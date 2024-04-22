package UI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionFactory {
    
    private static final String URL = "jdbc:mysql://54.172.73.239:3306/dbDoska";
    private static final String USUARIO = "maria";
    private static final String SENHA = "Takk@@2003ME%";
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    
    public static Connection getConnection() throws Exception, SQLException{
        try{
            Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA);
            System.out.println("Banco de Dados conectado");
            
            return conn;
        }catch(SQLException e) {
            System.out.println("Erro na conexão do Banco de Dados");
            System.out.println(e.toString());
            
            return null;
        } 
    }    
}
