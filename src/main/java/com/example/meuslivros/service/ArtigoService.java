package com.example.meuslivros.service;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import com.example.meuslivros.model.Artigo;
import org.springframework.stereotype.Service;

@Service
public class ArtigoService {
    private static final int LIMITE_PADRAO = 50;
    private static final int LIMITE_MINIMO = 1;
    private static final int LIMITE_MAXIMO = 200;

    // Metodo que cria uma lista de artigos e retorna essa lista.
    public List<Artigo> getArtigos() {
        List<Artigo> blog = new ArrayList<>();

        blog.add(new Artigo(
                "importancia-leitura",
                "O Manifesto da Decadencia Intelectual: A Falencia da Leitura no Seculo XXI",
                "Ziemann",
                "20/03/2026",
                "ARTIGO",
                "Um manifesto provocador sobre a completa falencia da leitura como ferramenta de pensamento critico no Brasil contemporaneo.",
                carregarHtml("artigos/importancia.html")));

        blog.add(new Artigo(
                "sistema-educacional-controle",
                "O Sistema Educacional Como Ferramenta de Controle",
                "Ziemann",
                "09/03/2026",
                "EDUCACAO",
                "Por que o Brasil ensina Bhaskara, mas falha no ensino de ingles e na formacao de autonomia intelectual.",
                carregarHtml("artigos/educacao.html")));

        blog.add(new Artigo(
                "julio-verne-despertar",
                "Julio Verne: O Guia que Transforma Jovens em Leitores",
                "Ziemann",
                "09/03/2026",
                "EDUCACAO",
                "A aventura como metodo educativo e a literatura como ponte para ciencia e pensamento critico.",
                carregarHtml("artigos/julioverne.html")));

        blog.add(new Artigo(
                "brasil-parou-crescer",
                "O Brasil Parou de Crescer: A Nacao Que Vive de Likes e Morre de Mediocridade",
                "Ziemann",
                "09/03/2026",
                "ARTIGO",
                "Uma critica sobre imaturidade social, validacao externa e formacao intelectual no Brasil contemporaneo.",
                carregarHtml("artigos/maturidade.html")));

        blog.add(new Artigo(
                "exercicio-juventude",
                "Um Exercicio de Juventude",
                "Ziemann",
                "09/03/2026",
                "POEMA",
                "Poema pessoal preservado como documento de formacao literaria e amadurecimento intelectual.",
                carregarHtml("artigos/poema.html")));

        return blog;
    }

    public List<Artigo> getArtigos(Integer limite, String modulo) {
        int limiteValidado = validarLimite(limite);
        List<Artigo> blog = filtrarPorModulo(getArtigos(), modulo);
        return blog.subList(0, Math.min(limiteValidado, blog.size()));
    }

    private List<Artigo> filtrarPorModulo(List<Artigo> artigos, String modulo) {
        if (modulo == null || modulo.isBlank()) {
            return artigos;
        }
        String moduloNormalizado = modulo.trim().toUpperCase(Locale.ROOT);
        return artigos.stream()
                .filter(artigo -> artigo.getModulo().equalsIgnoreCase(moduloNormalizado))
                .collect(Collectors.toList());
    }

    private String carregarHtml(String caminhoRecurso) {
        try (InputStream input = getClass().getClassLoader().getResourceAsStream(caminhoRecurso)) {
            if (input == null) {
                throw new IllegalStateException("Arquivo de artigo nao encontrado: " + caminhoRecurso);
            }
            return new String(input.readAllBytes(), StandardCharsets.UTF_8);
        } catch (IOException ex) {
            throw new IllegalStateException("Falha ao ler o artigo: " + caminhoRecurso, ex);
        }
    }

    private int validarLimite(Integer limite) {
        if (limite == null) {
            return LIMITE_PADRAO;
        }
        if (limite < LIMITE_MINIMO || limite > LIMITE_MAXIMO) {
            throw new IllegalArgumentException("O parametro 'limite' deve estar entre 1 e 200.");
        }
        return limite;
    }
}
