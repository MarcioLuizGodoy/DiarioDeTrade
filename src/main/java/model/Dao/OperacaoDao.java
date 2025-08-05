package model.Dao;

import db.DB;
import db.DbException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;
import javax.imageio.ImageIO;
import model.Operacao;

public class OperacaoDao {
    public OperacaoDao(){
    }
     String sql = "INSERT INTO Operacoes (ativo, preco_entrada, preco_saida, quantidade_contratos, tipo_operacao, tipo_posicao, status_operacao, imagem) " +
                         "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
    
    
 public boolean persistirRegistro(Operacao operacao) {
      try (
            Connection conn = DB.pegarConnection();
            PreparedStatement ps = conn.prepareStatement(sql)){
          
                ps.setString(1, operacao.getAtivo());
                ps.setDouble(2, operacao.getPrecoEntrada());
                ps.setDouble(3, operacao.getPrecoSaida());
                ps.setInt(4, operacao.getQuantidadeContratos());
                ps.setString(5, operacao.getTipoOperacao().toString());
                ps.setString(6, operacao.getTipoPosicao().toString());
                ps.setString(7, operacao.getStatusOperacao());

        if (operacao.getImg() != null) {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write(operacao.getImg(), "png", baos);
            byte[] imagemBytes = baos.toByteArray();
            ps.setBytes(8, imagemBytes);
        } else {
            ps.setNull(8, Types.BLOB);
        }
            int linhasAfetadas = ps.executeUpdate();
            return linhasAfetadas > 0;

    } catch (SQLException | IOException e) {
                    e.printStackTrace(); // Ou use um logger
                       return false;
        } finally{
          DB.fecharConnection();
      }
    }
}