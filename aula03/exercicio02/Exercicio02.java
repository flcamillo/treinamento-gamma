package aula03.exercicio02;

import java.util.Scanner;

public class Exercicio02 {

    /**
     * Exercicio exibir a tabuada de um numero digitado
     * 
     * @author Fabio Leandro Camillo
     * @version 1.0
     */
    public static void main(String[] args) {
        // cria uma scanner para leitura do teclado
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o numero para ver a tabuada: ");
        int numero = scanner.nextInt();
        // fecha o scanner
        scanner.close();
        // define o contador
        int contador = 0;
        // enquanto for menor ou igual que 10 exibe a tabuada do numero
        while (contador <= 10) {
            System.out.printf("%d x %d = %d\n", numero, contador, contador * numero);
            contador++;
        }
    }
}