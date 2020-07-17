package com.exampledb.demo.dao;

import java.util.List;

import com.exampledb.demo.model.Produto;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

// define uma interface que será implementada pelo framework para conter as operações CRUD com o banco de dados
// o primeiro parametro define o tipo de objeto do repositório, o segundo indica a chave primaria
public interface ProdutoRepo extends CrudRepository<Produto,Integer> {

    // define um novo metodo de pesquisa, o "nome" deve ser igual ao nome do campo que sera pesquisado
    // equivale a:
    // select * from produto where nome = nome
    public Produto findByNome(String nome);

    // define uma query para pesquisa abaixo de um determinado valor de preco
    @Query(value = "select * from produto where preco < 200", nativeQuery = true)
    public List<Produto> findPrecoBarato();

    // define uma query para pesquisa abaixo de um determinado valor de preco
    @Query(value = "select * from produto where preco < ?1", nativeQuery = true)
    public List<Produto> findLowerThanPreco(double preco);

    // define a pesquisa por nome que contenha algo do que foi informado
    // este método é do framework que utiliza o padrão: findBy<campo>Containing(<tipo> <campo>)
    public List<Produto> findByNomeContaining(String nome);

}
