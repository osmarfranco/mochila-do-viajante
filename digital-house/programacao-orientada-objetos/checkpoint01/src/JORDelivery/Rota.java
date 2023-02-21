package JORDelivery;

public class Rota {

    //atributos
    private Integer idRota;
    private Integer idPacote;
    private String status;
    private String endColeta;
    private String endEntrega;
    private String cliente;
    private String entregador;

    //construtor
    public Rota(Integer idRota, Integer idPacote, String status, String endColeta, String endEntrega, String cliente, String entregador) {
        this.idRota = idRota;
        this.idPacote = idPacote;
        this.status = status;
        this.endColeta = endColeta;
        this.endEntrega = endEntrega;
        this.cliente = cliente;
        this.entregador = entregador;
    }

    //métodos
    public void exibirDados(){
        System.out.println("ID: " + this.idRota + "\nPacote: " + this.idPacote + "\nCliente: " + this.cliente + "\nStatus: " + this.status + "\nEntregador: " + this.entregador + "\nEndereço de Coleta: " + this.endColeta + "\nEndereço de Entrega: " + this.endEntrega);
    }

    public void atualizarStatus(int novoStatus){
        switch (novoStatus){
            case 1:
                this.status = "Em Preparação";
                break;

            case 2:
                this.status = "Aguardando Coleta";
                break;

            case 3:
                this.status = "Em trânsito";
                break;

            case 4:
                this.status = "Entregue";
                break;

            case 5:
                this.status = "Extraviado";
                break;

            case 6:
                this.status = "Destinatário Ausente";
                break;

            case 7:
                this.status = "Cancelado";
                break;
        }
    }

    public void atualizarEntregador(String novoEntregador){
        this.entregador = novoEntregador;
    }

    //getters e setters
    public Integer getIdRota() {
        return idRota;
    }

    public Integer getIdPacote() {
        return idPacote;
    }

    public String getStatus() {
        return status;
    }

    public String getEndColeta() {
        return endColeta;
    }

    public String getEndEntrega() {
        return endEntrega;
    }

    public String getCliente() {
        return cliente;
    }

    public String getEntregador() {
        return entregador;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setEntregador(String entregador) {
        this.entregador = entregador;
    }
}
