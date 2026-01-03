package com.example.meuslivros.model;

public class Livro {
    // atributos
    private String titulo;
    private String autor;
    private String minhaOpiniao;
    private String capaUrl;

    // construtor
    public Livro(String titulo, String autor, String minhaOpiniao, String capaUrl) {
        this.titulo = titulo;
        this.autor = autor;
        this.minhaOpiniao = minhaOpiniao;
        this.capaUrl = capaUrl;
    }

    // getters e setters
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
    public String getMinhaOpiniao() {
        return minhaOpiniao;
    }
    public void setMinhaOpiniao(String minhaOpiniao) {
        this.minhaOpiniao = minhaOpiniao;
    }
    public String getCapaUrl() {
        return capaUrl;
    }
    public void setCapaUrl(String capaUrl) {
        this.capaUrl = capaUrl;
    }
}
