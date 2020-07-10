package aula05.exercicio01;

public class Placar {
    // atributos do placar
    String time1;
    String time2;
    int time1Gols;
    int time2Gols;    
    /**
     * Cria o placar padrão
     */
    public Placar(){
        time1 = "TimeA";
        time2 = "TimeB";
        time1Gols = 0;
        time2Gols = 0;
    }
    /**
     * Cria o placar com os nomes dos times
     */
    public Placar(String time1, String time2){
        this.time1 = time1;
        this.time2 = time2;
        time1Gols = 0;
        time2Gols = 0;
    }
    /**
     * Cria o placar com os nomes dos times e os gols de cada um
     */
    public Placar(String time1, int time1Gols, String time2, int time2Gols){
        this.time1 = time1;
        this.time2 = time2;
        this.time1Gols = time1Gols;
        this.time2Gols = time2Gols;
    }
    /**
     * Exibe o placar atual
     * @return texto formatado sobre o placar atual
     */
    public String Exibir() {
        return String.format("%s %d x %d %s", time1, time1Gols, time2Gols, time2);
    }
}