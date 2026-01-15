function somar(a, b) {
    let soma = 0;

    for (let i = 0; i < arguments.length; i++) {
        soma += arguments[i]
    }

    return soma;
}


console.log(somar(10, 20))

function somarComRest(...numero) {
    const soma = numero.reduce((total, numeroatual) => {
        total += numeroatual;
        return total
    }, 0)
    return soma;
}

console.log(somarComRest(10, 20, 30, 40))

const numeros = [1, 2, 3, 4, 5]
console.log(...numeros);

const timeDeFutebolDeSp = ["Santos", "Palmeras", "São Paulo", "Bragantino"]
const timeDeFutebolDeRJ = ["Vasco", "Botafogo", "Flamengo", "Fluminense"]

const timeDeFutebol = [...timeDeFutebolDeRJ, ...timeDeFutebolDeSp]

console.log(...timeDeFutebol.sort())

const CarroDaJulia ={
    modelo: 'gol',
    marca: 'vw',
    motor: 1.6
}

const CarroDaAna={
    ...CarroDaJulia,
    motor: 1.8
}

console.log(CarroDaJulia)
console.log(CarroDaAna)


//desestruturação

const motorAna = CarroDaAna.motor;

const {motor: motorDoCarroDaAna} = CarroDaAna
const {motor: motorDoCarroDaJulia } = CarroDaJulia

console.log(motorDoCarroDaAna)
console.log(motorDoCarroDaJulia)

const [ item1, item2, item3, ...resto] = timeDeFutebol

console.log(item1)
console.log(item1)
console.log(item3)
console.log(resto)
