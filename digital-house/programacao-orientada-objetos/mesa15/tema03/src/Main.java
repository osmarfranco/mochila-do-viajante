import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Jucilei", "dos Santos", 894563218L, 32);

        Horista horista1 = new Horista(18, LocalDate.of(2021,11,01), true, 100, 65.0);
        Horista horista2 = new Horista(24, LocalDate.of(2021,11,01), false, 180, 80.0);

        Mensalista mensalista1 = new Mensalista(48, LocalDate.of(2020,04,05),true, 3100.50, 200, "supervisor");
        Mensalista mensalista2 = new Mensalista(12, LocalDate.of(2022,05,10),true, 8000.00, 230, "chefe");

        horista2.adicionarTrabalhador(pessoa1);

        System.out.println(mensalista2.isChefe());

    }
}
