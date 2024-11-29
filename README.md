# Portaria Orientada a Objetos

Este projeto foi desenvolvido para simular o processo de validação de entrada em uma portaria utilizando os conceitos de **Programação Orientada a Objetos (POO)** em Kotlin. Ele gerencia convites, códigos e valida a idade das pessoas que desejam acessar determinado local.

## Estrutura do Projeto

O projeto é composto por diversas classes que implementam os seguintes conceitos:

- **Pessoa**: Representa a pessoa que deseja entrar no local, com validação de idade.
- **Convite**: Representa o convite de entrada, incluindo tipo e código do convite.
- **Portaria**: Responsável por orquestrar o processo de validação de entradas, verificando idade, tipo de convite e código.
- **Console**: Responsável por realizar a interação com o usuário, solicitando entradas e validando os dados.
- **Negócios**: Contém a lógica de validação para a pessoa, o convite e o código do convite.

## Funcionalidades

- **Validação de Idade**: Verifica se a pessoa tem 18 anos ou mais para permitir a entrada.
- **Validação de Convite**: Verifica se o tipo de convite informado é válido.
- **Validação de Código**: Verifica se o código do convite corresponde ao tipo de convite.
