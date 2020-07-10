package aula02.exercicio02;

import java.util.Scanner;

public class Exercicio02 {

    /**
     * Exercicio calcular a média de duas notas onde nota 1 possui peso de 40% e
     * nota 2 60% e informar se o aluno foi ou não aprovado (média >= 6)
     * 
     * @author Fabio Leandro Camillo
     * @version 1.0
     */
    public static void main(String[] args) {
        // cria uma scanner para leitura do teclado
        Scanner scanner = new Scanner(System.in);
        // le as notas
        System.out.print("Informe a primeira nota: ");
        float nota1 = scanner.nextFloat();
        System.out.print("Informe a segunda nota: ");
        float nota2 = scanner.nextFloat();
        // fecha o scanner
        scanner.close();
        // calcula a média
        float media = nota1 * 0.4f + nota2 * 0.6f;
        // verifica se foi aprovado
        if (media >= 6) {
            System.out.printf("Parabéns! você foi aprovado com a média %.2f\n", media);
        } else {
            System.out.printf("Reprovado! sua média de %.2f não foi suficiente\n", media);
        }
    }
}