//Desestruturação
const usuario = {
    nome: 'Raylan',
    idade: 19,
    endereco:{
        cidade: 'Ceilândia',
        estado: 'DF,'
    },
};
const{nome, idade, endereco:{cidade}} = usuario;
console.log("\n" + nome);
console.log(idade);
console.log(cidade);
//-----------------------------------------
//outra forma
function mostraNome({nome, idade}){
    console.log(nome, idade);
}
mostraNome(usuario);
