package controller;

import java.awt.image.BufferedImage;
import model.Operacao;
import model.OperacaoDao;
import model.TipoOperacao;
import model.TipoPosicao;

public class OperacaoController {
    private  String ativo;
    private Double precoEntrada;
    private Double precoSaida;
    private Integer quantidadeContratos;
    private TipoOperacao tipoOperacao;
    private TipoPosicao tipoPosicao;
    private String statusOperacao;
    private BufferedImage img;
    
    public OperacaoController(){
    }
  
    //ESSE METODO É IMPORTANTE PARA O FUNCIONAMENTO DA TELA.
    public BufferedImage receberImagemTela (BufferedImage imagem) {
       return imagem;
    }
    
   public void receberDados(
            String ativo, Double precoEntrada, Double precoSaida,
            Integer quantidadeContratos, TipoOperacao tipoOperacao,
            TipoPosicao tipoPosicao, String statusOperacao, BufferedImage img
            ) { this.ativo = ativo;
                this.precoEntrada = precoEntrada;
                this.precoSaida = precoSaida;
                this.quantidadeContratos = quantidadeContratos;
                this.tipoOperacao = tipoOperacao;
                this.tipoPosicao = tipoPosicao;
                this.statusOperacao = statusOperacao;
                this.img = img;
                }
   
    Operacao operacao = new Operacao(
            ativo,precoEntrada,precoSaida,
            quantidadeContratos, tipoOperacao,
            tipoPosicao, statusOperacao, img
            );
    OperacaoDao oD = new OperacaoDao();

     public boolean salvarRegistroController(){
          oD.persistirRegistro(operacao);
        return true;
          
      }

         
}


