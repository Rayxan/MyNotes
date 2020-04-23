//4.1 Desestruturação

const empresa = {
    nome: "Rocketseat",
    endereco: {
        cidade: "Rio do Sul",
        estado: "SC"
    }
};

const{
    nome,
    endereco: {cidade, estado}
} = empresa;

console.log(nome);
console.log(cidade);
console.log(estado);
console.log("\n");

//4.2 sem desestruturação
function mostraInfo(usuario){
    return `${usuario.nome} tem ${usuario.idade} anos.`;
}
console.log(mostraInfo({nome: 'Diego', idade: 23}));
console.log("\n");

//4.2 com desestruturação
function mostraInfo2({nome, idade}){
    return `${nome} tem ${idade} anos.`;
}
console.log(mostraInfo2({nome: "Diego", idade: 23}));
