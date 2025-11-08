package controller;

import auxiliaresEstatisticas.GerarPdfs;
import com.itextpdf.testutils.ITextTest;
import java.io.IOException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import model.Dao.OperacaoDao;
import model.Operacao;

public class ImprimirRelatorioController {
    
            public List <Operacao>  listaComFiltro = new ArrayList<>();
            public List <Operacao> listaSemFiltro = new ArrayList<>();
            OperacaoDao oD = new OperacaoDao();

    public ImprimirRelatorioController(){}
    
    public Boolean pegarDataEFiltrarPorData(Date dataInicio, Date dataFim) {
    
            LocalDate inicio = dataInicio.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate fim = dataFim.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            
            try{
                    listaSemFiltro= oD.consultarTodasOperacoes();

                        for(Operacao op: listaSemFiltro) {
                           LocalDate dataOperacao =  op.getDataHora().toLocalDate();

                            if (    (dataOperacao.isEqual(inicio) || dataOperacao.isAfter(inicio) )  && dataOperacao.isEqual(fim) || dataOperacao.isBefore(fim)      ){
                                 listaComFiltro.add(op);   
                                 
                                        }   
                                    }
                        GerarPdfs.gerarPdf(listaComFiltro);
                                }
                                catch (IOException ex) {
                                    JOptionPane aviso = new JOptionPane("Ocorreu um Erro no percurso de Imprimir PDF, Aguarde!  :  "   + ex.getMessage());
                                }
                                return  true;
                } 
}