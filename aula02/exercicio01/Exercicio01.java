package aula02.exercicio01;

import java.util.Scanner;

public class Exercicio01 {

    /**
     * Exercicio verificar se um número digitado é maior a 20, se for calcular
     * metade dele
     * 
     * @author Fabio Leandro Camillo
     * @version 1.0
     */
    public static void main(String[] args) {
        // cria uma scanner para leitura do teclado
        Scanner scanner = new Scanner(System.in);
        // le o numero
        System.out.print("Informe o número mágico: ");
        int numero = scanner.nextInt();
        // fecha o scanner
        scanner.close();
        // faz a magica
        if (numero > 20) {
            System.out.printf("Metade do número.: %.2f\n", numero / 2f);
        }
    }
}