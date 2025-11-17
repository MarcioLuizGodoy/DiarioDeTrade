package controller;

import auxiliaresEstatisticas.CalculadoraEstatisticasResultados;
import db.DbException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import model.Dao.OperacaoDao;
import model.Operacao;


public class EstatisticasPorAtivoController {
    List<Operacao> listaOperacoes = new ArrayList<>();
    String ativo; //CASO NO FUTURO PRECISE, JÁ ESTA AQUI.
    BigDecimal auxGain;
    BigDecimal auxLoss;
    BigDecimal auxSaldo;
    Integer totalOperacoes;

    
    public EstatisticasPorAtivoController(){
    }
    
    public List<Operacao> consultarOperacoesController(String ativo){
        this.ativo = ativo;
        OperacaoDao oD = new OperacaoDao();
            try{
                this.listaOperacoes = oD.consultarOperacoesPorAtivo(ativo); 
            }
            catch(DbException e){
                e.printStackTrace();            }
        return listaOperacoes;
    }
    
    
    
    public BigDecimal coletarOsGains(){
        auxGain = CalculadoraEstatisticasResultados.calcularResultadoOperacaoGain(listaOperacoes);
        return auxGain;
    }
    
    public BigDecimal coletarOsLoss(){
        auxLoss = CalculadoraEstatisticasResultados.calcularResultadoOperacaoLoss(listaOperacoes);
        return auxLoss;
    }
    
    public BigDecimal coletarOsSaldos(){
        auxSaldo = CalculadoraEstatisticasResultados.calcularResultadoOperacaoSaldo(listaOperacoes);
        return auxSaldo;
    }
    
    
    
    
}