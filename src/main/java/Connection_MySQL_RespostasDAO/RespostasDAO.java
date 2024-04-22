package Connection_MySQL_RespostasDAO;

import UI.ConnectionFactory;
import Connection_Respostas.Respostas;
import Jogo.Jogo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class RespostasDAO {
    public void cadastrar(Respostas p) throws Exception{
    Connection conn = ConnectionFactory.getConnection();  
    PreparedStatement ps = null;
    String sql = "insert into Respostas (Ra, Nome, pontuacao) values (? ,?, 0)";
    try{
        ps = conn.prepareStatement(sql);
        ps.setString(1, p.getRa());
        ps.setString(2, p.getNome());
        
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Cadastro feito com sucesso");

    }catch(SQLException e){
        JOptionPane.showMessageDialog(null, "Erro ao salvar respostas" + e.toString());
    }    
    }
    
    public boolean verificacao(Respostas r) throws Exception{
        String sql = "SELECT ra FROM respostas WHERE ra=?";
        try(var conexao = ConnectionFactory.getConnection();
                var ps = conexao.prepareStatement(sql)){
            ps.setString(1, r.getRa());
            try(var rs = ps.executeQuery()){
                return rs.next();
            }
            
        }
    }
    
    public void atualizar(Respostas p) throws Exception{
        String sql = "update Respostas set Nome=?,Pontução=? where Ra=?";
    try(var conn = ConnectionFactory.getConnection();   
            var ps = conn.prepareStatement(sql)) {
        ps.setString(1, p.getRa());
        ps.setString(2, p.getNome());
        ps.setInt(3, p.getPontuacao());
        
         ps.executeUpdate();
         JOptionPane.showMessageDialog(null, "Respostas atualizads com sucesso");
    } catch(SQLException e){
        JOptionPane.showMessageDialog(null, "Erro ao atualizar Respostas" + e.toString());
    }
    }    
    
    public void remover(Respostas p) throws Exception{
        String sql = "delete from Respostas where ra=?";
    try(var conn = ConnectionFactory.getConnection();   
            var ps = conn.prepareStatement(sql)) {
        ps.setString(1, p.getRa());
        
         ps.executeUpdate();
         JOptionPane.showMessageDialog(null, "Dados foram removidos com sucesso");
    } catch(SQLException e){
        JOptionPane.showMessageDialog(null, "Erro ao remover os dados" + e.toString());
    }
    }    
    
    public String listar () throws Exception {
        String sql = "select * from Respostas";
    try(var conn = ConnectionFactory.getConnection();   
            var ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery()){
        StringBuilder sb = new StringBuilder("");
        
        while(rs.next()){
            String ra = rs.getString("Ra");
            String nome = rs.getString("Nome");
            int pontuacao = rs.getInt("Pontuação");
            sb.append(
                 String.format(
                            "Ra:%s, Nome:%s, Pontuacao:%d",
                          ra, nome, pontuacao
                    )
                ).append("\n");
        }
            return sb.toString();
        }       
    }
     public void inserirPontuacao(Respostas r) throws Exception{
    Connection conn = ConnectionFactory.getConnection();  
    String sql = "insert into Respostas (pontuacao, ra, nome) values (?, ?, ?)";
    PreparedStatement ps;
    try{
        ps = conn.prepareStatement(sql);
        ps.setInt(1, r.getPontuacao());
        ps.setString(2, r.getRa());
        ps.setString(3, pegarNome(r.getRa()));
        System.out.println(ps);
        ps.executeUpdate();


    }catch(SQLException e){
        JOptionPane.showMessageDialog(null, "Erro ao salvar pontuacao" + e.toString());
    }    
    }
    
    public String pegarNome(String nome)throws Exception{
        String sql = "SELECT nome FROM usuario WHERE ra=?";
        try(var conexao = ConnectionFactory.getConnection();
                var ps = conexao.prepareStatement(sql)){
            ps.setString(1, nome);
            System.out.println(ps);
            try(var rs = ps.executeQuery()){
                if(rs.next()){
                    return rs.getString("nome");
                }
                else{
                    return "SORRY6";
                }
            }
            }
    } 
     
    public String pegarPontuacao(Respostas r)throws Exception{
        String sql = "SELECT pontuacao FROM respostas WHERE ra=?";
        try(var conexao = ConnectionFactory.getConnection();
                var ps = conexao.prepareStatement(sql)){
            ps.setString(1, r.getRa());
            System.out.println(ps);
            try(var rs = ps.executeQuery()){
                if(rs.next()){
                    return rs.getString("pontuacao");
                }
                else{
                    return "SORRY6";
                }
            }
            }
    }
    
//fim da classe
}
