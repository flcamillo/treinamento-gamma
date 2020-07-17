package com.exampledb.demo.services;

import java.util.List;

import com.exampledb.demo.model.Produto;

public interface IProdutoService {

    public Produto buscarProdutoPorCod(int cod);
    public Produto buscarProdutoPorNome(String nome);
    public List<Produto> buscarProdutoPorNomeContendo(String nome);
    public List<Produto> buscarTodosProdutos();
    public List<Produto> buscarPrecoBarato();
    public List<Produto> buscarTodosComPrecoMenorQue(double preco);
    public Produto novoProduto(Produto produto);
    public void apagarProduto(int cod);

}