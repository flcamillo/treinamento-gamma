package aula02.exercicio04;

import java.util.Scanner;

public class Exercicio04 {

    /**
     * Exercicio ler o salário bruto e o valor da prestação e informa se o emprestimo pode ser realizado<p>
     * O emprestimo não pode ser realizado se a prestação ultrapassar 30% do salário bruto
     * 
     * @author Fabio Leandro Camillo
     * @version 1.0
     */
    public static void main(String[] args) {
        // cria uma scanner para leitura do teclado
        Scanner scanner = new Scanner(System.in);
        // le os numeros
        System.out.print("Informe o salário bruto     : R$ ");
        float salario = scanner.nextFloat();
        System.out.print("Informe o valor da prestação: R$ ");
        float prestacao = scanner.nextFloat();
        // fecha o scanner
        scanner.close();
        // calcula o valor máximo da prestação baseado no sálario
        float limite = salario * 0.3f;
        if (prestacao > limite) {
            System.out.printf("Desculpe o empréstimo não pode ser realizado.");
        } else {
            System.out.printf("Empréstimo disponível !");
        }
    }
}