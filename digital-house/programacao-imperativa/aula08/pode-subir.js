// function podeSubir(altura, temAcompanhante) {
//     if (altura >= 1.4 && altura < 2) {
//         return "Acesso autorizado";
//     } else if (altura < 1.4 && altura >= 1.2 && temAcompanhante == true) {
//         return "Acesso autorizado somente com acompanhante";
//     } else {
//         return "Acesso negado";
//     }
// }

// Deixando o código mais limpo
function podeSubir2(altura, temAcompanhante){
    altura >= 1.4 && altura < 2 ? console.log("Acesso autorizado")
    : altura < 1.4 && altura >= 1.2 && temAcompanhante == true ? console.log("Acesso autorizado somente com acompanhante")
    : console.log("Acesso negado")
}

// ZONA DE TESTES
let altura = 1;
let temAcompanhante = true;

// console.log(podeSubir(altura, temAcompanhante))
podeSubir2(altura, temAcompanhante)