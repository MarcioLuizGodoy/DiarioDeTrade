
package controller;

import java.io.IOException;
import java.util.List;
import javax.swing.JOptionPane;
import model.Dao.OperacaoDao;
import model.Operacao;

public class BuscarOperacaoController {
    
    String escolhaFiltroUsuario;
    
    
    
    public void receberEscolhaFiltroTela(String valorEscolha) {
            if(valorEscolha == null && valorEscolha.isEmpty()){
                 JOptionPane.showMessageDialog(null, "Escolha do Usuario  nula/incorreta!");
                 return;
            }else{
                               this.escolhaFiltroUsuario = valorEscolha;

            }
    }
    
    
    
    public List<Operacao> buscarOperacoesController(){
        OperacaoDao oD = new OperacaoDao();
        try{
            if(escolhaFiltroUsuario.equals("Todas Operacoes")){
                List<Operacao> lista =  oD.consultarTodasOperacoes();
                return lista;                                               
            }
        }catch(IOException e ){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro na hora de buscar Todas Operações");
            }
            return null;
    }
    
    
    
}