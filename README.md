## Sumario
- [Sobre](#sobre)
- [Tecnologias usada](#tecnologias-usada)
- [Como executar](#como-executar)

## Sobre

O Mitask é uma ferramenta para criação de tarefas ou ideias. Sendo possível acessar de qualquer lugar, seja desktop ou mobile. Além de sincronizar entre dispositivos.
Uma ferramenta simples e fácil uso.

> Leve, não é preciso instalar em seus dispositivos e ocupado aqueles MB de suas músicas ou fotos favoritas.

> Simples, para criação de notas, ideias e tarefas rápidas sem complexidade ou conhecimentos avançados.

> Múltiplos dispositivos, você pode acessar de qualquer dispositivo desktop, mobile e smart tv, que tenha um navegador instalado.

***Obs: Mi task é totalmente educacional***

Um simples projeto para demostras minhas habilidades na criação de app web utilizando as tecnologias que domino, no back end e igualmente no front end.

## Tecnologias usada
- React
- TypeScript
- Java
- Spring boot
- Sass
- DB H2

## Como executar
A aplicação e composta por duas parte front end e back end, em que front end foi desenvolvido em react com typescript e o back end desenvolvido em java com spring boot.

Ao baixa ou clona o projeto, no diretorio raiz havera dois diretorios principais, o client que ira conter o front end e o server nele estara o back end.

Para testa o projeto por completo, e de valia iniciar o back end e posteriormente o front end.

### Back-end
A dependencia necessario para o funcionamento correto do back end e o java 17.0.x
apartir do diretorio raiz execute os seguintes comandos:

*entra no diretorio server*

```
cd server
```
*executar o back end*
```
./mvnw spring-boot:run -Dspring-boot.run.profiles=dev
```

### Front end
Primeiro precisa certificar se o nodejs esta instalado em sua maquina e que esteja na versão v16.xx, para roda o projeto precisa do npm.
apartir do diretorio raiz execute os seguintes comandos:

certifique que esta no direotorio raiz do projeto antes de realiza os proximos passos

*entra no diretorio client*

```
cd client
```

Usando npm:

*necessario instalar as dependencias que o projeto necessita.*

```
npm install
```
*executando o projeto em modo desenvolvido ou teste*
```
npm run dev
```
