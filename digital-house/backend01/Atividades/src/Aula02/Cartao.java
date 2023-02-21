package Aula02;

import java.time.LocalDate;

public abstract class Cartao {
    private int numeroCartao;
    private int codigoDeSeguranca;
    private LocalDate dataValidade;

    public Cartao(int numeroCartao, int codigoDeSeguranca, LocalDate dataValidade) {
        this.numeroCartao = numeroCartao;
        this.codigoDeSeguranca = codigoDeSeguranca;
        this.dataValidade = dataValidade;
    }

    public int getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(int numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public int getCodigoDeSeguranca() {
        return codigoDeSeguranca;
    }

    public void setCodigoDeSeguranca(int codigoDeSeguranca) {
        this.codigoDeSeguranca = codigoDeSeguranca;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }
}
