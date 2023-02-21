package Aula02;

public class ProcessadorDebito extends ProcessadorPagamentos {

    private CartaoDebito cartao;

    public ProcessadorDebito(Pagamento pagamento, CartaoDebito cartao) {
        super(pagamento);
        this.cartao = cartao;
    }

    public CartaoDebito getCartao() {
        return cartao;
    }

    public void setCartao(CartaoDebito cartao) {
        this.cartao = cartao;
    }

    @Override
    public void processarPagamento() {
        if(validarVencimento(getPagamento().getVencimento())){
            if(autorizarPagamento(cartao.getSaldoDisponivel(), getPagamento().getValor())){
                double saldoAtualizado = cartao.getSaldoDisponivel() - getPagamento().getValor();
                System.out.println("O pagamento no valor de R$ " + getPagamento().getValor() + " foi realizado com sucesso! \n Seu saldo agora é de: R$ " + saldoAtualizado + ".");
            } else {
                System.out.println("Saldo insuficiente para realizar esse pagamento.");
            }
        } else {
            System.out.println("Não é possível realizar a operação pois a ordem de pagamento está vencida.");
        };
    }
}
