package Aula02;

import java.time.LocalDate;

public class ProcessadorCredito extends ProcessadorPagamentos {

    private CartaoCredito cartao;

    public ProcessadorCredito(Pagamento pagamento, CartaoCredito cartao) {
        super(pagamento);
        this.cartao = cartao;
    }

    public CartaoCredito getCartao() {
        return cartao;
    }

    public void setCartao(CartaoCredito cartao) {
        this.cartao = cartao;
    }

    @Override
    public void processarPagamento() {
        if(validarVencimento(getPagamento().getVencimento())){
            if(autorizarPagamento((cartao.getLimite() - cartao.getSaldoUtilizado()), getPagamento().getValor())){
                double limiteAtualizado = cartao.getLimite() - getPagamento().getValor();
                System.out.println("O pagamento no valor de R$ " + getPagamento().getValor() + " foi realizado com sucesso! \n Seu limite agora é de: R$ " + limiteAtualizado + ".");
            } else {
                System.out.println("Você não possui limite para realizar esse pagamento.");
            }
        } else {
            System.out.println("Não é possível realizar a operação pois a ordem de pagamento está vencida.");
        };
    }

    }
