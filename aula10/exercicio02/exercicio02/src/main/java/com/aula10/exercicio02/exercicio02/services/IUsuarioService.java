package com.aula10.exercicio02.exercicio02.services;

import java.util.List;

import com.aula10.exercicio02.exercicio02.models.Usuario;

public interface IUsuarioService {
    
    public Usuario buscarPorId(long id);
    public Usuario buscarPorNomeESenha(String nome, String senha);
    public List<Usuario> buscarTodos();
    public Usuario novoUsuario(Usuario usuario);

}