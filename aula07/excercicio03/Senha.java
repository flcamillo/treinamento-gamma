package aula07.excercicio03;

public class Senha {
    
    String nome;
    int numero;
    String tipo;

    public Senha(String nome, int numero, String tipo) {
        this.nome = nome;
        this.numero = numero;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

}