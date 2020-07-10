package aula03.exercicio05;

public class Exercicio05 {

    /**
     * Exercicio reescrever o código for abaixo em while
     * 
     * @author Fabio Leandro Camillo
     * @version 1.0
     */
    public static void main(String[] args) {
        // codigo usando for
        int a = 10;
        for (int i = 0; i < 3; i++) {
            a = a + i;
            System.out.println("For : " + a);
        }
        // codigo usando while
        int aa = 10, i = 0;
        while (i < 3) {
            aa = aa + i;
            System.out.println("While : " + aa);
            i++;
        }
    }
}