public class Casa extends Projeto{
    private String tamanhoTerreno;
    private int qtdBanheiros;
    private int qtdQuartos;

    public Casa(int idsProjeto, String nome, String cidade, String statusProjeto, String tamanhoTerreno, int qtdBanheiros, int qtdQuartos) {
        super(idsProjeto, nome, cidade, statusProjeto);
        this.tamanhoTerreno = tamanhoTerreno;
        this.qtdBanheiros = qtdBanheiros;
        this.qtdQuartos = qtdQuartos;
    }
}
