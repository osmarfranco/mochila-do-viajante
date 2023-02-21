import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        PacienteParticular particular1 = new PacienteParticular(LocalDate.of(1960,11,15), "Nair", "Silva", false, 140.0, 591234850L);

        PacientePublico publico1 = new PacientePublico(LocalDate.of(1980,04,23), "Josivaldo", "Amaral", true, 121549664L);
        PacientePublico publico2 = new PacientePublico(LocalDate.of(1985,05,12), "Maria", "Adelina", false, 654851692L);

        publico1.compareTo(publico2);
    }
}
