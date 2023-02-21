public class Pessoa {
    private String nome;
    private String sobrenome;
    private Long rg;
    private int idade;

    public Pessoa(String nome, String sobrenome, Long rg, int idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.rg = rg;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public Long getRg() {
        return rg;
    }
}
