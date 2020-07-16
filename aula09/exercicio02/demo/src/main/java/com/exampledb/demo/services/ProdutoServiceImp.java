package com.exampledb.demo.services;

import java.util.List;

import com.exampledb.demo.dao.ProdutoRepo;
import com.exampledb.demo.model.Produto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // define a classe como um componente generico do framework
public class ProdutoServiceImp implements IProdutoService {

    @Autowired // deixa a criação do objeto por conta do framework
    private ProdutoRepo repo;

    @Override // implementa o metodo para buscar por produto
    public Produto buscarProdutoPorCod(int cod) {
        return repo.findById(cod).get();
    }

    @Override // implementa o metodo para listar todos os produtos
    public List<Produto> buscarTodosProdutos() {
        return (List<Produto>) repo.findAll();
    }
    
}