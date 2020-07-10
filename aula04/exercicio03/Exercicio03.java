package aula04.exercicio03;

import java.util.Random;

public class Exercicio03 {

    /**
     * Exercicio simular a rolagem de um dado 100x e identificar quantos vezes saiu cada lado
     * 
     * @author Fabio Leandro Camillo
     * @version 1.0
     */
    public static void main(String[] args) {
        // define o total de simulações a serem executadas
        final int SIMULACOES = 100;
        // define o total de lados que o dado pode ter
        final int LADOS = 6;
        // define o array com os lados sorteados do dado
        int[] lados = new int[LADOS];
        // define o gerador de numeros aleatórios
        Random random = new Random();
        // faz a simulação incrementando a quantidade de lados que foi sorteado
        for (int i = 0; i < SIMULACOES; i++) {
            lados[random.nextInt(LADOS)] += 1;
        }
        // exibe os resultados
        System.out.printf("Realizado %d simulações com dados de %d lados\n", SIMULACOES, LADOS);
        for (int i = 0; i < lados.length; i++) {
            System.out.printf("O valor %d do dado foi sorteado %d vez(es)\n", i+1, lados[i]);
        }
    }
}