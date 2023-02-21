import java.time.LocalDate;

public class PacientePublico extends Paciente implements Comparable<PacientePublico>{
    private Long numeroSUS;

    public PacientePublico(LocalDate dataNascimento, String nome, String sobrenome, Boolean isPrimeiraConsulta, Long numeroSUS) {
        super(dataNascimento, nome, sobrenome, isPrimeiraConsulta);
        this.numeroSUS = numeroSUS;
    }

    @Override
    public int compareTo(PacientePublico o) {
        if(o.numeroSUS == this.numeroSUS){
            System.out.println("É o mesmo paciente!");
            return 0;
        } else if(o.numeroSUS < this.numeroSUS){
            System.out.println("O registro de " + o.getNome() + " " + o.getSobrenome() + " é mais antigo que " + this.getNome() + " " + this.getSobrenome());
            return -1;
        } else {
            System.out.println("O registro de " + o.getNome() + " " + o.getSobrenome() + " é mais novo que " + this.getNome() + " " + this.getSobrenome());
            return 1;
        }

    }
}