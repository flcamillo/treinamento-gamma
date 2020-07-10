package aula01.exercicio02;

import java.util.Scanner;

public class Exercicio02 {

    /**
     * Exercicio para calcular o aumento de 25% no salário do funcionário
     * 
     * @author Fabio Leandro Camillo
     * @version 1.0
     */
    public static void main(String[] args) {
        // define o salario
        float salario;
        // define o valor de aumento do salario
        float aumento = 25;
        // cria uma scanner para leitura do teclado
        Scanner scanner = new Scanner(System.in);
        // le o salario
        System.out.print("Informe seu salario: R$ ");
        salario = scanner.nextFloat();
        // fecha o scanner
        scanner.close();
        // calcula o novo salario
        salario += salario * aumento / 100;
        // exibe o resultado
        System.out.printf("Seu salário após reajuste de %.2f%% será: R$ %.2f\n", aumento, salario);
    }
}