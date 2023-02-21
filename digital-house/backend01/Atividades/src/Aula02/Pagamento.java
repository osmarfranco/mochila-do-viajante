package Aula02;

import java.time.LocalDate;

public class Pagamento {

    private double valor;
    private LocalDate vencimento;

    public Pagamento(double valor, LocalDate vencimento) {
        this.valor = valor;
        this.vencimento = vencimento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDate getVencimento() {
        return vencimento;
    }

    public void setVencimento(LocalDate vencimento) {
        this.vencimento = vencimento;
    }
}
