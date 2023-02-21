package Mesa01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuadradoTest {

    @Test
    public void calculoCorreto(){
        Quadrado quadrado1 = new Quadrado(5);

        assertEquals(20.0, quadrado1.calcularPerimetro());
    }

}