package controller;

import java.awt.image.BufferedImage;
import java.math.BigDecimal;
import javax.swing.JOptionPane;
import model.Dao.OperacaoDao;
import model.Operacao;
import model.TipoOperacao;
import model.TipoPosicao;

public class RegistrarOperacaoController {

    private String tipoAtivo;
    private String ativo;
    private BigDecimal precoEntrada;
    private BigDecimal precoSaida;
    private Integer quantidadeContratos;
    private TipoOperacao tipoOperacao;
    private TipoPosicao tipoPosicao;
    private String statusOperacao;
    private BufferedImage imagem;
    private String descricao;
    private String eventoTecnicoBase;

    public RegistrarOperacaoController() {
    }

    @SuppressWarnings("empty-statement")
    public boolean receberDados(
            String tipoAtivo, String ativo, String precoEntrada, String precoSaida, Integer quantidadeContratos, String tipoOperacao,
            String tipoPosicao, String statusOperacao, BufferedImage image,
            String descricao, String eventoTecnicoBase) {

        this.tipoAtivo = tipoAtivo;

        if (ativo == null || ativo.isBlank() || !ativo.matches("^[A-Z]{4}\\d+$")) {
            JOptionPane.showMessageDialog(null, "Erro no padrão de escrita de nomes ativos financeiros, exemplo: BBAS3, BBAS4, WINV25.");
            return false;
        } else {
            this.ativo = ativo;
        }

        if (precoEntrada != null && precoEntrada.matches("\\d{3}\\.\\d+")) {
            this.precoEntrada = new BigDecimal(precoEntrada);
        } else {
            JOptionPane.showMessageDialog(null, "VocêTem que digitar um valor valido parao preco de entrada. Siga esse exemplo: 145.123");
            return false;
        }

        if (precoSaida != null && precoSaida.matches("\\d{3}\\.\\d+")) {
            this.precoSaida = new BigDecimal(precoSaida);
        } else {
            JOptionPane.showMessageDialog(null, "VocêTem que digitar um valor valido parao preco de entrada. Siga esse exemplo: 145.123");
            return false;
        }

        if (quantidadeContratos != null && quantidadeContratos > 0) {
            this.quantidadeContratos = quantidadeContratos;
        } else {
            JOptionPane.showMessageDialog(null, "A quantidade de contratos tem que ser no minimo 1 contrato por ativo financeiro!");
            return false;
        }

        //Criar as validação para esses enuns, só por garantia.
       // if (tipoOperacao.equals(TipoOperacao.DAY_TRADE) || tipoOperacao.equals(TipoOperacao.SWING_TRADE) || tipoOperacao.equals(TipoOperacao.POSITION)) {
            TipoOperacao to = TipoOperacao.valueOf(tipoOperacao);
            this.tipoOperacao = (to);
        //} else {
            //JOptionPane.showMessageDialog(null, "Coloque um Tipo de Operacao valida");
//
       // }

        //if (tipoPosicao.equals(TipoPosicao.BUY) || tipoPosicao.equals(TipoPosicao.SELL)) {
            TipoPosicao tp = TipoPosicao.valueOf(tipoPosicao);
            this.tipoPosicao = (tp);
       // } else {
          //  JOptionPane.showMessageDialog(null, "Coloque um Tipo de Posicao valida");

       // }

        //Aqui esta sem validação alguma
        this.statusOperacao = statusOperacao;

        if (image == null || image.getWidth() <= 0 || image.getHeight() <= 0) {
            JOptionPane.showMessageDialog(null, "Escolha uma imagem, é inegociável");
            return false;
        } else {
            this.imagem = image;
        }

        if (descricao != null && !descricao.trim().isEmpty()) {
            this.descricao = descricao.trim();
            System.out.print(this.descricao);
        } else {
            JOptionPane.showMessageDialog(null, "Visando ter boas informações pra estudo e analise posterior, não deixe de forma alguma esse campo em branco.");
            return false;
        }

        this.eventoTecnicoBase = eventoTecnicoBase;

        return true;
    }

    public boolean salvarRegistroController() {
        OperacaoDao oD = new OperacaoDao();
        Operacao operacao = new Operacao(tipoAtivo, ativo, precoEntrada, precoSaida, quantidadeContratos, tipoOperacao, tipoPosicao, statusOperacao, imagem, descricao, eventoTecnicoBase);
        return oD.persistirRegistro(operacao);
    }

}
