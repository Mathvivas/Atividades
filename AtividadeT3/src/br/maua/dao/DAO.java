package br.maua.dao;

import java.util.List;

public interface DAO <T>{       // Qualquer tipo --> Genérica
    List<T> get(String item, String valor);
    List<T> getAll();

    void delete(T t);
    void create(T t);
}
