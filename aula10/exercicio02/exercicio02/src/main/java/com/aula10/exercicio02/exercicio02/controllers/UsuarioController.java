package com.aula10.exercicio02.exercicio02.controllers;

import java.util.List;

import com.aula10.exercicio02.exercicio02.models.Usuario;
import com.aula10.exercicio02.exercicio02.services.IUsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class UsuarioController {
    
    @Autowired
    private IUsuarioService servico;

    @GetMapping("/usuario/{id}")
    public ResponseEntity<Usuario> buscarUsuarioPorId(@PathVariable long id) {
        Usuario usuario = servico.buscarPorId(id);
        if (usuario != null) {
            return ResponseEntity.ok(usuario);
        }
        return ResponseEntity.notFound().build();
    }    

    @GetMapping("/usuario")
    public ResponseEntity<List<Usuario>> buscarTodos() {
        List<Usuario> usuarios = servico.buscarTodos();
        if (usuarios != null) {
            return ResponseEntity.ok(usuarios);
        }
        return ResponseEntity.notFound().build();
    }    

    @PostMapping("/usuario")
    public ResponseEntity<Usuario> novoUsuario(@RequestBody Usuario usuario) {
        return ResponseEntity.ok(servico.novoUsuario(usuario));
    }  

    @PostMapping("/usuario/validar")
    public ResponseEntity<Usuario> buscarUsuarioPorNomeESenha(@RequestBody Usuario usuario) {
        Usuario encontrado = servico.buscarPorNomeESenha(usuario.getNome(), usuario.getSenha());
        if (encontrado != null) {
            return ResponseEntity.ok(encontrado);
        }
        return ResponseEntity.notFound().build(); 
    }  

}