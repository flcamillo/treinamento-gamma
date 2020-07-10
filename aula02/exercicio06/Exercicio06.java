package aula02.exercicio06;

import java.util.Scanner;

public class Exercicio06 {

    /**
     * Exercicio solicitar 3 valores de um triangulo e verificar qual o tipo
     * <ul>
     * <li>a>b+c ou b>a+c ou c>a+b não forma triângulo
     * <li>a=b e a=c triângulo equilátero
     * <li>a=b ou a=c ou b=c triângulo isósceles
     * <li>caso contrário trângulo escaleno
     * 
     * @author Fabio Leandro Camillo
     * @version 1.0
     */
    public static void main(String[] args) {
        // cria uma scanner para leitura do teclado
        Scanner scanner = new Scanner(System.in);
        // le os 3 valores
        System.out.print("Informe o lado a: ");
        int a = scanner.nextInt();
        System.out.print("Informe o lado b: ");
        int b = scanner.nextInt();
        System.out.print("Informe o lado c: ");
        int c = scanner.nextInt();
        // fecha o scanner
        scanner.close();
        // verifica se forma triangulo
        if ((a > b + c) || (b > a + c) || (c > a + b)) {
            System.out.println("Não é triângulo");
        } else {
            if (a == b && a == c) {
                System.out.println("Triângulo equilátero");
            } else if (a == b || a == c || b == c) {
                System.out.println("Triângulo isósceles");
            } else {
                System.out.println("Triângulo escaleno");
            }
        }
    }
}