import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Obra obra1 = new Obra("Rua 1, 23", LocalDate.of(2021,10,12), LocalDate.of(2022,04,12), LocalDate.of(2022,06,12));

        Edificio ed1 = new Edificio(123, "Bangu", "Rio de Janeiro", "Terminado", 18, 2);
        Edificio ed2 = new Edificio(145, "Pinhal", "São Paulo", "Terminado", 12, 4);

        ed1.cumpriuPrazo(obra1.getDataTerminoReal(), obra1.getDataTerminoPrevista());

        ed1.compareTo(ed2);
    }
}
