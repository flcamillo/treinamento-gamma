package aula01.sample02;

import java.util.Scanner;

/**
 * Uso de váriaveis
 * 
 * @author Fabio Leandro Camillo
 * @version 1.0
 */
public class Sample02 {
    public static void main(String[] args) {
        // define as variaveis que serão utilizadas
        int valorUm;
        int valorDois;
        int soma;
        // cria uma scanner para leitura do teclado
        Scanner scanner = new Scanner(System.in);
        // le o primeiro valor
        System.out.print("Informe o primeiro valor: ");
        valorUm = scanner.nextInt();
        // le o segundo valor
        System.out.print("Informe o segundo valor: ");
        valorDois = scanner.nextInt();
        // fecha o scanner
        scanner.close();        
        // calcula a soma
        soma = valorUm + valorDois;
        // exibe o resultado
        System.out.printf("Valor 1: %d Valor 2: %d e a Soma é: %d\n", valorUm, valorDois, soma);
    }
}