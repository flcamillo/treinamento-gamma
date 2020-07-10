package aula03.exercicio04;

import java.util.Scanner;

public class Exercicio04 {

    /**
     * Exercicio solicitar 10 numeros para o usuário e exibir a quantidade de numeros impares e numeros pares
     * 
     * @author Fabio Leandro Camillo
     * @version 1.0
     */
    public static void main(String[] args) {
        // cria uma scanner para leitura do teclado
        Scanner scanner = new Scanner(System.in);
        // define os contadores
        int contador = 1, pares = 0, impares = 0;
        // enquanto for menor ou igual a 10 solicita o numero ao usuário e identifica se é par ou impar
        while (contador <= 10) {
            System.out.printf("Digite o %dº o numero: ", contador);
            if (scanner.nextInt() % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
            contador++;
        }
        // exibe as quantidades identificadas
        System.out.printf("Total de pares é: %s\n", pares);
        System.out.printf("Total de ímpares é: %s\n", impares);
        // fecha o scanner
        scanner.close();
    }
}