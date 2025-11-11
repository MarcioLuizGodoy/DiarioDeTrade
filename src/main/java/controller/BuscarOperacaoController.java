package controller;

import java.io.IOException;
import java.util.List;
import javax.swing.JOptionPane;
import model.Dao.OperacaoDao;
import model.Operacao;

public class BuscarOperacaoController {

    public List<Operacao> buscarOperacoesController(String escolha) {
        OperacaoDao oD = new OperacaoDao();
        try {
            if (escolha.equals("Todas Operacoes")) {
                List<Operacao> lista = oD.consultarTodasOperacoes();
                return lista;
            } else {
                JOptionPane.showMessageDialog(null, "Ocorreu um erro na hora de buscar Todas Operações.");
            }
        } catch (IOException e) {
        }
        return null;
    }

}
