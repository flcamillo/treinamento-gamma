console.log("teste");

// let é usado para declarar variaveis apenas
// no bloco que ela existe
// var é usado para declarar variaveis globais
{
    var variavel1 = "global";
    let variavel2 = "local";
}
console.log(variavel1);
// a linha baixo vai gerar erro
//console.log(variavel2);

// constantes também existem apenas no bloco que serão declaradas
const PI = 3.14;
console.log(PI);

// as comparações podem ser feitas de duas formas
// == compara o conteúdo
// === compara o conteúdo e o tipo
let valor1 = "5";
let valor2 = 5;
console.log(valor1 == valor2);
console.log(valor1 === valor2);

// as funções são declaradas da seguinte forma
function teste() {
    console.log("executando função teste");
}
teste();
// as funções que retornam valor são declaradas 
// da mesma forma
function teste2() {
    return "executando função teste2 retornando valor";
}
console.log(teste2());

// as funções também podem receber parametros
function soma(x, y) {
    return x + y;
}
console.log("A soma é: " + soma(10, 20));

// função executada pelo botão OK da pagina html
function clickDoBotaoOK() {
    alert("Você clicou no botão");
    document.getElementById("texto").value = "olá";
}

// é possível gerar saidas formatadas da seguinte forma
function multiplicacao(x, y) {
    return `${x} * ${y} = ` + x * y;
}
console.log(multiplicacao(10, 20));

// também é possível usar a função eval para executar algo
function operacao(x, y, oper) {
    return eval(`${x} ${oper} ${y}`);
}
console.log("O resultado da operação é: " + operacao(10, 20, "*"));

// é possível declarar funcões e passa-las como parametros para outras funções
console.log(
    function(m){
        return "Mensagem :" + m;
    }("olá")
);

// também é possível declarar desta forma, usando o padrão arrow function
console.log(
    ((m) => {
        return "Mensagem :" + m;
    })("olá")
);

// define um evento que só ocorrerá quando a pagina html for completamente carregada
// dentro deste evento, define um outro evento para o botão "adicionar" da pagina html,
// para quando este botão for clicado adicionar o conteúdo do campo id="texto" dentro
// da div id="dados"
document.addEventListener("DOMContentLoaded", function(event) {
    document.getElementById("adicionar").addEventListener("click", function() {
        let texto = document.getElementById("texto");
        let dados = document.getElementById("dados")
        dados.innerHTML += '<p>' + texto.value + '</p>';
        texto.value = "";
        texto.focus();
    });    
});