function Conta(numero, tipo, saldo, titular){
    this.numero = numero,
    this.tipo = tipo,
    this.saldo = saldo,
    this.titular = titular
}

let contas = [];

contas.push( new Conta(5486273622, "Conta Corrente", 27771, "Abigael Natte"))
contas.push( new Conta(1183971869, "Conta Poupança", 8675, "Ramon Connell"))
contas.push( new Conta(9582019689, "Conta Poupança", 27363, "Jarret Lafuente"))
contas.push( new Conta(1761924656, "Conta Poupança", 32415, "Ansel Ardley"))
contas.push( new Conta(7401971607, "Conta Poupança", 18789, "Jacki Shurmer"))
contas.push( new Conta(630841470, "Conta Corrente", 28776, "Jobi Mawtus"))
contas.push( new Conta(4223508636, "Conta Corrente", 2177, "Thomasin Latour"))
contas.push( new Conta(185979521, "Conta Poupança", 25994, "Lonnie Verheijden"))
contas.push( new Conta(3151956165, "Conta Corrente", 7601, "Alonso Wannan"))
contas.push( new Conta(2138105881, "Conta Poupança", 33196, "Bendite Huggett"))

console.log(contas)