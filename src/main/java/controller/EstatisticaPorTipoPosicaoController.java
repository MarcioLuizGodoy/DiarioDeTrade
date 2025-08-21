
package controller;

import auxiliaresEstatisticas.CalculadoraEstatisticasResultados;
import java.util.ArrayList;
import java.util.List;
import model.Dao.OperacaoDao;
import model.Operacao;

public class EstatisticaPorTipoPosicaoController {
    String escolha;
    List <Operacao> listaOperacoesPorTipoPosicao = new ArrayList<>();
    Double totalGain;
    Double totalLoss;
    Double saldo;
    
    public EstatisticaPorTipoPosicaoController() {
    }
    
    public List <Operacao> buscarOperacaoPorTipoPosicaoController (String escolha){
        OperacaoDao oD = new OperacaoDao();
        
        this.listaOperacoesPorTipoPosicao = oD.consultarOperacaoPorTipoPosicao(escolha);
        return listaOperacoesPorTipoPosicao;
        }
    
    public Double coletarOsGains(){
        totalGain = CalculadoraEstatisticasResultados.calcularResultadoOperacaoGain(listaOperacoesPorTipoPosicao);
       return totalGain;
    }
    
    public Double coletarOSLoss(){
        totalLoss = CalculadoraEstatisticasResultados.calcularResultadoOperacaoLoss(listaOperacoesPorTipoPosicao);
        return totalLoss;
    }
    
    public Double coletarSaldo(){
        saldo = CalculadoraEstatisticasResultados.calcularResultadoOperacaoSaldo(listaOperacoesPorTipoPosicao);
        return saldo;
    }
    
}