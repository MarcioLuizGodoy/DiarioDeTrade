package model.Dao;

import db.DB;
import db.DbException;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.sql.Types;
import javax.imageio.ImageIO;
import model.Operacao;
import java.util.ArrayList;
import java.util.List;
import model.TipoOperacao;
import model.TipoPosicao;


    public class OperacaoDao {
    public OperacaoDao(){
    }
    
    
    
    public boolean persistirRegistro(Operacao operacao) {
      String sql = "INSERT INTO Operacoes (tipo_ativo, ativo, preco_entrada, preco_saida, quantidade_contratos, tipo_operacao, tipo_posicao, status_operacao, imagem, descricao, evento_tecnico_base)" +
                         "VALUES (?,?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
      try (
              
            Connection conn = DB.pegarConnection();
            PreparedStatement ps = conn.prepareStatement(sql)){
                
                ps.setString(1,operacao.getTipoAtivo());
                ps.setString(2, operacao.getAtivo());
                ps.setDouble(3, operacao.getPrecoEntrada());
                ps.setDouble(4, operacao.getPrecoSaida());
                ps.setInt(5, operacao.getQuantidadeContratos());
                ps.setString(6, operacao.getTipoOperacao().toString());
                ps.setString(7, operacao.getTipoPosicao().toString());
                        ps.setString(8, operacao.getStatusOperacao());

        if (operacao.getImg() != null) {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write(operacao.getImg(), "png", baos);
            byte[] imagemBytes = baos.toByteArray();
            ps.setBytes(9, imagemBytes);
        } else {
            ps.setNull(9, Types.BLOB);
        }
        
                ps.setString(10, operacao.getDescricao());
                ps.setString(11,operacao.getEventoTecnicoBase());
            int linhasAfetadas = ps.executeUpdate();
            return linhasAfetadas > 0;

    } catch (SQLException | IOException e) {
                    e.printStackTrace(); 
                       return false;
        } finally{
          DB.fecharConnection();
      }
    }
 
    
    //METODO QUE CONSULTA O BANCO E DEVOLVE UMA LISTA DAS OPERACOES CONSULTADAS QUE ATENDAM AO CRITERIO TODAS AS ( OPERACOES COMO FILTRO DESEJADO).
    public List<Operacao> consultarTodasOperacoes() throws IOException {
    String sql = "SELECT * FROM operacoes";
    List<Operacao> lista = new ArrayList<>();
        try {
            Connection conn = DB.pegarConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Operacao op = new Operacao();
            
            //PEGANDO DADOS DO BANCO E SETANDO NOS OBJETOS OPERACOES.
            op.setId(rs.getInt("id"));
            op.setTipoAtivo(rs.getString("tipo_ativo"));
            op.setAtivo(rs.getString("ativo"));
            op.setPrecoEntrada(rs.getDouble("preco_entrada"));
            op.setPrecoSaida(rs.getDouble("preco_saida"));
            op.setQuantidadeContratos(rs.getInt("quantidade_contratos"));
            op.setTipoOperacao(TipoOperacao.valueOf( rs.getString("tipo_operacao"))); 
            op.setTipoPosicao(TipoPosicao.valueOf(rs.getString("tipo_posicao")));  
            op.setStatusOperacao(rs.getString("status_operacao"));
            op.setDescricao(rs.getString("descricao"));
            op.setEventoTecnicoBase(rs.getString("evento_tecnico_base"));
            Timestamp timestamp = rs.getTimestamp("data_hora");
                        if(timestamp != null){
                        op.setDataHora(timestamp.toLocalDateTime());
                        }
            byte[] bytes = rs.getBytes("imagem");
            if (bytes != null) {
                ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
                BufferedImage img = ImageIO.read(bais);
                op.setImg(img);
            }
            lista.add(op);
        }
            DB.fecharConnection();
            
        } catch (SQLException e) {
            e.printStackTrace(); // ou tratamento mais robusto
        }
    return lista;
}

    
    
   public List<Operacao> consultarOperacoesPorAtivo(String ativo) {
    List<Operacao> listaOperacoes = new ArrayList<>();
    try {
        String sql = "SELECT * FROM operacoes WHERE UPPER(ativo) = UPPER(?)";
        Connection conn = DB.pegarConnection();
        
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, ativo);  
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            
            Operacao op = new Operacao();
            
            op.setId(rs.getInt("id"));
            op.setTipoAtivo(rs.getString("tipo_ativo"));
            op.setAtivo(rs.getString("ativo"));
            op.setPrecoEntrada(rs.getDouble("preco_entrada"));
            op.setPrecoSaida(rs.getDouble("preco_saida"));
            op.setQuantidadeContratos(rs.getInt("quantidade_contratos"));
            op.setTipoOperacao(TipoOperacao.valueOf(rs.getString("tipo_operacao")));
            op.setTipoPosicao(TipoPosicao.valueOf(rs.getString("tipo_posicao")));
            op.setStatusOperacao(rs.getString("status_operacao"));
            Timestamp timestamp = rs.getTimestamp("data_hora");
            if (timestamp != null) {
                op.setDataHora(timestamp.toLocalDateTime());
            }
            op.setDescricao(rs.getString("descricao"));
            op.setEventoTecnicoBase(rs.getString("evento_tecnico_base"));
            byte[] bytes = rs.getBytes("imagem");
            if (bytes != null) {
                ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
                BufferedImage img = ImageIO.read(bais);
                op.setImg(img);
            }

            listaOperacoes.add(op);
        }
        DB.fecharConnection();

    } catch (DbException | SQLException|IOException e) {
        e.printStackTrace();
    }
    return listaOperacoes;
}
    

   
   
   
   
   public List<Operacao> consultarOperacoesPorTipoAtivo(String tipoAtivo){
       
    List<Operacao> operacoes = new ArrayList<>();
    try{
    String sql = "SELECT * FROM operacoes WHERE UPPER(tipo_ativo) = UPPER(?)";
        Connection conn = DB.pegarConnection();
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, tipoAtivo);
        ResultSet rs = ps.executeQuery();    
        
        while(rs.next()){
            Operacao op = new Operacao();
            
            op.setId(rs.getInt("id"));
            op.setTipoAtivo(rs.getString("tipo_ativo"));
            op.setAtivo(rs.getString("ativo"));
            op.setPrecoEntrada(rs.getDouble("preco_entrada"));
            op.setPrecoSaida(rs.getDouble("preco_saida"));
            op.setQuantidadeContratos(rs.getInt("quantidade_contratos"));
            op.setTipoOperacao(TipoOperacao.valueOf(rs.getString("tipo_operacao")));
            op.setTipoPosicao(TipoPosicao.valueOf(rs.getString("tipo_posicao")));
            op.setStatusOperacao(rs.getString("status_operacao"));
            Timestamp timestamp = rs.getTimestamp("data_hora");
            if (timestamp != null) {
            op.setDataHora(timestamp.toLocalDateTime());
                }
            op.setDescricao(rs.getString("descricao"));
            op.setEventoTecnicoBase(rs.getString("evento_tecnico_base"));
            byte[] bytes = rs.getBytes("imagem");
            if (bytes != null) {
                ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
                BufferedImage img = ImageIO.read(bais);
                op.setImg(img);
            }

            operacoes.add(op);
            return operacoes;
        }
        DB.fecharConnection();

    }
    catch(DbException | SQLException e ){
        e.printStackTrace();
    }
    catch (IOException ex) {
        ex.printStackTrace();
        }
        return new ArrayList<>();
    }
    
}

