package com.example.meuslivros.service;

import java.util.List;
import java.util.ArrayList;
import com.example.meuslivros.model.Analogia;
import org.springframework.stereotype.Service;

@Service
public class AnalogiaService {
    private static final int LIMITE_PADRAO = 50;
    private static final int LIMITE_MINIMO = 1;
    private static final int LIMITE_MAXIMO = 200;

    public List<Analogia> getMinhasAnalogias() {
        List<Analogia> acervo = new ArrayList<>();

        // --- 1. Capitães da Areia → Distributed Systems ---
        acervo.add(new Analogia(
            "Capitães da Areia: O Cluster que o Estado Não Conseguiu Derrubar",
            "Capitães da Areia",
            "Jorge Amado",
            "Distributed Systems / Consenso Distribuído",
            """
            Em sistemas distribuídos, o problema fundamental é: como um grupo de nós independentes, \
            sem um coordenador central, chega a um acordo? É o Problema do Consenso — e é exatamente \
            o que Pedro Bala e seus Capitães resolvem todos os dias nas ruas de Salvador.

            Os Capitães da Areia são um cluster de alta disponibilidade. Não existe um servidor master \
            que, se cair, derruba o sistema inteiro. Pedro Bala lidera, sim, mas sua liderança é \
            emergente — ele não foi nomeado por um orquestrador externo; foi eleito pelo próprio \
            grupo através de um consenso orgânico, baseado em coragem e lealdade. Se Pedro Bala \
            "cai" (é preso, some, se machuca), o grupo não para. Outro nó assume. O sistema se \
            auto-repara — exatamente como um protocolo de consenso tipo Raft ou Paxos, onde a \
            eleição de um novo líder acontece automaticamente quando o líder atual falha.

            Cada membro do grupo é um microserviço com responsabilidade própria: Professor é o nó \
            de inteligência e leitura do ambiente, Sem-Pernas é o serviço de reconhecimento e \
            infiltração, Gato é a interface com o mundo externo (o charme, a lábia). Eles se \
            comunicam por protocolos informais — a rua, os sinais, a confiança mútua — num sistema \
            de mensageria assíncrona que funciona sem Kafka, sem RabbitMQ, só com a lealdade \
            como garantia de entrega.

            Agora, o mais fascinante: o Estado brasileiro no romance é o sistema centralizado que \
            tenta impor ordem de cima para baixo — o reformatório, a polícia, a imprensa. E ele \
            falha. Falha porque sistemas centralizados são frágeis quando o ambiente é caótico \
            e hostil. A arquitetura distribuída dos Capitães é resiliente justamente porque nasceu \
            do caos. Eles não precisam de um single point of failure; eles SÃO o sistema de \
            fallback.

            Jorge Amado, talvez sem saber, escreveu o melhor case study sobre por que arquiteturas \
            distribuídas superam arquiteturas centralizadas em ambientes adversos. O trapiche \
            abandonado onde dormem? É o data center improvisado. A praia de Salvador? A rede. \
            E o consenso distribuído entre eles — a regra não escrita de lealdade, partilha e \
            proteção mútua — é o algoritmo que mantém o cluster vivo quando tudo ao redor tenta \
            derrubá-lo.
            """,
            "/imagens/analogias/capitaes-distributed.jpg"
        ));

        // --- 2. Memórias Póstumas de Brás Cubas → State Machines ---
        acervo.add(new Analogia(
            "Memórias Póstumas de Brás Cubas: Uma Aula Sobre State Machines",
            "Memórias Póstumas de Brás Cubas",
            "Machado de Assis",
            "Máquinas de Estado (Finite State Machines)",
            """
            Uma Finite State Machine é um modelo computacional onde um sistema está sempre em \
            exatamente um estado de um conjunto finito de estados, e transita entre eles \
            conforme eventos específicos. A vida de Brás Cubas é, literalmente, uma state machine \
            — e das mal projetadas.

            Vejamos os estados: MENINO_MIMADO → ESTUDANTE_EM_COIMBRA → AMANTE_DE_MARCELA → \
            BACHAREL_INÚTIL → POLÍTICO_FRACASSADO → INVENTOR_DO_EMPLASTO → DEFUNTO_AUTOR. \
            Cada transição é disparada por um evento externo (a família manda, a sociedade cobra, \
            o tédio ataca), nunca por uma decisão interna genuína. Brás Cubas é um sistema reativo \
            sem lógica de negócio própria — ele apenas responde a inputs do ambiente.

            O mais brilhante é que Machado nos entrega a máquina de estados vista do estado \
            terminal: DEFUNTO_AUTOR. É como fazer debug de um sistema que já crashou, lendo os \
            logs de trás pra frente. O defunto autor tem acesso a todo o histórico de transições \
            e, com a ironia que só um processo morto pode ter, comenta cada uma delas com o \
            desapego de quem sabe que nenhum rollback é possível.

            A tragédia computacional de Brás Cubas é que sua state machine não tem nenhum estado \
            absorvente produtivo. Ele nunca atinge um ESTADO_DE_REALIZAÇÃO ou um ESTADO_DE_IMPACTO. \
            Todas as transições levam a estados de inércia. O "emplasto Brás Cubas" — sua única \
            tentativa de criar algo — falha antes de sair do staging. E o saldo final, aquele \
            famoso capítulo das negativas ("não tive filhos, não transmiti a nenhuma criatura o \
            legado da nossa miséria"), é o retorno de uma função que executou durante décadas e \
            retornou null.

            Machado de Assis, em 1881, escreveu a documentação mais elegante de uma state machine \
            mal arquitetada: muitos estados, muitas transições, zero side effects úteis. É o \
            sistema que roda em produção por 64 anos, consome recursos, e quando finalmente é \
            descomissionado, o post-mortem revela que nunca entregou valor a ninguém — nem ao \
            próprio processo.
            """,
            "/imagens/analogias/bras-cubas-state-machine.jpg"
        ));

        // --- 3. A Revolução dos Bichos → Open Source que Vira Proprietary ---
        acervo.add(new Analogia(
            "A Revolução dos Bichos: Quando o Open Source Vira Proprietary",
            "A Revolução dos Bichos",
            "George Orwell",
            "Open Source vs. Software Proprietário",
            """
            Todo projeto open source começa com um manifesto. Na Fazenda Solar, o manifesto é o \
            discurso do Velho Major — o fundador visionário que morre antes de ver o projeto \
            decolar (como acontece com tantos criadores de projetos seminais). Ele deixa a visão: \
            "todos os animais são iguais", que é o equivalente moral de uma licença MIT pura — \
            liberdade total, sem restrições, todo mundo contribui, todo mundo se beneficia.

            A revolução inicial funciona: os animais expulsam o fazendeiro (o proprietário do \
            software antigo), assumem os meios de produção, e o repositório é aberto. Os Sete \
            Mandamentos pintados no celeiro? É o README.md original — claro, direto, acessível. \
            Bola-de-Neve é o contributor apaixonado que quer implementar features ambiciosas \
            (o moinho de vento). Napoleão é o maintainer que vai, aos poucos, consolidando \
            poder sobre o repo.

            O golpe de Napoleão — expulsar Bola-de-Neve com os cães — é o momento em que o \
            maintainer principal remove os outros contributors com acesso de admin, revoga \
            permissões, e assume controle total do projeto. A partir daqui, o open source é \
            open source só no nome.

            O que se segue é a deterioração clássica: os Sete Mandamentos (o README) são \
            editados silenciosamente, commit por commit, sem pull request, sem code review. \
            "Nenhum animal dormirá em cama" vira "Nenhum animal dormirá em cama COM LENÇÓIS". \
            É o equivalente de mudar a licença de MIT para uma licença proprietária disfarçada, \
            adicionando cláusulas restritivas que ninguém percebe porque ninguém lê o diff do \
            LICENSE.md.

            Garganta, o porco propagandista, é o DevRel do projeto — ele aparece para explicar \
            que cada mudança é "para o bem da comunidade", que os maintainers "precisam de leite \
            e maçãs" (equity, stock options) para continuar mantendo o projeto, e que qualquer \
            questionamento é "colaboração com o fazendeiro Jones" (fork hostil). A comunidade, \
            sem acesso aos logs de decisão e sem entender o código, aceita.

            O final de Orwell é cirúrgico: os porcos caminham sobre duas patas e se sentam à \
            mesa com os humanos (os proprietários). Os outros animais olham de fora e não \
            conseguem mais distinguir porcos de humanos. É o momento em que a comunidade percebe \
            que o projeto "open source" que ela alimentou agora é indistinguível de um software \
            proprietário — mesmas restrições, mesma opacidade, mesma concentração de poder. \
            O LICENSE.md ainda diz "open source". Mas o README foi reescrito: "Todos os \
            contribuidores são iguais, mas alguns contribuidores são mais iguais que outros."
            """,
            "/imagens/analogias/revolucao-bichos-opensource.jpg"
        ));

        // --- 4. Triste Fim de Policarpo Quaresma → O Dev que Quer Refatorar o Legado ---
        acervo.add(new Analogia(
            "Triste Fim de Policarpo Quaresma: O Dev que Quis Refatorar o Brasil",
            "Triste Fim de Policarpo Quaresma",
            "Lima Barreto",
            "Refatoração de Sistemas Legados / Technical Debt",
            """
            Todo sistema legado tem um Policarpo Quaresma: aquele desenvolvedor que olha para o \
            monolito de 30 anos, com código em COBOL misturado com gambiarras em VB6, e diz: \
            "isso aqui precisa ser reescrito do zero." Ele não está errado. Mas o sistema está \
            em produção. E em produção, estar certo não é suficiente.

            A primeira proposta de Policarpo — adotar o Tupi-Guarani como língua oficial — é o \
            equivalente de um dev propondo migrar toda a stack de Java para Rust. Tecnicamente \
            fascinante? Sim. Melhoria de performance? Provável. Viável dentro da organização? \
            Absolutamente não. A burocracia (o Congresso, os colegas de repartição) não só \
            rejeita o PR como abre um processo disciplinar. Policarpo é afastado — o equivalente \
            corporativo de ser "realocado para outro projeto" depois de uma proposta ousada demais.

            Mas Policarpo não desiste. Vai para o campo e tenta a segunda refatoração: \
            modernizar a agricultura brasileira com métodos científicos. É o dev que, expulso \
            da squad principal, pega um projeto greenfield na periferia da empresa e tenta \
            provar seu ponto. O resultado? As formigas (bugs em produção) destroem tudo. O \
            ambiente real é infinitamente mais hostil do que o ambiente de desenvolvimento. \
            O solo não colabora. Os vizinhos sabotam. O management ignora. O projeto greenfield \
            morre — não porque a ideia era ruim, mas porque o ecossistema não suporta a mudança.

            A terceira e última tentativa é a mais trágica. Policarpo se alista na revolta, \
            acreditando que a liderança (Floriano Peixoto) compartilha sua visão de Brasil. \
            É o dev que finalmente encontra um CTO que "entende" e apoia a refatoração. Só \
            que o CTO não se importa com o código — ele quer poder. Quando Policarpo ousa \
            criticar a execução, é preso e condenado. O sponsorship executivo era falso. \
            O CTO usou o idealismo do dev como ferramenta e o descartou.

            O "triste fim" de Policarpo é o triste fim de todo dev que tenta refatorar um \
            sistema legado sem entender que o código é apenas a superfície do problema. O \
            verdadeiro legado não é técnico — é político, cultural, burocrático. Lima Barreto \
            escreveu, em 1915, o manual definitivo sobre por que a technical debt do Brasil \
            nunca será paga: não porque faltem desenvolvedores competentes, mas porque o \
            sistema recompensa a mediocridade e pune a excelência.
            """,
            "/imagens/analogias/policarpo-refatoracao.jpg"
        ));

        // --- 5. Dom Quixote → O QA que Testa em Produção ---
        acervo.add(new Analogia(
            "Dom Quixote: O QA que Testa em Produção",
            "Dom Quixote",
            "Miguel de Cervantes",
            "Quality Assurance / Testes em Produção",
            """
            Dom Quixote é o QA mais dedicado — e mais perigoso — da história da engenharia de \
            software. Ele leu toda a documentação (os romances de cavalaria), internalizou cada \
            especificação, e saiu pelo mundo convicto de que o sistema está cheio de bugs \
            críticos que precisam ser corrigidos imediatamente. O problema? Os bugs só existem \
            na cabeça dele.

            Os moinhos de vento são serviços perfeitamente funcionais que Quixote classifica \
            como gigantes (bugs P0). Ele abre o ticket, atribui severidade máxima, e parte \
            para o hotfix — sem ambiente de staging, sem test plan, direto em produção. O \
            resultado é previsível: ele quebra o que estava funcionando. Mas no report dele, \
            o incidente é registrado como "combate heroico contra forças malignas que \
            encantadores disfarçaram de moinhos" — o post-mortem mais criativo já escrito.

            Sancho Pança é o dev sênior pragmático que acompanha o QA por lealdade (e pela \
            promessa de uma ilha, que é a promoção que nunca chega). Sancho vê os moinhos \
            como moinhos. Ele sabe que o sistema funciona. Mas toda vez que tenta argumentar, \
            Quixote invoca a documentação sagrada (os livros de cavalaria) e Sancho cede — \
            porque discutir com alguém que tem a spec decorada é uma batalha perdida, mesmo \
            quando a spec não reflete a realidade.

            O gênio de Cervantes é mostrar que Quixote não é incompetente — ele é \
            hipercompetente no framework errado. Ele conhece profundamente as regras da \
            cavalaria (a spec antiga), mas o mundo migrou para uma versão nova e ele se \
            recusa a atualizar. É o QA que ainda testa com base nos requisitos da v1.0 \
            quando o sistema já está na v5.3. Cada "bug" que ele encontra é, na verdade, \
            uma feature que ele não reconhece.

            E a lição mais amarga: no leito de morte, Quixote finalmente "atualiza a spec" \
            — reconhece que os moinhos eram moinhos, que os gigantes não existiam, que sua \
            leitura do sistema estava errada desde o início. Mas nesse ponto, Sancho — o \
            pragmático — chora e pede que ele não desista. Porque o mundo sem o QA maluco \
            que acredita em gigantes é, paradoxalmente, um mundo mais pobre. Às vezes, o \
            cara que vê bugs onde não existem é o mesmo que te força a questionar se o \
            sistema realmente está tão bem quanto você pensa.
            """,
            "/imagens/analogias/quixote-qa.jpg"
        ));

        // --- 6. Moby Dick → A Feature que Virou Obsessão ---
        acervo.add(new Analogia(
            "Moby Dick: A Feature que Afundou o Sprint",
            "Moby Dick",
            "Herman Melville",
            "Scope Creep / Sunk Cost Fallacy / Gestão de Projetos",
            """
            O Capitão Ahab é o tech lead mais perigoso que existe: o brilhante. Ele conhece o \
            oceano (o domínio), comanda o respeito da tripulação (a equipe), e tem um track \
            record impecável. Por isso ninguém questiona quando ele define o objetivo do sprint: \
            matar a Baleia Branca. Ninguém pergunta "mas isso está no roadmap?" ou "qual o \
            business value dessa feature?" — porque questionar Ahab é questionar a lenda.

            Moby Dick é a feature impossível. É aquela tarefa que começou como um spike, virou \
            uma epic, e agora consome 100% da capacidade do time. Ela não tem acceptance criteria \
            claros (como você define "matar o incognoscível"?), não tem deadline realista ("vamos \
            navegar até encontrar"), e o único stakeholder é o próprio Ahab. O product owner \
            original (os donos do navio, os capitalistas de Nantucket) queria óleo de baleia — \
            um produto simples, com mercado definido. Ahab sequestrou o backlog.

            O Pequod é o sprint em chamas. A tripulação são os devs que sabem que o projeto \
            está condenado, mas continuam entregando porque: (a) já investiram demais (sunk cost), \
            (b) o líder é carismático, e (c) é mais fácil seguir do que mutilar. Starbuck, o \
            imediato, é o engineering manager que tenta, em momentos de lucidez, propor um \
            course correction: "E se a gente... voltasse a caçar baleias normais? Tem ROI \
            comprovado." Ahab ignora. O backlog tem um item só, e ele está em vermelho.

            Ishmael, o narrador, é o dev júnior que sobrevive porque não estava no core team \
            quando o navio afundou. Ele é o cara que, anos depois, escreve o post-mortem no \
            blog da empresa: "Lições aprendidas: como uma obsessão do tech lead destruiu um \
            projeto inteiro." Ninguém lê, claro. Porque no próximo sprint, outro Ahab vai \
            surgir com outra baleia branca.

            Melville nos ensina que o scope creep mais perigoso não é o que vem do cliente — \
            é o que vem de dentro do time, da convicção inabalável de um líder que confunde \
            sua ferida pessoal com a missão da empresa. A perna que Ahab perdeu para Moby Dick \
            é o projeto anterior que falhou. E em vez de fazer o retrospective e seguir em \
            frente, ele transformou o fracasso em cruzada. O resultado? O navio afunda, o \
            time inteiro morre, e a baleia continua nadando. A feature nunca foi entregue.
            """,
            "/imagens/analogias/moby-dick-sprint.jpg"
        ));

        // --- 7. Odisseia → O Maior Timeout da História ---
        acervo.add(new Analogia(
            "Odisseia: O Request HTTP que Levou 20 Anos Para Resolver",
            "Odisseia",
            "Homero",
            "HTTP Requests / Timeouts / Autenticação",
            """
            Odisseu faz um GET /home depois da Guerra de Troia e recebe um 302 Redirect. \
            E outro. E outro. Por vinte anos.

            Cada parada é um middleware que intercepta a request e tenta desviá-la do destino \
            original. As Sereias são um endpoint malicioso que retorna um Content-Type tão \
            sedutor que o cliente trava se não tiver proteção (Odisseu pede pra ser amarrado \
            ao mastro — o equivalente de um request timeout forçado). Circe é o serviço que \
            transforma o payload dos seus companheiros em porcos — um man-in-the-middle que \
            corrompe os dados em trânsito. Calipso é o cache que retém a response por sete \
            anos: "Pra que ir até o servidor de origem? Fica aqui, eu tenho tudo que você \
            precisa." Uma cache invalidation que quase nunca acontece.

            Do lado do servidor de origem — Ítaca — Penélope mantém a conexão aberta. Ela \
            é o keep-alive mais longo da história. Cada pretendente que invade seu palácio \
            é uma request não-autenticada tentando ocupar a porta. E o truque da mortalha \
            (tecer de dia, destecer de noite) é um rate limiter artesanal: ela aceita as \
            requests dos pretendentes mas nunca processa nenhuma completamente. Um backlog \
            infinito que nunca chega ao worker.

            Telêmaco, o filho, é o health check que sai periodicamente para verificar se \
            o servidor pai ainda existe em algum lugar da rede. Ele percorre nós (Esparta, \
            Pilos) perguntando: "Alguém tem informação sobre esse endpoint? Ele ainda está \
            up?" Os resultados são ambíguos — "última vez que vi, estava vivo" — como um \
            health check que retorna 200 mas sem body.

            E o final é a autenticação mais elegante da literatura. Odisseu chega em Ítaca \
            disfarçado (IP mascarado), observa o sistema comprometido (a casa cheia de \
            pretendentes), e quando é hora de provar sua identidade, usa o arco que ninguém \
            mais consegue tensionar — uma chave privada que só o titular original possui. \
            É um desafio de autenticação por prova de capacidade: não basta saber a senha, \
            você precisa ter a força (o segredo criptográfico) para executá-la. Os \
            pretendentes falham um a um. Odisseu dispara a flecha por doze machados \
            alinhados. Autenticação completa. Sessão restaurada. Response: 200 OK.

            Homero, três mil anos atrás, escreveu a especificação definitiva de uma \
            request resiliente: retry automático, proteção contra MITM, cache busting, \
            rate limiting, health checks, e autenticação por chave assimétrica. A Odisseia \
            não é um poema épico — é uma RFC.
            """,
            "/imagens/analogias/odisseia-http.jpg"
        ));

        // --- 8. O Médico e o Monstro → Dev vs. Produção ---
        acervo.add(new Analogia(
            "O Médico e o Monstro: Funciona na Minha Máquina",
            "O Médico e o Monstro",
            "Robert Louis Stevenson",
            "Ambientes de Desenvolvimento vs. Produção / Deploy",
            """
            Dr. Jekyll é o código em staging. Limpo. Testado. Todos os testes passando. \
            Code review aprovado. O build está verde. O cara é respeitável, previsível, e \
            segue todas as convenções. Se você olhar o pipeline, tudo indica que o deploy \
            vai ser tranquilo.

            Aí você dá o merge pra main e faz o deploy. O elixir. E o que emerge em \
            produção é Mr. Hyde: o mesmo código, mas correndo em um ambiente hostil, com \
            dados reais, carga real, e usuários reais fazendo coisas que nenhum test case \
            previu. Hyde é o bug que só aparece com 10 mil requests simultâneas. É o null \
            pointer que surge quando o campo "nome" vem vazio porque um cliente do Pará \
            preencheu o formulário de um jeito que ninguém em São Paulo imaginou. É a race \
            condition que o CI nunca pegou porque os testes rodam sequencialmente.

            A genialidade de Stevenson é que Jekyll e Hyde não são dois seres — são o mesmo. \
            O código não muda entre staging e produção; o que muda é o contexto. E é o \
            contexto que revela a monstruosidade latente. Todo dev sabe disso: o código que \
            você escreveu com carinho, com testes unitários, com padrões SOLID, pode se \
            transformar em um monstro quando exposto ao mundo real. O ambiente de dev é o \
            laboratório controlado; a produção é Londres à noite.

            O mais perturbador é que Jekyll se vicia. Ele sabe que Hyde é destrutivo, mas \
            continua fazendo o deploy porque a "transformação" é irresistível — a sensação \
            de poder quando o código vai pro ar. E cada deploy subsequente torna mais \
            difícil separar o Jekyll do Hyde, até que, no final, Hyde domina completamente \
            e Jekyll não consegue mais reverter. É o sistema em produção que acumula \
            tantos hotfixes, patches e workarounds que o código original (o Jekyll limpo) \
            se torna irrecuperável. Ninguém mais sabe como era o código antes dos deploys \
            de emergência. O monstro virou o estado natural.

            "Funciona na minha máquina" é a frase que Jekyll diria. Em staging, tudo é \
            civilizado. Mas a produção é Hyde country — e Stevenson sabia, em 1886, que \
            a distância entre o laboratório e a rua é onde mora o verdadeiro horror.
            """,
            "/imagens/analogias/jekyll-hyde-deploy.jpg"
        ));

        // --- 9. Macunaíma → O Sistema Legado Brasileiro ---
        acervo.add(new Analogia(
            "Macunaíma: O Sistema Legado que Funciona Apesar de Tudo",
            "Macunaíma",
            "Mário de Andrade",
            "Legacy Systems / Código Legado / Gambiarra",
            """
            Macunaíma é um sistema legado. Não qualquer sistema legado — é O sistema legado \
            brasileiro. Aquele que ninguém sabe quem escreveu, ninguém sabe por que funciona, \
            ninguém ousa tocar, mas roda em produção há décadas e sustenta metade da operação.

            O "herói sem nenhum caráter" é o código sem tipagem, sem documentação, sem \
            padrão. Ele é declarado como `any` e se comporta como `any`: muda de tipo \
            conforme convém, não respeita interface nenhuma, não implementa contrato \
            algum. Macunaíma nasce índio, vira branco, se transforma em bicho, muda de \
            forma como uma variável que é string num momento, number no outro, e undefined \
            quando você menos espera. É JavaScript dos anos 90 operando sem strict mode.

            A narrativa de Mário de Andrade é uma colagem — e é exatamente assim que um \
            sistema legado se forma. Ninguém projetou Macunaíma; ele foi acumulado. Cada \
            capítulo é um módulo escrito por um dev diferente (lendas tupis, mitos \
            africanos, folclore europeu, piadas paulistanas), com estilos incompatíveis, \
            sem integração tests, costurado na base da improvisação. O resultado é \
            caótico, contraditório, e — contra toda lógica — funciona. Porque o sistema \
            legado brasileiro não funciona APESAR do caos; ele funciona ATRAVÉS do caos. \
            A gambiarra não é o bug — é a feature.

            A Muiraquitã, o amuleto que Macunaíma passa o livro inteiro tentando recuperar, \
            é a documentação original. Alguém, em algum momento, sabia como o sistema \
            funcionava e registrou isso. Mas a documentação se perdeu (o gigante Piaimã \
            roubou), e agora o herói precisa navegar o sistema inteiro sem manual, usando \
            tentativa e erro, macumba (workarounds), e a famosa preguiça (otimização de \
            esforço). "Ai, que preguiça" é o mantra de todo dev que olha pro código legado \
            e decide: "não vou refatorar, vou só colocar um if aqui e resolver."

            Mário de Andrade, em 1928, escreveu a documentação mais honesta que existe \
            sobre o software brasileiro: ele não tenta fingir que há coerência. Ele abraça \
            o caos, mostra que a brasilidade computacional é feita de remendo sobre remendo, \
            de adaptação sobre adaptação, e que o "herói" desse sistema não é nenhum \
            engenheiro brilhante — é um anti-herói preguiçoso, inconstante e sem caráter \
            que, por algum milagre de resiliência cultural, mantém o sistema no ar.
            """,
            "/imagens/analogias/macunaima-legado.jpg"
        ));

        // --- 10. A Volta ao Mundo em 80 Dias → Automação + Fator Humano ---
        acervo.add(new Analogia(
            "Nem Phileas Fogg Automatiza Tudo: Por Que Fluxo Nenhum Elimina o Humano",
            "A Volta ao Mundo em 80 Dias",
            "Júlio Verne",
            "Automação / CI-CD / O Fator Humano em Pipelines",
            """
            Phileas Fogg é o pipeline de CI/CD perfeito. A vida dele é automatizada: \
            acorda no mesmo horário, toma o café na mesma temperatura, percorre o mesmo \
            caminho até o Reform Club, joga whist com a mesma precisão. Cada segundo do \
            dia está mapeado, otimizado, sem margem para variação. Fogg é o cron job \
            mais pontual do mundo. A aposta de dar a volta ao mundo em 80 dias é, para \
            ele, apenas uma questão de cálculo: horários de trens, conexões de navios, \
            tempos de escala. Se o mundo fosse um sistema determinístico, Fogg chegaria \
            no horário sem drama.

            O mundo não é um sistema determinístico.

            É aí que entra Passepartout — o fator humano que nenhum pipeline consegue \
            eliminar. Passepartout é o dev on-call que esquece de ajustar o timezone \
            (literalmente — ele não acerta o relógio, o que causa o plot twist final). \
            Ele é o erro humano que dispara incidentes: entra em um templo de sapatos \
            (quebra uma regra de compliance), se mete em confusões (introduz side \
            effects), e causa atrasos que nenhum Gantt chart previu. Mas — e aqui está \
            o ponto — é também ele que salva o projeto. Quando o trem não tem trilho, \
            é Passepartout que improvisa. Quando o navio não tem carvão, é Passepartout \
            que ajuda a desmontar o navio pra queimar como combustível. O fator humano \
            é simultaneamente a maior fonte de bugs e a única fonte de adaptação criativa.

            Mrs. Aouda — a mulher que Fogg salva na Índia — é o requisito não-funcional \
            que ninguém planejou. Ela não estava no backlog. Nenhuma user story previa \
            "resgatar uma mulher de uma fogueira ritual." Mas é ela que, no final, dá \
            sentido à jornada. Fogg chega em Londres pensando que perdeu a aposta (o \
            deploy falhou, timeout), e é Passepartout (o humano que errou o timezone) \
            que descobre que eles ganharam um dia — porque viajando para leste, \
            cruzaram a Linha Internacional de Data. O bug virou feature. O erro de \
            configuração salvou o projeto.

            Júlio Verne escreveu, em 1873, a tese definitiva sobre automação: você pode \
            otimizar cada etapa, calcular cada dependência, automatizar cada deploy — mas \
            o sistema só se completa quando o humano erra, improvisa, e descobre, no caos \
            da execução, algo que o planejamento nunca poderia prever. O pipeline perfeito \
            de Fogg precisou do bug de Passepartout para entregar. Nenhum CI/CD elimina o \
            fator humano — e talvez não deva.
            """,
            "/imagens/analogias/fogg-automacao.jpg"
        ));

        return acervo;
    }

    public List<Analogia> getMinhasAnalogias(Integer limite) {
        int limiteValidado = validarLimite(limite);
        List<Analogia> acervo = getMinhasAnalogias();
        return acervo.subList(0, Math.min(limiteValidado, acervo.size()));
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