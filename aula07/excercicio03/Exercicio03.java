package aula07.excercicio03;

import java.util.Scanner;

/**
 * Exercicio criar uma classe FilaDePrioridade que permita o atendimento de
 * pessoas prioritarias e pessoas comuns.
 * <p>
 * Criar um menu que permita inserir pessoas na fila com e sem prioridade e
 * simular o atendimento. Também deve possuir recursos para listar a fila.
 */
public class Exercicio03 {

    // define as variaveis globais, scanner e fila, para serem usadas pelos demais metodos
    static Scanner scanner = new Scanner(System.in);
    static FilaDePrioridade fila = new FilaDePrioridade();

    public static void main(String[] args) {
        int operacao = 0;
        do {
            operacao = exibirMenuPrincipal();
            switch (operacao) {
                case 1:
                    senhaComPrioridade();
                    break;
                case 2:
                    senhaComum();
                    break;
                case 3:
                    atender();
                    break;
                case 4:
                    exibir();
                    break;
                case 5:
                    alterarPriorizacao();
                    break;
            }
        } while (operacao > 0);
        scanner.close();
    }

    /**
     * Exibe o menu de opções
     * @return opção escolhida do menu
     */
    public static int exibirMenuPrincipal() {
        System.out.println("\n==== Menu Principal =====");
        System.out.println(" 1 ) senha com prioridade");
        System.out.println(" 2 ) senha comum");
        System.out.println(" 3 ) atender");
        System.out.println(" 4 ) exibir fila");
        System.out.println(" 5 ) alterar priorização");
        System.out.print("\nInforme a operação (0 = Sair): ");
        return scanner.nextInt();
    }

    /**
     * Executa a opção para gerar senha com prioridade
     */
    public static void senhaComPrioridade() {
        System.out.println("\n==== Senha com Prioridade =====");
        System.out.print("Informe o nome: ");
        String nome = scanner.next();
        System.out.printf("Senha gerada: %d\n", fila.adicionarComPrioridade(nome));
    }

    /**
     * Executa a opção para gerar senha comum
     */
    public static void senhaComum() {
        System.out.println("\n==== Senha Comum =====");
        System.out.print("Informe o nome: ");
        String nome = scanner.next();
        System.out.printf("Senha gerada: %d\n", fila.adicionar(nome));
    }

    /**
     * Executa a opção para realizar o atendimento de uma senha
     */
    public static void atender() {
        System.out.println("\n==== Atedimento =====");
        Senha senha = fila.atender();
        if (senha == null) {
            System.out.println("Não há ninguem para ser atendido");
        } else {
            System.out.printf("Senha [%d - %s] Realizando o atendimento de: %s\n", senha.getNumero(), senha.getTipo(),
                    senha.getNome());
        }
    }

    /**
     * Exibe das filas atuais
     */
    public static void exibir() {
        System.out.println("\n==== Exibir =====");
        fila.exibir();
    }

    /**
     * Altera o criterio de priorização de atendimento prioritário
     */
    public static void alterarPriorizacao() {
        System.out.println("\n==== Alterar Priorização =====");
        System.out.printf("Informe o novo parametro de priorização [%d]: ",
                FilaDePrioridade.getAtendimentoPrioridade());
        int priorizacao = scanner.nextInt();
        if (priorizacao > 0) {
            FilaDePrioridade.setAtendimentoPrioridade(priorizacao);
        }
    }

}