import java.time.LocalDate;

public class Obra {
    private String endereco;
    private LocalDate dataInicio;
    private LocalDate dataTerminoPrevista;
    private LocalDate dataTerminoReal;

    public Obra(String endereco, LocalDate dataInicio, LocalDate dataTerminoPrevista, LocalDate dataTerminoReal) {
        this.endereco = endereco;
        this.dataInicio = dataInicio;
        this.dataTerminoPrevista = dataTerminoPrevista;
        this.dataTerminoReal = dataTerminoReal;
    }

    public String getEndereco() {
        return endereco;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public LocalDate getDataTerminoPrevista() {
        return dataTerminoPrevista;
    }

    public LocalDate getDataTerminoReal() {
        return dataTerminoReal;
    }
}
