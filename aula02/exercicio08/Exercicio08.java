package aula02.exercicio08;

import java.util.Scanner;

public class Exercicio08 {

    /**
     * Exercicio ler 4 notas de um aluno e a quantidade de faltas.
     * <p>Se a quantide de faltas for maior ou igual a 16 ele é reprovado.
     * <p>Se a media das notas foi menor que 6, solicitar a nota do exame e recalcular a média. 
     * Se esta média for maior que 5 ele esta aprovado, caso contrário, esta reprovado.
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
        System.out.print("Informe a terceira nota: ");
        float nota3 = scanner.nextFloat();
        System.out.print("Informe a quarta nota: ");
        float nota4 = scanner.nextFloat();
        System.out.print("Informe a quantidade de faltas: ");
        int faltas = scanner.nextInt();
        // se faltou 16 ou mais vezes é reprovado
        if (faltas >= 16) {
            System.out.println("Reprovado por faltas");
        } else {
            float media = (nota1 + nota2 + nota3 + nota4) / 4;
            if ( media >= 6) {
                System.out.printf("Aluno aprovado com média de %.2f\n", media);
            } else {
                // se ficou com media inferior a 6 solicita então a nota do exame 
                // e recalcula a media
                System.out.print("Informe a nota do exame: ");
                float notaExame = scanner.nextFloat();
                media = (media + notaExame) / 2; 
                if (media >= 5) {
                    System.out.printf("Aluno aprovado com média de %.2f\n", media);
                } else {
                    System.out.printf("Aluno reprovado! média %.2f\n", media);
                }
            }
        }
        // fecha o scanner
        scanner.close();
    }
}