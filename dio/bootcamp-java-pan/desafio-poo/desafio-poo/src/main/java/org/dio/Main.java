package org.dio;

import org.dio.dominio.Bootcamp;
import org.dio.dominio.Curso;
import org.dio.dominio.Dev;
import org.dio.dominio.Mentoria;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        //Conteudos
        Curso curso01 = new Curso();
        curso01.setTitulo("IDEs Java");
        curso01.setDescricao("Aprendendo a instalar e usar as principais IDEs Java");
        curso01.setCargaHoraria(2);

        Curso curso02 = new Curso();
        curso02.setTitulo("POO");
        curso02.setDescricao("Aprendendo programação orientada a objetos");
        curso02.setCargaHoraria(8);

        Curso curso03 = new Curso();
        curso03.setTitulo("Lógica de Programação");
        curso03.setDescricao("Afinando a lógica de programação");
        curso03.setCargaHoraria(4);

        Mentoria mentoria01 = new Mentoria();
        mentoria01.setTitulo("Testes com JUnit");
        mentoria01.setDescricao("Aprendendo a fazer testes usando JUnit");
        mentoria01.setData(LocalDateTime.now());

        //Bootcamp
        Bootcamp bootcamp01 = new Bootcamp();
        bootcamp01.setNome("Bootcamp Java");
        bootcamp01.setDescricao("Aprendendo Java");
        bootcamp01.getConteudos().add(curso01);
        bootcamp01.getConteudos().add(curso02);
        bootcamp01.getConteudos().add(mentoria01);
        bootcamp01.getConteudos().add(curso03);

        //Criando Devs
        Dev devOsmar = new Dev();
        devOsmar.setNome("Osmar");

        Dev devPaula = new Dev();
        devPaula.setNome("Paula");

        //Inscrevendo ambos no bootcamp
        devOsmar.inscreverBootcamp(bootcamp01);
        System.out.println("Osmar acabou de se inscrever no bootcamp!");
        devOsmar.exibirCursos();

        devPaula.inscreverBootcamp(bootcamp01);
        System.out.println("Paula acabou de se inscrever no bootcamp!");
        devPaula.exibirCursos();

        //Progressão e XP
        devOsmar.progredir();
        devOsmar.progredir();
        System.out.println("Osmar fez dois cursos, vamos ver como ele está agora:");
        System.out.println("XP Total: " + devOsmar.calcularTotalXp());
        devOsmar.exibirCursos();

        devPaula.progredir();
        devPaula.progredir();
        devPaula.progredir();
        System.out.println("Paula fez dois cursos e uma mentoria, vamos ver como ele está agora:");
        System.out.println("XP Total: " + devPaula.calcularTotalXp());
        devPaula.exibirCursos();

    }
}