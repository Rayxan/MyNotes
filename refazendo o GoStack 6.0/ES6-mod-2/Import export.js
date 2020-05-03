//no arquivo funcoes.js
export function soma(a,b){
    return a+b;
}

export function sub(a,b){
    return a-b;
}

//no arquivo main.js

import {soma,sub} from './funcoes';   //É chamada assim quando a função não é default

console.log(soma(1,2));
console.log(sub(4,10));

//------------------------------------------------------------
//arquivo soma.js

export default function soma(a,b){
    return a+b;
}

//no arquivo main.js

import soma from './soma';    //É chamada assim quando a função é default

console.log(soma(1,2));

//--------------------------------------------------------------
//arquivo funcoes.js
export function soma(a,b){
    return a+b;
}

//arquivo main.js
import {soma as somaFunction} from './funcoes'; // ou seja, dá pra trocar o nome original da função importada

console.log(somaFunction(1,2));

//--------------------------------------------------------------
//arquivo funcoes.js

export default function soma(a,b){
    return a+b;
}

export function sub(a,b){
    return a-b;
}

//arquivo main.js

import soma, { sub } from './funcoes';

console.log(soma(1, 2));
console.log(sub(10, 5));

//--------------------------------------------------------------
//arquivo funcoes.js

export  function soma(a,b){
    return a+b;
}

export function sub(a,b){
    return a-b;
}

export  function mult(a,b){
    return a*b;
}

//arquivo main.js

import * as funcoes from './funcoes';

console.log(funcoes.soma(1, 2));
console.log(funcoes.sub(10, 5));
console.log(funcoes.mult(10, 5));
