import java.time.LocalDate;

public class Consulta {
    private LocalDate data;
    private LocalDate horario;
    private String especialidade;

    public Consulta(LocalDate data, LocalDate horario, String especialidade) {
        this.data = data;
        this.horario = horario;
        this.especialidade = especialidade;
    }

}
