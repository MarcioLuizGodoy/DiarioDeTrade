package controller;

import auxiliaresEstatisticas.GerarPdfs;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
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

        Instant inicio = dataInicio.toInstant().truncatedTo(ChronoUnit.DAYS);
        Instant fim = dataFim.toInstant().truncatedTo(ChronoUnit.DAYS).plus(1, ChronoUnit.DAYS).minus(1, ChronoUnit.MILLIS);

        try {
            listaSemFiltro = oD.consultarTodasOperacoes();

            for (Operacao op : listaSemFiltro) {
                Instant opInstant = op.getDataHora().atZone(ZoneId.systemDefault()).toInstant();
              if (!opInstant.isBefore(inicio) && !opInstant.isAfter(fim)) {
                    listaComFiltro.add(op);
                }
            }

            GerarPdfs.gerarPdf(listaComFiltro);
        } catch (IOException ex) {
            JOptionPane aviso = new JOptionPane("Ocorreu um Erro no percurso de Imprimir PDF, Aguarde!  :  " + ex.getMessage());
        }
        return true;
    }
}
