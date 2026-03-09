package com.example.meuslivros.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.List;
import com.example.meuslivros.model.Artigo;
import org.junit.jupiter.api.Test;

class ArtigoServiceTest {

    private final ArtigoService service = new ArtigoService();

    @Test
    void deveRetornarArtigos() {
        List<Artigo> artigos = service.getArtigos();

        assertFalse(artigos.isEmpty());
    }

    @Test
    void deveAplicarLimite() {
        List<Artigo> artigos = service.getArtigos(1, null);

        assertEquals(1, artigos.size());
    }

    @Test
    void deveFiltrarPorModulo() {
        List<Artigo> artigos = service.getArtigos(50, "POEMA");

        assertEquals(1, artigos.size());
        assertEquals("POEMA", artigos.get(0).getModulo());
    }

    @Test
    void deveFalharComLimiteInvalido() {
        assertThrows(IllegalArgumentException.class, () -> service.getArtigos(201, null));
    }
}
