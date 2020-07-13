package aula06.exercicio02;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Animal {

    private String nome;
    private String raca;
    private String cor;
    private Date nascimento;
    private Proprietario proprietario;

    /**
     * Construtor do animal
     * 
     * @param nome
     * @param raca
     * @param cor
     * @param nascimento
     */
    public Animal(String nome, String raca, String cor, Date nascimento) {
        this.nome = nome;
        this.raca = raca;
        this.cor = cor;
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public String getCor() {
        return cor;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    /**
     * Altera o metodo padrão do objeto para retonar uma string formatada
     */
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return String.format("Nome: %s Raça: %s Cor: %s Nascimento: %s %s", nome, raca, cor, sdf.format(nascimento),
                proprietario);
    }
}