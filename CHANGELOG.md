# Changelog

Todas as mudanças notáveis neste projeto serão documentadas aqui.

O formato segue as convenções de [Keep a Changelog](https://keepachangelog.com/en/1.0.0/) e este projeto segue a versão [SemVer](https://semver.org/lang/pt-BR/).

## [Unreleased]

## [1.1.0] - 2025-02-13
### Alterado
- `EmailExists` marcada como **obsoleta** (`@Deprecated`). Agora, utilize `UserAlreadyExistsException`.

### Corrigido
- Resolvido problema na rota **GET /tasks** que não estava retornando todas as tarefas cadastradas corretamente.

## [1.0.0] - 2017-11-17
### Adicionado
- Implementação inicial do projeto.
