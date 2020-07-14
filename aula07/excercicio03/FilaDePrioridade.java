package aula07.excercicio03;

import java.util.LinkedList;
import java.util.Queue;

public class FilaDePrioridade {

    // define quantas pessoas serão atendidas da fila de prioridade antes da fila normal
    private static int atendimentoPrioridade = 2;
    
    Queue<Senha> filaPrioritaria = new LinkedList<>();
    Queue<Senha> filaComum = new LinkedList<>();

    private int proximaSenha = 1;
    private int atendidas = 0;

    public int adicionarComPrioridade(String nome) {
        Senha senha = new Senha(nome, proximaSenha++, "prioritario");
        filaPrioritaria.add(senha);
        return senha.getNumero();
    }

    public int adicionar(String nome) {
        Senha senha = new Senha(nome, proximaSenha++, "comum");
        filaComum.add(senha);
        return senha.getNumero();
    }

    public Senha atender() {
        if (filaComum.size() ==0 && filaPrioritaria.size() == 0) {
            return null;
        }
        if (filaPrioritaria.size() > 0 && atendidas < atendimentoPrioridade) {
            atendidas++;
            return filaPrioritaria.remove();
        }
        atendidas = 0;
        return filaComum.remove();
    }

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

    public static int getAtendimentoPrioridade() {
        return atendimentoPrioridade;
    }

    public static void setAtendimentoPrioridade(int atendimentoPrioridade) {
        FilaDePrioridade.atendimentoPrioridade = atendimentoPrioridade;
    }

}