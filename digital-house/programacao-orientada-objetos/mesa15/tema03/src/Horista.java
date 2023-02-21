import java.time.LocalDate;

public class Horista extends Contrato implements Comparable<Horista>{
    private int horasContratadas;
    private Double valorHora;

    public Horista(int mesesDuracao, LocalDate dataInicio, Boolean registrado, int horasContratadas, Double valorHora) {
        super(mesesDuracao, dataInicio, registrado);
        this.horasContratadas = horasContratadas;
        this.valorHora = valorHora;
    }


    @Override
    public int compareTo(Horista o) {
        if(o.horasContratadas == this.horasContratadas){
            System.out.println("Os contratos são iguais.");
            return 0;
        } else if(o.horasContratadas < this.horasContratadas){
            System.out.println(o.horasContratadas + " é menor que o de " + this.horasContratadas);
            return -1;

        } else{
            System.out.println(o.horasContratadas + " é maior que o de " + this.horasContratadas);
            return 1;
        }
    }
}
