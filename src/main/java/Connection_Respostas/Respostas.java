package Connection_Respostas;

public class Respostas {
    private String ra;
    private String nome;
    private int pontuacao;
    
    //construtores:

    public Respostas(String ra, String nome, int pontuacao) {
        this.ra = ra;
        this.nome = nome;
        this.pontuacao = pontuacao;
    }

    public Respostas(String ra, int pontuacao) {
        this.ra = ra;
        this.pontuacao = pontuacao;
    }
    
    
    
    public Respostas(String ra) {
        this.ra = ra;
    }

    //getters and setters:
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

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    
}
    



















    
    