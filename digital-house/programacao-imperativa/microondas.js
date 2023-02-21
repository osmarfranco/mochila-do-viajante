function preparar (comida, tempo) {
    let tempoPadrao = 0;

    switch (comida) {
        case 1:
            console.log("pipoca");
            tempoPadrao = 10;
            break;
        case 2:
            console.log("macarrão");
            tempoPadrao = 8;
            break;
        case 3:
            console.log("carne");
            tempoPadrao = 15;
            break;
        case 4:
            console.log("feijão");
            tempoPadrao = 12;
            break;
        case 5:
            console.log("brigadeiro");
            tempoPadrao = 8;
            break;
        default:
            console.log("prato inexistente");
            tempoPadrao = false;
            break;

    }

    tempo < tempoPadrao ? console.log("tempo insuficiente")
    : tempo == tempoPadrao || tempo < (tempoPadrao * 2) ? true // sem anormalidades a serem exibidas
    : tempo >= (tempoPadrao * 2) && tempo < (tempoPadrao * 3) ? console.log("seu prato queimou!")
    : tempo >= (tempoPadrao * 3) && tempoPadrao != 0 ? console.log("KABUM")
    : tempo = tempoPadrao; // se não definir tempo, o tempo padrão será executado 

    // Não exibir a mensagem final da tarefa caso os parâmetros forem inexistentes ou insuficientes
    if (tempo < tempoPadrao) {
        return;
    } else if (tempoPadrao === false) {
        return;
    } else {
        console.log("prato pronto, bom apetite!")
    }
}

// Escolha a comida digitando alguma das opções ao lado

let botao = 1; // 1- pipoca, 2- macarrão, 3- carne, 4- feijão, 5- brigadeiro
let segundos; // escolha por quanto tempo quer cozinhar

preparar(botao, segundos);
