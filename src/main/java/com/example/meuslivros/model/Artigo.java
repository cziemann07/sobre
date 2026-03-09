package com.example.meuslivros.model;

public class Artigo {
    // atributos
    private String id;
    private String titulo;
    private String autor;
    private String data;
    private String modulo;
    private String resumo;
    private String conteudoHtml;

    // construtor
    public Artigo(String id, String titulo, String autor, String data, String modulo, String resumo, String conteudoHtml) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.data = data;
        this.modulo = modulo;
        this.resumo = resumo;
        this.conteudoHtml = conteudoHtml;
    }

    // getters e setters
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
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
    public String getModulo() {
        return modulo;
    }
    public void setModulo(String modulo) {
        this.modulo = modulo;
    }
    public String getResumo() {
        return resumo;
    }
    public void setResumo(String resumo) {
        this.resumo = resumo;
    }
    public String getConteudoHtml() {
        return conteudoHtml;
    }
    public void setConteudoHtml(String conteudoHtml) {
        this.conteudoHtml = conteudoHtml;
    }
}
