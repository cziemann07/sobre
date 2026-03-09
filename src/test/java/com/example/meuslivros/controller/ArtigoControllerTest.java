package com.example.meuslivros.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import java.util.List;
import com.example.meuslivros.model.Artigo;
import com.example.meuslivros.service.ArtigoService;
import org.junit.jupiter.api.Test;

class ArtigoControllerTest {

    private final ArtigoService service = mock(ArtigoService.class);
    private final ArtigoController controller = new ArtigoController(service);

    @Test
    void deveListarArtigosComLimite() {
        when(service.getArtigos(1, "ARTIGO")).thenReturn(List.of(
                new Artigo("id-1", "Titulo", "Autor", "09/03/2026", "ARTIGO", "Resumo", "<p>Conteudo</p>")));

        List<Artigo> resultado = controller.listarArtigos(1, "ARTIGO");

        assertEquals(1, resultado.size());
    }

    @Test
    void devePropagarErroDeValidacaoDeLimite() {
        when(service.getArtigos(999, null)).thenThrow(new IllegalArgumentException("O parametro 'limite' deve estar entre 1 e 200."));

        assertThrows(IllegalArgumentException.class, () -> controller.listarArtigos(999, null));
    }
}
