
//5.1 A
const arr = [1,2,3,4,5,6];

const [x, ...y] = arr;

console.log(x);
console.log(y);
console.log("\n");

//5.1 B
function soma(...nums){
    return nums.reduce((a, b) => a+b);//serve para iterar sobre um array e utilizar o valor de cada item para 
    //criar um objeto final com base em alguma regra
}

console.log(soma(1,2,3,4,5,6));
console.log(soma(1,2));
console.log("\n");

//5.2

const usuario ={
    nome: "Diego",
    idade: 23,
    endereco: {
        cidade: "Rio do Sul",
        uf: "SC",
        pais: "Brasil"
    }
};

const usuario2 = { ...usuario, nome: "Gabriel"};
const usuario3 = {
    ...usuario,
    endereco: {...usuario.endereco, cidade: "Lontras"}
};

console.log(usuario2);
console.log(usuario3);

/*
OBS:
Lembrar que o REST pega todo o resto que não foi utilizado em outra variável,
já o SPREAS pega o vetor todo (SPREAD é usado pra mudar algum valor de variável no vetor)
*/
