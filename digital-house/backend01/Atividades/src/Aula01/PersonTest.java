package Aula01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

class PersonTest {

    @Test
    public void eMaiorDeDezoito(){
        Person pessoa1 = new Person("Ademir", "Cavalcanti", "ademir@email.com", LocalDate.of(1975, 2, 15));
        if(pessoa1.isMaiorDeIdade()){
            System.out.println(pessoa1.mostrarNomeCompleto() + " é maior de 18 anos.");
        }
    }

    @Test
    public void eMenorDeDezoito(){
        Person pessoa2 = new Person("Enzo", "Nutella", "enzinho@email.com", LocalDate.of(2010, 8, 10));
        if(!pessoa2.isMaiorDeIdade()){
            System.out.println(pessoa2.mostrarNomeCompleto() + " é menor de 18 anos.");
        }
    }

}