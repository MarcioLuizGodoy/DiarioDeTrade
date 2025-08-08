
package controller;

import java.io.IOException;
import java.util.List;
import model.Dao.OperacaoDao;
import model.Operacao;

public class BuscarOperacaoController {
    
    // Variavel global recebida da tela pelo metodo do controller
    String escolhaFiltroUsuario;
    
    //Recebendo escolha do usuario e  setando como variavel global no ambiente controller!
    public void receberEscolhaFiltroTela(String valorEscolha) {
            if(valorEscolha != null){
                this.escolhaFiltroUsuario = valorEscolha;
            }
    }
    
    //Metodo que busca todas as operacoes
    public List<Operacao> buscarOperacoesController(){
        OperacaoDao oD = new OperacaoDao();
        try{
            if(escolhaFiltroUsuario.equals("Todas Operacoes")){
                List<Operacao> lista =  oD.consultarTodasOperacoes();
                return lista;                                               //IMPLEMENTADO COM SUCESSO!
            }
        }catch(IOException e ){
            }
        return null;
    
    }
    
    
    
}