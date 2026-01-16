export function multiplicar(a: number, b: number): number {
    return a * b;
}

export function saudacao(nome: string): string {
    return `Olá ${nome}`;
}

console.log(multiplicar(3, 4)); // 12
console.log(saudacao("Jailson")); // Olá Jailson
