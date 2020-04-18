//REST

const usuario = {
    nome: 'Raylan',
    idade: 19,
    empresa: 'Topster'
};

const {nome, ...resto} = usuario;   //usando desestruturação
console.log(nome);
console.log (resto);

//Outro uso do REST
const arr = [1, 2, 3, 4];

const [a, b, ...c] = arr;   //usando desestruturação

console.log("\n");
console.log(a);
console.log(b);
console.log(c);
console.log("\n");

//Outro uso REST
function soma(...params){
    return params;
}
console.log(soma(1, 2, 3, 4));
console.log("\n");

//Outro uso de Rest
function soma2(...params){
    return params.reduce((total,next) => total + next);
}
console.log(soma2(1, 30, 20 ,10));
