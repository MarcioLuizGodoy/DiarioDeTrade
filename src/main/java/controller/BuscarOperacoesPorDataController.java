package controller;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Operacao;
import model.Dao.OperacaoDao;

public class BuscarOperacoesPorDataController {


    public BuscarOperacoesPorDataController() {
    }

    public List<Operacao> listaOperacoes = new ArrayList();
    public List<Operacao> listaOperacoesFiltradas  = new ArrayList();

    public List<Operacao> receberDados(java.util.Date inicio, java.util.Date fim) {

        try {
            LocalDateTime inicioC = inicio.toInstant().atZone(ZoneId.systemDefault()).toLocalDate().atStartOfDay();
            LocalDateTime fimC = fim.toInstant().atZone(ZoneId.systemDefault()).toLocalDate().plusDays(1)
                    .atStartOfDay();

            OperacaoDao oD = new OperacaoDao();
            listaOperacoes = oD.consultarTodasOperacoes(); // ponto importante do codigo

            for (Operacao op : listaOperacoes) {
                if (op.getDataHora().isAfter(inicioC) && op.getDataHora().isBefore(fimC)) {
                    listaOperacoesFiltradas.add(op);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro inesperado avise para que possa ser resolvido.");
        }
        return listaOperacoesFiltradas;

    }
}
