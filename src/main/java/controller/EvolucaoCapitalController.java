package controller;

import auxiliaresEstatisticas.CalculadoraEstatisticasResultados;
import db.DbException;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import model.Dao.OperacaoDao;
import model.Operacao;

public class EvolucaoCapitalController {

    List<Operacao> listaOperacoes = new ArrayList<>();
    BigDecimal auxGain;
    BigDecimal auxLoss;
    BigDecimal auxSaldo;

    public EvolucaoCapitalController() {
    }

    public List<Operacao> consutarOperacoesController() {
        OperacaoDao oD = new OperacaoDao();
        try {
            this.listaOperacoes = oD.consultarTodasOperacoes();
        } catch (DbException | IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
        return this.listaOperacoes;

    }

    public BigDecimal coletarOsGains() {
        auxGain = CalculadoraEstatisticasResultados.calcularResultadoOperacaoGain(listaOperacoes);
        return auxGain;
    }

    public BigDecimal coletarOsLoss() {
        auxLoss = CalculadoraEstatisticasResultados.calcularResultadoOperacaoLoss(listaOperacoes);
        return auxLoss;
    }

    public BigDecimal coletarSaldoFinalCapital() {
        auxSaldo = CalculadoraEstatisticasResultados.calcularResultadoOperacaoSaldo(listaOperacoes);
        return auxSaldo;
    }

}
