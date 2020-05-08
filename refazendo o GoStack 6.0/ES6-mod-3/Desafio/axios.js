/* axios é uma biblioteca que nos da acesso a uma API para podermos trabalhar com
requisições assíncronas (protocolos http, servidores backend e etc)*/

import axios from 'axios';

class Api{
    static async getUserInfo(username){
        try{
            const response = await axios.get(`https://api.github.com/users/${username}`);
            console.log(response);
        }catch(err){
            console.warn("Erro na API");
        }
    }
}

Api.getUserInfo('rayxan');
Api.getUserInfo('rayxan546644465465645654');
