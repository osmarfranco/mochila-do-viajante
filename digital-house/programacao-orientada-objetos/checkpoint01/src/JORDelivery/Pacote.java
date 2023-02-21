package JORDelivery;

public class Pacote {

    //atributos
    private Integer idPacote;
    private String descricao;
    private String dimensoes;
    private Double peso;
    private Boolean temSeguro;

    //construtor
    public Pacote(Integer idPacote, String descricao, String dimensoes, Double peso, Boolean temSeguro) {
        this.idPacote = idPacote;
        this.descricao = descricao;
        this.dimensoes = dimensoes;
        this.peso = peso;
        this.temSeguro = temSeguro;
    }

    //métodos
    public void exibirDados(){
        if(temSeguro){
            System.out.println("ID: " + this.idPacote + "\nDescrição: " + this.descricao + "\nDimensões: " + this.dimensoes + "\nPeso: " + this.peso + "\nPossui Seguro");
        } else {
            System.out.println("ID: " + this.idPacote + "\nDescrição: " + this.descricao + "\nDimensões: " + this.dimensoes + "\nPeso: " + this.peso + "\nNão Possui Seguro");
        }
    }

    //getters para consultar os dados
    public Integer getIdPacote() {
        return idPacote;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getDimensoes() {
        return dimensoes;
    }

    public Double getPeso() {
        return peso;
    }

    public Boolean getTemSeguro() {
        return temSeguro;
    }
}
