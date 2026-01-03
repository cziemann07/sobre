// primeiro espera o carregamento completo do DOM
document.addEventListener('DOMContentLoaded', () => {
    carregarArtigos(); 
});

// função assíncrona (isto é, que retorna uma Promise) para carregar os artigos 
// e atualizar o conteúdo da página
async function carregarArtigos() {
    try {
        // javascript vai até a rota do controller que retorna os artigos em formato JSON
        const resposta = await fetch('/api/artigos');

        // converte a resposta (lista de objetos) para JSON (JavaScript Object Notation)
        const artigos = await resposta.json();

        // limpa o "carregando textos..." 
        const container = document.getElementById('container-artigos');
        container.innerHTML = '';

        // para cada artigo na lista de artigos, cria o HTML na tela
        artigos.forEach(artigo => {
            const card = document.createElement('article');
            card.className = 'artigo-card'; 

            card.innerHTML = `
                <h3>${artigo.titulo}</h3>
                <small>Publicado em ${artigo.data} por ${artigo.autor}</small>
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
    // Vamos criar o modal dinamicamente ou usar um existente
    // Vou sugerir criar um modal específico para leitura no HTML do artigos.html
    // Mas aqui vai uma lógica genérica rápida:
    
    // Você precisa ter a estrutura do modal no artigos.html também!
    const modal = document.getElementById('modal'); 
    const modalBody = document.querySelector('.modal-body');
    
    // Limpa o modal atual e joga o texto do artigo
    // Note que aqui eu mudo a estrutura visual pra não ter capa
    modalBody.innerHTML = `
        <div class="artigo-leitura">
            ${artigo.conteudoHtml}
        </div>
    `;
    
    // Reativa o botão de fechar (pq eu apaguei ele no innerHTML acima)
    // Uma estratégia melhor seria ter um modal separado só pra texto, mas assim funciona:
    const btnFechar = document.createElement('button');
    btnFechar.className = 'btn-close';
    btnFechar.onclick = () => { modal.style.display = 'none'; };
    document.querySelector('.modal-content').appendChild(btnFechar);

    modal.style.display = 'flex';
}