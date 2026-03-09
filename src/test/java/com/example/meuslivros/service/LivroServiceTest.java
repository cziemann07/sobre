package com.example.meuslivros.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.List;
import com.example.meuslivros.model.Livro;
import org.junit.jupiter.api.Test;

class LivroServiceTest {

    private final LivroService service = new LivroService();

    @Test
    void deveRetornarLivros() {
        List<Livro> livros = service.getMeusLivros();

        assertFalse(livros.isEmpty());
    }

    @Test
    void deveAplicarLimite() {
        List<Livro> livros = service.getMeusLivros(3);

        assertEquals(3, livros.size());
    }

    @Test
    void deveFalharComLimiteInvalido() {
        assertThrows(IllegalArgumentException.class, () -> service.getMeusLivros(0));
    }
}
