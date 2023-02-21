package Mesa01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CirculoTest {

    @Test
    public void calculoCorreto(){
        Circulo circulo1 = new Circulo(5);

        assertEquals(31.0, Math.round(circulo1.calcularPerimetro()));
    }

}