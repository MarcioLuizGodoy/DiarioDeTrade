package controller;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.List;
import model.Dao.OperacaoDao;
import model.Operacao;
import model.TipoOperacao;
import model.TipoPosicao;

public class EditarOperacoesController {

    String escolhaFiltroUsuario;

    public EditarOperacoesController() {
    }

    public boolean validarDadosEdicao(Integer id, String tipoAtivo, String ativo, double precoEntrada, double precoSaida,
            Integer qtdContratos, TipoOperacao tipoOps, TipoPosicao tipoPos, String statusOp, String evTecBase, String descricao, BufferedImage b) {

        if (id == null) {
            return false;
        } else {
        }
        
        if(tipoAtivo.equals("WIN") || tipoAtivo.equals("WDO") || tipoAtivo.equals("ACOES")){
        }else{
            return false;
        }
        
        if(ativo.matches("^[A-Z]{4}\\d+$")){
            
        }else{
            return false;
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
