package aula03.exercicio08;

import java.util.Scanner;

public class Exercicio08 {

    /**
     * Exercicio ler 2 notas de 5 alunos e realizar a média de cada aluno e da classe toda
     * <p>
     * A nota do aluno deve ser validada, ou seja, só pode aceitar notas entre 0 e 10
     * 
     * @author Fabio Leandro Camillo
     * @version 1.0
     */
    public static void main(String[] args) {
        // cria uma scanner para leitura do teclado
        Scanner scanner = new Scanner(System.in);
        // define o total de alunos e total de notas
        final int ALUNOS = 5;
        final int NOTAS = 2;
        // define a soma da nota da sala
        float notaSala = 0;
        // faz a leitura das notas dos alunos
        for (int i = 1; i <= ALUNOS; i++) {
            // define a soma das notas do aluno
            float soma = 0;
            for (int j = 1; j <= NOTAS; j++) {
                // le as notas
                float nota;
                do {
                    System.out.printf("Aluno [%2d] informe a nota [%d]: ", i, j);
                    nota = scanner.nextFloat();
                } while (nota < 0 || nota > 10);
                soma += nota;
            }
            // exibe a média da nota do aluno
            float media = (float) soma / NOTAS;
            System.out.printf("Aluno [%2d] sua média foi: %.2f\n", i, media);
            // soma a nota média do aluno ao total da sala
            notaSala += media;
        }
        // exibe a média da nota da sala
        System.out.printf("Nota média da sala: %.2f\n", notaSala / ALUNOS);
        // fecha o scanner
        scanner.close();
    }
}