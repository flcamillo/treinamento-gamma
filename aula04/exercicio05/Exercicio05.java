package aula04.exercicio05;

import java.util.Scanner;

public class Exercicio05 {

    /**
     * Exercicio criar uma função que recebe 3 numeros e retorne qual é o menor deles
     * 
     * @author Fabio Leandro Camillo
     * @version 1.0
     */
    public static void main(String[] args) {
        // cria uma scanner para leitura do teclado
        Scanner scanner = new Scanner(System.in);
        // define o array de numeros
        int[] numeros = new int[3];
        // faz a leitura dos numeros
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Informe o %dº numero: ", i+1);
            numeros[i] = scanner.nextInt();
        }
        // fecha o scanner
        scanner.close();
        // exibe o menor numero
        System.out.printf("O menor numero é: %d\n", menorNumero(numeros));
    }
    /**
     * Identifica o menor numero dentro de um array de inteiros
     * 
     * @param numeros
     * @return o menor numero encontrado
     */
    public static int menorNumero(int[] numeros) {
        int menor = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (menor > numeros[i]) {
                menor = numeros[i];
            }
        }
        return menor;
    }
}