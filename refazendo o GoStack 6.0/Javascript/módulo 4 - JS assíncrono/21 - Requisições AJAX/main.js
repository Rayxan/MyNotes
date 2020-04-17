var xhr = new XMLHttpRequest(); //nos dá acesso a funcionalidade do Ajax para recuperarmos informações de um servidor

xhr.open('GET', 'https://api.github.com/users/Rayxan'); // método GET é utilizado para buscar uma informação
xhr.send(null);

xhr.onreadystatechange = function(){
    if(xhr.readyState === 4){ //variável que significa que a resposta retornou
        console.log(JSON.parse(xhr.responseText)); //transforma a string em vetor
    }
}