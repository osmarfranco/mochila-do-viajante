package com.aulasdepoo.aula13.codigodisponivelpg;

public class ContaCorrente extends Conta {

    private double valorPermitido;

    public ContaCorrente(double saldo, double valorPermitido) {
        super(saldo);
        this.valorPermitido = valorPermitido;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= informarSaldo()){
            setSaldo(informarSaldo() - valor);
        }else{
            System.out.println("Não tem limite!!");
        }
    }

}
