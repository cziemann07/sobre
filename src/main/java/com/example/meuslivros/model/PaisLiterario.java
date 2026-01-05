package com.example.meuslivros.model;

public class PaisLiterario {
    private String isoCode;   // O Código de 3 letras (BRA, USA, RUS) essencial pro mapa
    private String nomePais;  // Nome para aparecer na tela
    private String topAutor;  // O autor destaque
    private int qtdLivros;    // Define a altura do relevo no 3D
    private boolean lido;     // Define a cor (verde ou cinza)

    public PaisLiterario(String isoCode, String nomePais, String topAutor, int qtdLivros, boolean lido) {
        this.isoCode = isoCode;
        this.nomePais = nomePais;
        this.topAutor = topAutor;
        this.qtdLivros = qtdLivros;
        this.lido = lido;
    }

    // Getters são obrigatórios pro Spring transformar em JSON
    public String getIsoCode() { return isoCode; }
    public String getNomePais() { return nomePais; }
    public String getTopAutor() { return topAutor; }
    public int getQtdLivros() { return qtdLivros; }
    public boolean isLido() { return lido; }
}