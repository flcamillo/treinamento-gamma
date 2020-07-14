package aula07.excercicio01;

import java.util.Scanner;
import java.util.Stack;

/**
 * Exercicio utilizar uma pilha para inverter uma frase digitada
 */
public class Exercicio01 {
    
    public static void main(String[] args) {
        
        // define uma pilha de caracteres
        Stack<Character> stack = new Stack<>();
        
        // define um scanner para leitura do teclado e le a frase
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite algo para ser invertido:");
        String texto = scanner.nextLine();
        scanner.close();
        
        // empilha todos os caracteres da frase
        for (int i = 0; i < texto.length(); i++) {
            stack.push(texto.charAt(i));
        }
        
        // remove os caracteres da pilha e exibe na console
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}