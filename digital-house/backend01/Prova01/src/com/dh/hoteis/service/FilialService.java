package com.dh.hoteis.service;

import com.dh.hoteis.dao.IDao;
import com.dh.hoteis.dao.impl.FilialDaoH2;
import com.dh.hoteis.model.Filial;

import java.sql.SQLException;

public class FilialService {
    public Filial cadastrar(Filial filial) throws SQLException{
        IDao<Filial> filialIDao = new FilialDaoH2();
        return filialIDao.cadastrar(filial);
    }
}
