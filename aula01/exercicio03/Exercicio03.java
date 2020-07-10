package aula01.exercicio03;

import java.util.Scanner;

public class Exercicio03 {

    /**
     * Exercicio para receber o salário minimo e o consumo em quilowatt de uma residencia 
     * e calcular o valor a ser pago sabendo que o quilowatt custa 1/500 avos do salario minimo.<p>
     * Deve ser exibido:<p><ul> 
     * <li>o valor em reais do quilowatt
     * <li>o valor em reais a ser pago pela residência
     * <li>o valor em reais a ser pago com desconto de 15%</ul>
     * 
     * @author Fabio Leandro Camillo
     * @version 1.0
     */
    public static void main(String[] args) {
        // define o salario e o consumo
        float salario, consumo;
        // define o valor da constante de desconto
        final float DESCONTO = 15;
        // cria uma scanner para leitura do teclado
        Scanner scanner = new Scanner(System.in);
        // le o salario
        System.out.print("Informe o salario minimo: R$ ");
        salario = scanner.nextFloat();
        // le o consumo em quilowatt e calcula o valor total consumido
        System.out.print("Informe o consumo em quilowatt: ");
        consumo = scanner.nextFloat() * salario / 500;
        // fecha o scanner
        scanner.close();
        // exibe o resultado
        System.out.printf("Valor do quilowatt: R$ %.2f\n", salario / 500);
        System.out.printf("Valor total consumido: R$ %.2f\n", consumo);
        System.out.printf("Valor com desconto de %.2f%%: R$ %.2f\n", DESCONTO, consumo - consumo * DESCONTO / 100);
    }
}