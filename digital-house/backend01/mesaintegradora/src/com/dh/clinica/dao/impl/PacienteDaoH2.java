package com.dh.clinica.dao.impl;

import com.dh.clinica.dao.ConfigJDBC;
import com.dh.clinica.dao.IDao;
import com.dh.clinica.model.Paciente;
import org.apache.log4j.Logger;
import org.junit.platform.commons.function.Try;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PacienteDaoH2 implements IDao<Paciente> {

    final static Logger logger = Logger.getLogger(PacienteDaoH2.class);

    private ConfigJDBC configJDBC;

    private Connection getConnection() throws SQLException, ClassNotFoundException {
        configJDBC = new ConfigJDBC("org.h2.Driver","jdbc:h2:~/clinica;AUTO_SERVER=TRUE;INIT=RUNSCRIPT FROM 'create.sql'","sa","");
        return configJDBC.getConnection();
    }


    @Override
    public Paciente salvar(Paciente paciente) throws SQLException {
        String SQLInsert = String.format("INSERT INTO paciente (nome, sobrenome, rg, endereco, dataCadastro) VALUES ('%s','%s','%s','%s','%s')",
                paciente.getNome(), paciente.getSobrenome(), paciente.getRg(), paciente.getEndereco(), paciente.getDataCadastro());
        Connection connection = null;

        try{
            logger.info("Abrindo conexão");
            connection = getConnection();
            Statement statement = connection.createStatement();
            statement.execute(SQLInsert, Statement.RETURN_GENERATED_KEYS);
            ResultSet resultSet = statement.getGeneratedKeys();
            if(resultSet.next()){
                paciente.setId(resultSet.getInt(1));
            }
        }catch (Exception e){
            logger.error("Erro no banco de dados");
            e.printStackTrace();
        }finally {
            logger.info("Fechando conexão");
            connection.close();
        }

        return paciente;
    }

    @Override
    public Paciente buscar(Paciente paciente) throws SQLException {
        String SQLSelect = String.format("SELECT * FROM paciente WHERE id = %s", paciente.getId());
        Connection connection = null;
        try {
            logger.info("Abrindo conexão");
            connection = getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SQLSelect);
            logger.info("Imprimindo nomes");
            while (resultSet.next()){
                System.out.println(resultSet.getInt("id")+ " - "+
                        resultSet.getString("nome")+ " - "+
                        resultSet.getString("sobrenome")+ " - "+
                        resultSet.getString("rg")+ " - "+
                        resultSet.getString("endereco"));
            }
        }catch (Exception e){
            logger.error("Erro no banco de dados");
            e.printStackTrace();

        }finally {
            logger.info("Fechando conexão");
            connection.close();
        }

        return paciente;
    }

    @Override
    public Paciente atualizar(Paciente paciente) throws SQLException {
        String SQLUpdate = String.format("UPDATE paciente SET endereco = %s WHERE id = %s", paciente.getEndereco(), paciente.getId());
        Connection connection = null;

        try{

        }catch (Exception e){
            logger.error("Erro no banco de dados");
            e.printStackTrace();
        }finally {
            logger.info("Fechando conexão");
            connection.close();
        }


        return paciente;
    }
}
