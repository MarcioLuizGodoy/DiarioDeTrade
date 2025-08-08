
package controller;

import java.io.IOException;
import java.util.List;
import javax.swing.JDialog;
import model.Dao.OperacaoDao;
import model.Operacao;

public class BuscarOperacaoController {
    
    String escolhaFiltroUsuario;
  //---------------------------------

    public void receberEscolhaFiltroTela(String valorEscolha) {
        
            if(valorEscolha != null){
            this.escolhaFiltroUsuario = valorEscolha;
            }else{
                System.out.println("Variavel vazia!!!");
            }
    }
    
    
    
    
    public List<Operacao> buscarPorFiltro(){
        OperacaoDao oD = new OperacaoDao();
        
        try{
            
        if(escolhaFiltroUsuario.equals("Todas Operacoes")){
            
            List<Operacao> lista =  oD.consultarTodasOperacoes();
            return lista;
            
        }
        else if(escolhaFiltroUsuario.equals("Ativo")){
            
            //oD.consultarOperacaoAtivo();
        }
        else if(escolhaFiltroUsuario.equals("Tipo Operação")){
            
        }
        else if(escolhaFiltroUsuario.equals("Tipo Posição")){
            
        }
        else if(escolhaFiltroUsuario.equals("Status Operação")){
            
        }
        else if(escolhaFiltroUsuario.equals("Data e Hora")){
            
        }
        
       
        
        }catch(IOException e ){
    }
        return null;
    
    }
}