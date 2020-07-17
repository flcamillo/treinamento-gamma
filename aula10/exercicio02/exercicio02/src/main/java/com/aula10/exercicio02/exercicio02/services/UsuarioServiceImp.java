package com.aula10.exercicio02.exercicio02.services;

import java.util.List;

import com.aula10.exercicio02.exercicio02.dao.UsuarioRepo;
import com.aula10.exercicio02.exercicio02.models.Usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UsuarioServiceImp implements IUsuarioService {

    @Autowired
    private UsuarioRepo repo;

    @Override
    public Usuario buscarPorId(long id) {
        return repo.findById(id).get();
    }

    @Override
    public Usuario buscarPorNomeESenha(String nome, String senha) {
        return repo.findByNomeAndSenha(nome, senha);
    }

    @Override
    public List<Usuario> buscarTodos() {
        return (List<Usuario>) repo.findAll();
    }

    @Override
    public Usuario novoUsuario(Usuario usuario) {
        return repo.save(usuario);
    }
    
    
}