package aula02.exercicio07;

import java.util.Scanner;

public class Exercicio07 {

    /**
     * Exercicio ler o salario de uma pessoa e exibir o desconto do INSS
     * <ul>
     * <li>abaixo de 600 reais = isento
     * <li>maior que 600 e menor ou igual 1200 = 20%
     * <li>maior que 1200 e menor ou igual 2000 = 25%
     * <li>maior que 2000 = 30%
     * </ul>
     * 
     * @author Fabio Leandro Camillo
     * @version 1.0
     */
    public static void main(String[] args) {
        // cria uma scanner para leitura do teclado
        Scanner scanner = new Scanner(System.in);
        // le o salario
        System.out.print("Informe o salario: R$ ");
        float salario = scanner.nextFloat();
        // fecha o scanner
        scanner.close();
        // calcula o desconto
        if (salario <= 600) {
            System.out.println("Isento.");
        } else if (salario <= 1200) {
            System.out.printf("20%% de desconto. R$ %.2f\n", salario * 0.2f);
        } else if (salario <= 2000) {
            System.out.printf("25%% de desconto. R$ %.2f\n", salario * 0.25f);
        } else {
            // acima de 2000 o desconto será de 30%
            System.out.printf("30%% de desconto. R$ %.2f\n", salario * 0.3f);
        }
    }
}