from flask import Flask, request
from flask_cors import CORS
import json
import os

app = Flask('Aplicação')
CORS(app)

@app.route("/")
def homepage():
    return "Hello World!"

@app.route('/consulta', methods=['GET'])
def consultaCadastro():
    documento = request.args.get('doc')
    registro = dados(documento)
    return registro

@app.route('/cadastro', methods=['POST'])
def cadastro():
    payload = request.json
    cpf = payload.get('cpf')
    valores = payload.get('dados')
    salvarDados(cpf,valores)
    return 'Dados Cadastrados'

def carregarArquivo():
    # caminho de onde o arquivo esta salvo
    caminhoArquivo = 'dados.json'
    try:
        with open(caminhoArquivo, "r") as arq:
            return json.load(arq)
    except Exception:
        return "Falha ao carregar o arquivo"

def gravarArquivo(dados):
    caminhoArquivo = 'dados.json'
    try:
        with open(caminhoArquivo, "w") as arq:
            json.dump(dados, arq, indent=4)
        return "Dados armazenados com sucesso"
    except Exception as e:
        return f"Falha ao gravar o arquivo: {str(e)}"

def salvarDados(cpf, registro):
    dadosPessoas = carregarArquivo()
    if not isinstance(dadosPessoas, dict):
        dadosPessoas = {}  # Caso o arquivo esteja vazio ou inválido
    dadosPessoas[cpf] = registro
    # Ordenar os CPFs por ordem alfabética antes de salvar
    dadosOrdenados = dict(sorted(dadosPessoas.items()))
    gravarArquivo(dadosOrdenados)


def dados(cpf):
    dadosPessoas = carregarArquivo()
    vazio = {
        "nome": "Não encontrado",
        "email": "-",
        "telefone": "-",
        "endereco": "-",
    }
    cliente = dadosPessoas.get(cpf, vazio)
    return cliente

if __name__ == "__main__":
    app.run(debug=True)