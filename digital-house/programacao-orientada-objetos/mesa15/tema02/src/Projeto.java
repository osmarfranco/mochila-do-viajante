import java.time.LocalDate;

public class Projeto {
    private int idsProjeto;
    private String nome;
    private String cidade;
    private String statusProjeto;

    public Projeto(int idsProjeto, String nome, String cidade, String statusProjeto) {
        this.idsProjeto = idsProjeto;
        this.nome = nome;
        this.cidade = cidade;
        this.statusProjeto = statusProjeto;
    }

    public void cumpriuPrazo(LocalDate obraTerminoReal, LocalDate obraTerminoPrevisto){
        if(obraTerminoReal == obraTerminoPrevisto && this.statusProjeto == "Terminado"){
            System.out.println("Terminou no prazo.");
        } else if(obraTerminoReal.isAfter(obraTerminoPrevisto) && this.statusProjeto == "Terminado"){
            System.out.println("Terminou depois do prazo.");
        } else {
            System.out.println("Terminou antes do prazo.");
        }
    }

    public String getNome() {
        return nome;
    }
}
