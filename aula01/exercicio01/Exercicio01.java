package aula01.exercicio01;

import java.util.Scanner;

public class Exercicio01 {

    /**
     * Exercicio para calcular a média de duas notas
     * 
     * @author Fabio Leandro Camillo
     * @version 1.0
     */
    public static void main(String[] args) {
        // variaveis utilizadas
        float nota1, nota2;
        // cria uma scanner para leitura do teclado
        Scanner scanner = new Scanner(System.in);
        // le a primeira nota
        System.out.print("Informe a primeira nota: ");
        nota1 = scanner.nextFloat();
        // le a segunda nota
        System.out.print("Informe a segunda nota.: ");
        nota2 = scanner.nextFloat();
        // fecha o scanner
        scanner.close();
        // exibe o resultado
        System.out.printf("Sua media foi: %.2f\n", (nota1 + nota2) / 2);
    }
}