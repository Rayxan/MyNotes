//é possível criar funções utilizando const, porém não é recomendado
//nos exemplos abaixo eu só utilizei const no lugar de function pra exemplificar que é possível 

const arr=[1, 3, 5, 4, 6];

const teste = () =>{
    return 'teste';
}
console.log(teste());
//-------------------------------
const teste2 = () =>{
    return 3;
}
console.log(teste2());
//-------------------------------
const teste3 = () => [1,2,3,4];
console.log(teste3());
//-------------------------------
const teste4 = () => { nome: 'Raylan'}; // não vai funcionar pois a chave aqui é usada pro corpo da função e não conta como se tivesse sendo utilizada para o objeto
console.log(teste4());
//-------------------------------
//Exemplo de cima, mas dessa vez funcionando
const teste5 = () => ({nome: 'Raylan'}); // para resolver o problema acima, é só adicionar parênteses ao obejto
console.log(teste5());
