import java.time.LocalDate;

public class PacienteParticular extends Paciente {
    private Double valorConsulta;
    private Long numeroRG;

    public PacienteParticular(LocalDate dataNascimento, String nome, String sobrenome, Boolean isPrimeiraConsulta, Double valorConsulta, Long numeroRG) {
        super(dataNascimento, nome, sobrenome, isPrimeiraConsulta);
        this.valorConsulta = valorConsulta;
        this.numeroRG = numeroRG;
    }
}
