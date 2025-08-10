
package controller;

import auxiliaresEstatisticas.CalculadoraEstatisticasResultados;
import db.DbException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import model.Dao.OperacaoDao;
import model.Operacao;

public class EvolucaoCapitalController {
    
    List<Operacao> listaOperacoes = new ArrayList<>();
    Double auxGain;
    Double auxLoss;
    Double auxSaldo;
 
    public EvolucaoCapitalController(){
    }
    
    public List<Operacao> consutarOperacoesController() {
        OperacaoDao oD = new OperacaoDao();
            try {
               listaOperacoes =  oD.consultarTodasOperacoes();
            } catch (DbException | IOException e) {
                e.printStackTrace(); 
                return new ArrayList<>();

            }
         return listaOperacoes;
         
    }
    
    public double coletarOsGains(){
       auxGain =  CalculadoraEstatisticasResultados.calcularResultadoOperacaoGain(listaOperacoes);
       return auxGain;
    }
    
    public double coletarOsLoss(){
        auxLoss = CalculadoraEstatisticasResultados.calcularResultadoOperacaoLoss(listaOperacoes);
        return auxLoss;
    }
    public double coletarSaldoFinalCapital(){
        auxSaldo = CalculadoraEstatisticasResultados.calcularResultadoOperacaoSaldo(listaOperacoes);
        return auxSaldo;
    }
    
  
    
    
    
    
    
    
    
    
    

}
