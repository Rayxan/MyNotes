var minhaPromise = function(){
    return new Promise(function(resolve, reject){ // resolve(sucesso) reject(não sucesso)
        var xhr = new XMLHttpRequest();
        xhr.open('GET','https://api.github.com/users/Rayxan');
        xhr.send(null);

        xhr.onreadystatechange = function(){
            if(xhr.readyState === 4){
                if(xhr.status === 200){
                    resolve(JSON.parse(xhr.responseText));
                }else{
                    reject('Erro na requisição');
                }
            }
        }
    });
}

minhaPromise()
    .then(function(response){
       console.log(response); 
    })
    .catch(function(error){
        console.warn(error);
    });

//Promises são códigos/funções que não vão influenciar na linha do tempo do
//nosso código Javascript, elas só vão devolver o valor de resultado ou erro só
//depois de um tempo.