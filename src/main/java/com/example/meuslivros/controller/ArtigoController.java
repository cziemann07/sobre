package com.example.meuslivros.controller;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping; // importa a anotação getmapping do spring, ela que mapeia requisições http do tipo get
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping; // importa a anotação requestmapping do spring, que mapeia requisições http para métodos do controller
import org.springframework.web.bind.annotation.RestController; // importa a anotação restcontroller do spring, que indica que essa classe é um controller rest
import com.example.meuslivros.model.Artigo; 
import com.example.meuslivros.service.ArtigoService;

@RequestMapping("/api/artigos") // esse cara é o responsável por mapear as requisições http que chegarem na url /api/artigos,
                               //ou seja, todas as requisições que chegarem nessa url serão tratadas por esse controller
@RestController
public class ArtigoController {
    // injeção de dependência do serviço de artigos
    // isto é, o controller depende do serviço para obter os dados dos artigos
    private final ArtigoService service;

    public ArtigoController(ArtigoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Artigo> listarArtigos(
            @RequestParam(defaultValue = "50") Integer limite,
            @RequestParam(required = false) String modulo) {
        return service.getArtigos(limite, modulo); // retorna o json com os artigos
    }
}
