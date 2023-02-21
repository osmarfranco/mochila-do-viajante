import java.time.LocalDate;

public class Mensalista extends Contrato{
    private Double salarioMensal;
    private int totalDeHoras;
    private String cargo;

    public Mensalista(int mesesDuracao, LocalDate dataInicio, Boolean registrado, Double salarioMensal, int totalDeHoras, String cargo) {
        super(mesesDuracao, dataInicio, registrado);
        this.salarioMensal = salarioMensal;
        this.totalDeHoras = totalDeHoras;
        this.cargo = cargo;
    }

    public void mudarFuncao(int codigoFuncao){
        switch (codigoFuncao){
            case 1:
                this.cargo = "funcionário";
                break;

            case 2:
                this.cargo = "supervisor";
                break;

            case 3:
                this.cargo = "chefe";
                break;
        }
    }

    public Boolean isChefe(){
        return this.cargo == "chefe";
    }
}
