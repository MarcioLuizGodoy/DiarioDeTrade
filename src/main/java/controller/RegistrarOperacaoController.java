package controller;


import java.awt.image.BufferedImage;
import javax.swing.JOptionPane;
import model.Dao.OperacaoDao;
import model.Operacao;
import model.TipoOperacao;
import model.TipoPosicao;

public class RegistrarOperacaoController {
    private String tipoAtivo;
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
    
    public void receberDados    (
        String tipoAtivo, String ativo, Double precoEntrada, Double precoSaida, Integer quantidadeContratos, TipoOperacao tipoOperacao, 
        TipoPosicao tipoPosicao, String statusOperacao,BufferedImage image,
        String descricao, String eventoTecnicoBase )    {
            
        this.tipoAtivo = tipoAtivo;
        
        
        if(ativo != null && ativo.matches("^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]+$")){
                    this.ativo = ativo;
        }else{
            JOptionPane.showMessageDialog(null,"Erro no padrão de escrita de nomes ativos financeiros, existe um padrão como: BBAS3, BBAS4, WINV25.");
            return;
        }
        
        
        
            String aux = precoEntrada.toString().trim();

            if (aux.matches("^(\\d{3})\\.(.+)$")) {
                this.precoEntrada = Double.valueOf(aux);
            } else {
                JOptionPane.showMessageDialog(null, "Para o Preço de Entrada: Digite um número válido, por exemplo: 150.500");
                return;
            }
            
             String auxx = precoSaida.toString().trim();
            if (auxx.matches("^(\\d{3})\\.(.+)$")) {
                this.precoSaida = Double.valueOf(auxx);
            } else {
                JOptionPane.showMessageDialog(null, "Para o Preço de Saída: Digite um número válido, por exemplo: 150.500");
                return;
            }
            
            if(quantidadeContratos != null && quantidadeContratos >0){
                        this.quantidadeContratos = quantidadeContratos;
            }else{
                                        JOptionPane.showMessageDialog(null, "A quantidade de contratos tem que ser no minimo 1 contrato por ativo financeiro!");

            }
                                this.tipoOperacao = tipoOperacao;
                                this.tipoPosicao = tipoPosicao;
                                this.statusOperacao = statusOperacao;
        
        if(image != null){
                    this.imagem = image;
        } else {
                        JOptionPane.showMessageDialog(null, "Escolha uma imagem, é inegociavél");
                        return;
        }
        
       if (descricao != null && !descricao.trim().isEmpty()) {

             this.descricao = descricao;
        } else{
             JOptionPane.showMessageDialog(null, "Visando ter um bom material de estudo e de avaliações de desempenho, coloque uma descrição adequada para que possa chegar a boas conclusões depois.");
                        return;
        }
       
        this.eventoTecnicoBase = eventoTecnicoBase;
        
    }

 
    
    public boolean salvarRegistroController()  {
        OperacaoDao oD = new OperacaoDao();
        Operacao operacao = new Operacao(tipoAtivo,ativo, precoEntrada, precoSaida, quantidadeContratos,tipoOperacao, tipoPosicao, statusOperacao,imagem,descricao,eventoTecnicoBase);
      
        return oD.persistirRegistro(operacao); // esse metodo retorna um boolean
    }
}
