package aula06.exercicio01;

/**
 * Exercicio criar uma classe funcionario com os atributos: nome, hora
 * trabalhada, valor pago por hora trabalhada. Implementar um método para
 * calcular o salário final do funcionario e um para exibir. Criar uma subclasse
 * que representa um funcionario senior, implementar um esquema de bonus para o
 * funcionario senior onde o bonus ocorre a cada 10h trabalhadas, deve-se
 * sobrescrever o metodo de calculo do salario e de exibir para gerar as
 * informações corretas do senior.
 */
public class Exercicio01 {

    public static void main(String[] args) {
        // cria os dois tipos de funcionario
        Funcionario junior = new Funcionario("Fabio", 22.50f);
        Senior senior = new Senior("Camillo", 25.75f, 50.00f);
        // define as horas trabalhadas
        junior.setHorasTrabalhadas(10);
        senior.setHorasTrabalhadas(15);
        // exibe os salarios
        System.out.println(junior.exibir());
        System.out.println(senior.exibir());
    }
}