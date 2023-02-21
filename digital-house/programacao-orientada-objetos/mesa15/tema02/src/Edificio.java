public class Edificio extends Projeto implements Comparable<Edificio>{
    private int qtdAndares;
    private int qtdAptosPorAndar;

    public Edificio(int idsProjeto, String nome, String cidade, String statusProjeto, int qtdAndares, int qtdAptosPorAndar) {
        super(idsProjeto, nome, cidade, statusProjeto);
        this.qtdAndares = qtdAndares;
        this.qtdAptosPorAndar = qtdAptosPorAndar;
    }

    public void isArranhaCeu(){
        if(this.qtdAndares > 15){
            System.out.println("É um arranha-céu!");
        } else {
            System.out.println("Não é um arranha-céu");
        }
    }

    @Override
    public int compareTo(Edificio o) {
        if((o.qtdAndares * o.qtdAptosPorAndar) == (this.qtdAndares * this.qtdAptosPorAndar)){
            System.out.println("Os edifícios são iguais");
            return 0;
        } else if((o.qtdAndares * o.qtdAptosPorAndar) < (this.qtdAndares * this.qtdAptosPorAndar)){
            System.out.println("O edifício " + o.getNome() + " é menor que o edifício " + this.getNome());
            return -1;
        } else {
            System.out.println("O edifício " + o.getNome() + " é maior que o edifício " + this.getNome());
            return 1;
        }
    }


}