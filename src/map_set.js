let meuMap = new Map();
meuMap.set("nome", "Jailson");
meuMap.set("stack", "html, css, js")

console.log(meuMap);

const nome = meuMap.get("nome")

console.log(nome)

const quantidade = meuMap.size;

console.log(quantidade)

console.log(meuMap.has("sobrenome"))


for (let chave of meuMap.keys()) {
    console.log(chave)
}

for (let valor of meuMap.values()) {
    console.log(valor)
}

for (let [chave, valor] of meuMap.entries()) {
    console.log(`${chave}: ${valor}`)
}

meuMap.delete("stack")

console.log(meuMap)
///////

const cpfs = new Set()

cpfs.add("01234567890")
cpfs.add("06843201564")
cpfs.add("21265465123")


console.log(cpfs)

console.log(cpfs.keys())
console.log(cpfs.values())

cpfs.forEach((valor) => console.log(valor))

const arrayNome = ['Suyanne Candido', 'Jailson Roth', 'Lucas Silva', 'Maria ribeiro', 'Suyanne Candido', 'Jailson Roth', 'Lucas Silva', 'Maria ribeiro']

const arrayComoSet = new Set([...arrayNome])

const arraySemItenDuplicado = [...arrayComoSet]


console.log(arrayComoSet)

console.log(arraySemItenDuplicado)