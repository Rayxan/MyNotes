const arr = [1,3,4,5,8,9];

// a função map vai percorrer o vetor e executa uma ação para todos os itens do array
const newArr = arr.map(function(item, index){
    return item + index;
});

//console.log(newArr);

//------------------------------------------------------------------------------------------

//a função reduce é uma função que vai percorrer todo o vetor e transformar em uma única variável
const sum = arr.reduce(function(total,next){
    return total + next;
});

//console.log(sum);

//------------------------------------------------------------------------------------------

//a função filter sempre retorna true ou false de acordo com a filtragem
const filter = arr.filter(function(item){
    return item % 2 === 0;  
});

//console.log(filter);

//------------------------------------------------------------------------------------------

//a função find percorre todos o vetor pra encontrar a informação requerida, retornando true ou false
const find = arr.find(function(item){
    return item === 2;
});

console.log(find); // irá retornar undefined pois o 2 não está no array
