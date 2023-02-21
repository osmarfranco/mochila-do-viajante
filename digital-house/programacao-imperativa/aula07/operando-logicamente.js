// Ex1
console.log(!true)
console.log(!false)
console.log(!!false)
console.log(!!true)
console.log(!true)
console.log(!1)
console.log(!!1)
console.log(!0)
console.log(!!0)
console.log(!"")
console.log(!!"")

let x = 5;
let y = 9;

console.log("a. " + (x < 10 && x !== 5))
console.log("b. " + (x > 9 || x === 5))
console.log("c. " + (!(x===y)))

// Ex2
let a = 10;
let b = "a";
console.log("1. " + (b === "b" || a >= 10))

let c = 3;
let d = 8;
console.log("2. " + ((c == "3" || c === d) && !(d !== 8 && c <= d)))

let str = "";
let msg = "haha!"
let eBonito = "false"
console.log("3. " + (!((str || msg) && eBonito)))

