package com.example.meuslivros.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.example.meuslivros.model.PaisLiterario;

@Service
public class MapaService {

    public List<PaisLiterario> getDadosMapa() {
        List<PaisLiterario> mundo = new ArrayList<>();

        // --- SEUS DADOS REAIS (Baseado no que conversamos) ---
        
        // Brasil (BRA) - Onde você leu mais
        mundo.add(new PaisLiterario("BRA", "Brasil", "Machado de Assis", 13, true));
        
        // Estados Unidos (USA) - Moby Dick, Último dos Moicanos
        mundo.add(new PaisLiterario("USA", "Estados Unidos", "Herman Melville", 2, true));

        // Reino Unido (GBR) - Orwell, Dickens, Defoe
        mundo.add(new PaisLiterario("GBR", "Reino Unido", "George Orwell", 5, true));

        // França (FRA) - Júlio Verne, Stendhal
        mundo.add(new PaisLiterario("FRA", "França", "Júlio Verne", 4, true));

        // Espanha (ESP) - Cervantes
        mundo.add(new PaisLiterario("ESP", "Espanha", "Miguel de Cervantes", 1, true));

        // Polônia (POL) - Quo Vadis
        mundo.add(new PaisLiterario("POL", "Polônia", "Henryk Sienkiewicz", 1, true));

        // Rússia (RUS) - Dostoiévski
        mundo.add(new PaisLiterario("RUS", "Rússia", "Fiódor Dostoiévski", 1, true));
        
        // Grécia (GRC) - Homero
        mundo.add(new PaisLiterario("GRC", "Grécia", "Homero", 1, true));
        
        // Índia (IND) - Mogli
        mundo.add(new PaisLiterario("IND", "Índia", "Rudyard Kipling", 1, true));


        // --- DADOS DE EXEMPLO (Não lidos ainda, aparecerão em cinza/roxo) ---
        mundo.add(new PaisLiterario("DEU", "Alemanha", "Goethe", 0, false));
        mundo.add(new PaisLiterario("JPN", "Japão", "Haruki Murakami", 0, false));
        mundo.add(new PaisLiterario("ARG", "Argentina", "Jorge Luis Borges", 0, false));
        mundo.add(new PaisLiterario("COL", "Colômbia", "Gabriel García Márquez", 0, false));

        return mundo;
    }
}