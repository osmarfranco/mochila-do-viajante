// importar módulo alunos
const moduloAlunos = require('./alunos');
let novoAluno = moduloAlunos.novoAluno;
let calcularMedia = moduloAlunos.calcularMedia;
let adicionarFalta = moduloAlunos.faltas;
let alunos = moduloAlunos.alunos;

// teste de inclusão de novo aluno na base
// alunos.push(novoAluno("Edson", 1, 6, 8, 9, 7));
// console.log(alunos);

// criação do curso
let curso = {
    nomeDoCurso: "Física",
    notaDeAprovacao: 7,
    faltasMaximas: 3,
    listaDeEstudantes: alunos,
    calcularMedia,
    adicionarFalta,
    adicionarAluno:function(nome, quantidadeFaltas, nota1, nota2, nota3, nota4) {
        let alunoNovo = novoAluno(nome, quantidadeFaltas, nota1, nota2, nota3, nota4);
        this.listaDeEstudantes.push(alunoNovo);
    },
    aprovado:function(numAluno){
        let media = calcularMedia(this.listaDeEstudantes, numAluno);
        let faltas = this.listaDeEstudantes[numAluno].quantidadeFaltas;
        let foiAprovado = 0;
        if (media >= this.notaDeAprovacao && faltas < this.faltasMaximas) {
            foiAprovado = true;
        } else if (faltas == this.faltasMaximas && media >= (this.notaDeAprovacao * 1.1)){
            foiAprovado = true;
        } else {
            foiAprovado = false;
        }
        return foiAprovado;  
    },
    listaDeClassificacao:function(){
        let lista = [];
        let situacao = 0;
        for (let i = 0; i < this.listaDeEstudantes.length; i++) {
            situacao = curso.aprovado(i);
            lista.push(situacao);
        }
        return lista;
    }
}

// teste de adição de aluno
// curso.adicionarAluno("Gilmar", 2, 7, 8, 6, 6);
// console.log(curso.listaDeEstudantes);

// teste de adição de falta
// adicionarFalta(curso.listaDeEstudantes, 0) // 5 faltas
// console.log(curso.listaDeEstudantes[0])

// teste de checagem de aprovação do aluno
// console.log(curso.aprovado(0)); // false
// console.log(curso.aprovado(2)); // true

// teste de geração da lista de classificação
// console.log(curso.listaDeClassificacao());
