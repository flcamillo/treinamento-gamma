package aula06.exercicio06;

/**
 * Define a Conta Poupança, não permite o saque de valores maiores que o saldo e
 * possui taxa de serviço para os saques.
 * <p>
 * Possui metodos estaticos para manipulação da taxa.
 */
public class ContaPoupanca extends Conta {

    private static float taxa;

    public ContaPoupanca(int numero) {
        super(numero);
    }

    @Override
    public float sacar(float valor) {
        if (getSaldo() >= valor) {
            super.sacar(taxa);
            return super.sacar(valor);
        }
        return 0;
    }

    @Override
    public String toString() {
        return String.format("Conta Poupança - Taxa de operação: R$ %.2f  %s", taxa, super.toString());
    }

    public static float getTaxa() {
        return taxa;
    }

    public static void setTaxa(float taxa) {
        ContaPoupanca.taxa = taxa;
    }
    
}