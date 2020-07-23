
function fazerLogin(event) {
    // previne a ação padrão do botão (envio do formulario, submit)
    event.preventDefault();
    // captura o valor das variaveis
    let txtUsuario = document.getElementById("txtUser").value;
    let txtSenha = document.getElementById("txtSenha").value;
    // cria um json dos dados
    let login = {
        email: txtUsuario,
        racf: txtUsuario,
        senha: txtSenha
    }
    // cria a requisição para enviar ao servidor
    let requisicao = {
        method: "POST",
        body: JSON.stringify(login),
        headers: {
            "Content-type": "application/json"
        },
    }
    // envia os dados para o servidor
    fetch("http://localhost:8080/login", requisicao)
        .then(response => {
            if (response.status == 200) {
                response.json().then(usuario => gravarUsuario(usuario));
            } else {
                document.getElementById("mensagem").innerHTML = '<p>Login inválido !<p>';
            }
        })
        .catch(error => {
            console.log('Falha na requisição de login: ' + error.message);
        });
}

function gravarUsuario(usuario) {
    localStorage.setItem("userLogged", JSON.stringify(usuario));
    window.location = "dados.html";
}