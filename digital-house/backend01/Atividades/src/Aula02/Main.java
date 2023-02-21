package Aula02;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        CartaoDebito cartao1 = new CartaoDebito(123456, 741, LocalDate.of(2030, 5, 30), 2000.00);
        CartaoCredito cartao2 = new CartaoCredito(654321, 258, LocalDate.of(2025, 8, 30), 3000.00, 500.00);

        Pagamento ordem1 = new Pagamento(1000.00, LocalDate.of(2022, 10, 31));
        Pagamento ordem2 = new Pagamento(500.00, LocalDate.of(2022, 10, 5));
        Pagamento ordem3 = new Pagamento(5000.00, LocalDate.of(2022, 11, 15));

        ProcessadorCredito pagamento1 = new ProcessadorCredito(ordem1, cartao2);
        ProcessadorCredito pagamento2 = new ProcessadorCredito(ordem2, cartao2);
        ProcessadorCredito pagamento3 = new ProcessadorCredito(ordem3, cartao2);

        ProcessadorDebito pagamento4 = new ProcessadorDebito(ordem1, cartao1);
        ProcessadorDebito pagamento5 = new ProcessadorDebito(ordem2, cartao1);
        ProcessadorDebito pagamento6 = new ProcessadorDebito(ordem3, cartao1);

//        pagamento1.processarPagamento();
//        pagamento2.processarPagamento();
//        pagamento3.processarPagamento();
//        pagamento4.processarPagamento();
//        pagamento5.processarPagamento();
//        pagamento6.processarPagamento();

    }

}
