package aula05.exercicio02;

public class Exercicio02 {

    /**
     * Exercicio uma classe relogio e usa-la
     * 
     * @author Fabio Leandro Camillo
     * @version 1.0
     */
    public static void main(String[] args) {
        // cria os relogios
        Relogio relogio1 = new Relogio();
        Relogio relogio2 = new Relogio(23, 30, 0);
        // exibe o horario de cada relogio
        System.out.printf("Relogio com construtor padrão: %s\n", relogio1.Exibir());
        System.out.printf("Relogio com hora customizada : %s\n", relogio2.Exibir());
        // ajusta a hora do relogio1
        relogio1.setHora(12);
        relogio1.setMinuto(15);
        relogio1.setSegundo(30);
        // ajusta a hora do relogio2
        relogio2.setHorario(18, 0, 22);
        // exibe o horario de cada relogio
        System.out.printf("Relogio com construtor padrão: %s\n", relogio1.Exibir());
        System.out.printf("Relogio com hora customizada : %s\n", relogio2.Exibir());
    }

}