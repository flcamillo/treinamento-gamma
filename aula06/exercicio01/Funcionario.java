package aula06.exercicio01;

public class Funcionario {
    // atributos
    private String nome;
    private float horasTrabalhadas;
    private float valorHora;

    /**
     * Construtor com nome e valor da hora trabalhada
     */
    public Funcionario(String nome, float valorHora) {
        this.nome = nome;
        if (valorHora >= 0) {
            this.valorHora = valorHora;
        }
    }

    /**
     * Retorna o nome do funcionario
     * @return nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do funcionario
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna as horas trabalhadas
     * @return horas
     */
    public float getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    /**
     * Define as horas trabalhadas
     * @param horasTrabalhadas
     */
    public void setHorasTrabalhadas(float horasTrabalhadas) {
        if (horasTrabalhadas >= 0) {
            this.horasTrabalhadas = horasTrabalhadas;
        } else {
            this.horasTrabalhadas = 0;
        }
    }

    /**
     * Retorna o valor por hora trabalhada
     * @return o valor da hora
     */
    public float getValorHora() {
        return valorHora;
    }

    /**
     * Define o valor da hora trabalhada
     * @param valorHora
     */
    public void setValorHora(float valorHora) {
        if (valorHora >= 0) {
            this.valorHora = valorHora;
        } else {
            this.valorHora = 0;
        }
    }

    /**
     * Retorna o calculo do salario do funcionario
     * @return salario calculado
     */
    public float salario() {
        return valorHora * horasTrabalhadas;
    }

    /**
     * Retorna uma string formatada do com os dados do funcionario e salario
     * @return nome, horas e salario
     */
    public String exibir() {
        return String.format("%s (Junior) trabalhou %.2fh e receberá R$ %.2f", nome, horasTrabalhadas, salario());
    }
}