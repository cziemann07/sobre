package com.example.meuslivros.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.meuslivros.model.Analogia;
import com.example.meuslivros.service.AnalogiaService;

@RequestMapping("/api/analogias") // endpoint para as analogias literatura ↔ TI
@RestController
public class AnalogiasController {
    // injeção de dependência do serviço de analogias
    private final AnalogiaService service;

    public AnalogiasController(AnalogiaService service) {
        this.service = service;
    }

    @GetMapping
    public List<Analogia> listarAnalogias(@RequestParam(defaultValue = "50") Integer limite) {
        return service.getMinhasAnalogias(limite); // retorna o json com as analogias
    }
}