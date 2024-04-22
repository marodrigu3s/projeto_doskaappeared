package Connection_Questoes;

        
public class Questoes {
    
    private String id;
    private String alternativaA;
    private String alternativaB;
    private String alternativaC;
    private String alternativaD;
    private String perguntas;
    private String respostas;
    private String idBusca;
    
    public Questoes(String id, String alternativaA, String alternativaB, String alternativaC, String alternativaD, String perguntas, String respostas, String idBusca1) {
        this.id = id;
        this.alternativaA = alternativaA;
        this.alternativaB = alternativaB;
        this.alternativaC = alternativaC;
        this.alternativaD = alternativaD;
        this.perguntas = perguntas;
        this.respostas = respostas;       
        this.idBusca = idBusca1;
    }
    public Questoes(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAlternativaA() {
        return alternativaA;
    }

    public void setAlternativaA(String AlternativaA) {
        this.alternativaA = AlternativaA;
    }

    public String getAlternativaB() {
        return alternativaB;
    }

    public void setAlternativaB(String AlternativaB) {
        this.alternativaB = AlternativaB;
    }

    public String getAlternativaC() {
        return alternativaC;
    }

    public void setAlternativaC(String AlternativaC) {
        this.alternativaC = AlternativaC;
    }

    public String getAlternativaD() {
        return alternativaD;
    }

    public void setAlternativaD(String AlternativaD) {
        this.alternativaD = AlternativaD;
    }

    public String getPerguntas() {
        return perguntas;
    }

    public void setPerguntas(String perguntas) {
        this.perguntas = perguntas;
    }

    public String getRespostas() {
        return respostas;
    }

    public void setRespostas(String respostas) {
        this.respostas = respostas;
    }
    
    public String getIdBusca() {
        return idBusca;
    }

    public void setIdBusca(String idBusca1) {
        this.idBusca = idBusca1;
    }
}