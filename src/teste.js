import { alunos } from "./arrays.js";
import { filtrarAlunosAprovados } from "./rest_spread.js";

const alunosAprovados = filtrarAlunosAprovados(alunos);

console.log("Alunos aprovados:");
console.log(alunosAprovados);
