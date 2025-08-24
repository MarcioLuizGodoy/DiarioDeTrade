
package controller;

import java.io.IOException;
import java.util.List;
import model.Dao.OperacaoDao;
import model.Operacao;


public class EditarOperacoesController {
        String escolhaFiltroUsuario;

    public EditarOperacoesController(){}
    
    public void editarOperacaoController(Integer id, Operacao operacao){
      
        OperacaoDao oD = new OperacaoDao();
        oD.editarOperacao(id, operacao);
        
    }
    
    public void receberEscolhaFiltroTela(String valorEscolha) {
            if(valorEscolha != null){
                this.escolhaFiltroUsuario = valorEscolha;
            }
    }
    
   
    public List<Operacao> buscarParaEditarOperacoesController(){
        OperacaoDao oD = new OperacaoDao();
        try {
                List<Operacao> lista =  oD.consultarTodasOperacoes();
                return lista;
        }catch( IOException e ){
            e.printStackTrace();
            }
        return null;
    }
    

    public  List<Operacao> buscarOperacoesEditarController(String linhaEscolhida){
        return null;
    }
}
