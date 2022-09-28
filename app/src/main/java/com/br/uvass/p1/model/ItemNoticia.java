package com.br.uvass.p1.model;

import java.util.Date;

public class ItemNoticia {

    private Integer id;
    private int foto;
    private String hora;
    private String titulo;
    private String descricao;
    private String autor;
    private String data;
    private String noticiaFull;

    public ItemNoticia(Integer id, int foto, String hora, String titulo, String descricao, String autor, String data, String noticiaFull) {
        this.id = id;
        this.foto = foto;
        this.hora = hora;
        this.titulo = titulo;
        this.descricao = descricao;
        this.data = data;
        this.autor = autor;
        this.noticiaFull = noticiaFull;
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

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getNoticiaFull() {
        return noticiaFull;
    }

    public void setNoticiaFull(String noticiaFull) {
        this.noticiaFull = noticiaFull;
    }
}
