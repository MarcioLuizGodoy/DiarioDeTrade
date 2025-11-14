package auxiliaresEstatisticas;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.JOptionPane;
import model.Operacao;

public final class GerarPdfs {

    String ativo;
    Double pE;
    Double pS;
    LocalDate hora;
    String des;

    private GerarPdfs() {
    }

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
            Font tituloFont = new Font(Font.FontFamily.COURIER, 18, Font.BOLD);
            Paragraph titulo = new Paragraph("Relatório Monetário em PDF", tituloFont);

            dc.add(titulo);
            titulo.setSpacingAfter(25);

            for (Operacao op : listaOperacoes) {
                Paragraph linha = new Paragraph("\n");

                linha.add("Ativo: " + op.getAtivo() + "\n");
                linha.add("Preço de Entrada: R$ " + op.getPrecoEntrada() + "\n");
                linha.add("Preço de Saída: R$ " + op.getPrecoSaida() + "\n");
                linha.add("Data/Hora: " + op.getDataHora() + "\n");
                linha.add("Descrição: " + op.getDescricao() + "\n");
                //  linha.add;
               
                linha.setSpacingAfter(10);
                dc.add(linha);

               
            }
            Paragraph p = new Paragraph();
            p.add(CalculadoraEstatisticasResultados.calcularResultadoOperacaoSaldo(listaOperacoes).toString());
            dc.add(p);
            
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
        }
    }

    //String desktopPath = System.getProperty("user.home") + File.separator + "Desktop";
    // File pastaDesktop = new File(desktopPath);
    //String nomePDF = "Relatorio_Monetario.pdf";
    //File arquivoPDF = new File(desktopPath, nomePDF);
    // File arquivoPDF = new File(System.getProperty("user.home") + File.separator + "Desktop", "Relatorio_Monetario.pdf");
    //mesma classe file e dois construtor diferente.
}
