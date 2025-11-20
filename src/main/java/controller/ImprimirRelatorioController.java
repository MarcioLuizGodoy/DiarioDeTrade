package controller;

import auxiliaresEstatisticas.GerarPdfs;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import model.Dao.OperacaoDao;
import model.Operacao;

public class ImprimirRelatorioController {

    public List<Operacao> listaComFiltro = new ArrayList<>();
    public List<Operacao> listaSemFiltro = new ArrayList<>();
    OperacaoDao oD = new OperacaoDao();

    public ImprimirRelatorioController() {
    }

    public Boolean pegarDataEFiltrarPorData(Date dataInicio, Date dataFim) {

        LocalDateTime inicio = dataInicio.toInstant()
                .atZone(ZoneId.systemDefault()).toLocalDate().atStartOfDay();

        LocalDateTime fim = dataFim.toInstant()
                .atZone(ZoneId.systemDefault()).toLocalDate().plusDays(1).atStartOfDay();

        try {
            listaSemFiltro = oD.consultarTodasOperacoes();

            for (Operacao op : listaSemFiltro) {

                if (op.getDataHora().isAfter(inicio) && op.getDataHora().isBefore(fim)) {
                    listaComFiltro.add(op);
                }
            }

            GerarPdfs.gerarPdf(listaComFiltro);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um Erro no percurso de Imprimir PDF, Aguarde!  :  " + ex.getMessage());
        }
        return true;
    }
}
