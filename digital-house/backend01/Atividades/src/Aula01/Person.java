package Aula01;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String nome;
    private String sobrenome;
    private String email;
    private LocalDate dataNascimento;

    public Person(String nome, String sobrenome, String email, LocalDate dataNascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.dataNascimento = dataNascimento;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String mostrarNomeCompleto(){
//        System.out.println(this.nome + " " + this.sobrenome);
        return this.nome + " " + this.sobrenome;
    }

    public boolean isMaiorDeIdade(){
        int idade = Period.between(this.dataNascimento, LocalDate.now()).getYears();
        return idade > 18;
    }
}
