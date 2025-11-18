package auxiliaresEstatisticas;

import java.math.BigDecimal;
import java.util.List;
import model.Operacao;
import model.TipoPosicao;

public final class CalculadoraEstatisticasResultados {

    private CalculadoraEstatisticasResultados() {
    }

    public static BigDecimal calcularResultadoOperacaoGain(List<Operacao> operacoes) {
        BigDecimal ganhoOperacao = new BigDecimal("0.00");
        ganhoOperacao.precision();

        for (Operacao op : operacoes) {
            if (op.getStatusOperacao().equals("GAIN")) {

                BigDecimal precoEntrada = op.getPrecoEntrada();
                BigDecimal precoSaida = op.getPrecoSaida();
                BigDecimal quantidade = BigDecimal.valueOf(op.getQuantidadeContratos());
                BigDecimal multiplicador = new BigDecimal(setarPadraoMovimentacaoTipoAtivo(op).toString());

                BigDecimal resultado;
                if (op.getTipoPosicao() == TipoPosicao.BUY) {
                    resultado = precoSaida.subtract(precoEntrada).multiply(quantidade).multiply(multiplicador);
                } else {
                    resultado = precoEntrada.subtract(precoSaida).multiply(quantidade).multiply(multiplicador);
                }

                ganhoOperacao = ganhoOperacao.add(resultado);
            }
        }
        return ganhoOperacao;
    }

    //=====================================================================================================================
    public static BigDecimal calcularResultadoOperacaoLoss(List<Operacao> operacoes) {
        BigDecimal perdaOperacao = new BigDecimal("0.0");
        BigDecimal resultado = BigDecimal.ZERO;
        for (Operacao op : operacoes) {
            if (op.getStatusOperacao().equals("LOSS")) {

                BigDecimal precoEntrada = op.getPrecoEntrada();
                BigDecimal precoSaida = op.getPrecoSaida();
                BigDecimal qtdContratos = BigDecimal.valueOf(op.getQuantidadeContratos());
                BigDecimal multiplicador = new BigDecimal(setarPadraoMovimentacaoTipoAtivo(op).toString());

                if (op.getTipoPosicao().toString().equals("BUY")) {

                    resultado = precoEntrada.subtract(precoSaida).multiply(qtdContratos).multiply(multiplicador);

                } else if (op.getTipoPosicao().toString().equals("SELL")) {

                    resultado = precoSaida.subtract(precoEntrada).multiply(qtdContratos).multiply(multiplicador);

                }
                //AQUI FOI NECESSARIO NEGTIVAR PORQUE A LOGICA DE VARIAÇÃO NAO COINCIDE COM A MATEMATICA.   NÃO APAGAR ESSA LINHA!!!
                perdaOperacao = perdaOperacao.add(resultado).negate();
            }
        }
        return perdaOperacao;
        //return perdaOperacao;

    }

    //=========================================================================================================================
    public static BigDecimal setarPadraoMovimentacaoTipoAtivo(Operacao operacao) {
        String tipoAtivo = operacao.getTipoAtivo();

        if (tipoAtivo == null) {
            return BigDecimal.ZERO;
        }
        switch (tipoAtivo.toUpperCase()) {
            case "WIN":
                return new BigDecimal("0.20");
            case "WDO":
                return new BigDecimal("0.50");
            case "ACOES":
                return new BigDecimal("0.01");
            default:
                return BigDecimal.ZERO;
        }
    }
//=====================================================================================

    public static BigDecimal calcularResultadoOperacaoSaldo(List<Operacao> operacoes) {
        BigDecimal ganho = CalculadoraEstatisticasResultados.calcularResultadoOperacaoGain(operacoes);
        BigDecimal perda = CalculadoraEstatisticasResultados.calcularResultadoOperacaoLoss(operacoes);
        BigDecimal saldo = ganho.subtract(perda.negate());

        return saldo;
    }
//===============================================================================================

}
