import { alunos } from "./arrays.js";

export const filtrarAlunosAprovados = (listaAlunos) =>
    listaAlunos.filter(aluno => aluno.nota >= 6);
