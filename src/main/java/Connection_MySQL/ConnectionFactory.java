package Connection_MySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionFactory {
    
    private static final String URL = "jdbc:mysql://localhost:3306/dbDoska";
    private static final String USUARIO = "root";
    private static final String SENHA = "Felipe@2804";
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
