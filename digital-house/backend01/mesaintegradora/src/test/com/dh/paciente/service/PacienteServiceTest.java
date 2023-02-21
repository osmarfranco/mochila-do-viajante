package test.com.dh.paciente.service;

import com.dh.clinica.model.Paciente;
import com.dh.clinica.service.PacienteService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PacienteServiceTest {
    PacienteService pacienteService;

    @BeforeEach
    void doBefore(){
        pacienteService = new PacienteService();
    }

    @Test
    public void criarPaciente() throws SQLException{
        Paciente paciente = new Paciente();
        paciente.setNome("Renato");
        paciente.setSobrenome("Lino");
        paciente.setRg("3668855");
        paciente.setEndereco("Rua legal, av bacana");
        paciente.setDataCadastro(LocalDate.of(2022,11,1));

        pacienteService.salvar(paciente);
        pacienteService.buscar(paciente);



    }
}