# Projeto de Distribuição com CEP

Bem-vindo ao repositório do projeto desenvolvido para gerenciar produtos e verificar a distribuição com base em CEPs! Este projeto foi criado como parte de um exercício acadêmico usando Spring Boot, PostgreSQL e a API ViaCEP.

## Sobre o Projeto

Este é um aplicativo Java baseado em Spring Boot que permite:
- Gerenciar produtos com informações como nome, preço, categoria e centro de distribuição.
- Verificar se um produto pode ser distribuído para uma localidade com base no CEP fornecido.
- Integrar com a API ViaCEP para obter a cidade associada a um CEP.

### Funcionalidades Implementadas
1. **Tarefa 1**: Adição da coluna `distribution_center` na tabela `product` usando um script SQL via Flyway.
2. **Tarefa 2**: Refatoração da entidade `Product` para incluir o campo `distributionCenter`.
3. **Tarefa 3**: Criação do serviço `CepService` para consultar a cidade de um CEP via API ViaCEP.
4. **Tarefa 4**: Desenvolvimento do endpoint `/check-distribution/{cep}/{id}` no `ProductController` para verificar a correspondência entre o CEP e o centro de distribuição do produto.
5. **Tarefa 5/6**: Implementação do `ProductService` com a lógica de negócio para integrar `CepService` e `ProductRepository`.
6. **Tarefa 7**: Teste do endpoint `/check-distribution` usando o Postman, retornando `true` ou `false`.

O endpoint principal, `/check-distribution/{cep}/{id}`, recebe um CEP e um ID de produto, consulta a cidade via API e compara com o `distribution_center` do produto no banco de dados.
