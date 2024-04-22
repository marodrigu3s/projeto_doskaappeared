
package Jogo;

public class Jogo {
    private String pontuacaoInicial;
    private String pontuacaoFinal;
    private String casaInicial;
    private String casaFinal = "1";
    private String pontuacao = "0";
    private String vidas = "3";
    private String ra;

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }
   
    
    public String getCasaInicial() {
        return casaInicial;
    }

    public void setCasaInicial(String casaInicial) {
        this.casaInicial = casaInicial;
    }

    public String getCasaFinal() {
        return casaFinal;
    }

    public void setCasaFinal(String casaFinal) {
        this.casaFinal = casaFinal;
    }

    public String getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(String pontuacao) {
        this.pontuacao = pontuacao;
    }
    public String getVidas() {
        return vidas;
    }

    public void setVidas(String vidas) {
        this.vidas = vidas;
    }
    
    
    
    //métodos:
    public int posicaoX(int casaInicial){
        switch(casaInicial){
            case 1:
            return 300;
            case 2:
                return 430;
            case 3:
                return 560;
            case 4:
                return 690;
            case 5:
                return 820;
            case 6:
                return 820;
            case 7:
                return 820;
            case 8:
                return 690;
            case 9:
                return 560;
            case 10:
                return 430;
            case 11:
                return 300;
            case 12:
                return 300;
            case 13:
                return 300;
            case 14:
                return 430;
            case 15:
                return 560;
            case 16:
                return 690;
            case 17:
                return 820;
            default:
                return 0;
        }
    }
    
    public int posicaoY(int casaInicial){
        switch(casaInicial){
            case 1:
            return 300;
            case 2:
                return 430;
            case 3:
                return 560;
            case 4:
                return 690;
            case 5:
                return 820;
            case 6:
                return 820;
            case 7:
                return 820;
            case 8:
                return 690;
            case 9:
                return 560;
            case 10:
                return 430;
            case 11:
                return 300;
            case 12:
                return 300;
            case 13:
                return 300;
            case 14:
                return 430;
            case 15:
                return 560;
            case 16:
                return 690;
            case 17:
                return 820;
            default:
                return 0;
        }
    }
    
   
}
