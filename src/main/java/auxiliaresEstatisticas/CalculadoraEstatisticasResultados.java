
package auxiliaresEstatisticas;
import java.util.List;
import model.Operacao;

//chamar esse metodo dentro de todos os metodos pra validar o padrao de movimentacao do ativo
public class   CalculadoraEstatisticasResultados {
    
   
    public static Double calcularResultadoOperacaoGain(List<Operacao> operacoes){
        Double ganhoOperacao = 0.0;
        for( Operacao op : operacoes){
            if( op.getStatusOperacao().equals("GAIN")){
                ganhoOperacao = ganhoOperacao +((op.getPrecoSaida() - op.getPrecoEntrada()) * op.getQuantidadeContratos() * 0.20);
            } 
        }
        return + Math.abs(ganhoOperacao);
    }
    //=====================================================================================================================

      public static Double calcularResultadoOperacaoLoss(List<Operacao> operacoes){
        Double perdaOperacao = 0.0;
        for( Operacao op : operacoes){
            if( op.getStatusOperacao().equals("LOSS")){
            perdaOperacao += -1 * ((op.getPrecoEntrada() - op.getPrecoSaida()) * op.getQuantidadeContratos() * 0.20);
            }
            
        }
        return Math.abs(perdaOperacao);
    }
    //=========================================================================================================================
      
      public static Double calcularResultadoOperacaoSaldo(List<Operacao> operacoes){
        Double saldo=0.0;
            return CalculadoraEstatisticasResultados.calcularResultadoOperacaoGain(operacoes )- (Math.abs(calcularResultadoOperacaoLoss(operacoes)));          
      }
   
    //=========================================================================================================================
     


}





//========================================================================
    
    //QUANDO ESSE METODO ESTIVER PRONTO, SETAR ELE NAS DE BAIXO PRA QUE O CALCULO SEJA FEITO CORRETAMENTE!!!
    
   /* public  static Double PegarTipoAtivo(Operacao operacao){
        Double padraoMovimentacao;
        
        if(operacao.getTipoAtivo.equals("WIN"){
            tipoAtivo.parseDouble(tipoAtivoTela);
            padraoMovimentacao = 0.20;
            return padraoMovimentacao;
        }
        else if(operacao.getTipoAtivo.equals("WDO"){
            tipoAtivo.parseDouble(tipoAtivoTela);
            padraoMovimentacao = 0.50;
            return padraoMovimentacao;
        }
    else if( operacao.getTipoAtivo.equals(ACAO"){
            tipoAtivo.parseDouble(tipoAtivoTela);
            padraoMovimentacao = 0.01;
        }    
                return padraoMovimentacao;

    }
    
    */
    
//============================================================================
