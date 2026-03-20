# Guia Completo: Cards Compartilháveis Instagramáveis

Este documento explica, de forma prática, como o projeto gera cards para Instagram (imagem PNG), quais arquivos são responsáveis por cada parte e como reaproveitar o padrão em outro sistema.

## Objetivo

Transformar conteúdo da UI (notícia, votação, escândalo, gráfico, dossiê) em uma imagem no formato de post de Instagram, geralmente 1080 x 1350, com download local para o usuário publicar manualmente.

---

## Visão Geral da Arquitetura

O fluxo usado no projeto segue este padrão:

1. Página monta os dados de compartilhamento.
2. Página renderiza um componente de Share (botão + template oculto).
3. Usuário clica em Compartilhar.
4. Componente captura o template oculto via html-to-image.
5. Componente baixa o PNG via downloadjs.

### Dependências-chave

- html-to-image: converte um nó do DOM para PNG.
- downloadjs: dispara download do arquivo no browser.

Estão em package.json como dependências do app.

---

## Arquivos Principais (Core)

## 1) Shares de conteúdo textual

### components/ui/NewsShareButton.tsx

Responsável por:

- Card de notícia.
- Modal de seleção de template visual (múltiplos esquemas de cor).
- Ajustes dinâmicos de densidade de texto (fontes, truncamento, espaçamento).

Ponto forte para reaproveitamento:

- É o componente mais completo em UX (prévia + seleção visual + export).

### components/ui/EscandaloShareButton.tsx

Responsável por:

- Card de escândalo no estilo editorial fixo.
- Blocos numéricos (valor desviado, condenados, etc.).

Ponto forte para reaproveitamento:

- Estrutura simples e objetiva para cards de impacto.

### components/ui/VotacaoShareButton.tsx

Responsável por:

- Card de votação com barras de Sim/Não e percentuais.
- Resumo de resultado e partidos principais.

Ponto forte para reaproveitamento:

- Ótimo template para qualquer card de comparação ou placar.

---

## 2) Share de dossiê complexo

### components/ui/InstaShareButton.tsx

Responsável por:

- Card longo e sofisticado em múltiplas seções (timeline, família, contraste teoria x realidade).
- Altura dinâmica para acomodar conteúdo maior.

Ponto forte para reaproveitamento:

- Serve como base para infográficos narrativos e dossiês.

---

## 3) Shares de gráficos

### components/charts/VotacaoBarChart.tsx
### components/charts/GastosCeapChart.tsx
### components/charts/PartidoDistribuicaoChart.tsx
### components/charts/OrientacaoIdeologicaChart.tsx

Responsáveis por:

- Exibir gráfico visível na página.
- Gerar versão ocultada e otimizada para compartilhamento.
- Exportar PNG do gráfico em layout instagramável.

Observação:

- Existe também components/ui/ChartShareButton.tsx, mas os componentes de chart acima já implementam share internamente.

---

## Onde os Shares são usados nas páginas

### app/noticias/page.tsx

- Monta NewsShareData por notícia.
- Renderiza NewsShareButton dentro de cada card.

### app/escandalos/page.tsx

- Monta EscandaloShareData por escândalo.
- Renderiza EscandaloShareButton no cabeçalho de cada bloco.

### app/votacoes/page.tsx

- Monta VotacaoShareData por votação.
- Renderiza VotacaoShareButton nas ações da votação.

### components/features/Scandals/MBLDossier.tsx
### components/features/Scandals/Supremo.tsx

- Alimentam InstaShareButton com objetos de dados extensos para dossiês.

---

## Fluxo Técnico Padrão (como implementar do zero)

Abaixo está o fluxo que se repete nos componentes de share.

## Etapa 1: Estrutura base no componente

- use client no topo.
- useRef para apontar para o card oculto.
- useState para loading.

## Etapa 2: Handler de exportação

- Validar se ref.current existe.
- Chamar toPng(ref.current, { cacheBust: true, pixelRatio: 3, skipFonts: true }).
- Gerar filename limpo (slug).
- Chamar download(dataUrl, filename).

## Etapa 3: Botão de ação

- Botão de Compartilhar/Baixar.
- Estado de loading com spinner.
- Desabilitar botão durante geração.

## Etapa 4: Template oculto

- Um container fora da tela:
  - position: fixed
  - left: -9999px
- Dentro dele, o card real a ser exportado.
- Dimensões recomendadas:
  - width: 1080px
  - height: 1350px (ou dinâmica, se necessário)

## Etapa 5: Design para legibilidade

- Headline forte.
- Hierarquia tipográfica clara.
- Blocos de dado e fontes.
- Rodapé com marca/projeto.

---

## Convenções úteis já usadas no projeto

## Nome de arquivo exportado

Padrão geral observado:

- Prefixo por domínio (ex.: psf, dossie, grafico).
- Trecho do título slugificado.
- Data quando fizer sentido.

## Configuração de captura

Padrão recorrente:

- cacheBust: true
- pixelRatio: 3
- skipFonts: true

Isso melhora nitidez e reduz chance de artefatos na geração.

---

## Checklist para copiar para outro projeto

1. Instalar html-to-image e downloadjs.
2. Criar componente client de share com useRef + useState.
3. Implementar handleShare com toPng + download.
4. Criar layout oculto 1080 x 1350.
5. Separar interface de dados (ex.: NewsShareData).
6. Na página, montar os dados e passar para o componente.
7. Testar conteúdos curtos e longos.
8. Ajustar truncamento e escalonamento tipográfico.
9. Testar em mobile e desktop.
10. Validar nomes de arquivo e qualidade final do PNG.

---

## Problemas comuns e como evitar

## 1) Texto estourando

- Solução: truncamento por limite + níveis de densidade de conteúdo.

## 2) Imagem com baixa qualidade

- Solução: aumentar pixelRatio (neste projeto, 3).

## 3) Conteúdo cortado

- Solução: revisar altura fixa ou usar altura dinâmica (caso do InstaShareButton).

## 4) Fontes inconsistentes na exportação

- Solução: testar com skipFonts true e tipografia de fallback adequada.

## 5) Download com nome ruim

- Solução: slugificar título antes de montar filename.

---

## Estratégia de Reuso recomendada

Para acelerar em outro projeto, faça assim:

1. Crie um ShareCardBase com o miolo técnico (ref, toPng, download, container oculto).
2. Crie variantes por conteúdo:
   - ShareNoticia
   - ShareRanking
   - ShareRelatorio
3. Centralize helpers:
   - slugify
   - limite de texto por densidade
   - presets de cor/tema
4. Deixe o layout como prop (children) quando quiser máxima flexibilidade.

---

## Mapa rápido (resumo)

- Núcleo de share de notícia: components/ui/NewsShareButton.tsx
- Núcleo de share de escândalo: components/ui/EscandaloShareButton.tsx
- Núcleo de share de votação: components/ui/VotacaoShareButton.tsx
- Núcleo de dossiê complexo: components/ui/InstaShareButton.tsx
- Shares de gráficos: components/charts/VotacaoBarChart.tsx, components/charts/GastosCeapChart.tsx, components/charts/PartidoDistribuicaoChart.tsx, components/charts/OrientacaoIdeologicaChart.tsx
- Integrações principais: app/noticias/page.tsx, app/escandalos/page.tsx, app/votacoes/page.tsx

---

## Próximo passo prático (sugestão)

Se quiser, o próximo passo é gerar um kit reutilizável em um único componente base + utilitários (slug, truncamento, densidade), já com API simples de props para você portar para outro projeto em minutos.
