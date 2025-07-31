package model;

import db.DB;
import db.DbException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginDao {
    
    Connection conn = null;
    Statement st = null;
    ResultSet rs = null;
       
    
    public LoginDao() {
        
    }
    
    public boolean validar(Usuario u){
       boolean validado = false;
       try {
            conn = DB.pegarConnection();
            st = conn.createStatement();
            rs = st.executeQuery("SELECT * FROM usuarios WHERE nome = '" + u.getNome() + "'");

       while(rs.next()){

            String nome =  rs.getString("Nome");
            String senha =  rs.getString("Senha");
              if(nome.equals(u.getNome()) && senha.equals(u.getSenha())){
                validado = true;
                DB.fecharConnection();
                break;
              }
       }
    }
    catch(SQLException e){
        throw new DbException(e.getMessage());
        }      
        return validado;
        
    }
}
   
    
