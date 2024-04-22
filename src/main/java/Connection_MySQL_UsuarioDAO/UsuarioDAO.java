package Connection_MySQL_UsuarioDAO;

import UI.ConnectionFactory;
import Connection_Usuarios.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UsuarioDAO {
    
    public void cadastrar(Usuario p) throws Exception{
        Connection conn = ConnectionFactory.getConnection();  
        PreparedStatement ps = null;
        String sql = "insert into Usuario (ra, nome, email, senha) values (? ,?, ?, ?)";
        try{
            ps = conn.prepareStatement(sql);
            ps.setString(1, p.getRa());
            ps.setString(2, p.getNome());
            ps.setString(3, p.getEmail());
            ps.setString(4, p.getSenha());

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Dados foram inseridos com sucesso");
            //ver se pode colocar JOptionPane ou se o Bossini vai implicar

        }catch(SQLException e){
            System.out.println("Erro ao salvar os dados" + e.toString());
            //same
        }    
    }
    
    public void atualizar(Usuario p) throws Exception{
        String sql = "update Usuario set Nome=?,Email=?,Senha=?, Ra=? where Ra=?";
    try(var conn = ConnectionFactory.getConnection();   
            var ps = conn.prepareStatement(sql)) {
        ps.setString(1, p.getRa());
        ps.setString(2, p.getNome());
        ps.setString(3, p.getEmail());
        ps.setString(4, p.getSenha());
        ps.setString(5, p.getRaBusca());
        
         ps.executeUpdate();
         System.out.println("dados atualizados com sucesso");
         JOptionPane.showMessageDialog(null, "Dados atualizados com sucesso.");
    } catch(SQLException e){
        JOptionPane.showMessageDialog(null, "Erro ao atualizar dados.");
        System.out.println("erro ao atualizar dados: \n" + e.toString());
    }
    }    
    
    public void remover(Usuario p) throws Exception{
        String sql = "delete from Usuario where Ra=?";
    try(var conn = ConnectionFactory.getConnection();   
            var ps = conn.prepareStatement(sql)) {
        ps.setString(1, p.getRa());
        
         ps.executeUpdate();
    } catch(SQLException e){
        JOptionPane.showMessageDialog(null, "Erro ao remover dados" + e.toString());
    }
    }    
    
    public String listar () throws Exception {
        String sql = "select * from Usuario";
    try(var conn = ConnectionFactory.getConnection();   
            var ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery()){
        StringBuilder sb = new StringBuilder("");
        
        while(rs.next()){
            String ra = rs.getString("Ra");
            String nome = rs.getString("Nome");
            String email = rs.getString("Email");
            String senha = rs.getString("Senha");
            sb.append(
                 String.format(
                            "Ra:%s, Nome:%s, Email:%s, Senha:%s",
                            ra, nome, email, senha
                    )
                ).append("\n");
        }
            return sb.toString();
        }       
    } 
    
    public boolean existe(Usuario u) throws Exception{
        String sql = "SELECT senha,ra FROM USUARIO WHERE ra=? AND senha=?";
        try(var conexao = ConnectionFactory.getConnection();
                var ps = conexao.prepareStatement(sql)){
            ps.setString(1, u.getRa());
            ps.setString(2, u.getSenha());
            try(var rs = ps.executeQuery()){
                return rs.next();
            }
            
        }
    }
    
    public boolean verificacao(Usuario u) throws Exception{
        String sql = "SELECT ra FROM USUARIO WHERE ra=?";
        try(var conexao = ConnectionFactory.getConnection();
                var ps = conexao.prepareStatement(sql)){
            ps.setString(1, u.getRa());
            try(var rs = ps.executeQuery()){
                return rs.next();
            }
            
        }
    }
    
        
}        

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

