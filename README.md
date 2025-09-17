Funcionalidades Implementadas

Tarefa 1: Adição da coluna distribution_center na tabela product usando um script SQL via Flyway.
Tarefa 2: Refatoração da entidade Product para incluir o campo distributionCenter.
Tarefa 3: Criação do serviço CepService para consultar a cidade de um CEP via API ViaCEP.
Tarefa 4: Desenvolvimento do endpoint /check-distribution/{cep}/{id} no ProductController para verificar a correspondência entre o CEP e o centro de distribuição do produto.
Tarefa 5/6: Implementação do ProductService com a lógica de negócio para integrar CepService e ProductRepository.
Tarefa 7: Teste do endpoint /check-distribution usando o Postman, retornando true ou false.

O endpoint principal, /check-distribution/{cep}/{id}, recebe um CEP e um ID de produto, consulta a cidade via API e compara com o distribution_center do produto no banco de dados.

Utilize o Postman para teste:

GET http://localhost:8080/product/check-distribution/08773380/p1
