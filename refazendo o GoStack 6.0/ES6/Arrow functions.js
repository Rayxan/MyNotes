const arr = [1,3,4,5,6];

//Função que retorna o dobro de todos os itens sem arrow funct
const newArr = arr.map(function(item){
    return item * 2;
});
console.log("Sem arrow funct: " + newArr);
//------------------------------------------------------------------------------------------------
// Mesma função que retorna o dobro de todos os itens, agora com arrow funct
const newArr2 = arr.map((item)=>{ 
    return item *2; 
});
console.log("Com arrow funct: " + newArr2);
//------------------------------------------------------------------------------------------------
//Mesma função, agora retirando o parênteses do parâmetro item
const newArr3 = arr.map(item =>{// obs = quando é passado só um parâmetro, pode-se tirar os pa  rênteses em volta do item
    return item*2;
});
console.log("Com arrow funct: " + newArr3);
//------------------------------------------------------------------------------------------------
//Mesma função, agora retirando os parênteses do parâmetro e resuzindo a função pra 1 linha
const newArr4 = arr.map(item => item*2);

console.log("Com arrow funct: " + newArr4);
