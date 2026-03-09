package com.example.meuslivros.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.List;
import com.example.meuslivros.model.PaisLiterario;
import org.junit.jupiter.api.Test;

class MapaServiceTest {

    private final MapaService service = new MapaService();

    @Test
    void deveRetornarDadosMapa() {
        List<PaisLiterario> mapa = service.getDadosMapa();

        assertFalse(mapa.isEmpty());
    }

    @Test
    void deveAplicarLimite() {
        List<PaisLiterario> mapa = service.getDadosMapa(2);

        assertEquals(2, mapa.size());
    }

    @Test
    void deveFalharComLimiteInvalido() {
        assertThrows(IllegalArgumentException.class, () -> service.getDadosMapa(-1));
    }
}
