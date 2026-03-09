# Meus Livros | Portfolio Project

Aplicacao web autoral para organizar uma estante literaria pessoal com comentarios, artigos e visualizacoes interativas (mapa e cronologia).

## Objetivo

Este projeto foi construido para portfolio, com foco em:
- Exibir repertorio tecnico em Java com Spring Boot.
- Apresentar uma curadoria literaria pessoal de forma visual.
- Demonstrar organizacao de API REST + frontend estatico.

## Stack

- Java 21
- Spring Boot 4 (Web MVC)
- Maven Wrapper (`mvnw`)
- HTML, CSS e JavaScript (arquivos estaticos em `src/main/resources/static`)

## Funcionalidades

- Estante virtual de livros com opinioes pessoais.
- Secao de artigos.
- Mapa literario por pais e autor destaque.
- Linha do tempo (cronologia).

## Preview (Prints/GIF)

Sugestao de estrutura para midias do projeto:

- `docs/preview/home.png`
- `docs/preview/mapa.png`
- `docs/preview/artigos.png`
- `docs/preview/demo.gif`

Quando adicionar as imagens, descomente os blocos abaixo:

```md
![Tela inicial](docs/preview/home.png)
![Mapa literario](docs/preview/mapa.png)
![Artigos](docs/preview/artigos.png)
![Demo](docs/preview/demo.gif)
```

## Como rodar localmente

### Pre-requisitos

- Java 21 instalado
- Maven nao e obrigatorio (o projeto usa Maven Wrapper)

### Executar

No Windows (PowerShell), dentro da pasta `sobre`:

```powershell
.\mvnw.cmd spring-boot:run
```

A aplicacao sobe em:

- `http://localhost:8080`

### Rodar testes

```powershell
.\mvnw.cmd test
```

## Endpoints da API

- `GET /api/livros`
- `GET /api/artigos`
- `GET /api/mapa`

## Deploy publico

Este repositorio ja inclui arquivos para deploy com container:

- `Dockerfile`
- `.dockerignore`
- `render.yaml`

### Render (recomendado para comeco rapido)

1. Suba o projeto para o GitHub.
2. No Render, escolha `New +` -> `Blueprint` e selecione o repositorio.
3. O Render vai ler `render.yaml` e provisionar o servico web.
4. A aplicacao ficara publica em uma URL do Render.

Observacao: o projeto ja esta preparado para porta dinamica em cloud via `server.port=${PORT:8080}`.

## Estrutura do projeto

```text
src/main/java/com/example/meuslivros
|- controller
|- service
|- model

src/main/resources/static
|- index.html
|- artigos.html
|- mapa.html
|- cronologia.html
```

## Proximos passos

- Adicionar persistencia real com banco de dados.
- Incluir filtros/paginacao nos endpoints.
- Aumentar cobertura de testes (servico e controller).
- Publicar com deploy continuo (Render/Railway/Azure).

## English Summary

Personal portfolio project built with Java + Spring Boot to present a curated literary catalog, articles, and interactive visual pages. It showcases REST API design, service-layer organization, and static frontend integration.
