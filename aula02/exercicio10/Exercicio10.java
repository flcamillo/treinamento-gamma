package aula02.exercicio10;

import java.util.Scanner;

public class Exercicio10 {

    /**
     * Exercicio ler o número da semana e informar se é dia util ou não.
     * <p>Considere que segunda = 1 e domingo = 7
     * 
     * @author Fabio Leandro Camillo
     * @version 1.0
     */
    public static void main(String[] args) {
        // cria uma scanner para leitura do teclado
        Scanner scanner = new Scanner(System.in);
        // le o primeiro numero, seguido da operação e o segundo número
        System.out.printf("Informe o numero do dia da semana (segunda = 1, domingo = 7): ");
        int semana = scanner.nextInt();
        // fecha o scanner
        scanner.close();
        // identifica se é dia util ou não
        switch (semana) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.printf("Dia útil");
                break;
            case 6:
            case 7:
                System.out.printf("Não é dia útil");
                break;
            default:
                System.out.println("Dia da semana inválido");
        }
    }
}