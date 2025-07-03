# 📋 Cadastro de Usuário - Spring Boot

Este projeto é uma API REST simples para gerenciar usuários, construída com **Spring Boot 3.5.3**, **JPA**, e **H2 Database**, utilizando as boas práticas de separação por camadas: controller, service, repository e entity.

## ⚙️ Funcionalidades

A API permite:

- ✅ Criar um novo usuário  
- 🔍 Buscar usuário por e-mail  
- 🗑️ Deletar usuário por e-mail  
- ✏️ Atualizar dados de um usuário por ID

## 🧱 Estrutura do Projeto

```bash
src
├── business         # Regras de negócio (Service)
├── controller       # Endpoints da API (Controller)
├── infrastructure
│   ├── entity       # Modelo de dados (Entity)
│   └── repository   # Interface de acesso ao banco (Repository)
└── resources
    ├── application.properties # Configurações da aplicação
```

## 🛠️ Tecnologias Utilizadas
- Java 21
- Spring Boot 3.5.3
- Spring Web
- Spring Data JPA
- H2 Database (banco em memória)
- Lombok
- Maven

## 🔌 Endpoints

| Método | Endpoint            | Descrição                      |
|--------|---------------------|-------------------------------|
| POST   | `/usuario`          | Cadastra um novo usuário      |
| GET    | `/usuario?email=`   | Busca usuário pelo e-mail     |
| DELETE | `/usuario?email=`   | Deleta usuário pelo e-mail    |
| PUT    | `/usuario?id=`      | Atualiza usuário pelo ID      |


A aplicação utiliza H2, um banco de dados em memória. O console está habilitado em:
http://localhost:8888/h2-console
