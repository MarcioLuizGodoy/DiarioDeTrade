package controller;


import java.awt.image.BufferedImage;
import java.io.IOException;
import java.sql.SQLException;
import model.Dao.OperacaoDao;
import model.Operacao;
import model.TipoOperacao;
import model.TipoPosicao;

public class OperacaoController {
    private String ativo;
    private Double precoEntrada;
    private Double precoSaida;
    private Integer quantidadeContratos;
    private TipoOperacao tipoOperacao;
    private TipoPosicao tipoPosicao;
    private String statusOperacao;
    private BufferedImage img;

    public OperacaoController() {}

    public BufferedImage receberImagemTela(BufferedImage imagem) {
       return imagem;
    }

    public void receberDados(
        String ativo, Double precoEntrada, Double precoSaida,
        Integer quantidadeContratos, TipoOperacao tipoOperacao,
        TipoPosicao tipoPosicao, String statusOperacao, BufferedImage img
    ) {
        this.ativo = ativo;
        this.precoEntrada = precoEntrada;
        this.precoSaida = precoSaida;
        this.quantidadeContratos = quantidadeContratos;
        this.tipoOperacao = tipoOperacao;
        this.tipoPosicao = tipoPosicao;
        this.statusOperacao = statusOperacao;
        this.img = img;
    }

    public boolean salvarRegistroController() throws SQLException, IOException {
        Operacao operacao = new Operacao(
            ativo, precoEntrada, precoSaida, quantidadeContratos,
            tipoOperacao, tipoPosicao, statusOperacao, img
        );
        OperacaoDao oD = new OperacaoDao();
        return oD.persistirRegistro(operacao);
    }
}
