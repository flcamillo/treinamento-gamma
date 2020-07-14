package aula07.excercicio03;

/**
 * Define uma classe para ser utilizada com uma senha de atendimento em uma fila.
 */
public class Senha {
    
    // atributos da senha
    String nome;
    int numero;
    String tipo;

    /**
     * Construtor principal
     * @param nome - nome da pessoa a ser atendia
     * @param numero - numero sequencial da senha atribuida
     * @param tipo - tipo de senha, exemplo: prioritário ou comum
     */
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