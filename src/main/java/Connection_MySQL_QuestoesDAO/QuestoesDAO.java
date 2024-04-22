package Connection_MySQL_QuestoesDAO;

import UI.ConnectionFactory;
import Connection_Questoes.Questoes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class QuestoesDAO {
    public void cadastrar(Questoes q) throws Exception{
    Connection conn = ConnectionFactory.getConnection();  
    PreparedStatement ps = null;
    String sql = "insert into Questoes (id, AlternativaA, AlternativaB, AlternativaC, AlternativaD, Perguntas, Respostas) values (?, ?, ?, ?, ?, ?, ?)";
    try{
        ps = conn.prepareStatement(sql);
        ps.setString(1, q.getId());
        ps.setString(2, q.getAlternativaA());
        ps.setString(3, q.getAlternativaB());
        ps.setString(4,q.getAlternativaC());
        ps.setString(5,q.getAlternativaD());
        ps.setString(6, q.getPerguntas());
        ps.setString(7, q.getRespostas());
        
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Questões foram inseridas com sucesso");

    }catch(SQLException e){
        JOptionPane.showMessageDialog(null, "Erro ao salvar questões" + e.toString());
    }    
    }
    
    public void atualizar(Questoes q) throws Exception{
        String sql = "update Questoes set id=?, AlternativaA=?,AlternativaB=?, AlternativaC=?, AlternativaD=?, Perguntas=?, Respostas=? where id=?";
    try(var conn = ConnectionFactory.getConnection();   
            var ps = conn.prepareStatement(sql)) {
        ps.setString(1, q.getId());
        ps.setString(2, q.getAlternativaA());
        ps.setString(3, q.getAlternativaB());
        ps.setString(4, q.getAlternativaC());
        ps.setString(5,q.getAlternativaD());
        ps.setString(6, q.getPerguntas());
        ps.setString(7, q.getRespostas());
        ps.setString(8,q.getIdBusca());
        
         ps.executeUpdate();
         JOptionPane.showMessageDialog(null, "Questões atualizads com sucesso");
    } catch(SQLException e){
        JOptionPane.showMessageDialog(null, "Erro ao atualizar questões" + e.toString());
    }
    }    
    
    public void remover(Questoes q) throws Exception{
        String sql = "delete from Questoes where Id=?";
    try(var conn = ConnectionFactory.getConnection();   
            var ps = conn.prepareStatement(sql)) {
        ps.setString(1, q.getId());
        
         ps.executeUpdate();
         JOptionPane.showMessageDialog(null, "Questões foram removidos com sucesso");
    } catch(SQLException e){
        JOptionPane.showMessageDialog(null, "Erro ao remover os questões" + e.toString());
    }
    }    
    
    public String listar () throws Exception {
        String sql = "select * from Questoes;";
    try(var conn = ConnectionFactory.getConnection();   
            var ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery()){
        StringBuilder sb = new StringBuilder("");
        
        while(rs.next()){
            int id = rs.getInt("id");
            String AlternativaA = rs.getString("AlternativaA");
            String AlternativaB = rs.getString("AlternativaB");
            String AlternativaC = rs.getString("AlternativaC");
            String AlternativaD = rs.getString("AlternativaD");
            String perguntas = rs.getString("Perguntas");
            String respostas = rs.getString("Respostas");
            
            sb.append(
                 String.format(
                            "id:%d, AlternativaA:%s, AlternativaB:%s, AlternativaC:%s, AlternativaD:%s, Perguntas:%s, Respostas:%s",
                          id, AlternativaA, AlternativaB, AlternativaC, AlternativaD, perguntas, respostas
                    )
                ).append("\n");
        }
            return sb.toString();
        }       
    }
    
    public boolean existe(Questoes q) throws Exception{
        String sql = "SELECT id FROM QUESTOES WHERE id=?";
        try(var conexao = ConnectionFactory.getConnection();
                var ps = conexao.prepareStatement(sql)){
            ps.setString(1, q.getId());
            try(var rs = ps.executeQuery()){
                return rs.next();
            }
        }
    }
    
    public String vaiEnunciado(Questoes q)throws Exception{
        String sql = "SELECT perguntas FROM questoes WHERE id=?;";
        try(var conexao = ConnectionFactory.getConnection();
                var ps = conexao.prepareStatement(sql)){
            ps.setString(1, q.getId());
            try(var rs = ps.executeQuery()){
                if(rs.next()){
                    return rs.getString("Perguntas");
                }
                else{
                    return "SORRY1";
                }
            }
            }
    }
    
    public String listarAlternativaA(Questoes q)throws Exception{
        String sql = "SELECT alternativaA FROM questoes WHERE id=?;";
        //2. Abrir uma conexão com o Banco
        //try-with-resources
        //3. Preparar o comando
        try(var conexao = ConnectionFactory.getConnection();
                var ps = conexao.prepareStatement(sql)){
            ps.setString(1, q.getId());
            try(var rs = ps.executeQuery()){
                if(rs.next()){
                    //6. Manipular os dados resultantes
                    return rs.getString("alternativaA");
                }
                else{
                    return "SORRY2";
                }
            }
            }
    }
    
    public String listarAlternativaB(Questoes q)throws Exception{
        String sql = "SELECT alternativaB FROM questoes WHERE id=?;";
        try(var conexao = ConnectionFactory.getConnection();
                var ps = conexao.prepareStatement(sql)){
            ps.setString(1, q.getId());
            try(var rs = ps.executeQuery()){
                if(rs.next()){
                    return rs.getString("alternativaB");
                }
                else{
                    return "SORRY3";
                }
            }
            }
    }
    
    public String listarAlternativaC(Questoes q)throws Exception{
        String sql = "SELECT alternativaC FROM questoes WHERE id=?;";
        //2. Abrir uma conexão com o Banco
        //try-with-resources
        //3. Preparar o comando
        try(var conexao = ConnectionFactory.getConnection();
                var ps = conexao.prepareStatement(sql)){
            //4. Substituir os eventuais placeholders
            ps.setString(1, q.getId());
            //5. Executar o comando
            //try-with-resources
            try(var rs = ps.executeQuery()){
                if(rs.next()){
                    //6. Manipular os dados resultantes
                    return rs.getString("alternativaC");
                }
                else{
                    return "SORRY4";
                }
            }
            }
    }
    
    public String listarAlternativaD(Questoes q)throws Exception{
        String sql = "SELECT alternativaD FROM questoes WHERE id=?;";
        try(var conexao = ConnectionFactory.getConnection();
                var ps = conexao.prepareStatement(sql)){
            ps.setString(1, q.getId());
            try(var rs = ps.executeQuery()){
                if(rs.next()){
                    return rs.getString("alternativaD");
                }
                else{
                    return "SORRY5";
                }
            }
            }
    }
    
    public String verificacaoResposta(Questoes q)throws Exception{
        String sql = "SELECT respostas FROM questoes WHERE id=?;";
        try(var conexao = ConnectionFactory.getConnection();
                var ps = conexao.prepareStatement(sql)){
            ps.setString(1, q.getId());
            try(var rs = ps.executeQuery()){
                if(rs.next()){
                    return rs.getString("Respostas");
                }
                else{
                    return "SORRY6";
                }
            }
            }
    }
    public boolean verificacao(Questoes q) throws Exception{
        String sql = "SELECT id FROM QUESTOES WHERE id=?";
        try(var conexao = ConnectionFactory.getConnection();
                var ps = conexao.prepareStatement(sql)){
            ps.setString(1, q.getId());
            try(var rs = ps.executeQuery()){
                return rs.next();
            }
        }
    }
}
