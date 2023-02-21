package com.dh.hoteis.dao;

import java.sql.SQLException;

public interface IDao <T>{
    public T cadastrar(T t) throws SQLException;
}
