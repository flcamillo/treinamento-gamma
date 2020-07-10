package aula04.exercicio06;

import java.util.Scanner;

public class Exercicio06 {

    /**
     * Exercicio contar quantas vogais existem em uma frase ou palavra através de uma função
     * 
     * @author Fabio Leandro Camillo
     * @version 1.0
     */
    public static void main(String[] args) {
        // cria uma scanner para leitura do teclado
        Scanner scanner = new Scanner(System.in);
        // faz a leitura da frase e conta as vogais
        System.out.println("Digite alguma coisa:");
        System.out.printf("Total de vogais do texto: %d\n", contarVogais(scanner.nextLine()));
        // fecha o scanner
        scanner.close();
    }

    /**
     * Faz a contagem das vogais em um texto
     * 
     * @param numeros
     * @return a quantidade de vogais
     */
    public static int contarVogais(String texto) {
        int vogais = 0;
        for (int i = 0; i < texto.length(); i++) {
            switch (texto.charAt(i)) {
                case 'a':
                case 'A':
                case 'e':
                case 'E':
                case 'i':
                case 'I':
                case 'o':
                case 'O':
                case 'u':
                case 'U':
                    vogais++;
                    break;
            }
        }
        return vogais;
    }
}