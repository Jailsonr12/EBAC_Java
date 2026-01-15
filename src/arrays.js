const redeSociais = ["Facebook", "Instagram", "Twitter"]

for (let i = 0; i < redeSociais.length; i++) {
    console.log(`eu tenho persil na rede social: ${redeSociais[i]}`);
}

redeSociais.forEach(function (redeSocial) {
    console.log(`eu tenho persil na rede social: ${redeSocial}`);

})

const numeros = [1, 2, 3, 4, 5]
const dobraNumero = numeros.map(numero => numero * 2)
console.log(dobraNumero)

const alunos = ["Gustavo", "Julia", "Marcos", "Paulo"]

const alunosCurso = alunos.map(itemAtual => itemAtual = { nome: itemAtual, cursando: "Front-end" })

console.log(alunosCurso)

const paulo = alunosCurso.find(pessoa => pessoa.nome === "Paulo")

console.log(paulo)

const pauloIndex = alunosCurso.findIndex(pessoa => pessoa.nome === "Paulo")

console.log(pauloIndex)

const verificarCurso = alunosCurso.every(item => item.cursando == "Front-end")

console.log(verificarCurso)

const existeGustavo = alunosCurso.some(item => item.nome == "Jailson")

console.log(existeGustavo)

function filtraLetraI(nome) {
    return nome.toLowerCase().includes("i")
}

const filtrarAlunosComI = alunos.filter(filtraLetraI)

console.log(filtrarAlunosComI)


const numero2 = [10, 25, 30, 65, 70]

const somatudo = numero2.reduce( function(acumulador, itemAtual){
    acumulador += itemAtual;
    return acumulador;

},0)

console.log(somatudo)
