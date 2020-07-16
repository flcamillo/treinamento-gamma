package com.exampledb.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // define que a classe é uma entidade do banco de dados
@Table(name = "produto") // define o nome da tabela do banco que representa esta classe
public class Produto {

    @Id // define que este campo é chave privada
    @GeneratedValue(strategy = GenerationType.IDENTITY) // define que será usado auto numeração para o campo
    @Column(name = "cod") // define o nome do campo na tabela
    private int cod;

    @Column(name = "nome", length = 40) // define o nome do campo e seu comprimento
    private String nome;

    @Column(name = "preco") // define o nome do campo
    private double preco;

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

}