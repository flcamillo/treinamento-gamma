package com.exampledb.demo.controllers;

import java.util.List;

import com.exampledb.demo.model.Produto;
import com.exampledb.demo.services.IProdutoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController // informa ao framework que esta classe sera utilizada para acesso via HTTP
@CrossOrigin("*") // permite conexão de qualquer origem
public class ProdutoController {
    
    @Autowired // deixa a criação do objeto por conta do framework
    private IProdutoService servico;

    @GetMapping("/produto/{cod}") // define o metodo de acesso http e o parametro utilizado para passar para o metodo
    public ResponseEntity<Produto> buscarProdutoPorCod(@PathVariable int cod) {
        Produto produto = servico.buscarProdutoPorCod(cod);
        if (produto != null) {
            return ResponseEntity.ok(produto);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/produto") // define o metodo de acesso http para listar todos os produtos
    public ResponseEntity<List<Produto>> buscarProdutoTodosProdutos() {
        List<Produto> produtos = servico.buscarTodosProdutos();
        if (produtos != null) {
            return ResponseEntity.ok(produtos);
        }
        return ResponseEntity.notFound().build();
    }    
}