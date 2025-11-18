package auxiliaresEstatisticas;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.JOptionPane;
import model.Operacao;

public final class GerarPdfs {

    public static void gerarPdf(List<Operacao> listaOperacoes) {

        Document dc = new Document(PageSize.A4, 72, 72, 72, 72);

        try {

            String diretorio = System.getProperty("user.home") + File.separator + "Desktop";
            LocalDateTime agora = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss");

            String nomeArquivo = "Relatorio_Monetario_" + agora.format(formatter) + ".pdf";
            File caminhoEnomeArquivo = new File(diretorio, nomeArquivo);

            PdfWriter w = PdfWriter.getInstance(dc, new FileOutputStream(caminhoEnomeArquivo));
            dc.open();

            Image img = Image.getInstance("src/main/resources/imgs/Estudo de media movel 50 periodos.png");
            img.scaleToFit(500, 500);
            img.setAlignment(Image.ALIGN_CENTER);
            dc.add(img);

            Font tituloFont = new Font(Font.FontFamily.COURIER, 18, Font.BOLD);
            Paragraph p1 = new Paragraph("Relatório Monetário em PDF", tituloFont);
            p1.setSpacingAfter(25);

            dc.add(p1);

            for (Operacao op : listaOperacoes) {

                PdfPTable tabela = new PdfPTable(1);
                tabela.setTotalWidth(500);
                tabela.setLockedWidth(true);

                PdfPCell celula = new PdfPCell(new Phrase("Id: " + op.getId()));
                tabela.addCell(celula);

                PdfPCell celula1 = new PdfPCell(new Phrase("Ativo: " + op.getAtivo()));
                tabela.addCell(celula1);

                PdfPCell cell2 = new PdfPCell(new Phrase("Preço de Entrada: " + op.getPrecoEntrada()));
                tabela.addCell(cell2);

                PdfPCell cell3 = new PdfPCell(new Phrase("Preço de Saída: " + op.getPrecoSaida()));
                tabela.addCell(cell3);

                PdfPCell cell4 = new PdfPCell(new Phrase("Quantidade de Contratos: " + op.getQuantidadeContratos()));
                tabela.addCell(cell4);

                PdfPCell cell5 = new PdfPCell(new Phrase("Status Operação " + op.getStatusOperacao()));
                tabela.addCell(cell4);

                PdfPCell cell6 = new PdfPCell(new Phrase("Preço de movimentação minima: " + CalculadoraEstatisticasResultados.setarPadraoMovimentacaoTipoAtivo(op)));
                tabela.addCell(cell6);

                PdfPCell cell7 = new PdfPCell(new Phrase("Data/Hora Operação: " + op.getDataHora()));
                tabela.addCell(cell7);

                if (op.getStatusOperacao().equals("GAIN")) {
                    PdfPCell cell8 = new PdfPCell(new Phrase("Como é feito o calculo: Preco de entrada - Preco de saida * 0.20* quantidade de contratos" + "\n"
                            + "Calculo feito: " + CalculadoraEstatisticasResultados.calcularResultadoOperacaoGain(listaOperacoes)));
                    tabela.addCell(cell8);

                } else {
                    PdfPCell cell9 = new PdfPCell(new Phrase("Como é feito o calculo: Preco de saida - Preco de entrada * 0.20* quantidade de contratos" + "\n"
                            + "Calculo feito: " + CalculadoraEstatisticasResultados.calcularResultadoOperacaoLoss(listaOperacoes)));
                    tabela.addCell(cell9);

                }

                tabela.setSpacingAfter(25);
                dc.add(tabela);
            }

            PdfPTable tabela2 = new PdfPTable(1);
            PdfPCell cell10 = new PdfPCell(new Phrase(("Resultado Líquido desse período: " + CalculadoraEstatisticasResultados.calcularResultadoOperacaoSaldo(listaOperacoes).toString())));
            tabela2.addCell(cell10);
            tabela2.setSpacingAfter(10);
            dc.add(tabela2);

            dc.close();
            w.close();

            JOptionPane.showMessageDialog(null, "PDF gerado em AREA DE TRABALHO: " + caminhoEnomeArquivo.getAbsolutePath());
            Desktop.getDesktop().browse(caminhoEnomeArquivo.toURI());

        } catch (DocumentException e) {
            System.out.println("Não foi possível abrir o PDF automaticamente 1: " + e.getMessage());
        } catch (FileNotFoundException e) {
            System.out.println("Não foi possível abrir o PDF automaticamente 2: " + e.getMessage());
        } catch (IOException ex) {
            System.out.println("Não foi possível abrir o PDF automaticamente 3: " + ex.getMessage());
        } catch(Exception e ){
            e.printStackTrace();
        }
    }

    //String desktopPath = System.getProperty("user.home") + File.separator + "Desktop";
    // File pastaDesktop = new File(desktopPath);
    //String nomePDF = "Relatorio_Monetario.pdf";
    //File arquivoPDF = new File(desktopPath, nomePDF);
    // File arquivoPDF = new File(System.getProperty("user.home") + File.separator + "Desktop", "Relatorio_Monetario.pdf");
    //mesma classe file e dois construtor diferente.
}
