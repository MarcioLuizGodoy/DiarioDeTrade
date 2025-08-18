
package controller;

import auxiliaresEstatisticas.CalculadoraEstatisticasResultados;
import java.util.ArrayList;
import java.util.List;
import model.Dao.OperacaoDao;
import model.Operacao;

public class EstatisticaPorTipoOperacaoController {
    
   List<Operacao> operacoesFiltradas = new ArrayList<>();
   Double auxGain;
   Double auxLoss;
   Double auxSaldo;

    public EstatisticaPorTipoOperacaoController(){}
    
    
  
    
    
    public List<Operacao> consultarOperacoesTipoOperacao(String tipoOperacao){
        OperacaoDao oD = new OperacaoDao();
        operacoesFiltradas = oD.consultarOperacaoPorTipoOperacao(tipoOperacao);
        return operacoesFiltradas;
        
    }

    public Double coletarOsGains() {
       auxGain =  CalculadoraEstatisticasResultados.calcularResultadoOperacaoGain(operacoesFiltradas);
       return auxGain;
    }

    public Double coletarOsLoss() {
        auxLoss = CalculadoraEstatisticasResultados.calcularResultadoOperacaoLoss(operacoesFiltradas);
       return auxLoss;
    }

    public Double coletarOsSaldos() {
       auxSaldo = CalculadoraEstatisticasResultados.calcularResultadoOperacaoSaldo(operacoesFiltradas);
        return auxSaldo;
    }
}
