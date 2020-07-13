package aula06.exercicio01;

public class Funcionario {
    // atributos
    private String nome;
    private float horasTrabalhadas;
    private float valorHora;

    // construtor com nome e valor da hora trabalhada
    public Funcionario(String nome, float valorHora) {
        this.nome = nome;
        this.valorHora = valorHora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(float horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    // retorna o calculo do salario do funcionario
    public float salario() {
        return valorHora * horasTrabalhadas;
    }

    // retorna os dados do funcionario
    public String exibir() {
        return String.format("%s (Junior) trabalhou %.2fh e receberá R$ %.2f", nome, horasTrabalhadas, salario());
    }
}