package aula04.exercicio07;

public class Exercicio07 {

    /**
     * Exercicio criar e utilizar a classe veículos contendo os atributos, marca, modelo e consumo
     * 
     * @author Fabio Leandro Camillo
     * @version 1.0
     */
    public static void main(String[] args) {
        // cria os veículos
        Veiculo ford = new Veiculo("KA", "Ford", 9.1f);
        Veiculo honda = new Veiculo("Civic", "Honda", 12.5f);
        Veiculo bmw = new Veiculo("X1", "BMW", 8.0f);
        // exibe os dados de cada um
        System.out.println(ford.info());
        System.out.println(honda.info());
        System.out.println(bmw.info());
    }

}