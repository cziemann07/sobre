package com.example.meuslivros.service; // define o pacote do serviço
import java.util.List; // importa a interface list para usar listas
import java.util.ArrayList; // importa a classe arraylist para criar listas
import com.example.meuslivros.model.Livro; // importa a classe livro do pacote model
import org.springframework.stereotype.Service; // importa a anotação service do spring

@Service
public class LivroService {
    private static final int LIMITE_PADRAO = 50;
    private static final int LIMITE_MINIMO = 1;
    private static final int LIMITE_MAXIMO = 200;

    // metódo que cria uma lista de livros e retorna essa lista

    public List<Livro> getMeusLivros() {
        // o "banco de dados" é uma lista estática de livros
        List<Livro> estante = new ArrayList<>();

        // -- Machado de Assis --
        estante.add(new Livro(
            "Dom Casmurro",
            "Machado de Assis",
            """
            Não é apenas uma história de ciúme; é um estudo de caso sobre a desintegração psíquica sob a égide da modernidade incipiente. A análise já feita, sobre a inocência de Capitu e a psicopatia de Bentinho, deve ser expandida. Bentinho representa a elite brasileira que, por ser inerte e incapaz de ação efetiva (uma inércia que o próprio Machado, como um autêntico conservador, critica), projeta sua falha no mundo exterior. Seu ciúme não é prova de amor; é a manifestação de um complexo de inferioridade que se transforma em tirania. Ao tentar 'atar as pontas' para si, ele nos atesta que a Verdade é sempre uma construção de poder. A tragédia não é a traição; é a destruição da vida de uma mulher forte pela fraqueza de um homem covarde. Uma crítica atemporal à masculinidade tóxica travestida de moralismo.
            """,
            "/imagens/dom-casmurro.jpg"
        ));

        estante.add(new Livro(
            "Memórias Póstumas de Brás Cubas",
            "Machado de Assis",
            """
            Aqui, temos o nascimento do narrador definitivo da nossa frustração. Brás Cubas, o defunto autor, fala do túmulo, o que lhe confere a licença irônica para desmascarar a futilidade da existência burguesa no Rio de Janeiro imperial. A 'humana vaidade' é o motor de tudo, e a obra é uma negação de qualquer heroísmo ou ideal. Brás Cubas, com sua vida 'inútil', encarna o liberalismo brasileiro: superficial, inconsequente, autocentrado. O 'verme' que ele pisa no final do livro simboliza a pequenez de sua vida, que não legou 'nem um miserrímo empréstimo'. É a obra máxima sobre o niilismo elegante da nossa elite, que se diverte com a própria inutilidade.
            """,
            "/imagens/memorias-postumas.jpg"
        ));

        estante.add(new Livro(
            "Quincas Borba",
            "Machado de Assis",
            """
            A continuação da patologia. O foco se desloca para a Filosofia do Humanitismo, uma paródia hilariante (e profundamente séria) das filosofias positivistas e cientificistas que tanto seduziram o Brasil do Segundo Reinado. Rubião, o ingênuo provinciano que herda a fortuna e a 'filosofia', é a prova de que a riqueza sem caráter e inteligência moral só serve para acelerar a loucura. O Humanitismo, que prega que 'Ao vencedor, as batatas!', é a doutrina perfeita para justificar a selvageria do capitalismo e a falta de caridade. A obra é um ataque direto ao nosso materialismo rasteiro e à forma como a sociedade valoriza o status em detrimento da virtude.
            """,
            "/imagens/quincas-borba.jpg"
        ));

        // --- José de Alencar ---
        estante.add(new Livro(
            "Iracema",
            "José de Alencar",
            """
            Esta fantástica obra foi o meu primeiro contato com o Romantismo Indianista. Guardo com muito carinho as lembranças que tenho e a influência de minha antiga professora de Língua Portuguesa, que, com seu respeito e saudosismo para com essas obras, me introduziu ao gênero e à perspectiva que hoje tenho. Iracema, a 'virgem dos lábios de mel', é menos uma mulher e mais uma alegoria da terra brasileira. Ela é a natureza intocada que se entrega ao colonizador branco (Martim), gerando o primeiro fruto mestiço, Moacir (o 'filho da dor'). A complexidade aqui reside no fato de que, enquanto Alencar tenta criar um mito fundador romântico, ele inadvertidamente narra o destino trágico da cultura indígena: a beleza se entrega ao estrangeiro e morre de saudade, deixando apenas a herança mestiça e o nome. É uma obra fundamental para entender a melancolia subjacente ao nosso nacionalismo, a consciência de que a pureza original foi perdida.
            """,
            "/imagens/iracema.jpg"
        ));

        estante.add(new Livro(
            "O Guarani",
            "José de Alencar",
            """
            O épico da conciliação impossível. Peri é o indígena idealizado, nobre e heroico, dotado de uma virtude moral superior a muitos brancos. Ele personifica o 'bom selvagem' de Rousseau, mas, em Alencar, esse selvagem tem um propósito: servir e proteger a família portuguesa de D. Antônio de Mariz. O livro é o desejo utópico de um Brasil onde as duas raças se unem em torno da fé cristã e da honra. Contudo, a cena final, com Peri e Cecília à mercê da natureza em fúria, é a confissão inconsciente de Alencar: essa união é extra-histórica, só pode sobreviver fora da sociedade, em um pacto com o universo que a realidade nega. É a nossa fundação como um sonho irrealizável.
            """,
            "/imagens/o-guarani.jpg"
        ));

        estante.add(new Livro(
            "Ubirajara",
            "José de Alencar",
            """
            O tribalismo levado ao limite, buscando no passado remoto a glória de um Brasil anterior à colonização. Diferente dos outros, esta é uma obra que se passa inteiramente no universo tupi, tentando (e falhando, por limitações do autor) reproduzir a lógica e a honra guerreira indígena. O nome do herói (Senhor da Lança) e sua busca por fama e liderança ilustram a ética do guerreiro. A complexidade é que o livro é uma ficção de pureza; ele tenta compensar a mestiçagem inevitável, buscando um 'proto-nacionalismo' na força dos seus ancestrais. É uma tentativa de dar ao Brasil um passado heroico que não seja apenas o português, mas que, ironicamente, o faz usando a estrutura do romance europeu.
            """,
            "/imagens/ubirajara.jpg"
        ));

        estante.add(new Livro(
            "Senhora",
            "José de Alencar",
            """
            Um duro olhar sobre o poder do capital no século XIX. Aurélia Camargo é a mulher que se transforma em 'senhora' por meio da riqueza e usa seu dinheiro como arma para vingança moral. Ela compra o amor do homem que a desprezou, Fernando Seixas, invertendo a lógica patriarcal. O livro revela que a moralidade burguesa é uma casca: sob o verniz social, o que impera é o mercado de vaidades e casamentos. Alencar, aqui, critica a superficialidade das relações sociais e mostra que, no Brasil, o dinheiro é a única forma de emancipação real para uma mulher. Uma leitura conservadora veria a degeneração dos costumes; uma crítica veria a desigualdade que força tais atos.
            """,
            "/imagens/senhora.jpg"
        ));

        estante.add(new Livro(
            "Lucíola",
            "José de Alencar",
            """
            Mais do que a história de uma prostituta, é o estudo da Redenção Moral na sociedade hipócrita. Lúcia (ou Maria da Glória) é a vítima de um sistema social que a marginaliza, mas que, paradoxalmente, a força a uma profissão que a torna rica. A complexidade está em como Alencar tenta elevar a figura da cortesã ao status de mulher virtuosa através do amor puro de um homem. É um clássico do moralismo romântico que busca a pureza onde há o vício, tentando provar que a graça (no sentido cristão) pode salvar mesmo o mais caído. Um debate sobre a diferença entre moralidade social e a pureza da alma.
            """,
            "/imagens/luciola.jpg"
        ));

        // --- Outros Clássicos Nacionais ---
        estante.add(new Livro(
            "Triste Fim de Policarpo Quaresma",
            "Lima Barreto",
            """
            O nosso guia espiritual. O livro é o manifesto trágico do nacionalismo puro e ingênuo. Policarpo é o brasileiro que acredita no Brasil: na língua Tupi como idioma oficial, na superioridade da nossa agricultura, e no Exército como guardião da ordem. Seu 'triste fim' é a denúncia da nossa realidade bufa e implacável. O Brasil não aceita a pureza; esmaga o idealista. O livro é a prova de que o burocrata medíocre e o político fisiológico sempre vencerão o homem de virtude e ideal. É a crítica mais brutal à nossa incompetência administrativa e à nossa vocação para a mediocridade, narrada com a dor de quem ama o Brasil e sofre com ele.
            """,
            "/imagens/policarpo-quaresma.jpg"
        ));

        estante.add(new Livro(
            "Capitães da Areia",
            "Jorge Amado",
            """
            Como já dito, é a exposição da chaga social. O complexo reside na forma como Jorge Amado usa o lirismo para descrever a violência. Ele não apenas reporta; ele glamouriza a resistência. Pedro Bala e seus 'Capitães' são um microcosmo da sociedade: têm sua própria hierarquia, suas regras de lealdade, seus códigos. Amado oferece um contraponto à falência do Estado ao mostrar que a comunidade pode se formar até no esgoto. A obra não é apenas sobre a pobreza; é uma tese sobre a rejeição da hipocrisia burguesa e a busca por um sentido de pertencimento entre os despossuídos.
            """,
            "/imagens/capitaes-da-areia.jpg"
        ));

        estante.add(new Livro(
            "Macunaíma",
            "Mário de Andrade",
            """
            O Herói sem Caráter é a antropofagia em ato. Mário de Andrade não apenas critica, ele devora e vomita a cultura brasileira. Macunaíma, com sua inconstância, sua preguiça e sua incapacidade de manter o foco, é a crítica à nossa falta de virtude produtiva. O livro é uma colagem de lendas, dialetos e folclore, mostrando que o Brasil é um mosaico caótico, mas que falta a cola moral para uni-lo. Ele critica o heroísmo clássico ao mostrar que o nosso herói é cínico, libidinoso e, em última instância, indiferente. A obra é a confissão de que a brasilidade é mais uma força da natureza (selvagem e irracional) do que um projeto de civilização.
            """,
            "/imagens/macunaima.jpg"
        ));

        estante.add(new Livro(
            "O Vampiro de Curitiba",
            "Dalton Trevisan",
            """
            ATENÇÃO, pois aqui reside o verdadeiro tesouro não lapidado. O descaso com Dalton Trevisan é a prova cabal do nosso complexo de vira-lata e da nossa incapacidade de valorizar a genialidade que não se dobra ao mainstream carioca-paulistano. Trevisan é um cronista da sordidez humana de um rigor quase científico. O Vampiro de Curitiba não é um livro de contos; é uma necropsia da alma paranaense e, por extensão, da alma urbana brasileira. Seus personagens (os vampiros, as prostitutas, os solitários, os hipócritas) são a fauna noturna que a moralidade diurna finge não ver. O estilo é seco, cortante, quase lacônico, mas carrega uma carga de profundidade existencial que poucos autores no mundo atingem. A 'Vila Tira-Teima' é o nosso inferno particular. O livro é um manifesto de que a literatura não precisa ser épica para ser grandiosa; ela só precisa ser verdadeira. Trevisan tem o mérito de extrair poesia da feiura, de desmascarar a pequena vida provinciana e revelar o abismo que há sob a rotina. Valorizá-lo não é apenas um ato de justiça literária; é um imperativo moral e intelectual para quem de fato tem senso crítico. Quem não o lê, não entende a sombra que nos constitui.
            """,
            "/imagens/vampiro-curitiba.jpg"
        ));

        estante.add(new Livro(
            "O Homem que Calculava",
            "Malba Tahan",
            """
            A genialidade de O Homem que Calculava reside exatamente na premissa de que a beleza da Matemática e a aplicação da lógica são as fundações da justiça e da virtude social, posicionando Beremiz Samir não apenas como um mero resolvedor de problemas, mas como um filósofo moral que usa os números para desvendar e corrigir as iniquidades do mundo. O livro de Malba Tahan é uma metáfora pedagógica que demonstra, através de soluções elegantes e acessíveis, que o raciocínio lógico e a ordem matemática são os pilares indispensáveis para o bom funcionamento de qualquer sociedade, servindo como um contraponto didático e urgente ao caos, à desorganização e à falta de equidade que persistem no nosso Brasil. Ao provar que a inteligência racional é a base da verdadeira sabedoria e da ética prática, a obra se torna um manifesto pela clareza, pela honestidade e pela repartição justa, o que justifica plenamente a tese de que O Homem que Calculava deveria ser leitura obrigatória nas escolas brasileiras, ensinando que a correção de problemas sociais, assim como os matemáticos, começa com a aplicação da lógica e do método.
            """,
            "/imagens/homem-calculava.jpg"
        ));

        // --- Clássicos Mundiais ---
        estante.add(new Livro(
            "Moby Dick",
            "Herman Melville",
            """
            Não é uma caçada; é a luta metafísica contra o Absoluto. O Capitão Ahab representa a vontade de poder levada à loucura, o homem que se recusa a aceitar os limites impostos pela natureza ou por Deus. Moby Dick não é apenas uma baleia; é a encarnação do Mistério Ininteligível, do mal ou do destino cego. O livro é uma meditação sobre a Obsessão e a forma como ela destrói não só o indivíduo, mas toda a comunidade (o navio Pequod). Uma lição sobre a humildade necessária diante da magnitude do universo, e o perigo de se curvar a um líder que confunde sua neurose com uma missão divina.
            """,
            "/imagens/moby-dick.jpg"
        ));

        estante.add(new Livro(
            "Dom Quixote",
            "Miguel de Cervantes",
            """
            O livro que define a esquizofrenia entre o idealismo e a realidade. Dom Quixote é o último cavaleiro, o homem que tenta impor a ética da cavalaria a um mundo que se tornou prosaico e pragmático. Ele não é apenas um louco; é o símbolo do idealista que se recusa a aceitar a mediocridade do seu tempo. Seu companheiro, Sancho Pança, é o contraponto realista, o homo economicus que busca a recompensa terrena. A complexidade está em como a 'loucura' de Quixote é, paradoxalmente, a única fonte de virtude e poesia no mundo. É uma ode à imaginação e um questionamento sobre onde reside a verdadeira sanidade: na aceitação do mundo feio ou na luta para torná-lo belo.
            """,
            "/imagens/dom-quixote.jpg"
        ));

        estante.add(new Livro(
            "Robinson Crusoé",
            "Daniel Defoe",
            """
            A apoteose do individualismo burguês e do espírito prático. Crusoé é o arquétipo do homem ocidental que, ao ser jogado na natureza selvagem, não se rende, mas reconstrói a civilização a partir do zero. A ilha é o laboratório onde o trabalho e a racionalidade protestante triunfam sobre o caos. Sua complexidade está no seu subtexto colonialista e missionário: ele domina a natureza, submete o nativo (Sexta-Feira) e o converte, provando que a civilização ocidental é um modelo universal e superior. Para o nosso nacionalismo, é uma faca de dois gumes: admiramos a capacidade de superação, mas rejeitamos a arrogância civilizacional.
            """,
            "/imagens/robinson-crusoe.jpg"
        ));

        estante.add(new Livro(
            "A Revolução dos Bichos",
            "George Orwell",
            """
            Uma alegoria política de rigor impecável. A 'fazenda' é a metáfora da revolução traída, um espelho do que aconteceu na União Soviética, mas aplicável a toda revolução que se inicia com ideais de igualdade e termina em tirania. Os porcos (Napoleão e Bola-de-Neve) representam os líderes revolucionários que, ao tomar o poder, se tornam mais opressores que os antigos donos (os humanos). A complexidade é que Orwell não critica apenas o comunismo; ele critica a natureza humana, mostrando que o poder, em qualquer sistema, corrompe e que a ignorância dos 'outros bichos' é a base para a tirania. É um manual para entender como a linguagem é usada para justificar a opressão ('Todos os animais são iguais, mas alguns são mais iguais que outros').
            """,
            "/imagens/revolucao-bichos.jpg"
        ));

        estante.add(new Livro(
            "O Vermelho e o Negro",
            "Stendhal",
            """
            O retrato do arrivismo social na França pós-Napoleônica. Julien Sorel é o jovem ambicioso, de origem humilde, que usa sua inteligência e sua paixão para ascender na sociedade. A complexidade reside na forma como Stendhal expõe o conflito entre a paixão (o Negro) — seu destino no clero — e a ação (o Vermelho) — sua admiração por Napoleão e sua ambição militar. O livro é uma crítica à hipocrisia da Restauração, onde o mérito é subjugado ao nascimento e o dinheiro. Sorel é o herói que, ao se recusar a ser medíocre, é esmagado pelo sistema, um precursor do nosso Bentinho em sua luta para ser notado.
            """,
            "/imagens/vermelho-e-negro.jpg"
        ));

        estante.add(new Livro(
            "Quo Vadis",
            "Henryk Sienkiewicz",
            """
            Um épico da fé inabalável contra a decadência imperial. A Roma de Nero é o palco da dissolução moral, onde o hedonismo e a crueldade são a norma. O romance é um poderoso contraponto entre o luxo corrupto do Império e a pureza e a força moral do cristianismo primitivo. A complexidade reside na forma como Sienkiewicz usa o contraste entre a beleza pagã e a verdade cristã. A história de amor entre o patrício Vinícius e a cristã Lígia é a metáfora da conversão da Europa: o poder romano se curva à mensagem de Cristo. Um livro que reafirma a importância da virtude e da fé como únicos sustentáculos contra a tirania e a perversão.
            """,
            "/imagens/quo-vadis.jpg"
        ));

        estante.add(new Livro(
            "Odisseia",
            "Homero",
            """
            O Arquétipo da jornada de retorno. Odisseu é o herói da astúcia (Métis), diferente da força bruta de Aquiles. O livro não é só uma aventura; é a narração da luta do homem para retornar à sua identidade e ao seu lar (Ítaca), que é a metáfora da ordem e da estabilidade. A complexidade está nas tentações que ele enfrenta: o canto das Sereias (a sedução da morte), o Ciclope (a brutalidade sem razão), Calipso (a sedução da imortalidade sem propósito). É uma lição sobre a perseverança, o valor da família e a forma como a inteligência é a maior arma do homem. O retorno à ordem é a vitória da civilização sobre o caos.
            """,
            "/imagens/odisseia.jpg"
        ));

        estante.add(new Livro(
            "O Último dos Moicanos",
            "James Fenimore Cooper",
            """
            O lamento sobre o fim de uma era. O romance se passa no conflito franco-indígena e é a idealização do nobre selvagem americano. Chingachgook e Uncas (o último moicano) representam uma pureza e uma conexão com a natureza que estão condenadas a desaparecer pela chegada da civilização branca e seus conflitos. O livro é uma meditação sobre a perda da inocência e o destino trágico das culturas que não podem competir com o poder militar europeu. É um precursor do nosso Iracema, expondo a dor do colonizador que admira aquilo que destrói.
            """,
            "/imagens/ultimo-moicanos.jpg"
        ));

        estante.add(new Livro(
            "As Mil e Uma Noites",
            "Anônimo",
            """
            A estrutura narrativa como ferramenta de sobrevivência. A rainha Sherazade conta histórias para adiar sua morte nas mãos do sultão Shariar. A complexidade não está só nas fábulas, mas na Função da História: a narrativa é a única coisa que pode conter a barbárie e a vontade arbitrária de poder (o sultão que mata suas esposas). É um compêndio que celebra a imaginação, o exótico e a sabedoria popular, provando que a cultura e a arte são os verdadeiros pilares de uma civilização, capazes de converter a tirania em ordem.
            """,
            "/imagens/mil-e-uma-noites.jpg"
        ));

        estante.add(new Livro(
            "Oliver Twist",
            "Charles Dickens",
            """
            Uma denúncia brutal da pobreza urbana e da hipocrisia vitoriana. Oliver Twist é a personificação da inocência abusada, o garoto que, apesar de todas as misérias e da corrupção ao seu redor (a começar pelo terrível Fagin e o vilão Monks), mantém sua pureza moral. O livro é um ataque direto às Leis dos Pobres e à indiferença da sociedade rica. Dickens usa o sentimentalismo para forçar a elite a encarar a miséria. É um chamado conservador à caridade e à responsabilidade social, mostrando que a verdadeira depravação não está nos bandidos, mas na indiferença institucionalizada.
            """,
            "/imagens/oliver-twist.jpg"
        ));

        estante.add(new Livro(
            "O Livro da Selva (Mogli)",
            "Rudyard Kipling",
            """
            O dilema entre Natureza e Civilização. Mogli é o 'menino-lobo' que vive entre dois mundos. A 'Lei da Selva' de Kipling é, ironicamente, mais moral e organizada do que a lei da cidade dos homens. O livro é uma alegoria sobre a Ordem Natural e a necessidade de se ter um código de conduta. Ele questiona: a civilização realmente melhora o homem? Em Mogli, a lealdade e o respeito hierárquico ensinados pelos animais superam a malícia e a fragilidade dos homens. É uma defesa da disciplina e do entendimento das leis fundamentais.
            """,
            "/imagens/mogli.jpg"
        ));

        estante.add(new Livro(
            "O Médico e o Monstro",
            "Robert Louis Stevenson",
            """
            A exploração da Dualidade Humana. Dr. Jekyll e Mr. Hyde não são duas pessoas, mas a personificação da luta entre o Desejo e a Consciência, entre o Bem e o Mal que reside em cada um. A complexidade é que o elixir que separa os dois é a metáfora da nossa própria modernidade, que tenta nos dividir em compartimentos de moralidade. A mensagem é que não se pode sufocar o lado sombrio; é preciso integrá-lo e controlá-lo. O livro é um aviso sobre o perigo de negar a natureza pecaminosa do homem, que, uma vez libertada, toma conta e destrói o lado racional.
            """,
            "/imagens/medico-monstro.jpg"
        ));

        // --- Júlio Verne (O Mestre) ---
        estante.add(new Livro(
            "Viagem ao Centro da Terra",
            "Júlio Verne",
            """
            A busca pelo Conhecimento Absoluto em Viagem ao Centro da Terra é, de fato, uma ode à coragem científica, mas que se revela como um fascinante estudo do Hybris da razão vitoriana: o Professor Lidenbrock encarna a crença quase maníaca de que a metodologia e a dedução podem desvendar todos os mistérios do universo, submetendo o impossível à análise metódica. Contudo, a jornada ao interior do planeta transcende a mera aventura exploratória; ela se transforma em uma vertiginosa viagem no tempo profundo, onde cada camada geológica e cada criatura extinta encontrada (do mastodonte ao homem primordial) faz do centro da Terra um arquivo biológico e histórico da própria vida, um Éden invertido que desafia as limitações físicas de Axel, a voz da prudência. O ideal de que não há limites para a razão é equilibrado, no entanto, pela presença estoica de Hans, o guia que representa a sabedoria silenciosa e prática da natureza, lembrando-nos que a ação pragmática é tão vital quanto a teoria ambiciosa para que a busca pelo que está oculto não se torne uma ruína fatal.
            """,
            "/imagens/viagem-centro-terra.jpg"
        ));

        estante.add(new Livro(
            "Vinte Mil Léguas Submarinas",
            "Júlio Verne",
            """
            O Capitão Nemo, como o gênio que se revolta contra a superfície, é a prefiguração mais sombria do poder tecnológico descontrolado, representando o estudo da Inteligência Marginalizada que transforma sua invenção, o Nautilus, em uma utopia anti-social e uma arma de vingança. Sua auto-exclusão, motivada por uma dor profunda e um ódio às guerras e fronteiras humanas, leva-o a criar um mundo autossuficiente e regido por suas próprias leis, mas esse refúgio submarino é também um alerta trágico de Júlio Verne sobre a ciência sem ética: ao operar fora de qualquer escrutínio social e utilizar a tecnologia de ponta para afundar navios, Nemo manifesta o pesadelo de que o conhecimento absoluto, quando dissociado da humanidade, se converte em tirania e instrumento de destruição pessoal, transformando o gênio em pária e a inovação em instrumento de luto e rancor.
            """,
            "/imagens/20000-leguas.jpg"
        ));

        estante.add(new Livro(
            "A Volta ao Mundo em 80 Dias",
            "Júlio Verne",
            """
            A jornada de Phileas Fogg em A Volta ao Mundo em 80 Dias é a celebração definitiva do Triunfo da Racionalidade e do Método britânico, onde o protagonista é a personificação da precisão e do cálculo, tratando o mundo como um problema matemático a ser resolvido pela tecnologia (trens e navios) que encurtou o globo. Verne elogia a disciplina da Era da Razão e a superioridade do homem que age com frieza sobre o caos da paixão, mas o romance sutilmente subverte essa premissa: o Método de Fogg depende do caos humano de Passepartout e é, por fim, redimido pela interferência da paixão ao salvar e se apaixonar por Mrs. Aouda. A vitória final de Fogg é, na verdade, a vitória do elemento humano sobre o cálculo, provando que o verdadeiro prêmio da sua odisseia não era a aposta em si, mas a vida e a conexão afetiva que o frio planejamento tentou inicialmente negligenciar.
            """,
            "/imagens/80-dias.jpg"
        ));

        estante.add(new Livro(
            "Sete Breves Lições de Física",
            "Carlo Rovelli",
            """
            Uma obra-prima de concisão e clareza, Sete Breves Lições de Física é uma introdução magistral aos conceitos mais profundos e revolucionários da física moderna, escrita por Carlo Rovelli com uma elegância que torna a obra acessível não apenas aos cientistas, mas a qualquer leitor curioso sobre o universo. Em sua Obra, Rovelli consegue destilar temas complexos como a relatividade geral, a mecânica quântica e a gravidade quântica em narrativas breves e envolventes, revelando a beleza intrínseca da ciência e sua capacidade de transformar nossa compreensão do cosmos. A genialidade do livro reside na habilidade de Rovelli em conectar essas ideias abstratas com questões filosóficas fundamentais sobre a natureza da realidade, o tempo e o espaço, convidando o leitor a refletir sobre o papel da ciência na busca pelo conhecimento humano. É uma leitura essencial que não apenas informa, mas inspira, mostrando que a física é uma aventura intelectual que está ao alcance de todos. Até hoje, ainda me é difícil compreender a ideia da gravidade quântica, mas a forma como Rovelli a apresenta me faz sentir que estou apenas a um passo de desvendar essas ondulações do espaço-tempo.
            """,
            "/imagens/sete-breves-licoes.jpg"
        ));

        return estante;
    }

    public List<Livro> getMeusLivros(Integer limite) {
        int limiteValidado = validarLimite(limite);
        List<Livro> estante = getMeusLivros();
        return estante.subList(0, Math.min(limiteValidado, estante.size()));
    }

    private int validarLimite(Integer limite) {
        if (limite == null) {
            return LIMITE_PADRAO;
        }
        if (limite < LIMITE_MINIMO || limite > LIMITE_MAXIMO) {
            throw new IllegalArgumentException("O parametro 'limite' deve estar entre 1 e 200.");
        }
        return limite;
    }
}
