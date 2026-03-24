document.addEventListener('DOMContentLoaded', async () => {
    await Promise.all([
        carregarFragmento('site-header-placeholder', 'header.html'),
        carregarFragmento('site-footer-placeholder', 'footer.html')
    ]);

    marcarLinkAtivo();
});

async function carregarFragmento(placeholderId, arquivo) {
    const placeholder = document.getElementById(placeholderId);
    if (!placeholder) {
        return;
    }

    try {
        const resposta = await fetch(arquivo);
        if (!resposta.ok) {
            throw new Error(`Falha ao carregar ${arquivo}`);
        }

        placeholder.innerHTML = await resposta.text();
    } catch (erro) {
        console.error(erro);
    }
}

function marcarLinkAtivo() {
    const paginaAtual = window.location.pathname.split('/').pop() || 'index.html';
    const links = document.querySelectorAll('.site-nav a, .site-footer__links a');

    links.forEach((link) => {
        const destino = link.getAttribute('href');
        if (!destino || destino.startsWith('#')) {
            return;
        }

        const [arquivo] = destino.split('?');
        if (arquivo === paginaAtual) {
            link.classList.add('is-active');
        }
    });
}
