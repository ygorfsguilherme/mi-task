<div align="center">
   <img src="https://user-images.githubusercontent.com/100237670/205465701-884df909-389d-41f8-9311-b908bedb9030.svg" />
</div>

<p align="center">
   <img src="http://img.shields.io/static/v1?label=React&message=FRAMEWORK&color=blue&style=for-the-badge" #vitrinedev/>
   <img src="http://img.shields.io/static/v1?label=Java&message=17.0.5&color=red&style=for-the-badge" #vitrinedev/>
   <img src="http://img.shields.io/static/v1?label=Srping%20Boot&message=FRAMEWORK&color=green&style=for-the-badge" #vitrinedev/>
   <img src="http://img.shields.io/static/v1?label=license&message=MIT&color=yellow&style=for-the-badge" #vitrinedev/>
   <img src="http://img.shields.io/static/v1?label=STATUS&message=EM%20DESENVOLVIMENTO&color=greeb&style=for-the-badge" #vitrinedev/>
</p>

## <img height="30px" src="https://img.icons8.com/plasticine/100/null/todo-list.png"/> Tópicos
- [Descrição](#-descrição)
- [Funcionalidades](#-funcionalidades)
- [Layout](#-layout-ou-deploy-da-aplicação)
- [Ferramentas Utilizadas](#-ferramentas-utilizadas)
- [Pré Requisitos](#-pré-requisitos)
- [Executar / Testar](#-executar--testar)
- [Licença](#-licença)

## 📜 Changelog
Para conferir todas as mudanças e atualizações do projeto, acesse o [CHANGELOG.md](https://github.com/ygorfsguilherme/mi-task/blob/main/CHANGELOG.md).


## <img src="https://cdn-icons-png.flaticon.com/512/3534/3534033.png" style="widht:30px; height:30px;" /> Descrição

O Mitask é uma ferramenta para criação de tarefas ou ideias. Sendo possível acessar de qualquer lugar, seja desktop ou mobile. Uma ferramenta simples e fácil uso.

Um simples projeto para demostras minhas habilidades na criação de app web utilizando as tecnologias que domino, no back end e igualmente no front end.

A aplicação e composta por duas parte front end e back end, em que front end foi desenvolvido em react com typescript e o back end desenvolvido em java com spring boot.

## <img height="35px" src="https://img.icons8.com/color/96/null/puzzle-matching.png"/> Funcionalidades
- Login e Registra
- Mostrar todas as tarefas do usuario
- E possivel editar, criar e deleta tarefa

## <img height="30px" src="https://img.icons8.com/color/96/null/template.png"/> Layout ou Deploy da Aplicação
- [Figma - Representação das funcionalidades e designer](https://www.figma.com/file/uSp36JGpnZZ8IqwQGQTR2V/MiTask?node-id=0%3A1&t=Nn9YigM5OxZMJqoy-0)

## <img src="https://cdn-icons-png.flaticon.com/512/1835/1835211.png" style="widht:30px; height:30px;" /> Ferramentas Utilizadas
- <img height="20px"  src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/react/react-original.svg" /> React
- <img height="20px" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/typescript/typescript-plain.svg" /> TypeScript
- <img height="20px" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg" /> Java
- <img height="20px" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/spring/spring-original.svg" /> Spring boot
- <img height="20px" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/sass/sass-original.svg" /> Sass
- <img height="20px" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/html5/html5-original.svg" /> HTML 5

Outras tecnologias como, banco de dados H2, css module, spring security e jwt

## <img height="35px" src="https://img.icons8.com/fluency/96/null/requirement.png"/> Pré-requisitos
- [Nodejs 16.xx](https://nodejs.org)
- [Java 17.xx](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.htmlnode)

## <img src="https://cdn-icons-png.flaticon.com/512/3068/3068553.png" style="widht:30px; height:30px;" /> Executar / Testar

Ao baixa / clona o projeto, no diretorio raiz havera dois diretorios principais, o client que ira conter o front end e o server nele estara o back end.

> No terminal, clone o projeto:
```
git clone https://github.com/ygorfsguilherme/mi-task.git
```
> Entre na raiz do projeto:
```
cd mit-task
```

<img height="20px" src="https://img.icons8.com/color/48/null/error--v1.png"/> Aviso: *Para testa o projeto por completo, e de valia iniciar o back end e posteriormente o front end.*

### - Back-end
A dependencia necessario para o funcionamento correta do back end e o java 17.0.x
apartir do diretorio raiz execute os seguintes comandos:

> Entre no diretorio server:

```
cd server
```
> Executar o back end no modo desenvolvidor/teste:

```
./mvnw spring-boot:run -Dspring-boot.run.profiles=dev
```

### - Front end
Primeiro precisa certificar se o nodejs esta instalado em sua maquina e que esteja na versão v16.xx, para roda o projeto precisa do npm.
apartir do diretorio raiz execute os seguintes comandos:

certifique que esta no diretorio raiz do projeto antes de realiza os proximos passos

> Entra no diretorio client:

```
cd client
```

> Necessario instalar as dependencias que o projeto necessita:

```
npm install
```

> Executando o projeto em modo desenvolvedor/teste:

```
npm run dev
```

![Captura de tela de 2023-08-12 00-55-53](https://github.com/ygorfsguilherme/mi-task/assets/100237670/9d77e325-5981-4b29-886f-712562e4a091)![Captura de tela de 2023-08-12 00-55-57](https://github.com/ygorfsguilherme/mi-task/assets/100237670/2f810af5-104e-4f9b-af44-be8ebbdbd219)![Captura de tela de 2023-08-12 00-57-17](https://github.com/ygorfsguilherme/mi-task/assets/100237670/a019cfde-e7ad-469e-93b4-0efd7b85bc3d)![Captura de tela de 2023-08-12 00-57-40](https://github.com/ygorfsguilherme/mi-task/assets/100237670/0fda9321-27a1-4ddd-a32b-875e247c92ab)![Captura de tela de 2023-08-12 00-58-40](https://github.com/ygorfsguilherme/mi-task/assets/100237670/dfd20676-f222-4aea-aaf8-53ca0bd9c3bc)
![Captura de tela de 2023-08-12 00-58-57](https://github.com/ygorfsguilherme/mi-task/assets/100237670/11cbee72-c938-4170-bfaa-49b5d9217915)




## <img height="30px" src="https://img.icons8.com/external-filled-outline-icons-maxicons/85/null/external-balance-law-and-justice-filled-outline-filled-outline-icons-maxicons.png"/> Licença

Mi Task é licenciado pelo [MIT License](https://github.com/ygorfsguilherme/mi-task/blob/main/LICENSE).
