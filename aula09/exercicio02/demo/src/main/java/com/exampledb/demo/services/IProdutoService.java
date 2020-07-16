package com.exampledb.demo.services;

import java.util.List;

import com.exampledb.demo.model.Produto;

public interface IProdutoService {

    public Produto buscarProdutoPorCod(int cod);
    public List<Produto> buscarTodosProdutos();
        
}