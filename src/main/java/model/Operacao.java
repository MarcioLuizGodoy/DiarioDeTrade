package model;

import java.awt.image.BufferedImage;

public class Operacao {
    private String ativo;
    private Double precoEntrada;
    private Double precoSaida;
    private Integer quantidadeContratos;
    private TipoOperacao tipoOperacao;
    private TipoPosicao tipoPosicao;
    private String statusOperacao;
    private BufferedImage img;
    private String descricao;
    private String eventoTecnicoBase;

    // Construtor vazio
    public Operacao() {}

    // Construtor completo
    public Operacao(String ativo, Double precoEntrada, Double precoSaida,
        Integer quantidadeContratos, TipoOperacao tipoOperacao, TipoPosicao tipoPosicao,
        String statusOperacao, BufferedImage img, String descricao, String eventoTecnicoBase ) {

        this.ativo = ativo;
        this.precoEntrada = precoEntrada;
        this.precoSaida = precoSaida;
        this.quantidadeContratos = quantidadeContratos;
        this.tipoOperacao = tipoOperacao;
        this.tipoPosicao = tipoPosicao;
        this.statusOperacao = statusOperacao;
        this.img = img;
        this.descricao = descricao;
        this.eventoTecnicoBase = eventoTecnicoBase;
    }

    // Getters
    
    public String getEventoTecnicoBase(){
        return eventoTecnicoBase;
    }
    public String getDescricao(){
        return descricao;
    }
    public String getAtivo() {
        return ativo;
    }

    public Double getPrecoEntrada() {
        return precoEntrada;
    }

    public Double getPrecoSaida() {
        return precoSaida;
    }

    public Integer getQuantidadeContratos() {
        return quantidadeContratos;
    }

    public TipoOperacao getTipoOperacao() {
        return tipoOperacao;
    }

    public TipoPosicao getTipoPosicao() {
        return tipoPosicao;
    }

    public String getStatusOperacao() {
        return statusOperacao;
    }

    public BufferedImage getImg() {
        return img;
    }

    // Setters
    
    public void setEventoTecnicoBase(String eventoTecnicoBase){
        this.eventoTecnicoBase = eventoTecnicoBase;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }

    public void setPrecoEntrada(Double precoEntrada) {
        this.precoEntrada = precoEntrada;
    }

    public void setPrecoSaida(Double precoSaida) {
        this.precoSaida = precoSaida;
    }

    public void setQuantidadeContratos(Integer quantidadeContratos) {
        this.quantidadeContratos = quantidadeContratos;
    }

    public void setTipoOperacao(TipoOperacao tipoOperacao) {
        this.tipoOperacao = tipoOperacao;
    }

    public void setTipoPosicao(TipoPosicao tipoPosicao) {
        this.tipoPosicao = tipoPosicao;
    }

    public void setStatusOperacao(String statusOperacao) {
        this.statusOperacao = statusOperacao;
    }

    public void setImg(BufferedImage img) {
        this.img = img;
    }
}
