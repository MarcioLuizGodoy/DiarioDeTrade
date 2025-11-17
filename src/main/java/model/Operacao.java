package model;

import java.awt.image.BufferedImage;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Operacao {
    private Integer id;  // Usar Integer para permitir null (antes de inserir)
    private String tipoAtivo;
    private String ativo;
    private BigDecimal precoEntrada;
    private BigDecimal precoSaida;
    private Integer quantidadeContratos;
    private TipoOperacao tipoOperacao;
    private TipoPosicao tipoPosicao;
    private String statusOperacao;
    private BufferedImage img;
    private String descricao;
    private String eventoTecnicoBase;
    private LocalDateTime dataHora;

    // Construtor vazio
    public Operacao() {}
    
    // Construtor completo, ID E HORA. SAO AUTOINCREMENTADOS PELO BANCO DE DADOS.
    // DEPOIS É SÓ CHAMÁ-LOS COM GETTERS E SETTERS.
    
    public Operacao(String tipoAtivo,String ativo, BigDecimal precoEntrada, BigDecimal precoSaida,
        Integer quantidadeContratos, TipoOperacao tipoOperacao, TipoPosicao tipoPosicao,
        String statusOperacao, BufferedImage img, String descricao, String eventoTecnicoBase ) {    
        
            this.tipoAtivo = tipoAtivo;
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
    public String getTipoAtivo(){
        return tipoAtivo;
    }        
    public LocalDateTime getDataHora() {
    return dataHora;
}
    public Integer getId(){
        return id;
    }
    public String getEventoTecnicoBase(){
        return eventoTecnicoBase;
    }
    public String getDescricao(){
        return descricao;
    }
    public String getAtivo() {
        return ativo;
    }
    public BigDecimal getPrecoEntrada() {
        return precoEntrada;
    }
    public BigDecimal getPrecoSaida() {
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
    public void setTipoAtivo(String tipoAtivo){
        this.tipoAtivo = tipoAtivo;
    }
    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }
    public void setId(Integer id){
        this.id = id;
        
    }
    public void setEventoTecnicoBase(String eventoTecnicoBase){
        this.eventoTecnicoBase = eventoTecnicoBase;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }
    public void setPrecoEntrada(BigDecimal precoEntrada) {
        this.precoEntrada = precoEntrada;
    }
    public void setPrecoSaida(BigDecimal precoSaida) {
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
