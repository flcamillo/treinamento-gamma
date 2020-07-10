package aula04.exercicio01;

import java.util.Scanner;

public class Exercicio01 {

    /**
     * Exercicio ler a nota de 10 alunos e armazena-las em um array, calcular a nota média da turma
     * exibir as notas digitas e a quantidade de notas acima da média.
     * 
     * @author Fabio Leandro Camillo
     * @version 1.0
     */
    public static void main(String[] args) {
        // cria uma scanner para leitura do teclado
        Scanner scanner = new Scanner(System.in);
        // define o array de notas
        float[] notas = new float[10];
        // define a nota média da turma
        float media = 0;
        // faz a leitura das notas dos alunos
        for (int i = 0; i < notas.length; i++) {
            float nota;
            do {
                System.out.printf("Informe a nota do %dº aluno: ", i+1);
                nota = scanner.nextFloat();
            } while (nota < 0 || nota > 10);
            notas[i] = nota;
            // soma a nota para depois calcular a média
            media += nota;
        }
        // calcula a nota média
        media /= notas.length;
        // exibe as notas e identifica quantas ficaram acima da média
        int acimaMedia = 0;
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Nota do %dº aluno => %.2f\n", i+1, notas[i]);
            if (notas[i] >= media) {
                acimaMedia++;
            }
        }
        // exibe a nota média e a quantidade de notas acima da média
        System.out.printf("Nota média da turma: %.2f\n", media);
        System.out.printf("Quantidade de alunos com notas acima da média: %d\n", acimaMedia);
        // fecha o scanner
        scanner.close();
    }
}