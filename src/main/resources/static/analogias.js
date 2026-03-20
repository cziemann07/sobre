// analogias.js — consome GET /api/analogias e renderiza os cards + modal

document.addEventListener('DOMContentLoaded', () => {
    const container = document.getElementById('container-analogias');
    const modal = document.getElementById('modal-analogia');
    const btnClose = document.getElementById('btn-close-analogia');

    // elementos do modal
    const modalTag = document.getElementById('modal-tag');
    const modalTitulo = document.getElementById('modal-titulo-art');
    const modalLivro = document.getElementById('modal-livro-nome');
    const modalAutor = document.getElementById('modal-autor-nome');
    const modalTexto = document.getElementById('modal-texto-analogia');

    // ---- Fetch do endpoint ----
    fetch('/api/analogias')
        .then(response => {
            if (!response.ok) throw new Error(`Erro HTTP: ${response.status}`);
            return response.json();
        })
        .then(analogias => {
            container.innerHTML = ''; // limpa o "Compilando analogias..."
            renderizarCards(analogias);
        })
        .catch(erro => {
            console.error('Falha ao carregar analogias:', erro);
            container.innerHTML = `
                <p class="loading-msg" style="color: #c4651a;">
                    // ERRO: não foi possível compilar as analogias.<br>
                    // Verifique se o backend está rodando.
                </p>
            `;
        });

    // ---- Renderiza os cards ----
    function renderizarCards(analogias) {
        analogias.forEach((item, index) => {
            const card = document.createElement('div');
            card.className = 'analogia-card';
            card.style.animationDelay = `${index * 0.08}s`; // entrada escalonada

            // pega as primeiras ~200 chars do texto como preview
            const preview = item.analogia.trim().substring(0, 180) + '...';

            card.innerHTML = `
                <div class="card-header-tech">
                    <span class="card-conceito-tech">${item.conceitoTech}</span>
                    <h3 class="card-titulo">${item.tituloArtigo}</h3>
                </div>
                <div class="card-body-lit">
                    <p class="card-livro">${item.livro}</p>
                    <p class="card-autor">${item.autor}</p>
                    <p class="card-preview">${preview}</p>
                    <span class="card-ler-mais">→ ler analogia</span>
                </div>
            `;

            // click abre o modal
            card.addEventListener('click', () => abrirModal(item));

            container.appendChild(card);
        });
    }

    // ---- Abre o modal com os dados da analogia ----
    function abrirModal(item) {
        modalTag.textContent = item.conceitoTech;
        modalTitulo.textContent = item.tituloArtigo;
        modalLivro.textContent = item.livro;
        modalAutor.textContent = item.autor;
        modalTexto.textContent = item.analogia.trim();

        modal.style.display = 'flex';
        // pequeno delay pra a animação CSS funcionar
        requestAnimationFrame(() => {
            modal.classList.add('aberto');
        });

        document.body.style.overflow = 'hidden'; // trava scroll do body
    }

    // ---- Fecha o modal ----
    function fecharModal() {
        modal.classList.remove('aberto');
        // espera a animação terminar antes de esconder
        setTimeout(() => {
            modal.style.display = 'none';
            document.body.style.overflow = '';
        }, 350);
    }

    btnClose.addEventListener('click', fecharModal);

    // fecha clicando fora do conteúdo
    modal.addEventListener('click', (e) => {
        if (e.target === modal) fecharModal();
    });

    // fecha com ESC
    document.addEventListener('keydown', (e) => {
        if (e.key === 'Escape' && modal.style.display === 'flex') {
            fecharModal();
        }
    });
});