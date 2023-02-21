package com.dh.clinica.model;

import java.time.LocalDate;
import java.util.Date;

public class Paciente {
    private int id;
    private String nome, sobrenome, rg, endereco;
    private LocalDate dataCadastro;

    public Paciente() {

    }

    public void atualizarNome(String novoNome){
        setNome(novoNome);
    }

    public void atualizarSobrenome(String novoSobrenome){
        setSobrenome(novoSobrenome);
    }

    public void atualizarRG(String novoRG){
        setRg(novoRG);
    }

    public void atualizarEndereco(String novoEndereco){
        setEndereco(novoEndereco);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}
