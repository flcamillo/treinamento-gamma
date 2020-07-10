package aula05.exercicio01;

public class Exercicio01 {

    /**
     * Exercicio criar uma classe placar com 3 contrutores diferentes e um metodo para exibir o placar e criar
     * 3 placares usando cada construtor para testa-los
     * 
     * @author Fabio Leandro Camillo
     * @version 1.0
     */
    public static void main(String[] args) {
        // cria os placares
        Placar placar1 = new Placar();
        Placar placar2 = new Placar("Brasil", "Argentina");
        Placar placar3 = new Placar("Brasil", 3, "Argentina", 0);
        // exibe o resultado de cada um
        System.out.printf("Placar com construtor padrão: %s\n", placar1.Exibir());
        System.out.printf("Placar apenas com os times: %s\n", placar2.Exibir());
        System.out.printf("Placar completo com os times e gols: %s\n", placar3.Exibir());
    }

}