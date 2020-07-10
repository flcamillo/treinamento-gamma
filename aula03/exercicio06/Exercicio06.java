package aula03.exercicio06;

import java.util.Scanner;

public class Exercicio06 {

    /**
     * Exercicio reescrever o código for abaixo em while
     * 
     * @author Fabio Leandro Camillo
     * @version 1.0
     */
    public static void main(String[] args) {
        // cria uma scanner para leitura do teclado
        Scanner scanner = new Scanner(System.in);
        // define os contadores
        int quantidade = 0, positivos = 0, soma = 0;
        // inicia a leitura dos numeros e faz as devidas contatagens
        for (int i = 1; i <= 10; i++) {
            System.out.printf("Informe o %dº número: ", i);
            int numero = scanner.nextInt();
            if (numero >= 0) {
                positivos++;
            }
            soma += numero;
            quantidade++;
        }
        // calcula o percentual de positivos e a média dos números digitados
        float percentualPositivo = (float) positivos / quantidade * 100;
        float media = (float) soma / quantidade;
        // exibe os resultados
        System.out.printf("Total de números digitados     : %d\n", quantidade);
        System.out.printf("Soma dos números digitados     : %d\n", soma);
        System.out.printf("Média dos números digitados    : %.2f\n", media);
        System.out.printf("Total de números positivos     : %d\n", positivos);
        System.out.printf("Percentual de números positivos: %.2f%%\n", percentualPositivo);
        // fecha o scanner
        scanner.close();
    }
}