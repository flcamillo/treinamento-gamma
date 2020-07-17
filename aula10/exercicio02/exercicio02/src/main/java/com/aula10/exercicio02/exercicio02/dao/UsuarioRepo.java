package com.aula10.exercicio02.exercicio02.dao;

import com.aula10.exercicio02.exercicio02.models.Usuario;

import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepo extends CrudRepository<Usuario, Long>{
    
    public Usuario findByNomeAndSenha(String nome, String senha);

}