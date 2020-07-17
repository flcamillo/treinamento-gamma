package com.exampledb.demo.controllers;

import java.util.List;

import com.exampledb.demo.model.Departamento;
import com.exampledb.demo.services.IDepartamentoService;

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
public class DepartamentoController {
    
    @Autowired // deixa a criação do objeto por conta do framework
    private IDepartamentoService servico;

    @GetMapping("/departamento/{cod}") // define o metodo de acesso http e o parametro utilizado para passar para o metodo
    public ResponseEntity<Departamento> buscarDepartamentoPorCod(@PathVariable int cod) {
        Departamento departamento = servico.buscarDepartamentoPorCod(cod);
        if (departamento != null) {
            return ResponseEntity.ok(departamento);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/departamento/nome/{nome}") // define o metodo de acesso http e o parametro utilizado para passar para o metodo
    public ResponseEntity<Departamento> buscarDepartamentoPorCod(@PathVariable String nome) {
        Departamento departamento = servico.buscarDepartamentoPorNome(nome);
        if (departamento != null) {
            return ResponseEntity.ok(departamento);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/departamento/nome/contem/{nome}") // define o metodo de acesso http e o parametro utilizado para passar para o metodo
    public ResponseEntity<List<Departamento>> buscarDepartamentoPorNomeContem(@PathVariable String nome) {
        List<Departamento> departamento = servico.buscarDepartamentoPorNomeContendo(nome);
        if (departamento != null) {
            return ResponseEntity.ok(departamento);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/departamento") // define o metodo de acesso http para listar todos os departamentos
    public ResponseEntity<List<Departamento>> buscarDepartamentoTodosDepartamentos() {
        List<Departamento> departamentos = servico.buscarTodosDepartamentos();
        if (departamentos != null) {
            return ResponseEntity.ok(departamentos);
        }
        return ResponseEntity.notFound().build();
    }  

    @PostMapping("/departamento") // define o metodo de acesso http para gravar um novo departamento, o novo departamento é passado via json no corpo da mensagem post
    public ResponseEntity<Departamento> novoDepartamento(@RequestBody Departamento departamento) {
        return ResponseEntity.ok(servico.novoDepartamento(departamento));
    }  

    @DeleteMapping("/departamento/{cod}")
    public ResponseEntity<String> apagarDepartamentoPorCod(@PathVariable int cod) {
        servico.apagarDepartamento(cod);
        return ResponseEntity.ok("removido com sucesso");
    }

}