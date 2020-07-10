package aula02.exercicio03;

import java.util.Scanner;

public class Exercicio03 {

    /**
     * Exercicio ler dois numeros em ponto flutuante e exibi-los em ordem decrescente
     * 
     * @author Fabio Leandro Camillo
     * @version 1.0
     */
    public static void main(String[] args) {
        // cria uma scanner para leitura do teclado
        Scanner scanner = new Scanner(System.in);
        // le os numeros
        System.out.print("Informe o numero: ");
        float numero1 = scanner.nextFloat();
        System.out.print("Informe o numero: ");
        float numero2 = scanner.nextFloat();
        // fecha o scanner
        scanner.close();
        // exibe em ordem decrescente
        String msg  = "Numeros em ordem decrescente:\n%.2f\n%.2f"; 
        if (numero1 > numero2) {
            System.out.printf(msg, numero1, numero2);
        } else {
            System.out.printf(msg, numero2, numero1);
        }
    }
}