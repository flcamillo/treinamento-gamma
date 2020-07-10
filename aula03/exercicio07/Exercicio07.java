package aula03.exercicio07;

import java.util.Scanner;

public class Exercicio07 {

    /**
     * Exercicio criar um painel para votação em 4 candidatos (numeros, 1-4) ou
     * votar em nulo ou branco numeros, 5 e 6)
     * <p>
     * Deverá ser exibido o total de votos, a quantidade de votos em cada canditado
     * e o percetual de votos em cada um
     * 
     * @author Fabio Leandro Camillo
     * @version 1.0
     */
    public static void main(String[] args) {
        // cria uma scanner para leitura do teclado
        Scanner scanner = new Scanner(System.in);
        // define o total de eleitores
        final int ELEITORES = 10;
        // define os candidatos
        int candidato1 = 0;
        int candidato2 = 0;
        int candidato3 = 0;
        int candidato4 = 0;
        // define o total de brancos e nulos
        int brancos = 0;
        int nulos = 0;
        // le os votos
        for (int i = 1; i <= ELEITORES; i++) {
            System.out.printf("Eleitor [%2d] informe seu candidato (5 = nulo 6 = em branco): ", i);
            switch (scanner.nextInt()) {
                case 1:
                    candidato1++;
                    break;
                case 2:
                    candidato2++;
                    break;
                case 3:
                    candidato3++;
                    break;
                case 4:
                    candidato4++;
                    break;
                case 6:
                    brancos++;
                    break;
                default:
                    nulos++;
            }
        }
        // define o total de votos validos e o total de todos os votos
        int votos = candidato1 + candidato2 + candidato3 + candidato4;  
        int total = votos + brancos + nulos;      
        // exibe os totais de votos
        System.out.printf("Total de votos em branco : %d percentual: %.2f%%\n", brancos, (float) brancos / total * 100);
        System.out.printf("Total de votos nulos     : %d percentual: %.2f%%\n", nulos, (float) nulos / total * 100);
        System.out.printf("Total de votos Candidato1: %d percentual: %.2f%%\n", candidato1, (float) candidato1 / votos * 100);
        System.out.printf("Total de votos Candidato2: %d percentual: %.2f%%\n", candidato2, (float) candidato2 / votos * 100);
        System.out.printf("Total de votos Candidato3: %d percentual: %.2f%%\n", candidato3, (float) candidato3 / votos * 100);
        System.out.printf("Total de votos Candidato4: %d percentual: %.2f%%\n", candidato4, (float) candidato4 / votos * 100);
        // fecha o scanner
        scanner.close();
    }
}