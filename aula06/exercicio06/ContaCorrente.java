package aula06.exercicio06;

/**
 * Define a Conta Corrente, não permite o saque de valores maiores que o saldo e
 * possui taxa de serviço para os depósitos.
 * <p>
 * Possui metodos estaticos para manipulação da taxa.
 */
public class ContaCorrente extends Conta {

    private static float taxa;

    public ContaCorrente(int numero) {
        super(numero);
    }

    @Override
    public float sacar(float valor) {
        if (getSaldo() < valor) {
            return 0;
        }
        return super.sacar(valor);
    }

    @Override
    public boolean depositar(float valor) {
        return super.depositar(valor - taxa);
    }

    @Override
    public String toString() {
        return String.format("Conta Corrente - %s", super.toString());
    }

    public static float getTaxa() {
        return taxa;
    }

    public static void setTaxa(float taxa) {
        ContaCorrente.taxa = taxa;
    }

}