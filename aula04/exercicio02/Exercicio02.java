package aula04.exercicio02;

import java.util.Scanner;

public class Exercicio02 {

    /**
     * Exercicio ler 7 nomes e exibir os nomes em ordem inversa
     * 
     * @author Fabio Leandro Camillo
     * @version 1.0
     */
    public static void main(String[] args) {
        // cria uma scanner para leitura do teclado
        Scanner scanner = new Scanner(System.in);
        // define o array de nomes
        String[] nomes = new String[7];
        // faz a leitura dos nomes
        for (int i = 0; i < nomes.length; i++) {
            System.out.printf("Informe o %dº nome: ", i+1);
            nomes[i] = scanner.nextLine();
        }
        // fecha o scanner
        scanner.close();
        // exibe em ordem inversa
        System.out.println("Os nomes em ordem inversa são:");
        for (int i = nomes.length - 1; i >= 0; i--) {
            System.out.printf("%s ", nomes[i]);
        }
    }
}