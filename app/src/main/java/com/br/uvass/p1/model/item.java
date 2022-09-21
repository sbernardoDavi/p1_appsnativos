package com.br.uvass.p1.model;

import java.util.Date;

public class item {

    private Integer id;
    private int foto;
    private String hora;
    private String titulo;
    private String descricao;

    public item(Integer id, int foto, String hora, String titulo, String descricao) {
        this.id = id;
        this.foto = foto;
        this.hora = hora;
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

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
}
