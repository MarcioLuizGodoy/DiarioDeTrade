
package controller;

import auxiliaresEstatisticas.CalculadoraEstatisticasResultados;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import model.Dao.OperacaoDao;
import model.Operacao;

public class EstatisticaPorTipoPosicaoController {
    String escolha;
    List <Operacao> listaOperacoesPorTipoPosicao = new ArrayList<>();
    BigDecimal totalGain;
    BigDecimal totalLoss;
    BigDecimal saldo;
    
    public EstatisticaPorTipoPosicaoController() {
    }
    
    public List <Operacao> buscarOperacaoPorTipoPosicaoController (String escolha){
        OperacaoDao oD = new OperacaoDao();
        
        this.listaOperacoesPorTipoPosicao = oD.consultarOperacaoPorTipoPosicao(escolha);
        return listaOperacoesPorTipoPosicao;
        }
    
    public BigDecimal coletarOsGains(){
        totalGain = CalculadoraEstatisticasResultados.calcularResultadoOperacaoGain(listaOperacoesPorTipoPosicao);
       return totalGain;
    }
    
    public BigDecimal coletarOSLoss(){
        totalLoss = CalculadoraEstatisticasResultados.calcularResultadoOperacaoLoss(listaOperacoesPorTipoPosicao);
        return totalLoss;
    }
    
    public BigDecimal coletarSaldo(){
        saldo = CalculadoraEstatisticasResultados.calcularResultadoOperacaoSaldo(listaOperacoesPorTipoPosicao);
        return saldo;
    }
    
}