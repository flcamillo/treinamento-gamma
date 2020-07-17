package com.exampledb.demo.dao;

import java.util.List;

import com.exampledb.demo.model.Departamento;

import org.springframework.data.repository.CrudRepository;

// define uma interface que será implementada pelo framework para conter as operações CRUD com o banco de dados
// o primeiro parametro define o tipo de objeto do repositório, o segundo indica a chave primaria
public interface DepartamentoRepo extends CrudRepository<Departamento, Integer> {
    
    // define um novo metodo de pesquisa, o "nome" deve ser igual ao nome do campo que sera pesquisado
    // equivale a:
    // select * from produto where nome = nome
    public Departamento findByNome(String nome);

    // define a pesquisa por nome que contenha algo do que foi informado
    /// este método é do framework que utiliza o padrão: findBy<campo>Containing(<tipo> <campo>)
    public List<Departamento> findByNomeContaining(String nome);

}