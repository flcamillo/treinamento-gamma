package com.exampledb.demo.dao;

import com.exampledb.demo.model.Produto;

import org.springframework.data.repository.CrudRepository;

// define uma interface que será implementada pelo framework para conter as operações CRUD com o banco de dados
public interface ProdutoRepo extends CrudRepository<Produto,Integer> {}
