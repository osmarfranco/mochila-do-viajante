// Função construtora de alunos
function Aluno(nome, quantidadeFaltas, nota1, nota2, nota3, nota4) {
    this.nome = nome;
    this.quantidadeFaltas = quantidadeFaltas;
    this.notas = [nota1, nota2, nota3, nota4];
}

// Base inicial de alunos
const aluno1 = new Aluno("Jonas", 4, 6, 4, 5, 7);
const aluno2 = new Aluno("Luciana", 2, 7, 8, 10, 9);
const aluno3 = new Aluno("Dalva", 1, 9, 8, 6, 7);
const aluno4 = new Aluno("Rogério", 0, 5.5, 8, 7.5, 6.5);
const aluno5 = new Aluno("Osvaldo", 1, 4.5, 7, 8.5, 8);
const aluno6 = new Aluno("Ademar", 3, 3.5, 6, 8, 9);
const aluno7 = new Aluno("Bruno", 0, 8, 9, 8.5, 9.5);
const aluno8 = new Aluno("Albertina", 0, 7.5, 7, 8, 8);
const aluno9 = new Aluno("Mara", 1, 9.5, 8, 5.5, 8);

//exportar o construtor e a base
module.exports = {
    novoAluno:function(nome, quantidadeFaltas, nota1, nota2, nota3, nota4){
        let aluno = new Aluno(nome, quantidadeFaltas, nota1, nota2, nota3, nota4);
        return aluno;
    },
    alunos:[aluno1, aluno2, aluno3, aluno4, aluno5, aluno6, aluno7, aluno8, aluno9],
    calcularMedia:function(listaAlunos, aluno){
        let notas = listaAlunos[aluno].notas;
        let soma = 0;
        for (nota of notas) {
            soma += nota;
        }
        return soma/notas.length
    },
    faltas:function(listaAlunos, aluno){
        listaAlunos[aluno].quantidadeFaltas = listaAlunos[aluno].quantidadeFaltas + 1;
    }
};
