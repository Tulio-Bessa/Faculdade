async function buscarFuncionario() {
    const docCPF = document.getElementById('cpf').value
    if (!docCPF){
        alert('Por favor, digite o CPF!');
        return;
    }

    const response = await fetch(`http://127.0.0.1:5000/consulta?doc=${docCPF}`)

    const dados = await response.json(response)
    document.getElementById('nome').textContent =  dados.nome
    document.getElementById('email').textContent =  'Email: ' + dados.email
    document.getElementById('telefone').textContent = 'Telefone: ' + dados.telefone
    document.getElementById('endereco').textContent = 'Endereço: ' + dados.endereco
}


async function cadastrarCliente(event) {
    event.preventDefault();
    
    // Pegar Valores HTML
    const cpf = document.getElementById('cadCpf').value;
    const nome = document.getElementById('cadNome').value;
    const email = document.getElementById('cadEmail').value;
    const telefone = document.getElementById('cadTel').value;
    const endereco = document.getElementById('cadEnd').value;

    // Criar Estrutura JSON
    const payload = {
        cpf,
        dados: {
            nome,
            email,
            telefone,
            endereco
        }
    };

    // Requisição no Backend
    const response = await fetch('http://127.0.0.1:5000/cadastro', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(payload)
    });
}