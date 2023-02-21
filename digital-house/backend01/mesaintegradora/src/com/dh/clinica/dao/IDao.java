package com.dh.clinica.dao;

import java.sql.SQLException;

public interface IDao <T>{
    T salvar(T t) throws SQLException;

    T buscar(T t) throws SQLException;

    T atualizar(T t) throws SQLException;


}
