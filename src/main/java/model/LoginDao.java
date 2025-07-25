package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDao {
    // Dados da conexão (ajuste para seu banco)
    private final String URL = "jdbc:mysql://localhost:3306/seu_banco";
    private final String USER = "seu_usuario";
    private final String PASS = "sua_senha";

    public LoginDao() {
        // vazio ou inicializações se precisar
    }

    public boolean validar(Usuario usuario) {
        boolean validado = false;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            // Abrir conexão
            conn = DriverManager.getConnection(URL, USER, PASS);

            // Preparar consulta
            String sql = "SELECT senha FROM usuarios WHERE nome = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, usuario.getNome());

            // Executar consulta
            rs = stmt.executeQuery();

            // Validar senha
            if (rs.next()) {
                String senhaBanco = rs.getString("senha");
                if (senhaBanco.equals(usuario.getSenha())) {
                    validado = true;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Fechar recursos
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return validado;
    }
}
