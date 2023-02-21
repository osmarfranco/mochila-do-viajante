package JORDelivery;

public abstract class Pessoa {

    //atributos
    private String nome;
    private String endereco;
    private String email;
    private Integer telefone;

    //construtor
    public Pessoa(String nome, String endereco, String email, Integer telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
    }

    //métodos
    public abstract void exibirDados();

    public void atualizarEndereco(String novoEndereco) {
        this.setEndereco(novoEndereco);
    }

    public void atualizarEmail(String novoEmail) {
        this.setEmail(novoEmail);
    }

    public void atualizarTelefone(Integer novoTelefone) {
        this.setTelefone(novoTelefone);
    }

    //getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getTelefone() {
        return telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }
}
