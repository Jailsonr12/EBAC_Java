function funcaoMuitoPesada() {
    let execucoes = 0;

    for (let i = 0; i < 10000000000; i++) {
        execucoes++;
    }

    return execucoes;
}

const funcaoMuitoPessadaPromise = new Promise((resolve, reject) => {

    try {
        let execucoes = 0;

        for (let i = 0; i < 1000000000; i++) {
            execucoes++;
        }
        resolve(execucoes)
        return execucoes;
    } catch (e) {
        reject("Deu erro na iteração do numeros")
    }

})

async function execucaoPrincipal() {
    console.log("Inicio")
    await funcaoMuitoPessadaPromise.then(resultado => console.log(resultado)).catch(error => console.log(error))
    console.log("FIm")

}

execucaoPrincipal()