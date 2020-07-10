package aula03.exercicio01;

public class Exercicio01 {

    /**
     * Exercicio exibir todos os numero na mesma linha, de 100 à 200
     * 
     * @author Fabio Leandro Camillo
     * @version 1.0
     */
    public static void main(String[] args) {
        // define o contador
        int contador = 100;
        // enquanto for menor ou igual que 200 exibe o numero
        while (contador <= 200) {
            System.out.printf("%d ", contador++);
        }
    }
}