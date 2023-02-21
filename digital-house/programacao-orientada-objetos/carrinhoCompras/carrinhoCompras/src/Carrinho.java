import java.util.ArrayList;

public class Carrinho implements Estado {
    private ArrayList<Produto> listaProdutos =  new ArrayList<>();
    private Estado estado;

    public Carrinho(Estado estado) {

        this.estado = estado;

    }

    //Getters e Setters
    public void setListaProdutos(ArrayList<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public void adicionar() {

    }

    @Override
    public void pagar() {

    }

    @Override
    public void esvaziar() {

    }

    @Override
    public void fechar() {

    }
}

