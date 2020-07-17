package com.exampledb.demo.controllers;

import java.util.List;

import com.exampledb.demo.model.Produto;
import com.exampledb.demo.services.IProdutoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @GetMapping("/produto/nome/{nome}") // define o metodo de acesso http e o parametro utilizado para passar para o metodo
    public ResponseEntity<Produto> buscarProdutoPorCod(@PathVariable String nome) {
        Produto produto = servico.buscarProdutoPorNome(nome);
        if (produto != null) {
            return ResponseEntity.ok(produto);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/produto/nome/contem/{nome}") // define o metodo de acesso http e o parametro utilizado para passar para o metodo
    public ResponseEntity<List<Produto>> buscarProdutoPorNomeContendo(@PathVariable String nome) {
        List<Produto> produto = servico.buscarProdutoPorNomeContendo(nome);
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

    @GetMapping("/produto/precomenor/{preco}") // define o metodo de acesso http para listar todos os produtos
    public ResponseEntity<List<Produto>> buscarProdutoComPrecoMenorQue(@PathVariable double preco) {
        List<Produto> produtos = servico.buscarTodosComPrecoMenorQue(preco);
        if (produtos != null) {
            return ResponseEntity.ok(produtos);
        }
        return ResponseEntity.notFound().build();
    }  

    @GetMapping("/produto/precobarato") // define o metodo de acesso http para listar todos os produtos baratos
    public ResponseEntity<List<Produto>> buscarProdutosBaratos() {
        List<Produto> produtos = servico.buscarPrecoBarato();
        if (produtos != null) {
            return ResponseEntity.ok(produtos);
        }
        return ResponseEntity.notFound().build();
    }  

    @PostMapping("/produto") // define o metodo de acesso http para gravar um novo produto, o novo produto é passado via json no corpo da mensagem post
    public ResponseEntity<Produto> novoProduto(@RequestBody Produto produto) {
        return ResponseEntity.ok(servico.novoProduto(produto));
    }  

    @DeleteMapping("/produto/{cod}")
    public ResponseEntity<String> apagarProdutoPorCod(@PathVariable int cod) {
        servico.apagarProduto(cod);
        return ResponseEntity.ok("removido com sucesso");
    }

}