package com.exampledb.demo.services;

import java.util.List;

import com.exampledb.demo.dao.DepartamentoRepo;
import com.exampledb.demo.model.Departamento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // define a classe como um componente generico do framework
public class DepartamentoServiceImp implements IDepartamentoService {

    @Autowired // deixa a criação do objeto por conta do framework
    private DepartamentoRepo repo;

    @Override // implementa o metodo para buscar por produto
    public Departamento buscarDepartamentoPorCod(int cod) {
        return repo.findById(cod).get();
    }

    @Override // implementa o metodo para listar todos os produtos
    public List<Departamento> buscarTodosDepartamentos() {
        return (List<Departamento>) repo.findAll();
    }

    @Override
    public Departamento novoDepartamento(Departamento produto) {
        return repo.save(produto);
    }

    @Override
    public Departamento buscarDepartamentoPorNome(String nome) {
        return repo.findByNome(nome);
    }

    @Override
    public void apagarDepartamento(int id) {
        repo.deleteById(id);
    }

    @Override
    public List<Departamento> buscarDepartamentoPorNomeContendo(String nome) {
        return repo.findByNomeContaining(nome);
    }  
    
    
}