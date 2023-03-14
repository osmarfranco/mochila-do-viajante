package org.dio.dominio;

public abstract class Conteudo {
    private String titulo;
    private String descricao;
    protected final Integer XP_PADRAO = 10;

    public abstract Integer calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getXP_PADRAO() {
        return XP_PADRAO;
    }
}
