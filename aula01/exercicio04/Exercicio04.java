package aula01.exercicio04;

import java.util.Scanner;

public class Exercicio04 {

    /**
     * Exercicio para ler uma medida em quilometros e converter em outras unidades
     * Deve ser exibido o comprimento:<p><ul> 
     * <li>em pés
     * <li>em polegadas
     * <li>em jardas
     * <li>em milhas</ul>
     * 
     * @author Fabio Leandro Camillo
     * @version 1.0
     */
    public static void main(String[] args) {
        // define a comprimento
        float comprimento;
        // cria uma scanner para leitura do teclado
        Scanner scanner = new Scanner(System.in);
        // le o comprimento em milhas
        System.out.print("Informe o comprimento em KM: ");
        comprimento = scanner.nextFloat();
        // calcula as medidas
        float milhas = comprimento * 0.62137f;
        float jardas = milhas * 1760;
        float pes = jardas * 3;
        float polegadas = pes * 12;
        // fecha o scanner
        scanner.close();
        // exibe o resultado
        System.out.printf("Comprimento em Milhas   : %.2f\n", milhas);
        System.out.printf("Comprimento em Jardas   : %.2f\n", jardas);
        System.out.printf("Comprimento em Pés      : %.2f\n", pes);
        System.out.printf("Comprimento em Polegadas: %.2f\n", polegadas);
    }
}