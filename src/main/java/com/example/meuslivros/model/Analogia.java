package com.example.meuslivros.model;

public class Analogia {
    // atributos
    private String tituloArtigo;
    private String livro;
    private String autor;
    private String conceitoTech;
    private String analogia;
    private String imagemUrl;

    // construtor
    public Analogia(String tituloArtigo, String livro, String autor, String conceitoTech, String analogia, String imagemUrl) {
        this.tituloArtigo = tituloArtigo;
        this.livro = livro;
        this.autor = autor;
        this.conceitoTech = conceitoTech;
        this.analogia = analogia;
        this.imagemUrl = imagemUrl;
    }

    // getters e setters
    public String getTituloArtigo() {
        return tituloArtigo;
    }
    public void setTituloArtigo(String tituloArtigo) {
        this.tituloArtigo = tituloArtigo;
    }
    public String getLivro() {
        return livro;
    }
    public void setLivro(String livro) {
        this.livro = livro;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getConceitoTech() {
        return conceitoTech;
    }
    public void setConceitoTech(String conceitoTech) {
        this.conceitoTech = conceitoTech;
    }
    public String getAnalogia() {
        return analogia;
    }
    public void setAnalogia(String analogia) {
        this.analogia = analogia;
    }
    public String getImagemUrl() {
        return imagemUrl;
    }
    public void setImagemUrl(String imagemUrl) {
        this.imagemUrl = imagemUrl;
    }
}