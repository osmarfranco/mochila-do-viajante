package Mesa01;

public class Circulo extends Figura {

    private int raio;

    public Circulo(int raio) {
        this.raio = raio;
    }

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    @Override
    public double calcularPerimetro() {
        return 2*Math.PI*this.raio;
    }
}
