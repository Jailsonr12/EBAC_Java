class Pessoa {
    constructor(nome, idade) {
       this.nome = nome;
       this.idade = idade;
    }
 
    apresentar() {
       return `Olá, meu nome é ${this.nome} e tenho ${this.idade} anos.`;
    }
 }
 
 class Aluno extends Pessoa {
    constructor(nome, idade, curso) {
       super(nome, idade);
       this.curso = curso;
    }
 
    apresentar() {
       return `Sou o aluno ${this.nome}, tenho ${this.idade} anos e curso ${this.curso}.`;
    }
 }
 
 class Professor extends Pessoa {
    constructor(nome, idade, disciplina) {
       super(nome, idade);
       this.disciplina = disciplina;
    }
 
    apresentar() {
       return `Sou o professor ${this.nome} e leciono ${this.disciplina}.`;
    }
 }
 
 const pessoa = new Pessoa("Carlos", 45);
 const aluno = new Aluno("Ana", 21, "Sistemas de Informação");
 const professor = new Professor("João", 50, "Programação");
 
 console.log(pessoa.apresentar());
 console.log(aluno.apresentar());
 console.log(professor.apresentar());
 