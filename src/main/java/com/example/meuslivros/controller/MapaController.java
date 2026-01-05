package com.example.meuslivros.controller;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping; // importa a anotação getmapping do spring, ela que mapeia requisições http do tipo get
import org.springframework.web.bind.annotation.RequestMapping; // importa a anotação requestmapping do spring, que mapeia requisições http para métodos do controller
import org.springframework.web.bind.annotation.RestController; // importa a anotação restcontroller do spring, que indica que essa classe é um controller rest
import com.example.meuslivros.model.PaisLiterario;
import com.example.meuslivros.service.MapaService;

@RestController
@RequestMapping("/api/mapa")
public class MapaController {

    private final MapaService service;

    public MapaController(MapaService service) {
        this.service = service;
    }

    @GetMapping
    public List<PaisLiterario> getMapa() {
        return service.getDadosMapa();
    }
}
