package aula02.exercicio09;

import java.util.Scanner;

public class Exercicio09 {

    /**
     * Exercicio criar uma calculadora que faz a leitura de dois e a operação, em seguida
     * realiza uma das operações informadas: soma, subtração, multiplicação e devisão.
     * <p>Deve retornar operação inválida se o sinal não for aceito e tratar divisão por zero.
     * 
     * @author Fabio Leandro Camillo
     * @version 1.0
     */
    public static void main(String[] args) {
        // cria uma scanner para leitura do teclado
        Scanner scanner = new Scanner(System.in);
        // le o primeiro numero, seguido da operação e o segundo número
        System.out.printf("Informe a conta a ser realizada.\nForma e uso:\n<num>\n<op> (+ - * /)\n<num>\n");
        float valor1 = scanner.nextFloat();
        String operacao = scanner.next();
        float valor2 = scanner.nextFloat();
        // executa a operação
        switch (operacao.charAt(0)) {
            case '+':
                System.out.printf("= %.2f\n", valor1 + valor2);
                break;
            case '-':
                System.out.printf("= %.2f\n", valor1 - valor2);
                break;
            case '*':
                System.out.printf("= %.2f\n", valor1 * valor2);
                break;
            case '/':
                if (valor2 == 0) {
                    System.out.println("Impossível dividir !");
                } else {
                    System.out.printf("= %.2f\n", valor1 / valor2);
                }
                break;
            default:
                System.out.printf("Sinal '%s' inválido\n", operacao);
        }
        // fecha o scanner
        scanner.close();
    }
}