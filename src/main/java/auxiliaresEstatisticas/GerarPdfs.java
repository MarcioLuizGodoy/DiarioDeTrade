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
import java.util.List;
import javax.swing.JOptionPane;
import model.Operacao;

public final class GerarPdfs {
    String ativo;
    Double pE;
    Double pS;
    LocalDate hora;
    String des;
    
    private GerarPdfs()  {}
    
    public static void  gerarPdf(List<Operacao> listaOperacoes) {
        
        Document dc = new Document(PageSize.A4,72,72,72,72);                                           
        try{
                String diretorio = System.getProperty("user.home") + File.separator + "Desktop"; 
                String nomeArquivo =  "Relatorio_Monetario.pdf";                                                  
                File caminhoEnomeArquivo = new File(diretorio, nomeArquivo);
                
                    PdfWriter w =PdfWriter.getInstance(dc, new FileOutputStream(caminhoEnomeArquivo)); 
                            dc.open();                                                                                                                      
                            Font tituloFont = new Font(Font.FontFamily.COURIER, 18, Font.BOLD);
                            Paragraph titulo = new Paragraph("Relatório Monetário em PDF", tituloFont);
                          
                           dc.add(titulo);
                           titulo.setSpacingAfter(25);
                           
                         for (Operacao op : listaOperacoes) {
                                Paragraph linha = new Paragraph();
                                linha.add("Ativo: " + op.getAtivo() + " ");
                                linha.add("Preço de Entrada: R$ " + op.getPrecoEntrada() );
                                linha.add("Preço de Saída: R$ " + op.getPrecoSaida());
                                linha.add("Data/Hora: " + op.getDataHora());
                                linha.add("Descrição: " + op.getDescricao()) ;
                              //  linha.add;
                                linha.setSpacingAfter(10);
                                dc.add(linha);
                                    }           
                           dc.close();      
                           w.close();
                JOptionPane.showMessageDialog(null, "PDF gerado em AREA DE TRABALHO: " + caminhoEnomeArquivo.getAbsolutePath());
               
                Desktop.getDesktop().browse(caminhoEnomeArquivo.toURI());
            
        }catch( DocumentException e ){
            e.printStackTrace();
        }
        catch(FileNotFoundException e ){
            e.printStackTrace();
        }
         catch (IOException ex) {
                System.err.println("Não foi possível abrir o PDF automaticamente: " + ex.getMessage());
            }
    }    
    
     //String desktopPath = System.getProperty("user.home") + File.separator + "Desktop";
           // File pastaDesktop = new File(desktopPath);
             //String nomePDF = "Relatorio_Monetario.pdf";
                //File arquivoPDF = new File(desktopPath, nomePDF);
    
      // File arquivoPDF = new File(System.getProperty("user.home") + File.separator + "Desktop", "Relatorio_Monetario.pdf");
                 //mesma classe file e dois construtor diferente.
    
    
   
}
