package Aula02;

import java.time.LocalDate;

public class CartaoDebito extends Cartao {

    private double saldoDisponivel;

    public CartaoDebito(int numeroCartao, int codigoDeSeguranca, LocalDate dataValidade, double saldoDisponivel) {
        super(numeroCartao, codigoDeSeguranca, dataValidade);
        this.saldoDisponivel = saldoDisponivel;
    }

    public double getSaldoDisponivel() {
        return saldoDisponivel;
    }

    public void setSaldoDisponivel(double saldoDisponivel) {
        this.saldoDisponivel = saldoDisponivel;
    }
}
