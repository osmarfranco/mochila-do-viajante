package com.dh.hoteis.dao.impl;

import com.dh.hoteis.dao.ConfigJDBC;
import com.dh.hoteis.dao.IDao;
import com.dh.hoteis.model.Filial;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FilialDaoH2 implements IDao<Filial> {

    final static Logger logger = Logger.getLogger(FilialDaoH2.class);

    private ConfigJDBC configJDBC;

    private Connection getConnection() throws SQLException, ClassNotFoundException {
        configJDBC = new ConfigJDBC("org.h2.Driver","jdbc:h2:~/filiais;AUTO_SERVER=TRUE;INIT=RUNSCRIPT FROM 'create.sql'","sa","");
        return configJDBC.getConnection();
    }

    @Override
    public Filial cadastrar(Filial filial) throws SQLException {

        String SQLInsert = String.format("INSERT INTO filiais (nome, rua, numero, cidade, estado, is_cinco_estrelas) VALUES ('%s','%s','%s','%s','%s', '%s')",
                filial.getNomeDaFilial(), filial.getRua(), filial.getNumero(), filial.getCidade(), filial.getEstado(), filial.converterIsCincoEstrelas());
        Connection connection = null;

        try{
            logger.info("Abrindo conexão");
            connection = getConnection();
            Statement statement = connection.createStatement();
            logger.info("Inserindo dados");
            statement.execute(SQLInsert, Statement.RETURN_GENERATED_KEYS);
            ResultSet resultSet = statement.getGeneratedKeys();
            if(resultSet.next()){
                filial.setId(resultSet.getInt(1));
            }
        }catch (Exception e){
            logger.error("Erro no banco de dados");
            e.printStackTrace();
        }finally {
            logger.info("Fechando conexão");
            connection.close();
        }

        return filial;
    }
}
