package com.exampledb.demo.services;

import java.util.List;
import com.exampledb.demo.model.Departamento;

public interface IDepartamentoService {
    
    public Departamento buscarDepartamentoPorCod(int cod);
    public Departamento buscarDepartamentoPorNome(String nome);
    public List<Departamento> buscarDepartamentoPorNomeContendo(String nome);
    public List<Departamento> buscarTodosDepartamentos();
    public Departamento novoDepartamento(Departamento produto);
    public void apagarDepartamento(int cod);

}