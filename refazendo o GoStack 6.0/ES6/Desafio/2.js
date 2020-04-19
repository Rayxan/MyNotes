//Questão 2
const usuarios = [
    {nome: 'Diego', idade: 23, empresa: 'Rocketseat'},
    {nome: 'Gabriel', idade: 15, empresa: 'Rocketseat'},
    {nome: 'Jesus', idade: 30, empresa: 'Céu'},
];

//2.1
const idades = usuarios.map(usuario => usuario.idade);
console.log(idades);
console.log("\n");

//2.2
const rocketseat18 = usuarios.filter(
    usuario => usuario.empresa === "Rocketseat" && usuario.idade >= 18
);
console.log(rocketseat18);
console.log("\n");

//2.3
const amazon = usuarios.find(
    usuario => usuarios.empresa === "Amazon"
);
console.log(amazon);
console.log("\n");  

//2.4
const dobro = usuarios
    .map(usuario => ({...usuario, idade: usuario.idade * 2})) // O SPREAD está sendo usado aqui pra pegar todos os valores dos objetos
    .filter(usuario => usuario.idade <= 50);                  // em cada posição no vetor e substituir a idade por idade*2

console.log(dobro);
