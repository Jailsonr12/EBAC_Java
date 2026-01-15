const minhaFuncao = () => "Diz olá";

const retornUmCarro = () => ({
    modelo: "Ka",
    fabricante: "Ford"
})

console.log(minhaFuncao())
console.log(retornUmCarro())

const carro = {
    velocidade: 40,
    acelerar : function(){
        console.log(this.velocidade)
        this.velocidade += 10;
    },
    frear:function(){
        console.log(this.velocidade)
        this.velocidade -= 10;
    }
}

carro.acelerar();
carro.frear();

console.log(carro.velocidade)
