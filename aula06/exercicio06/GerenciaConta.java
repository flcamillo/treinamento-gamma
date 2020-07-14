package aula06.exercicio06;

import java.util.ArrayList;

/**
 * Define o Gerenciador de Contas, armazenados as contas e permitindo todas as
 * operações sobre as contas e taxas.
 */
public class GerenciaConta {

    ArrayList<Conta> contas = new ArrayList<>();

    public GerenciaConta() {
        ContaCorrente.setTaxa(0.10f);
        ContaPoupanca.setTaxa(0.50f);
    }

    private Conta procurar(int numero) {
        for (Conta conta : contas) {
            if (conta.getNumero() == numero) {
                return conta;
            }
        }
        return null;
    }

    public boolean criarContaCorrente(int numero) {
        if (procurar(numero) != null) {
            return false;
        }
        ContaCorrente conta = new ContaCorrente(numero);
        return contas.add(conta);
    }

    public boolean criarContaPoupanca(int numero) {
        if (procurar(numero) != null) {
            return false;
        }
        ContaPoupanca conta = new ContaPoupanca(numero);
        return contas.add(conta);
    }

    public boolean criarContaEspecial(int numero, float limite) {
        if (procurar(numero) != null) {
            return false;
        }
        ContaEspecial conta = new ContaEspecial(numero, limite);
        return contas.add(conta);
    }

    public boolean removerConta(int numero) {
        Conta conta = procurar(numero);
        if (conta != null) {
            return contas.remove(conta);
        }
        return false;
    }

    public void listar() {
        for (Conta conta : contas) {
            System.out.println(conta);
        }
    }

    public boolean sacar(int contaNumero, float valor) {
        Conta conta = procurar(contaNumero);
        if (conta != null) {
            return conta.sacar(valor) != 0;
        }
        return false;
    }

    public boolean depositar(int contaNumero, float valor) {
        Conta conta = procurar(contaNumero);
        if (conta != null) {
            return conta.depositar(valor);
        }
        return false;
    }

    public boolean exibirConta(int contaNumero) {
        Conta conta = procurar(contaNumero);
        if (conta != null) {
            System.out.println(conta);
            return true;
        }
        return false;
    }

    public boolean definirTaxaPoupanca(float taxa) {
        if (taxa < 0) {
            return false;
        }
        ContaPoupanca.setTaxa(taxa);
        return true;
    }

    public boolean definirTaxaContaCorrente(float taxa) {
        if (taxa < 0) {
            return false;
        }
        ContaCorrente.setTaxa(taxa);
        return true;
    }

    public void exibirTaxas() {
        System.out.printf("Taxa da conta corrente: R$ %.2f\n", ContaCorrente.getTaxa());
        System.out.printf("Taxa da poupança: R$ %.2f\n", ContaPoupanca.getTaxa());
    }

}