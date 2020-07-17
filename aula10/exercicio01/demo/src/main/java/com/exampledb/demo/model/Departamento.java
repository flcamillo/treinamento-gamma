package com.exampledb.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity // define que a classe é uma entidade do banco de dados
@Table(name = "departamento") // define o nome da tabela do banco que representa esta classe
public class Departamento {
    
    @Id // define que este campo é chave privada
    @GeneratedValue(strategy = GenerationType.IDENTITY) // define que será usado auto numeração para o campo
    @Column(name = "cod") // define o nome do campo na tabela
    private int id;

    @Column(name = "nome", length = 80, nullable = false) // define o nome do campo na tabela, seu comprimento e obriga o mesmo a ter valor
    private String nome;

    @Column(name = "local", length = 50) // define o nome do campo na tabela e seu comprimento
    private String local;

    @OneToMany(mappedBy = "departamento", cascade = CascadeType.ALL) // informa que este campo será mapeado pelo campo "departamento" na tabela Produto
    @JsonIgnoreProperties("departamento") // informa que na serialização do json não deve ser serializado o campo "departamento" da classe Produto, isso evita o loop infinito
    private List<Produto> produtos;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

}