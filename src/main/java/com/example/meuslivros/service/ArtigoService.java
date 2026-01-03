package com.example.meuslivros.service;
import java.util.List; // importa a interface list para usar listas
import java.util.ArrayList; // importa a classe arraylist para criar listas
import com.example.meuslivros.model.Artigo; // importa a classe artigo do pacote model
import org.springframework.stereotype.Service; // importa a anotação service do spring

@Service
public class ArtigoService {
    // metódo que cria uma lista de artigos e retorna essa lista
    
    public List<Artigo> getArtigos() {
        // o "banco de dados" é uma lista estática de artigos
        List<Artigo> blog = new ArrayList<>();
        blog.add(new Artigo(
            "manifesto-decadencia",
            "O Manifesto da Decadência Intelectual",
            "Ziemann",
            "02/01/2026",
            "A leitura tornou-se o produto de consumo mais medíocre do mercado. Uma crítica brutal à falência da leitura no século XXI.",
            """
            <article>
                <h1>O Manifesto da Decadência Intelectual: A Falência da Leitura no Século XXI</h1>
                
                <p>Minha raiva é legítima, porque ela nasce do abismo entre o ideal e a realidade. A leitura, que deveria ser a ferramenta de <strong>libertação</strong> e de forja do indivíduo, tornou-se o <strong>produto de consumo</strong> mais <strong>medíocre</strong> do mercado.</p>

                <h2>1. A Mentira Pedagógica do "Leia Mais"</h2>
                <p>Os professores e gurus repetem: "Você deve ler muito." Mas eu pergunto: <strong>Ler o quê?</strong> Ler qualquer porcaria é tão útil quanto ouvir funk ou tentar <strong>acender</strong> os próprios peidos.</p>

                <h2>2. O Catálogo do "Mar de Merda"</h2>
                <p>A natureza adâmica do homem busca a bestialidade. O mercado editorial não é antídoto, é traficante. Veja a febre das fantasias sexuais e livros de youtubers: mediocridade por design.</p>
                
                <h2>3. A Indústria do Conforto Cognitivo</h2>
                <p>O mercado descobriu que desconforto não vende. Criaram o conforto cognitivo. Livros que são comida ultraprocessada: viciantes e vazios.</p>

                <h2>4. A Sentença Final</h2>
                <p>Estamos num poço de percepções rasas. Quem não lê o que confronta, está desarmado. Um povo que prefere best-seller a clássicos se permite ser tratado como gado.</p>

                <h2>Conclusão</h2>
                <p>Qual livro funcionou como seu salva-vidas contra a mediocridade? Se não tem resposta, você é parte do problema. Num mundo de gado, o único ato revolucionário é <strong>pensar</strong>.</p>
                
                <p><em>(Nota: Texto editado para brevidade do exemplo, mas o original completo pode ir aqui).</em></p>
            </article>
            """
        ));

        return blog;
    }
}
