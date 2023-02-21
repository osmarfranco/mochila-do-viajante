import java.time.LocalDate;

public class Contrato {
    private int mesesDuracao;
    private LocalDate dataInicio;
    private Boolean registrado;

    public Contrato(int mesesDuracao, LocalDate dataInicio, Boolean registrado) {
        this.mesesDuracao = mesesDuracao;
        this.dataInicio = dataInicio;
        this.registrado = registrado;
    }

    public void adicionarTrabalhador(Pessoa pessoa){
        if(this.registrado){
            System.out.println(pessoa.getNome() + " " + pessoa.getSobrenome() + " , RG " + pessoa.getRg() + " pode ser contratado.");
        } else {
            System.out.println(pessoa.getNome() + " " + pessoa.getSobrenome() + " , RG " + pessoa.getRg() + " não pode ser contratado.");
        }
    };
}
