
package db;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DB {
    
    private static Connection conn;
    
    private static Properties carregarProperties(){
        try(InputStream is = DB.class.getClassLoader().getResourceAsStream("db.properties")){
                Properties props = new Properties();
                props.load(is);
                return props;
        }
        catch(IOException e){
                throw new DbException(e.getMessage());
            
        }
    }
    
    
    
    public static Connection pegarConnection() throws SQLException{
        if (conn == null ){
            try {
                Properties propriedades = carregarProperties();
                String url = propriedades.getProperty("dburl");
                conn = DriverManager.getConnection(url, propriedades);  
                }
            catch(SQLException e ){
                throw new DbException(e.getMessage());
                
            }
        } return conn;
    }
    
    
    
    public static void fecharConnection(){
        if( conn != null){
            try {
               conn.close();
            }
            catch(SQLException e){
                throw new DbException(e.getMessage());
                
            }
        }
    }
    
    
    
}
