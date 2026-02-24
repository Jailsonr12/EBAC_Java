const calc = require("./calculadora");

describe("Testes para a calculadora", () => {
    test("Soma de 2 + 3 deve ser igual a 5", () => {
        const minhaSoma = calc.somar(2, 3);
        expect(minhaSoma).toBe(5);
    });

    test("Subtração de 5 - 2 deve ser igual a 3", () => {
        const minhaSubtracao = calc.subtrair(5, 2);
        expect(minhaSubtracao).toBe(3);
    });

    test("Multiplicação de 4 * 3 deve ser igual a 12", () => {
        const minhaMultiplicacao = calc.multiplicar(4, 3);
        expect(minhaMultiplicacao).toBe(12);
    });

    test("Divisão de 10 / 2 deve ser igual a 5", () => {
        const minhaDivisao = calc.dividir(10, 2);
        expect(minhaDivisao).toBeLessThan(5.1);
    });
});
