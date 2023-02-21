package Aula02;

import java.time.LocalDate;

public abstract class ProcessadorPagamentos {

    private Pagamento pagamento;

    public ProcessadorPagamentos(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public boolean validarVencimento(LocalDate vencimento){
        return vencimento.isAfter(LocalDate.now());
    };

    public boolean autorizarPagamento(double saldoOulimite, double valorPagamento){
        return saldoOulimite > valorPagamento;
    };

    public abstract void processarPagamento();

}
