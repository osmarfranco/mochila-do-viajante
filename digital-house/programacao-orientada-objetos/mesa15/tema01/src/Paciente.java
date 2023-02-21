import java.time.LocalDate;

public class Paciente {
    private LocalDate dataNascimento;
    private String nome;
    private String sobrenome;
    private Boolean isPrimeiraConsulta;

    public Paciente(LocalDate dataNascimento, String nome, String sobrenome, Boolean isPrimeiraConsulta) {
        this.dataNascimento = dataNascimento;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.isPrimeiraConsulta = isPrimeiraConsulta;
    }

    public void avaliarHistorico(){
        if(this.isPrimeiraConsulta){
            System.out.println("Precisa avaliar o histórico");
        }else{
            System.out.println("Não é a primeira consulta");
        }
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }
}
