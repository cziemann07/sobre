// primeiro espera o carregamento completo do DOM
document.addEventListener('DOMContentLoaded', () => {
    carregarEstante();
    setupModalEvents(); // configura o botão de fechar modal uma única vez, evitando [...]
});

// função assíncrona (isto é, que retorna uma Promise) para carregar os livros da estante
// e atualizar o conteúdo da página
async function carregarEstante() {
    try {
        // javascript vai até a rota do controller que retorna os livros em formato JSON
        const resposta = await fetch('/api/livros');

        // converte a resposta (lista de objetos) para JSON (JavaScript Object Notation)
        const livros = await resposta.json();

        // limpa o "carregando..." 
        const container = document.getElementById('container-livros');
        container.innerHTML = '';

        // para cada livro na lista de livros, cria o HTML na tela
        livros.forEach(livro => {
            // card como tag semântica para cada livro
            const card = document.createElement('article');
            card.className = 'livro-card';

            card.innerHTML = `
                <div class="capa-wrapper">
                    <img src="${livro.capaUrl}" alt="Capa de ${livro.titulo}" onerror="this.style.display='none'; this.parentElement.classList.add('sem-capa')">
                </div>
                <div class="conteudo">
                    <h2>${livro.titulo}</h2>
                    <h3>${livro.autor}</h3>
                </div>
            `;
            
            container.appendChild(card);

            card.addEventListener('click', () => {
                abrirModal(livro);
            });
            
            /*
            card.addEventListener('click', () => {
                //alert(`Você clicou no livro: ${livro.titulo}`);

                // o modal vai ser os popup com mais informações do livro
                const modal = document.getElementById('modal-livro');
                const modalConteudo = document.getElementById('modal-conteudo');
                modalConteudo.innerHTML = `
                    <div class="modal" id="modal">
                        <div class="modal-inner">
                            <div class="capa-wrapper-modal">
                                <img src="${livro.capaUrl}" alt="Capa de ${livro.titulo}" onerror="this.src='https://via.placeholder.com/150x220?text=Livro'">
                            </div>
                            <div class="detalhes-livro">
                                <h2>${livro.titulo}</h2>
                                <h3>Autor: ${livro.autor}</h3>
                                <p>${livro.minhaOpiniao}</p>
                            </div>
                            <button id="close-modal">Fechar</button>
                        </div>
                    </div>
                `;
                modal.style.display = 'block';
                
                return modal;
            }); */

        });
        
    } catch (erro) {
        console.error("Erro ao carregar a estante virtual:", erro);
    }
}

// função especial para abrir o modal
function abrirModal(livro) {
    // primeiro pega-se os componentes do modal, até então, em brancos
    const modalOverlay = document.getElementById('modal');
    const img = document.getElementById('modal-img');
    const titulo = document.getElementById('modal-titulo');
    const autor = document.getElementById('modal-autor');
    const opiniao = document.getElementById('modal-opiniao');

    // preenche com os dados do livro parâmetro
    img.src = livro.capaUrl;
    img.alt = livro.titulo;
    // boas práticas: protege erro de imagem
    img.onerror = function() { 
        this.style.display='none'; 
    }; 

    titulo.innerText = livro.titulo;
    autor.innerText = livro.autor;
    
    opiniao.innerText = livro.minhaOpiniao || "Sem opinião registrada.";

    // após tuddo preenchido, o modal aparece
    modalOverlay.style.display = 'flex';
}

// função fecha modal (carrega uma única fez ao iniciar o dom)
function setupModalEvents() {
    const modalOverlay = document.getElementById('modal');
    const btnClose = document.getElementById('btn-close');

    // ao clicar no botão -> fecha o modal
    btnClose.addEventListener('click', () => {
        modalOverlay.style.display = 'none';
    });

    // ao clicar fora do modal -> fecha o modal
    modalOverlay.addEventListener('click', (event) => {
        if (event.target === modalOverlay) {
            modalOverlay.style.display = 'none';
        }
    });
}