package br.com.buscador.dao;

import java.util.List;

public interface Dao<T> {

    void persistir(T entidade);

    void remover(T entidade);

    T findById(int id);

    List<T> listar(String filtro);

    List<T> listar();
}
