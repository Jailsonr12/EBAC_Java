function soma(a, b) {
    return a + b;
}

function subtracao(a, b) {
    return a - b;
}

function multiplicacao(a, b) {
    return a * b;
}

function divisao(a, b) {
    return a / b;
}

console.log("Soma: " + soma(5, 3)); // Output: Soma: 8
console.log("Subtração: " + subtracao(5, 3)); // Output: Subtração: 2
console.log("Multiplicação: " + multiplicacao(5, 3)); // Output: Multiplicação: 15
console.log("Divisão: " + divisao(5, 3)); // Output: Divisão: 1.6666666666666667

module.exports = {
    somar: soma,
    subtrair: subtracao,
    multiplicar: multiplicacao,
    dividir: divisao,
};
