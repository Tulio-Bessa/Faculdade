# README - Trabalho Avaliativo de Estrutura de Dados I

## Descrição do Projeto

Este projeto foi desenvolvido por mim e pelo colega **Adryan Santos** como parte do trabalho avaliativo da disciplina de **Estrutura de Dados I**. O objetivo principal foi criar uma aplicação interativa para gerenciar dados de funcionários utilizando um servidor web com **Flask** e um sistema de armazenamento em **JSON**. 

A aplicação permite buscar e cadastrar funcionários por meio do **CPF**, utilizando **Flask** no back-end e uma interface simples no front-end.

### Tecnologias Utilizadas

- **Python**: Para manipulação da base de dados em formato JSON e implementação da lógica de armazenamento e ordenação.
- **Flask**: Framework Python para criação do servidor web e manipulação das rotas de consulta e cadastro de dados.
- **Flask_CORS**: Para permitir requisições CORS entre o front-end e o back-end.
- **JSON**: Para armazenar os dados dos funcionários de forma estruturada.
  
Instale as bibliotecas necessárias com o seguinte comando:

```bash
pip install flask flask_cors
```

### Funcionalidades

A aplicação possui as seguintes funcionalidades:

1. **Consulta de Funcionários**:
   - O usuário pode **consultar os dados** de um funcionário pelo **CPF**. Se o CPF for encontrado, as informações são retornadas como um **JSON**.
   - Caso o CPF não exista, será retornado um JSON com os valores padrão, indicando que o funcionário não foi encontrado.

2. **Cadastro de Funcionários**:
   - O usuário pode **cadastrar um novo funcionário** com as informações como **nome**, **email**, **telefone** e **endereço**. 
   - Ao cadastrar um funcionário, o sistema **salva os dados** em um arquivo JSON.
   - Os dados são **ordenados automaticamente** por CPF utilizando a função **Timsort** do Python.

## Como Usar

### Requisitos

- **Python 3.x** instalado na máquina.
- Bibliotecas necessárias:
  - `json`: Para manipulação do arquivo JSON.
  - `flask`: Para servidor web e comunicação com o front-end.
  - `flask_cors`: Para permitir requisições CORS entre o front-end e o back-end.

### Passos para Execução

1. **Clone o repositório**:

   ```bash
   git clone https://github.com/seu-usuario/trabalho-estruturas-de-dados
   cd trabalho-estruturas-de-dados
   ```

2. **Execute o servidor Python**:

   Navegue até o diretório do projeto e execute o seguinte comando para iniciar o servidor Flask:

   ```bash
   python app.py
   ```

3. **Acesse no navegador**:

   Após iniciar o servidor, abra o navegador e acesse o endereço:

   ```
   http://127.0.0.1:5000
   ```

4. **Interaja com a API**:
   - Para consultar um funcionário, faça uma requisição **GET** para o endpoint `/consulta` passando o CPF como parâmetro (exemplo: `http://127.0.0.1:5000/consulta?doc=12345678900`).
   - Para cadastrar um novo funcionário, faça uma requisição **POST** para o endpoint `/cadastro` com os dados no formato JSON (exemplo de payload):

   ```json
   {
     "cpf": "12345678900",
     "dados": {
       "nome": "João da Silva",
       "email": "joao.silva@email.com",
       "telefone": "(11) 98765-4321",
       "endereco": "Rua Exemplo, 123"
     }
   }
   ```

### Estrutura de Dados (JSON)

O arquivo de dados dos funcionários é um arquivo **JSON** onde o **CPF** de cada funcionário é a **chave primária**, e os dados de cada funcionário são armazenados como valores associados às chaves. Quando um novo funcionário é cadastrado, seu **CPF** é utilizado como chave.

**Exemplo de arquivo `dados.json`**:

```json
{
  "12345678900": {
    "nome": "João da Silva",
    "email": "joao.silva@email.com",
    "telefone": "(11) 98765-4321",
    "endereco": "Rua Exemplo, 123"
  },
  "98765432100": {
    "nome": "Maria Oliveira",
    "email": "maria.oliveira@email.com",
    "telefone": "(21) 91234-5678",
    "endereco": "Avenida Central, 456"
  }
}
```

O arquivo **dados.json** é atualizado toda vez que um novo funcionário é cadastrado. Além disso, os registros são **ordenados por CPF** usando o algoritmo **Timsort**, o que garante que a lista de dados esteja sempre ordenada de forma eficiente.

## Algoritmo de Ordenação (Timsort)

O **Timsort** é uma combinação de dois algoritmos eficientes de ordenação: **Merge Sort** e **Insertion Sort**. Este algoritmo foi escolhido por sua eficiência em listas parcialmente ordenadas, o que é ideal para a manipulação de dados no arquivo JSON.

No código Python, o Timsort é utilizado para ordenar a lista de funcionários por CPF sempre que um novo cadastro é feito.

## Contribuições

Este projeto foi desenvolvido de forma colaborativa entre eu e **Tulio Bessa**.

## License

Este projeto está licenciado sob a Licença MIT - veja o arquivo [LICENSE](LICENSE) para mais detalhes.
