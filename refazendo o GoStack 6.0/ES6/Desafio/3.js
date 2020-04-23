//3.1 sem arrow function
const arr = [1, 2, 3, 4, 5];

var soma10 = arr.map(function(item){
    return item + 10;
});

console.log(soma10);

//3.1 com arrow function
const soma10A = arr.map(item => item + 10);

console.log(soma10A);
console.log("\n");
//---------------------------------------------------------------------
//3.2 sem arrow function
const usuario = {nome: 'Diego', idade: 23};

function mostraIdade(usuario){
    return usuario.idade;
}

console.log(mostraIdade(usuario));

//3.2 com arrow function
const mostraIdade2 = usuario => usuario.idade;

console.log(mostraIdade2(usuario));
console.log("\n");
//---------------------------------------------------------------------
//3.3 sem arrow function
const nome = "Diego";
const idade = 23;

function mostraUsuario(nome = 'Diego', idade = 18){
    return {nome, idade};
}

console.log(mostraUsuario(nome, idade));
console.log(nome);

//3.3 com arrow function
const mostraUsuario2 = (nome = "Diego", idade = 18) => ({nome, idade});

console.log(mostraUsuario2(nome, idade));
console.log(nome);

//---------------------------------------------------------------------

//agora sem console.log
//3.4 sem arrow function
const promise = function(){
    return new Promise(function(resolve, reject){

    return resolve();
    });
}
//3.4 com arrow function
const promise2 = () => new Promise((resolve, reject) => resolve());
