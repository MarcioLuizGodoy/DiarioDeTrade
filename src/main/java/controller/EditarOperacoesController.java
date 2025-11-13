package controller;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.List;
import javax.swing.JOptionPane;
import model.Dao.OperacaoDao;
import model.Operacao;
import model.TipoOperacao;
import model.TipoPosicao;

public class EditarOperacoesController {
    
    String escolhaFiltroUsuario;
    Integer qtdAux;
    Integer auxID;
    TipoOperacao tO;
    double conversaoSaida;
    double conversaoEntrada;
    TipoPosicao tP;
    
    public EditarOperacoesController() {
    }
    
    public boolean validarDadosEdicao(String id, String tipoAtivo, String ativo, String precoEntrada, String precoSaida,
            String qtdContratos, String tipoOpc, String tipoPos, String statusOp, String evTecBase, String descricao, BufferedImage b) {
        
        try {
            
            if (id.isBlank()) {
                JOptionPane.showMessageDialog(null, "O Id tem que ser inserido. Tudo indica que ocorreu um erro interno.");
                return false;
            } else {
                auxID = Integer.valueOf(id);
            }
            
            if (tipoAtivo.equals("WIN") || tipoAtivo.equals("WDO") || tipoAtivo.equals("ACOES")) {
            } else {
                JOptionPane.showMessageDialog(null, "Tipo de ativo tem que ser enviado, não há negociação nesse sentido..");
                return false;
            }
            
            if (ativo != null && !ativo.isBlank() && ativo.matches("^[A-Z]{4,5}\\d+$")) {
                
            } else {
                JOptionPane.showMessageDialog(null, "O nome do ativo esta fora de padrão, ajuste antes de  enviar a Operação. Tente algo nesse padrão: BBAS3, BBAS3F, WINZ25");
                return false;
            }
            
            if (precoEntrada != null && precoEntrada.matches("\\d{3}\\.\\d+")) {
                conversaoEntrada = Double.parseDouble(precoEntrada);
            } else {
                JOptionPane.showMessageDialog(null, "VocêTem que digitar um valor valido parao preco de entrada. Siga esse exemplo: 145.123");
                
            }
            
            if (precoSaida != null && precoSaida.matches("\\d{3}\\.\\d+")) {
                conversaoSaida = Double.parseDouble(precoSaida);
            } else {
                JOptionPane.showMessageDialog(null, "VocêTem que digitar um valor valido parao preco de saida. Siga esse exemplo: 145.123");
                
            }
            
            qtdAux = Integer.valueOf(qtdContratos);
            if (qtdAux > 0) {
                //não foi preciso fazer nada aqui porque a qtd de contrato esta no padrão        
            } else {
                JOptionPane.showMessageDialog(null, "A quantidade de contratos tem que ser no minimo 1 contrato por ativo financeiro!");
                return false;
            }
            tO = TipoOperacao.valueOf(tipoOpc);
            
            if (tO.equals(TipoOperacao.DAY_TRADE) || tO.equals(TipoOperacao.SWING_TRADE) || tO.equals(TipoOperacao.POSITION)) {
                
            } else {
                JOptionPane.showMessageDialog(null, "O Tipo de Operação não foi setada corretamente, insira corretamente no seu codigo.");
                return false;
            }
            tP = TipoPosicao.valueOf(tipoPos);
            
            if (tP.equals(TipoPosicao.BUY) || tP.equals(TipoPosicao.SELL)) {
                
            } else {
                JOptionPane.showMessageDialog(null, "Tipo de Posição foi inserida de forma indevida. Ajuste isso para que tudo de certo.");
                return false;
            }
            
            if (statusOp.equals("GAIN") || statusOp.equals("LOSS")) {
                
            } else {
                JOptionPane.showMessageDialog(null, "O Status da Operação foi inserido de forma Errada, cheque esse detalhe e tudo dara certo.");
                return false;
            }
            
            if (evTecBase.equals("Rompimento") || evTecBase.equals("Regressao media movel")) {
                
            } else {
                JOptionPane.showMessageDialog(null, "Evento Tecnico Escolhido não compativel com as opções");
                return false;
            }
            
            if (descricao == null || descricao.isBlank()) {
                JOptionPane.showMessageDialog(null, "Visando ter boas informações pra estudo e analise posterior, não deixe de forma alguma esse campo em branco.");
                return false;
            } else {
                
            }
            
            if (b != null && b.getWidth() > 0 && b.getHeight() > 0) {
                
            } else {
                JOptionPane.showMessageDialog(null, "A imagem é inválida ou não foi carregada corretamente!");
                return false;
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO: Voê digitou algo errado, deixou de digitar ou digitou com pontuação errada entre numeros. Tambem nao digite letras onde é numeros!");
            return false;
        }
        
        try {
            Operacao op = new Operacao(tipoAtivo, ativo, conversaoEntrada, conversaoSaida, qtdAux, tO, tP, statusOp, b, descricao, evTecBase);
            editarOperacaoController(auxID, op);
                        JOptionPane.showMessageDialog(null, "EDITADO!\n CLIQUE EM BUSCAR PRA VER SE TUDO ESTA COMO VOCÊ DESEJA");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO: Objeto com erro");
        }
        return true;
    }
    
    public void editarOperacaoController(Integer id, Operacao operacao) {
        
        OperacaoDao oD = new OperacaoDao();
        oD.editarOperacao(id, operacao);
        
    }
    
    public void receberEscolhaFiltroTela(String valorEscolha) {
        if (valorEscolha != null) {
            this.escolhaFiltroUsuario = valorEscolha;
        }
    }
    
    public List<Operacao> buscarParaEditarOperacoesController() {
        OperacaoDao oD = new OperacaoDao();
        try {
            List<Operacao> lista = oD.consultarTodasOperacoes();
            return lista;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public List<Operacao> buscarOperacoesEditarController(String linhaEscolhida) {
        return null;
    }
}
