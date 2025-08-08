package controller;


import db.DB;
import java.awt.image.BufferedImage;
import model.Dao.OperacaoDao;
import model.Operacao;
import model.TipoOperacao;
import model.TipoPosicao;

public class RegistrarOperacaoController {
    private String ativo;
    private Double precoEntrada;
    private Double precoSaida;
    private Integer quantidadeContratos;
    private TipoOperacao tipoOperacao;
    private TipoPosicao tipoPosicao;
    private String statusOperacao;
    private BufferedImage imagem;
    private String descricao;
    private String eventoTecnicoBase;
    
    public RegistrarOperacaoController() {}

    
public void receberImagemTela(BufferedImage imagem) {
    this.imagem = imagem;
}

    public void receberDados(
        String ativo, Double precoEntrada, Double precoSaida,
        Integer quantidadeContratos, TipoOperacao tipoOperacao,
        TipoPosicao tipoPosicao, String statusOperacao,BufferedImage image,
        String descricao, String eventoTecnicoBase ) {
        this.ativo = ativo;
        this.precoEntrada = precoEntrada;
        this.precoSaida = precoSaida;
        this.quantidadeContratos = quantidadeContratos;
        this.tipoOperacao = tipoOperacao;
        this.tipoPosicao = tipoPosicao;
        this.statusOperacao = statusOperacao;
        this.imagem = image;
        this.descricao = descricao;
        this.eventoTecnicoBase = eventoTecnicoBase;
        
    }

    public BufferedImage getImagem() {
    return this.imagem;
}
    /**
     *
     * @return
     */
    public boolean salvarRegistroController()  {
        Operacao operacao = new Operacao(
            ativo, precoEntrada, precoSaida, quantidadeContratos,
            tipoOperacao, tipoPosicao, statusOperacao,this.imagem,descricao,eventoTecnicoBase
        );
        OperacaoDao oD = new OperacaoDao();
        return oD.persistirRegistro(operacao);
    }
}
