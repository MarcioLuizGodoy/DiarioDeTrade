package controller;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.Dao.OperacaoDao;
import model.Operacao;

public class ExcluirOperacoesController {

    public ExcluirOperacoesController() {
    }
    
    
    OperacaoDao oD = new OperacaoDao();
    public List<Operacao> listaOperacoes;
    public List<Operacao> listaFiltro = new ArrayList<>();
    JFrame framePai;

    public boolean avisar(){
        return true;
    }
    
    public List<Operacao> buscarOperacoesPorData(Date valorUm, Date valorDois, JFrame frame) {
        try {

            framePai = frame;
            LocalDateTime inicioC = valorUm.toInstant().atZone(ZoneId.systemDefault()).toLocalDate().atStartOfDay();
            LocalDateTime fimC = valorDois.toInstant().atZone(ZoneId.systemDefault()).toLocalDate().plusDays(1).atStartOfDay();
            listaOperacoes = oD.consultarTodasOperacoes();

            for (Operacao op : listaOperacoes) {
                if (op.getDataHora().isAfter(inicioC) && op.getDataHora().isBefore(fimC)) {
                    listaFiltro.add(op);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Escolha uma data não nulla porfavor");
        }
        return listaFiltro;

    }

  public boolean perguntarCerteza() {
    int opcao = JOptionPane.showConfirmDialog(
        framePai,
        "Você tem certeza que deseja excluir essa operação?",
        "Confirme a exclusão da operação",
        JOptionPane.YES_NO_OPTION,
        JOptionPane.WARNING_MESSAGE
    );
    return opcao == JOptionPane.YES_OPTION ;
}


    public void excluirOperacao(Integer idOperacaoEscolhida) {
        OperacaoDao oD = new OperacaoDao();
        if (idOperacaoEscolhida != null) {
            if (perguntarCerteza() == true) {
                 oD.excluirOperacao(idOperacaoEscolhida);
                JOptionPane.showMessageDialog(null, "Operação excluída!");
               avisar();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Clique  duas vezes na operacao que deseja editar, porfavor!");
        }

    }

    
    public List<Operacao> buscarTudoLista() throws IOException{
        return oD.consultarTodasOperacoes();
    }
}
