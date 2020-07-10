package aula05.exercicio02;

public class Relogio {
    // atributos do relogio
    private int hora;
    private int minuto;    
    private int segundo;    
    /**
     * Cria o relogio padrão
     */
    public Relogio(){
        hora = minuto = segundo = 0;
    }
    /**
     * Cria o Relogio com o horário inicial
     */
    public Relogio(int hora, int minuto, int segundo){
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
    /**
     * Define o horário do relogio
     */
    public void setHorario(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
    /**
     * Retorna a hora atual
     * @return hora
     */
    public int getHora() {
        return hora;
    }
    /**
     * Define a hora atual
     * @param hora
     */
    public void setHora(int hora) {
        this.hora = hora;
    }
    /**
     * Retorna o minuto atual
     * @return minuto
     */
    public int getMinuto() {
        return minuto;
    }
    /**
     * Define o minuto atual
     * @param minuto
     */
    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }
    /**
     * Retorna o segundo atual
     * @return segundo
     */
    public int getSegundo() {
        return segundo;
    }
    /**
     * Define o segundo atual
     * @param segundo
     */
    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }
    /**
     * Exibe o horario atual
     * @return texto formatado com hora minuto e segundo
     */
    public String Exibir() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }

}