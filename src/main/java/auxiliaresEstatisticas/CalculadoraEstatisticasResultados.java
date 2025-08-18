
package auxiliaresEstatisticas;
import java.util.List;
import model.Operacao;

//chamar esse metodo dentro de todos os metodos pra validar o padrao de movimentacao do ativo
public class   CalculadoraEstatisticasResultados {
   
   
    public static Double calcularResultadoOperacaoGain(List<Operacao> operacoes){
    Double ganhoOperacao = 0.0;

    for (Operacao op : operacoes) {
        if (op.getStatusOperacao().equals("GAIN")) {
            if (op.getTipoPosicao().toString().equals("BUY")) {
                ganhoOperacao += (op.getPrecoSaida() - op.getPrecoEntrada()) *
                                 op.getQuantidadeContratos() *
                                 setarPadraoMovimentacaoTipoAtivo(op);
            } else if (op.getTipoPosicao().toString().equals("SELL")) {
                ganhoOperacao += (op.getPrecoEntrada() - op.getPrecoSaida()) *
                                 op.getQuantidadeContratos() *
                                 setarPadraoMovimentacaoTipoAtivo(op);
            }
        }
    }

    return ganhoOperacao;
}

    //=====================================================================================================================
 
      public static Double calcularResultadoOperacaoLoss(List<Operacao> operacoes){
    Double perdaOperacao = 0.0;
    for (Operacao op : operacoes) {
        if (op.getStatusOperacao().equals("LOSS")) {
            if (op.getTipoPosicao().toString().equals("BUY")) {
               
                perdaOperacao += (op.getPrecoEntrada() - op.getPrecoSaida()) * op.getQuantidadeContratos() *setarPadraoMovimentacaoTipoAtivo(op);
           
            } else if (op.getTipoPosicao().toString().equals("SELL")) {
              
                perdaOperacao += (op.getPrecoSaida() - op.getPrecoEntrada()) *op.getQuantidadeContratos() *setarPadraoMovimentacaoTipoAtivo(op);
           
            }
        }
    }
    return  Math.abs(perdaOperacao); // já vai ser positivo, resultado da operação
}

    //=========================================================================================================================
     
    
    //QUANDO ESSE METODO ESTIVER PRONTO, SETAR ELE NAS DE BAIXO PRA QUE O CALCULO SEJA FEITO CORRETAMENTE!!!
  public static Double setarPadraoMovimentacaoTipoAtivo(Operacao operacao) {
    String tipoAtivo = operacao.getTipoAtivo();

    
    if (tipoAtivo == null) {
        return 0.0; 
    } switch (tipoAtivo.toUpperCase()) {
        case "WIN":
            return 0.20;
        case "WDO":
            return 0.50;
        case "ACOES":
            return 0.01;
        default:
            return 0.0; // Valor padrão se o tipo não for reconhecido
    }
}
//=====================================================================================
   
  
  
  
  public static Double calcularResultadoOperacaoSaldo(List<Operacao> operacoes) {
    Double ganho = CalculadoraEstatisticasResultados.calcularResultadoOperacaoGain(operacoes);
    Double perda = CalculadoraEstatisticasResultados.calcularResultadoOperacaoLoss(operacoes);
    Double saldo = ganho - Math.abs(perda);
    return saldo;
    }
//===============================================================================================
   

   
}
