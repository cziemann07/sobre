package com.example.meuslivros.controller;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping; // importa a anotação getmapping do spring, ela que mapeia requisições http do tipo get
import org.springframework.web.bind.annotation.RequestMapping; // importa a anotação requestmapping do spring, que mapeia requisições http para métodos do controller
import org.springframework.web.bind.annotation.RestController; // importa a anotação restcontroller do spring, que indica que essa classe é um controller rest
import com.example.meuslivros.model.Livro; 
import com.example.meuslivros.service.LivroService;

@RequestMapping("/api/livros") // esse cara é o responsável por mapear as requisições http que chegarem na url /api/livros,
                               //ou seja, todas as requisições que chegarem nessa url serão tratadas por esse controller
@RestController
public class LivroController {
    // injeção de dependência do serviço de livros
    // isto é, o controller depende do serviço para obter os dados dos livros
    private final LivroService service;

    public LivroController(LivroService service) {
        this.service = service;
    }

    @GetMapping
    public List<Livro> listarLivros() {
        return service.getMeusLivros(); // retorna o json com meus livros
    }
}
