// CALCULADORA NÍVEL I
//item 2
function adicao(x,y){
    return x + y
}

//item 3
function subtracao(x,y){
    return x - y
}

//item 4
function multiplicacao(x,y){
    return x * y
}

//item 5
function divisao(x,y){
    return x / y
}

// CALCULADORA NÍVEL II
//item 1
console.log("------- TESTANDO CALCULADORA -------")

//item 2
console.log(adicao(4,7));
console.log(subtracao(12,5));

//item 3
console.log(multiplicacao(9,4));

//item 4
console.log(divisao(30,6));

//item 5
console.log(divisao(42,0));

// CALCULADORA NÍVEL III
//item 1
function quadradoDoNumero(x){
    return multiplicacao(x,x)
}

//item 2
function mediaDeTresNumeros(x,y,z){
    return divisao(adicao(adicao(x,y),z), 3)
}

//item 3
function calculaPorcentagem(total,porcentagemDesejada){
    return multiplicacao(total,divisao(porcentagemDesejada,100))
}

//item 4
function geradorDePorcentagem(x,y){
    return divisao(multiplicacao(x,100),y)
}