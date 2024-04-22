package Connection_Usuarios;


public class Usuario {
    private String ra;
    private String nome;
    private String email;
    private String senha;
    private String raBusca;
    
    //construtor para atualização de usuário(atualizar usuário);
    public Usuario(String ra, String nome, String email, String senha, String raBusca) {
        this.ra = ra;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.raBusca = raBusca;
    }
    
    //construtor para busca de ra (excluir usuário)
    public Usuario(String ra) {
        this.ra = ra;
    }

    //construtor para busca do login(tela de login)
    public Usuario(String ra, String senha) {
        this.ra = ra;
        this.senha = senha;
    }

    //construtor paera cadastrar novo usuário(telas de cadastro)
    public Usuario(String ra, String nome, String email, String senha) {
        this.ra = ra;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public Usuario() {
    }
    

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }   

    public String getRaBusca() {
        return raBusca;
    }

    public void setRaBusca(String raBusca) {
        this.raBusca = raBusca;
    }
    
}






