package Aula02;

import java.time.LocalDate;

public class CartaoCredito extends Cartao {

    private double limite;
    private double saldoUtilizado;

    public CartaoCredito(int numeroCartao, int codigoDeSeguranca, LocalDate dataValidade, double limite, double saldoUtilizado) {
        super(numeroCartao, codigoDeSeguranca, dataValidade);
        this.limite = limite;
        this.saldoUtilizado = saldoUtilizado;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getSaldoUtilizado() {
        return saldoUtilizado;
    }

    public void setSaldoUtilizado(double saldoUtilizado) {
        this.saldoUtilizado = saldoUtilizado;
    }
}
