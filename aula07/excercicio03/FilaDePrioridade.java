package aula07.excercicio03;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Define uma fila com atendimento prioritário e atendimento comum.
 * <p>
 * A fila permite configurar quantas senhas prioritárias serão atendidas antes
 * de uma senha comum.
 */
public class FilaDePrioridade {

    // define quantas pessoas serão atendidas da fila de prioridade antes da fila
    // normal
    private static int atendimentoPrioridade = 2;

    // define as filas com atendimento prioritário ou comum
    Queue<Senha> filaPrioritaria = new LinkedList<>();
    Queue<Senha> filaComum = new LinkedList<>();

    // define o valor da proxima senha a ser gerada
    private int proximaSenha = 1;
    
    // define um contador para validar se ja atendeu todas as pessoas prioritárias
    // caso tenham sido atendidas, esta variavel é resetada para zero
    private int atendidas = 0;

    /**
     * Adiciona uma pessoa na fila com atendimento prioritário
     * 
     * @return numero da senha gerada
     */
    public int adicionarComPrioridade(String nome) {
        Senha senha = new Senha(nome, proximaSenha++, "prioritario");
        filaPrioritaria.add(senha);
        return senha.getNumero();
    }

    /**
     * Adiciona uma pessoa na fila para atendimento comum
     * 
     * @return numero da senha gerada
     */
    public int adicionar(String nome) {
        Senha senha = new Senha(nome, proximaSenha++, "comum");
        filaComum.add(senha);
        return senha.getNumero();
    }

    /**
     * Remove uma senha da fila para realizar o atendimento
     * 
     * @return senha a ser atendida
     */
    public Senha atender() {
        if (filaComum.size() == 0 && filaPrioritaria.size() == 0) {
            return null;
        }
        if (filaPrioritaria.size() > 0 && atendidas < atendimentoPrioridade) {
            atendidas++;
            return filaPrioritaria.remove();
        }
        atendidas = 0;
        return filaComum.remove();
    }

    /**
     * Lista todas as senhas da fila
     */
    public void exibir() {
        System.out.printf("Total de pessoas na fila prioritária: %d\n", filaPrioritaria.size());
        for (Senha senha : filaPrioritaria) {
            System.out.printf("Senha [%d] Nome: %s\n", senha.getNumero(), senha.getNome());
        }
        System.out.printf("Total de pessoas na fila comum: %d\n", filaComum.size());
        for (Senha senha : filaComum) {
            System.out.printf("Senha [%d] Nome: %s\n", senha.getNumero(), senha.getNome());
        }
    }

    /**
     * Recupera a quantidade de senhas a serem atendidas com prioridade antes de
     * realizar atendimentos comuns
     * 
     * @return quantidade de senhas
     */
    public static int getAtendimentoPrioridade() {
        return atendimentoPrioridade;
    }

    /**
     * Define a quantidade de senhas que deverão serem atendidas atends de realizar
     * atendimentos comuns
     * 
     * @param atendimentoPrioridade
     */
    public static void setAtendimentoPrioridade(int atendimentoPrioridade) {
        FilaDePrioridade.atendimentoPrioridade = atendimentoPrioridade;
    }

}