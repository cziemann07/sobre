// primeiro espera o carregamento completo do DOM
document.addEventListener('DOMContentLoaded', () => {
    carregarArtigos(); 
});

// função assíncrona (isto é, que retorna uma Promise) para carregar os artigos 
// e atualizar o conteúdo da página
async function carregarArtigos() {
    try {
        const params = new URLSearchParams(window.location.search);
        const modulo = params.get('modulo');
        const tituloPorModulo = {
            EDUCACAO: 'Educacao',
            ARTIGO: 'Artigo',
            POEMA: 'Poema'
        };

        // javascript vai até a rota do controller que retorna os artigos em formato JSON
        const url = modulo ? `/api/artigos?modulo=${encodeURIComponent(modulo)}` : '/api/artigos';
        const resposta = await fetch(url);

        // converte a resposta (lista de objetos) para JSON (JavaScript Object Notation)
        const artigos = await resposta.json();

        const header = document.querySelector('.header-blog h2');
        if (header && modulo && tituloPorModulo[modulo]) {
            header.textContent = `Modulo: ${tituloPorModulo[modulo]}`;
        }

        // limpa o "carregando textos..." 
        const container = document.getElementById('container-artigos');
        container.innerHTML = '';

        // para cada artigo na lista de artigos, cria o HTML na tela
        artigos.forEach(artigo => {
            const card = document.createElement('article');
            card.className = 'artigo-card'; 

            card.innerHTML = `
                <h3>${artigo.titulo}</h3>
                <small>[${artigo.modulo}] Publicado em ${artigo.data} por ${artigo.autor}</small>
                <p>${artigo.resumo}</p>
                <button class="ler-mais">Ler Completo</button>
            `;

            card.querySelector('.ler-mais').addEventListener('click', () => {
                abrirModalArtigo(artigo);
            });

            container.appendChild(card);
        });

    } catch (erro) {
        console.error("Erro ao carregar artigos:", erro);
    }
}

function abrirModalArtigo(artigo) {
    const modal = document.getElementById('modal'); 
    const modalBody = document.querySelector('.modal-body');
    
    // Limpa o modal atual e joga o texto do artigo
    modalBody.innerHTML = `
        <div class="artigo-leitura">
            ${artigo.conteudoHtml}
        </div>
    `;
    
    // Garante que o botão de fechar está presente
    let btnFechar = document.getElementById('btn-close');
    if (!btnFechar) {
        btnFechar = document.createElement('button');
        btnFechar.id = 'btn-close';
        btnFechar.className = 'btn-close';
        document.querySelector('.modal-content').appendChild(btnFechar);
    }
    
    // Fecha o modal ao clicar no botão X
    btnFechar.onclick = (e) => {
        e.stopPropagation();
        fecharModal();
    };
    
    // Fecha o modal ao clicar fora do conteúdo (no overlay)
    modal.onclick = (e) => {
        if (e.target === modal) {
            fecharModal();
        }
    };

    modal.style.display = 'flex';
}

function fecharModal() {
    const modal = document.getElementById('modal');
    modal.style.display = 'none';
}