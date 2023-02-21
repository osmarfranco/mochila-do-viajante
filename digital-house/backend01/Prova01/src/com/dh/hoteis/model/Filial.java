package com.dh.hoteis.model;

public class Filial {
    private int Id;
    private String nomeDaFilial;
    private String rua;
    private String numero;
    private String cidade;
    private String estado;
    private Boolean isCincoEstrelas;

    //Construtor
    public Filial() {

    }

    //Metodo para converter Boolean em bit na hora de salvar no banco
    public int converterIsCincoEstrelas(){
        if(this.getCincoEstrelas()){
            return 1;
        } else {
            return 0;
        }
    }

    //Getters e Setters
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNomeDaFilial() {
        return nomeDaFilial;
    }

    public void setNomeDaFilial(String nomeDaFilial) {
        this.nomeDaFilial = nomeDaFilial;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Boolean getCincoEstrelas() {
        return isCincoEstrelas;
    }

    public void setCincoEstrelas(Boolean cincoEstrelas) {
        isCincoEstrelas = cincoEstrelas;
    }
}
