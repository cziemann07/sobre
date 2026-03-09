package com.example.meuslivros.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import java.util.List;
import com.example.meuslivros.model.Livro;
import com.example.meuslivros.service.LivroService;
import org.junit.jupiter.api.Test;

class LivroControllerTest {

    private final LivroService service = mock(LivroService.class);
    private final LivroController controller = new LivroController(service);

    @Test
    void deveListarLivrosComLimite() {
        when(service.getMeusLivros(2)).thenReturn(List.of(
                new Livro("Livro A", "Autor A", "Opiniao A", "/a.jpg"),
                new Livro("Livro B", "Autor B", "Opiniao B", "/b.jpg")));

        List<Livro> resultado = controller.listarLivros(2);

        assertEquals(2, resultado.size());
    }

    @Test
    void devePropagarErroDeValidacaoDeLimite() {
        when(service.getMeusLivros(0)).thenThrow(new IllegalArgumentException("O parametro 'limite' deve estar entre 1 e 200."));

        assertThrows(IllegalArgumentException.class, () -> controller.listarLivros(0));
    }
}
