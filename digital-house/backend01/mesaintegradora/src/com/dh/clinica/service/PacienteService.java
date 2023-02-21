package com.dh.clinica.service;

import com.dh.clinica.dao.IDao;
import com.dh.clinica.dao.impl.PacienteDaoH2;
import com.dh.clinica.model.Paciente;

import java.sql.SQLException;

public class PacienteService {

    public Paciente salvar(Paciente paciente) throws SQLException{
        IDao<Paciente> pacienteIDao = new PacienteDaoH2();
        return pacienteIDao.salvar(paciente);

    }

    public Paciente buscar(Paciente paciente) throws SQLException{
        IDao<Paciente> pacienteIDao = new PacienteDaoH2();
        return pacienteIDao.buscar(paciente);
    }

    public Paciente atualizar(Paciente paciente) throws SQLException{
        IDao<Paciente> pacienteIDao = new PacienteDaoH2();
        return pacienteIDao.atualizar(paciente);
    }

}
