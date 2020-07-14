package aula07.excercicio01;

import java.util.Scanner;
import java.util.Stack;

/**
 * Exercicio utilizar uma pilha para inverter uma frase digitada e inverter palavras em tirar as palavra de ordem
 */
public class Exercicio01 {

    public static void main(String[] args) {

        // define uma pilha de caracteres
        Stack<Character> letras = new Stack<>();
        Stack<String> palavras = new Stack<>();

        // define um scanner para leitura do teclado e le a frase
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite algo para ser invertido:");
        String texto = scanner.nextLine();
        scanner.close();

        // empilha todos os caracteres da frase
        for (int i = 0; i < texto.length(); i++) {
            letras.push(texto.charAt(i));
        }

        // remove os caracteres da pilha e identifica se forma palavra
        // se formar adiciona a palavra na pilha de palavras
        String palavra = "";
        while (!letras.isEmpty()) {
            Character letra = letras.pop();
            if (letra == ' ') {
                if (palavra.length() > 0) {
                    palavras.push(palavra);
                    palavra = "";
                }
            } else {
                palavra += letra;
            }
            System.out.print(letra);
        }
        // adiciona a palavra se ainda houver uma
        if (palavra.length() > 0) {
            palavras.push(palavra);
        }
        System.out.println();

        // exibe as palavras em ordem porem com seus caracteres invertidos
        while (!palavras.isEmpty()) {
            System.out.print(palavras.pop() + " ");
        }
        System.out.println();

    }

}