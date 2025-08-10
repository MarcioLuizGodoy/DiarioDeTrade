
package auxiliaresEstatisticas;

import java.util.List;
import model.Operacao;

public class   CalculadoraEstatisticasResultados {
    
//============================================================================
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
        return -Math.abs(perdaOperacao);
    }
    //=========================================================================================================================
      
      public static Double calcularResultadoOperacaoSaldo(List<Operacao> operacoes){
            Double saldo=0.0;
                for(Operacao op:operacoes){ 
                }
                return CalculadoraEstatisticasResultados.calcularResultadoOperacaoGain(operacoes )- (Math.abs(calcularResultadoOperacaoLoss(operacoes)));          
      }
   
    //=========================================================================================================================
}
