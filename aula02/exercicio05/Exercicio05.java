package aula02.exercicio05;

import java.util.Scanner;

public class Exercicio05 {

    /**
     * Exercicio ler a senha do usuário e validar se a mesma é "R10p5"
     * 
     * @author Fabio Leandro Camillo
     * @version 1.0
     */
    public static void main(String[] args) {
        // cria uma scanner para leitura do teclado
        Scanner scanner = new Scanner(System.in);
        // le a palavra magica
        System.out.print("Informe a palavra mágica: ");
        String segredo = scanner.nextLine();
        // fecha o scanner
        scanner.close();
        if (segredo.equals("R10p5")) {
            System.out.printf("Acesso concedido.");
        } else {
            System.out.printf("Acesso negado");
        }
    }
}