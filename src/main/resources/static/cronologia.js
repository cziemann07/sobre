// Dados completos de cada período literário
const periodosData = {
    'quinhentismo': {
        titulo: 'Quinhentismo',
        periodo: '1500 - 1601',
        era: 'colonial',
        descricao: 'O Quinhentismo marca o início da literatura no Brasil, ainda que não houvesse uma literatura propriamente brasileira. Os textos dessa época dividem-se em duas vertentes: a Literatura de Informação, composta por relatos de viajantes e cronistas sobre a nova terra, e a Literatura de Catequese, produzida pelos jesuítas com o objetivo de converter os indígenas ao cristianismo.',
        caracteristicas: [
            'Descrição detalhada da fauna, flora e povos nativos',
            'Visão europeia e colonizadora sobre a terra',
            'Textos informativos, cartas e crônicas de viagem',
            'Literatura de caráter documental e histórico',
            'Produção jesuítica voltada à catequese'
        ],
        autoresObras: [
            { autor: 'Pero Vaz de Caminha', obra: 'Carta a El-Rei Dom Manuel (1500)' },
            { autor: 'Padre José de Anchieta', obra: 'Auto de São Lourenço, poesias em tupi' },
            { autor: 'Padre Manuel da Nóbrega', obra: 'Cartas do Brasil' },
            { autor: 'Pero de Magalhães Gândavo', obra: 'Tratado da Terra do Brasil' },
            { autor: 'Gabriel Soares de Sousa', obra: 'Tratado Descritivo do Brasil' }
        ],
        contexto: 'Período de descobrimento e colonização portuguesa. A literatura servia como registro e ferramenta de dominação cultural.'
    },

    'barroco': {
        titulo: 'Barroco',
        periodo: '1601 - 1768',
        era: 'colonial',
        descricao: 'O Barroco brasileiro surge em meio às tensões da Contrarreforma católica e reflete o conflito entre o teocentrismo medieval e o antropocentrismo renascentista. É a arte dos contrastes, das antíteses, do claro-escuro. No Brasil, ganha tons próprios com a crítica social mordaz de Gregório de Matos e a oratória grandiosa de Padre Antônio Vieira.',
        caracteristicas: [
            'Dualismo e conflito entre corpo e alma, céu e terra',
            'Uso intenso de antíteses e paradoxos',
            'Linguagem rebuscada e ornamentada (cultismo)',
            'Reflexões filosóficas sobre a efemeridade da vida',
            'Jogo de ideias e argumentação complexa (conceptismo)',
            'Temática religiosa predominante'
        ],
        autoresObras: [
            { autor: 'Gregório de Matos (Boca do Inferno)', obra: 'Poesia lírica, satírica e religiosa' },
            { autor: 'Padre Antônio Vieira', obra: 'Sermão da Sexagésima, Sermão de Santo Antônio aos Peixes' },
            { autor: 'Bento Teixeira', obra: 'Prosopopeia (marco inicial do Barroco no Brasil)' },
            { autor: 'Botelho de Oliveira', obra: 'Música do Parnaso' }
        ],
        contexto: 'Brasil colonial sob domínio português e espanhol (União Ibérica). Sociedade estratificada, com forte presença da Igreja Católica.'
    },

    'arcadismo': {
        titulo: 'Arcadismo',
        periodo: '1768 - 1836',
        era: 'colonial',
        descricao: 'O Arcadismo representa uma reação à exuberância barroca, buscando o equilíbrio, a simplicidade e a razão iluminista. Os poetas árcades, inspirados na Arcádia grega, adotavam pseudônimos pastoris e cantavam a vida bucólica, o "carpe diem" e o "locus amoenus". Em Minas Gerais, muitos poetas participaram da Inconfidência Mineira, trazendo os primeiros sinais de consciência nacional.',
        caracteristicas: [
            'Valorização da natureza e da vida simples no campo',
            'Uso de pseudônimos pastoris (Dirceu, Glauceste, etc.)',
            'Equilíbrio, clareza e racionalismo',
            'Influência do Iluminismo e ideais de liberdade',
            'Convenções clássicas greco-latinas',
            '"Fugere urbem" (fuga da cidade) e "carpe diem" (aproveitar o momento)'
        ],
        autoresObras: [
            { autor: 'Tomás Antônio Gonzaga (Dirceu)', obra: 'Marília de Dirceu, Cartas Chilenas' },
            { autor: 'Cláudio Manuel da Costa (Glauceste Satúrnio)', obra: 'Obras Poéticas' },
            { autor: 'Basílio da Gama', obra: 'O Uraguai' },
            { autor: 'Santa Rita Durão', obra: 'Caramuru' },
            { autor: 'Alvarenga Peixoto', obra: 'Poesias' }
        ],
        contexto: 'Ciclo do ouro em Minas Gerais. Ideais iluministas europeus chegam ao Brasil. Inconfidência Mineira (1789) marca o despertar político.'
    },

    'romantismo': {
        titulo: 'Romantismo',
        periodo: '1836 - 1881',
        era: 'nacional',
        descricao: 'O Romantismo brasileiro nasce com a Independência e busca construir uma identidade nacional através da literatura. É o movimento que funda a literatura verdadeiramente brasileira, exaltando a natureza tropical, o índio como herói e, posteriormente, questionando a sociedade escravista.',
        fases: [
            {
                nome: '1ª Geração — Indianista / Nacionalista',
                periodo: '1836 - 1853',
                descricao: 'A primeira geração romântica tinha como missão criar uma literatura genuinamente brasileira. O índio foi eleito como símbolo nacional, representando o "bom selvagem" em harmonia com a natureza exuberante do Brasil. Era uma literatura de afirmação patriótica.',
                autores: ['Gonçalves Dias', 'José de Alencar', 'Gonçalves de Magalhães'],
                obras: ['I-Juca Pirama', 'Canção do Exílio', 'O Guarani', 'Iracema', 'Ubirajara']
            },
            {
                nome: '2ª Geração — Ultrarromântica / Mal do Século',
                periodo: '1853 - 1869',
                descricao: 'A segunda geração mergulhou no pessimismo, na melancolia e na obsessão pela morte. Influenciados por Byron e Musset, esses poetas viviam uma boemia intensa, escrevendo sobre amores impossíveis e tédio existencial. Muitos morreram jovens, vítimas da tuberculose.',
                autores: ['Álvares de Azevedo', 'Casimiro de Abreu', 'Fagundes Varela', 'Junqueira Freire'],
                obras: ['Lira dos Vinte Anos', 'Noite na Taverna', 'Meus Oito Anos', 'As Primaveras']
            },
            {
                nome: '3ª Geração — Condoreira / Social',
                periodo: '1869 - 1881',
                descricao: 'A terceira geração transformou a poesia em instrumento de luta social. O condor, ave que voa nas alturas, simbolizava a liberdade e a grandiosidade dos ideais abolicionistas. Castro Alves usou versos grandiosos para denunciar os horrores da escravidão.',
                autores: ['Castro Alves', 'Tobias Barreto', 'Sousândrade'],
                obras: ['Navio Negreiro', 'Vozes d\'África', 'Espumas Flutuantes', 'O Guesa']
            }
        ],
        contexto: 'Independência do Brasil (1822). Construção da identidade nacional. Debates sobre a abolição da escravatura.'
    },

    'realismo': {
        titulo: 'Realismo',
        periodo: '1881 - 1893',
        era: 'nacional',
        descricao: 'O Realismo surge como reação ao sentimentalismo romântico, propondo uma literatura objetiva e analítica. Influenciado pelo positivismo e pelo cientificismo, busca retratar a realidade tal como ela é, sem idealizações. No Brasil, Machado de Assis eleva o movimento a um patamar universal, com sua ironia fina, análise psicológica profunda e crítica à hipocrisia da sociedade burguesa carioca.',
        caracteristicas: [
            'Objetividade e impessoalidade na narrativa',
            'Análise psicológica profunda dos personagens',
            'Crítica à burguesia, à Igreja e às instituições',
            'Retrato fiel da sociedade contemporânea',
            'Linguagem direta e precisa',
            'Narrador onisciente e crítico'
        ],
        autoresObras: [
            { autor: 'Machado de Assis', obra: 'Memórias Póstumas de Brás Cubas (marco inicial)' },
            { autor: 'Machado de Assis', obra: 'Quincas Borba' },
            { autor: 'Machado de Assis', obra: 'Dom Casmurro' },
            { autor: 'Machado de Assis', obra: 'Esaú e Jacó, Memorial de Aires' },
            { autor: 'Raul Pompeia', obra: 'O Ateneu' }
        ],
        contexto: 'Crise do Império, campanha abolicionista e republicana. Modernização urbana do Rio de Janeiro. Influência do positivismo europeu.'
    },

    'naturalismo': {
        titulo: 'Naturalismo',
        periodo: '1881 - 1893',
        era: 'nacional',
        descricao: 'O Naturalismo é uma radicalização do Realismo, aplicando o determinismo científico à literatura. Influenciado por Darwin e Taine, acredita que o ser humano é determinado pelo meio, pela raça e pelo momento histórico. Os romances naturalistas retratam as camadas mais baixas da sociedade, explorando temas como sexualidade, vícios e instintos.',
        caracteristicas: [
            'Determinismo: o homem é produto do meio, raça e momento',
            'Visão científica e experimental da literatura',
            'Retrato das classes baixas e marginalizadas',
            'Temas como sexualidade, alcoolismo, doenças',
            'Descrições minuciosas e cruas',
            'Zoomorfização dos personagens (comparação com animais)'
        ],
        autoresObras: [
            { autor: 'Aluísio Azevedo', obra: 'O Mulato (marco inicial)' },
            { autor: 'Aluísio Azevedo', obra: 'O Cortiço' },
            { autor: 'Aluísio Azevedo', obra: 'Casa de Pensão' },
            { autor: 'Júlio Ribeiro', obra: 'A Carne' },
            { autor: 'Adolfo Caminha', obra: 'Bom-Crioulo' },
            { autor: 'Inglês de Sousa', obra: 'O Missionário' }
        ],
        contexto: 'Abolição da escravatura (1888) e Proclamação da República (1889). Imigração europeia e crescimento urbano desordenado.'
    },

    'parnasianismo': {
        titulo: 'Parnasianismo',
        periodo: '1882 - 1893',
        era: 'nacional',
        descricao: 'O Parnasianismo representa a busca pela "arte pela arte", valorizando a forma acima do conteúdo. Os parnasianos buscavam a perfeição formal, com versos rigorosamente metrificados, rimas ricas e vocabulário erudito. Inspirados na cultura greco-romana, criavam poesias que deveriam ser belas como esculturas de mármore.',
        caracteristicas: [
            '"Arte pela arte" — a poesia não precisa ter utilidade',
            'Culto à forma perfeita e ao trabalho artesanal',
            'Versos alexandrinos (12 sílabas) e decassílabos',
            'Rimas ricas e vocabulário erudito',
            'Temas greco-romanos e mitológicos',
            'Objetividade e contenção emocional'
        ],
        autoresObras: [
            { autor: 'Olavo Bilac', obra: 'Poesias, Via Láctea, Profissão de Fé' },
            { autor: 'Alberto de Oliveira', obra: 'Meridionais, Sonetos e Poemas' },
            { autor: 'Raimundo Correia', obra: 'Sinfonias, Aleluias' },
            { autor: 'Vicente de Carvalho', obra: 'Poemas e Canções' },
            { autor: 'Francisca Júlia', obra: 'Mármores, Esfinges' }
        ],
        contexto: 'Fase de transição entre Império e República. Academia Brasileira de Letras (1897) consagra os parnasianos.'
    },

    'simbolismo': {
        titulo: 'Simbolismo',
        periodo: '1893 - 1922',
        era: 'nacional',
        descricao: 'O Simbolismo surge como reação ao objetivismo parnasiano e naturalista, propondo uma poesia subjetiva, misteriosa e musical. Influenciados por Baudelaire, Verlaine e Mallarmé, os simbolistas brasileiros buscavam expressar o inefável através de símbolos, sinestesias e sugestões.',
        caracteristicas: [
            'Subjetivismo e espiritualidade',
            'Musicalidade e uso de sinestesias',
            'Linguagem vaga, sugestiva e simbólica',
            'Temas como morte, mistério, transcendência',
            'Uso de maiúsculas alegorizantes',
            'Preferência pela cor branca e seus símbolos'
        ],
        autoresObras: [
            { autor: 'Cruz e Sousa (Dante Negro)', obra: 'Missal, Broquéis (marcos iniciais)' },
            { autor: 'Cruz e Sousa', obra: 'Faróis, Últimos Sonetos' },
            { autor: 'Alphonsus de Guimaraens', obra: 'Kyriale, Câmara Ardente' },
            { autor: 'Pedro Kilkerry', obra: 'Poesias' }
        ],
        contexto: 'Período de marginalização cultural. Cruz e Sousa, poeta negro, enfrentou preconceito racial. O movimento não teve o mesmo prestígio que o Parnasianismo.'
    },

    'pre-modernismo': {
        titulo: 'Pré-Modernismo',
        periodo: '1902 - 1922',
        era: 'nacional',
        descricao: 'O Pré-Modernismo não constitui uma escola literária, mas um período de transição que antecipa as rupturas modernistas. Os escritores dessa fase abandonam a visão idealizada do Brasil e voltam-se para a realidade nacional: o sertão, o subúrbio, as contradições sociais.',
        caracteristicas: [
            'Ruptura com o academicismo e linguagem rebuscada',
            'Regionalismo: retrato do Brasil profundo',
            'Denúncia social e tipos marginalizados',
            'Sincretismo de estilos',
            'Linguagem mais coloquial e brasileira',
            'Temática nacional: sertão, subúrbio, problemas sociais'
        ],
        autoresObras: [
            { autor: 'Euclides da Cunha', obra: 'Os Sertões (marco inicial, 1902)' },
            { autor: 'Lima Barreto', obra: 'Triste Fim de Policarpo Quaresma, Clara dos Anjos' },
            { autor: 'Monteiro Lobato', obra: 'Urupês, Cidades Mortas' },
            { autor: 'Augusto dos Anjos', obra: 'Eu' },
            { autor: 'Graça Aranha', obra: 'Canaã' },
            { autor: 'Simões Lopes Neto', obra: 'Contos Gauchescos' }
        ],
        contexto: 'República Velha, política do café com leite. Guerra de Canudos (1897), Revolta da Vacina (1904). Urbanização e imigração.'
    },

    'modernismo': {
        titulo: 'Modernismo',
        periodo: '1922 - 1960',
        era: 'nacional',
        descricao: 'O Modernismo brasileiro é a mais importante revolução estética de nossa literatura. Iniciado com a Semana de Arte Moderna de 1922, rompe com o passadismo acadêmico e propõe uma arte genuinamente brasileira. Desenvolve-se em três fases distintas, cada uma com características próprias.',
        fases: [
            {
                nome: '1ª Fase — Heroica / Destruição',
                periodo: '1922 - 1930',
                descricao: 'A primeira fase é de combate e experimentação. Os modernistas propõem "deglutir" a cultura estrangeira para criar uma arte genuinamente brasileira — é a Antropofagia cultural. Verso livre, linguagem coloquial, humor e irreverência são as armas dessa revolução.',
                autores: ['Mário de Andrade', 'Oswald de Andrade', 'Manuel Bandeira', 'Raul Bopp'],
                obras: ['Pauliceia Desvairada', 'Macunaíma', 'Pau-Brasil', 'Manifesto Antropófago', 'Cobra Norato']
            },
            {
                nome: '2ª Fase — Consolidação / Regionalismo',
                periodo: '1930 - 1945',
                descricao: 'A segunda fase consolida as conquistas de 1922 e amplia o projeto para uma dimensão social. Na prosa, surge o romance regionalista nordestino, denunciando miséria e estruturas arcaicas. Na poesia, Drummond aprofunda a reflexão existencial.',
                autores: ['Carlos Drummond de Andrade', 'Graciliano Ramos', 'Jorge Amado', 'Rachel de Queiroz', 'Cecília Meireles'],
                obras: ['Sentimento do Mundo', 'Vidas Secas', 'São Bernardo', 'Capitães da Areia', 'O Quinze']
            },
            {
                nome: '3ª Fase — Experimentação / Universalização',
                periodo: '1945 - 1960',
                descricao: 'A terceira fase caracteriza-se pela experimentação formal e introspecção psicológica. Guimarães Rosa reinventa a linguagem, Clarice Lispector mergulha no fluxo de consciência, João Cabral constrói uma poesia cerebral. A literatura brasileira atinge maturidade universal.',
                autores: ['Guimarães Rosa', 'Clarice Lispector', 'João Cabral de Melo Neto', 'Nelson Rodrigues'],
                obras: ['Grande Sertão: Veredas', 'Perto do Coração Selvagem', 'Morte e Vida Severina', 'Vestido de Noiva']
            }
        ],
        contexto: 'Da Semana de 22 ao desenvolvimentismo de JK. Era Vargas, Segunda Guerra, redemocratização. Construção de Brasília e Bossa Nova.'
    },

    'contemporaneo': {
        titulo: 'Literatura Contemporânea',
        periodo: '1960 em diante',
        era: 'nacional',
        descricao: 'A literatura contemporânea brasileira é marcada pela pluralidade de vozes, estilos e temas. Da poesia concreta às narrativas urbanas violentas, do realismo feroz às experimentações pós-modernas, não há uma escola dominante. A ditadura militar gerou uma literatura de resistência, enquanto a redemocratização trouxe novos olhares.',
        caracteristicas: [
            'Pluralidade de estilos e tendências',
            'Narrativa urbana e violência',
            'Literatura marginal e periférica',
            'Experimentalismo e metalinguagem',
            'Diálogo com outras mídias',
            'Vozes femininas, negras, LGBTQIA+ ganham espaço',
            'Autoficção e narrativas do eu'
        ],
        autoresObras: [
            { autor: 'Rubem Fonseca', obra: 'Feliz Ano Novo, A Grande Arte' },
            { autor: 'Dalton Trevisan', obra: 'O Vampiro de Curitiba' },
            { autor: 'Hilda Hilst', obra: 'A Obscena Senhora D' },
            { autor: 'Caio Fernando Abreu', obra: 'Morangos Mofados' },
            { autor: 'Raduan Nassar', obra: 'Lavoura Arcaica' },
            { autor: 'Milton Hatoum', obra: 'Dois Irmãos' },
            { autor: 'Conceição Evaristo', obra: 'Ponciá Vicêncio' },
            { autor: 'Chico Buarque', obra: 'Budapeste, Leite Derramado' }
        ],
        contexto: 'Ditadura militar, redemocratização, globalização, era digital. A literatura reflete um Brasil diverso, desigual e em constante mutação.'
    }
};

// Elementos do DOM
const modalOverlay = document.getElementById('modalOverlay');
const modalBody = document.getElementById('modalBody');
const modalClose = document.getElementById('modalClose');

// Adicionar eventos de clique nos cards
document.querySelectorAll('.timeline_card').forEach(card => {
    card.addEventListener('click', () => {
        const period = card.getAttribute('data-period');
        openModal(period);
    });
});

// Fechar modal
modalClose.addEventListener('click', closeModal);
modalOverlay.addEventListener('click', (e) => {
    if (e.target === modalOverlay) {
        closeModal();
    }
});

// Fechar com ESC
document.addEventListener('keydown', (e) => {
    if (e.key === 'Escape' && modalOverlay.classList.contains('active')) {
        closeModal();
    }
});

function openModal(period) {
    const data = periodosData[period];
    if (!data) return;

    let html = '';

    // Header
    html += `<h2>${data.titulo}</h2>`;
    html += `<p class="modal-period">${data.periodo}</p>`;
    html += `<span class="modal-era ${data.era}">${data.era === 'colonial' ? 'Era Colonial' : 'Era Nacional'}</span>`;

    // Descrição
    html += `<p class="modal-description">${data.descricao}</p>`;

    // Se tiver fases (Romantismo ou Modernismo)
    if (data.fases) {
        html += `<div class="modal-section"><h3>As Três Fases</h3></div>`;
        html += `<div class="modal-fases">`;

        data.fases.forEach(fase => {
            html += `
                <div class="fase-card">
                    <h4>${fase.nome}</h4>
                    <p style="font-size: 0.75rem; color: #606080; margin-bottom: 8px;">${fase.periodo}</p>
                    <p>${fase.descricao}</p>
                    <div class="autores">
                        ${fase.autores.map(a => `<span class="autor-tag">${a}</span>`).join('')}
                    </div>
                </div>
            `;
        });

        html += `</div>`;
    } else {
        // Características
        if (data.caracteristicas) {
            html += `
                <div class="modal-section">
                    <h3>Características</h3>
                    <ul>
                        ${data.caracteristicas.map(c => `<li>${c}</li>`).join('')}
                    </ul>
                </div>
            `;
        }

        // Autores e Obras
        if (data.autoresObras) {
            html += `
                <div class="modal-section">
                    <h3>Principais Autores e Obras</h3>
                    <ul>
                        ${data.autoresObras.map(ao => `
                            <li>
                                <span class="author-highlight">${ao.autor}</span> —
                                <span class="work-title">${ao.obra}</span>
                            </li>
                        `).join('')}
                    </ul>
                </div>
            `;
        }
    }

    // Contexto histórico
    if (data.contexto) {
        html += `
            <div class="modal-section">
                <h3>Contexto Histórico</h3>
                <p style="color: #8888a0; line-height: 1.7; font-weight: 300;">${data.contexto}</p>
            </div>
        `;
    }

    modalBody.innerHTML = html;
    modalOverlay.classList.add('active');
    document.body.style.overflow = 'hidden';
}

function closeModal() {
    modalOverlay.classList.remove('active');
    document.body.style.overflow = '';
}
