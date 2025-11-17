package controller;

import auxiliaresEstatisticas.CalculadoraEstatisticasResultados;
import java.math.BigDecimal;
import java.util.List;
import model.Dao.OperacaoDao;
import model.Operacao;

public class EstatisticaPorTipoAtivoController {
    
    String escolha;
    List<Operacao> operacoes;
    
    
    public EstatisticaPorTipoAtivoController(){
    }
    
    public void receberEscolhaPorAtivoController (String escolha){
        this.escolha = escolha;       
    }
 
    public List<Operacao> buscarOperacaoPorTipoAtivoController(){
        OperacaoDao oD = new OperacaoDao();
        this.operacoes = oD. consultarOperacoesPorTipoAtivo(escolha);
        return operacoes;    
    }
    
    
    
   public BigDecimal coletarOsGains(){
        BigDecimal auxGain = CalculadoraEstatisticasResultados.calcularResultadoOperacaoGain(operacoes);
        return auxGain;
    }
    
    public BigDecimal coletarOsLoss(){
        BigDecimal auxLoss = CalculadoraEstatisticasResultados.calcularResultadoOperacaoLoss(operacoes);
        return auxLoss;
    }
    
    public BigDecimal coletarOsSaldos(){
        BigDecimal auxSaldo = CalculadoraEstatisticasResultados.calcularResultadoOperacaoSaldo(operacoes);
        return auxSaldo;
    }
    
}
