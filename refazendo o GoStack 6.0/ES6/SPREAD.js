//SPREAD

const arr1 = [1, 2, 3];
const arr2 = [4, 5, 6];

const arr3 = [...arr1, ...arr2];

console.log(arr3 + "\n");
//--------------------------------------
//Outro exemplo de SPREAD
const usuario = {
    nome: 'Raylan',
    idade: 19,
    empresa: 'Topster',
};

const usuario2 = {...usuario, nome: 'Jojo'};

console.log(usuario2);
