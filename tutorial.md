# ThymeReact - integração React ao Thymeleaf

Este é um tutorial de integração do **React** ao **Thymeleaf**, utilizando o **Spring Boot** como *backend*.

Para isso, vamos criar um simples exemplo de um CRUD para registrar produtos, contendo nome, descrição e preço. Vamos utilizar o **Thymeleaf** para gerar as `views` e, junto do `npm`, será feita a integração de componentes **React** à aplicação.

## Criando um CRUD simples

Para isso, vamos primeiro criar um projeto com as seguintes dependências:

- Spring Web
- Thymeleaf
- H2 Database (banco em memória)
- Lombok
- Spring Data JPA

O nome do nosso projeto será `com.example.thymereact`.

Inicialmente, vamos criar um pacote chamado `com.example.thymereact.products`. Nesse pacote, serão criados os seguintes arquivos:

- classe `ProductEntity` → que representa a tabela SQL
- interface `ProductRepository` → conexão com o banco de dados
- classe `ProductDTO` → *data transfer object* para criação de novas *entities*
- classe `ProductService` → implementando a regra de negócios
- classe `ProductController` → gerando as rotas HTTP

## Criando views Thymeleaf com React