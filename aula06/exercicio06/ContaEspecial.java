package aula06.exercicio06;

/**
 * Define a Conta Especial com limite para saque, permite o saque de valores
 * abaixo do saldo, até o limite cadastrado.
 */
public class ContaEspecial extends Conta {

    private float limite;

    public ContaEspecial(int numero, float limite) {
        super(numero);
        if (limite < 0) {
            this.limite = 0;
        } else {
            this.limite = limite;
        }
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        if (limite >= 0) {
            this.limite = limite;
        }
    }

    @Override
    public float sacar(float valor) {
        if (getSaldo() + getLimite() >= valor) {
            return super.sacar(valor);
        }
        return 0;
    }

    @Override
    public String toString() {
        return String.format("Conta Especial - Limite: R$ %.2f  %s", limite, super.toString());
    }

}