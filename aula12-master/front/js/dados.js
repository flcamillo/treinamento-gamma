function validaLogin() {
    let usuario = localStorage.getItem("userLogged");
    if (usuario == null) {
        window.location = "index.html";
    }
    dados = JSON.parse(usuario);
    document.getElementById("foto").src = dados.linkFoto;
    document.getElementById("nome").innerHTML = `<p>${dados.nome}</p>`;
}

function logout() {
    localStorage.removeItem("userLogged");
    window.location = "index.html";
}

function carregarUsuarios() {
    // cria a requisição para enviar ao servidor
    let requisicao = {
        method: "GET",
        headers: {
            "Content-type": "application/json"
        },
    }
    // envia os dados para o servidor
    fetch("http://localhost:8080/listausuario", requisicao)
        .then(response => {
            if (response.status == 200) {
                response.json().then(usuarios => criaTabelaUsuario(usuarios));
            } else {
                document.getElementById("lista").innerHTML = '<p>Falha na requisição<p>';
            }
        })
        .catch(error => {
            console.log('Falha na requisição da lista de usuários: ' + error.message);
        });
}

function criaTabelaUsuario(usuarios) {
    let tabela = document.getElementById("lista");
    let tabelaHTML = `<table class="table">`;
    tabelaHTML += `<thead><tr><th>Usuario</th><th>RACF</th><th>Email</th></tr></thead><tbody>`;
    usuarios.forEach(usuario => {
        tabelaHTML += `<tr><td>${usuario.nome}</td><td>${usuario.racf}</td><td>${usuario.email}</td></tr>`;        
    });
    tabelaHTML += "</tbody></table>";
    tabela.innerHTML = tabelaHTML;
}