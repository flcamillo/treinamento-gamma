package aula06.exercicio02;

public class Proprietario {

    private String nome;
    private String telefone;

    /**
     * Construtor do proprietario
     * @param nome
     * @param telefone
     */
    public Proprietario(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    /**
     * Altera o metodo padrão do objeto para retonar uma string formatada
     */
    public String toString() {
        return String.format("Proprietario: %s Tel: %s", nome, telefone);
    }
}