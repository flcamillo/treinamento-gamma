package aula03.exercicio03;

import java.util.Scanner;

public class Exercicio03 {

    /**
     * Exercicio solicitar um numero e calcular os multiplo: 1, 2, 4, 8 até o numero digitado
     * 
     * @author Fabio Leandro Camillo
     * @version 1.0
     */
    public static void main(String[] args) {
        // cria uma scanner para leitura do teclado
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o numero: ");
        int numero = scanner.nextInt();
        // fecha o scanner
        scanner.close();
        // define o contador
        int contador = 1;
        // enquanto for menor ou igual ao numero multiplica o contador por 2
        while (contador <= numero) {
            System.out.printf("%d ", contador);
            contador *= 2;
        }
    }
}