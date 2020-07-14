package aula06.exercicio06;

import java.util.Scanner;

/**
 * Exercicio criar uma classe Conta, ContaCorrente, ContaPoupanca, ContaEspecial
 * para controlar saques e depositos. A classe ContaCorrente deve descontar 10
 * centavos de cada deposito. A classe ContaPoupanca faz saque apenas se houver
 * saldo e deve descontar uma taxa para cada saque. A classe ContaEspecial deve
 * possuir um limite e permitir o saque se o saldo+limite >= 0.
 * <p>
 * Criar um gerenciador para realizar todas as operações nas contas e criar um
 * menu de opções para realizar as operações.
 */
public class Exercicio06 {

    static GerenciaConta gc = new GerenciaConta();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int operacao = 0;
        do {
            operacao = exibirMenuPrincipal();
            switch (operacao) {
                case 1:
                    criarContaCorrente();
                    break;
                case 2:
                    criarContaPoupanca();
                    break;
                case 3:
                    criarContaEspecial();
                    break;
                case 4:
                    removerConta();
                    break;
                case 5:
                    exibirConta();
                    break;
                case 6:
                    realizarDeposito();
                    break;
                case 7:
                    realizarSaque();
                    break;
                case 8:
                    listarContas();
                    break;
                case 9:
                    definirTaxaContaCorrente();
                    break;
                case 10:
                    definirTaxaPoupanca();
                    break;
                case 11:
                    exibirTaxas();
                    break;
            }
        } while (operacao > 0);
        scanner.close();
    }

    public static int exibirMenuPrincipal() {
        System.out.println("\n==== Menu Principal =====");
        System.out.println(" 1 ) criar conta corrente");
        System.out.println(" 2 ) criar conta poupança");
        System.out.println(" 3 ) criar conta especial");
        System.out.println(" 4 ) remover conta");
        System.out.println(" 5 ) exibir conta");
        System.out.println(" 6 ) realizar depósito");
        System.out.println(" 7 ) realizar saque");
        System.out.println(" 8 ) listar contas");
        System.out.println(" 9 ) alterar taxa da conta corrente");
        System.out.println(" 10) alterar taxa da poupança");
        System.out.println(" 11) exibir taxas");
        System.out.print("\nInforme a operação (0 = Sair): ");
        return scanner.nextInt();
    }

    public static void criarContaCorrente() {
        System.out.println("\n==== Criar Conta Corrente =====");
        System.out.print("Informe o numero da conta: ");
        int numero = scanner.nextInt();
        if (gc.criarContaCorrente(numero)) {
            System.out.printf("Conta corrente '%d' criada com sucesso\n", numero);
        } else {
            System.out.printf("Não foi possível criar a conta corrente '%d'\n", numero);
        }
    }

    public static void criarContaPoupanca() {
        System.out.println("\n==== Criar Conta Poupança =====");
        System.out.print("Informe o numero da conta: ");
        int numero = scanner.nextInt();
        if (gc.criarContaPoupanca(numero)) {
            System.out.printf("Conta poupança '%d' criada com sucesso\n", numero);
        } else {
            System.out.printf("Não foi possível criar a conta poupança '%d'\n", numero);
        }
    }

    public static void criarContaEspecial() {
        System.out.println("\n==== Criar Conta Especial =====");
        System.out.print("Informe o numero da conta: ");
        int numero = scanner.nextInt();
        System.out.print("Informe o limite de saque da conta: R$ ");
        float limite = scanner.nextFloat();
        if (gc.criarContaEspecial(numero, limite)) {
            System.out.printf("Conta especial '%d' criada com sucesso\n", numero);
        } else {
            System.out.printf("Não foi possível criar a conta especial '%d'\n", numero);
        }
    }

    public static void removerConta() {
        System.out.println("\n==== Remover Conta =====");
        System.out.print("Informe o numero da conta: ");
        int numero = scanner.nextInt();
        if (gc.removerConta(numero)) {
            System.out.printf("Conta '%d' removida com sucesso\n", numero);
        } else {
            System.out.printf("Não foi possível remover a conta '%d'\n", numero);
        }
    }

    public static void exibirConta() {
        System.out.println("\n==== Exibir Conta =====");
        System.out.print("Informe o numero da conta: ");
        int numero = scanner.nextInt();
        if (!gc.exibirConta(numero)) {
            System.out.printf("Não foi possível exibir a conta '%d'\n", numero);
        }
    }

    public static void realizarDeposito() {
        System.out.println("\n==== Realizar Depósito =====");
        System.out.print("Informe o numero da conta: ");
        int numero = scanner.nextInt();
        System.out.print("Informe o valor do depósito: R$ ");
        float valor = scanner.nextFloat();
        if (gc.depositar(numero, valor)) {
            System.out.printf("Depósito na conta '%d' no valor R$ %.2f realizado com sucesso\n", numero, valor);
        } else {
            System.out.printf("Não foi possível realizar o depósito de R$ %.2f na conta '%d'\n", valor, numero);
        }
    }

    public static void realizarSaque() {
        System.out.println("\n==== Realizar Saque =====");
        System.out.print("Informe o numero da conta: ");
        int numero = scanner.nextInt();
        System.out.print("Informe o valor do saque: R$ ");
        float valor = scanner.nextFloat();
        if (gc.sacar(numero, valor)) {
            System.out.printf("Saque na conta '%d' no valor R$ %.2f realizado com sucesso\n", numero, valor);
        } else {
            System.out.printf("Não foi possível realizar o saque de R$ %.2f na conta '%d'\n", valor, numero);
        }
    }

    public static void listarContas() {
        System.out.println("\n==== Listar Contas =====");
        gc.listar();
    }

    public static void definirTaxaPoupanca() {
        System.out.println("\n==== Alterar Taxa da Poupança =====");
        System.out.print("Informe a nova taxa: R$ ");
        float taxa = scanner.nextFloat();
        if (gc.definirTaxaPoupanca(taxa)) {
            System.out.printf("Taxa alterada com sucesso para R$ %.2f\n", taxa);
        } else {
            System.out.printf("Não foi possível alterar a taxa para R$ %.2f\n", taxa);
        }
    }

    public static void definirTaxaContaCorrente() {
        System.out.println("\n==== Alterar Taxa da Conta Corrente =====");
        System.out.print("Informe a nova taxa: R$ ");
        float taxa = scanner.nextFloat();
        if (gc.definirTaxaContaCorrente(taxa)) {
            System.out.printf("Taxa alterada com sucesso para R$ %.2f\n", taxa);
        } else {
            System.out.printf("Não foi possível alterar a taxa para R$ %.2f\n", taxa);
        }
    }

    public static void exibirTaxas() {
        System.out.println("\n==== Exibir Taxas =====");
        gc.exibirTaxas();
    }

}