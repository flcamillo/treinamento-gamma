package com.exampledb.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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

    @ManyToOne() // informa o tipo de relacionamento entre o Produto(n) x (1)Departamento
    @JoinColumn(name = "departamento_id") // informa qual o nome da coluna que será criada como chave estrangeira
    @JsonIgnoreProperties("produtos") // informa que na serialização do json não deve ser serializado o campo "produtos" da classe Departamento, isso evita o loop infinito
    private Departamento departamento;

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

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

}