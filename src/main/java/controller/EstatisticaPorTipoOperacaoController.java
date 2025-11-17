
package controller;

import auxiliaresEstatisticas.CalculadoraEstatisticasResultados;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import model.Dao.OperacaoDao;
import model.Operacao;

public class EstatisticaPorTipoOperacaoController {
    
   List<Operacao> operacoesFiltradas = new ArrayList<>();
   BigDecimal auxGain;
   BigDecimal auxLoss;
   BigDecimal auxSaldo;

    public EstatisticaPorTipoOperacaoController(){}
    
    
  
    
    
    public List<Operacao> consultarOperacoesTipoOperacao(String tipoOperacao){
        OperacaoDao oD = new OperacaoDao();
        operacoesFiltradas = oD.consultarOperacaoPorTipoOperacao(tipoOperacao);
        return operacoesFiltradas;
        
    }

    public BigDecimal coletarOsGains() {
       auxGain =  CalculadoraEstatisticasResultados.calcularResultadoOperacaoGain(operacoesFiltradas);
       return auxGain;
    }

    public BigDecimal coletarOsLoss() {
        auxLoss = CalculadoraEstatisticasResultados.calcularResultadoOperacaoLoss(operacoesFiltradas);
       return auxLoss;
    }

    public BigDecimal coletarOsSaldos() {
       auxSaldo = CalculadoraEstatisticasResultados.calcularResultadoOperacaoSaldo(operacoesFiltradas);
        return auxSaldo;
    }
}
