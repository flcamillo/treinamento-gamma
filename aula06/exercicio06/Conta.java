package aula06.exercicio06;

/**
 * Classe generica para implementação de novas contas. Possui com atributos o
 * numero da conta e o saldo atual.
 * <p>
 * Faz validações básicas de saques e depósitos impendindo valores negativos.
 */
public abstract class Conta {

    private int numero;
    private float saldo;

    public Conta(int numero) {
        this.numero = numero;
    }

    public boolean depositar(float valor) {
        if (valor < 0) {
            return false;
        }
        saldo += valor;
        return true;
    }

    public float sacar(float valor) {
        if (valor < 0) {
            return 0;
        }
        saldo -= valor;
        return valor;
    }

    public int getNumero() {
        return numero;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public String toString() {
        return String.format("Conta numero: %d  Saldo: R$ %.2f", numero, getSaldo());
    }

}