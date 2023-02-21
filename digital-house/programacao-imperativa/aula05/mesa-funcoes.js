//item 1
function polParaCm(polegadas) {
    return polegadas * 2.54
}

console.log(polParaCm(6));

//item 2
function criaUrl(dominio) {
    return `http://www.${dominio}.com.br`
}

console.log(criaUrl("osmarfranco"));

//item 3
function interjeicao(frase){
    return frase + "!"
}

console.log(interjeicao("Égua"));

//item 4
function idadeDoCachorro(idade){
    return idade * 7
}

console.log(`Meu cão tem ${idadeDoCachorro(3)} anos.`);

//item 5
function valorHoraTrabalho(salario){
    return salario/160
}

console.log(`O Valor da minha hora de trabalho é ${valorHoraTrabalho(3000)}.`);

//item 6
function calculaImc(peso,altura){
    let alt = altura/100;
    return (peso/(alt*alt)).toFixed(2);
}

console.log(`Seu IMC é ${calculaImc(90,177)}.`);

//item 7
function caixaAlta(frase){
    return frase.toUpperCase()
}

console.log(caixaAlta("abra logo essa porta!"));

//item 8
function tipoDado(parametro){
    return typeof parametro
}

console.log(tipoDado(200));
console.log(tipoDado("200"));
console.log(tipoDado(true));
console.log(tipoDado(200.01));
console.log(tipoDado(null));
console.log(tipoDado());

//item 9
function calculaCircunferencia(raio){
    let circ = 2 * Math.PI * raio;
    return circ.toFixed(1)
}

console.log(`De acordo com o raio fornecido, a circunferência é ${calculaCircunferencia(6)}.`);
