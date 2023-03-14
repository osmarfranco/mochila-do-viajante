package org.dio.dominio;

public class Curso extends Conteudo {
    private Integer cargaHoraria;

    public Curso() {
    }

    @Override
    public Integer calcularXp() {
        return XP_PADRAO * this.cargaHoraria;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return getTitulo();
    }
}
