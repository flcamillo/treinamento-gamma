package aula04.exercicio04;

import java.util.Scanner;

public class Exercicio04 {

    /**
     * Exercicio escrever o numero digitado por extenso
     * 
     * @author Fabio Leandro Camillo
     * @version 1.0
     */
    public static void main(String[] args) {
        // cria uma scanner para leitura do teclado
        Scanner scanner = new Scanner(System.in);
        // define os nomes dos numeros basicos
        String[] unidades = new String[] { "zero", "um", "dois", "três", "quato", "cinco", "seis", "sete", "oito",
                "nove", "dez", "onze", "doze", "treze", "quatorze", "quinze", "dezeseis", "dezesete", "dezoito",
                "dezenove" };
        String[] dezenas = new String[] { "dez", "vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta",
                "oitenta", "noventa" };
        String[] centenas = new String[] { "cem", "duzentos", "trezentos", "quatrocentos", "quinhentos", "seiscentos",
                "setecentos", "oitocentos", "novecentos" };
        // le um numero para escreve-lo por extenso
        System.out.println("Informe o numero para escreve-lo por extenso: ");
        int numero = scanner.nextInt();
        // fecha o scanner
        scanner.close();
        // define uma variavel para o numero inteiro da divisão
        int inteiro = 0, resto = 0;
        // define o nome do numero
        String nomeNumero = "";
        String nomeCompleto = "";
        // identifica a centena do numero
        if (numero >= 100) {
            resto = numero % 100;
            inteiro = (numero - resto) / 100;
            if (inteiro == 1 && resto > 0) {
                nomeNumero = "cento";
            } else {
                nomeNumero = centenas[inteiro - 1];
            }
            nomeCompleto += nomeNumero;
            numero = resto;
        }
        // identifica a dezena
        if (numero >= 20) {
            resto = numero % 10;
            inteiro = (numero - resto) / 10;
            if (inteiro > 0) {
                nomeNumero = dezenas[inteiro - 1];
            }
            if (nomeCompleto.length() > 0) {
                nomeCompleto += " e ";
            }
            nomeCompleto += nomeNumero;
            numero = resto;
        }
        // identifica a unidade final do numero
        if (numero >= 0 && numero <= 19) {
            if (nomeCompleto.length() > 0) {
                if (numero != 0) {
                    nomeCompleto += " e " + unidades[numero];
                }
            } else {
                nomeCompleto += unidades[numero];
            }
        }
        // identifica a milhar
        if (numero >= 1000 && numero < 100000) {
            nomeCompleto += " mil";
        }
        System.out.println(nomeCompleto);
    }

}