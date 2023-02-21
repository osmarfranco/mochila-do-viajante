package JORDelivery;

public class ClientePessoaFisica extends Pessoa{

    //atributos
    private String cpf;

    //construtor
    public ClientePessoaFisica(String nome, String endereco, String email, Integer telefone, String cpf) {
        super(nome, endereco, email, telefone);
        this.cpf = cpf;
    }

    //métodos
    @Override
    public void exibirDados() {
        System.out.println("Nome: " + this.getNome() + "\nEndereço: " + this.getEndereco() + "\nE-mail: " + this.getEmail() + "\nTelefone: " + this.getTelefone() + "\nCPF: " + this.cpf);
    }

    //getter para poder consultar os dados
    public String getCpf() {
        return cpf;
    }
}
