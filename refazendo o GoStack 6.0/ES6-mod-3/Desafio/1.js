
//A

const delay = () => new Promise(resolve => setTimeout(resolve, 1000));

async function umPorSegundo(){
    await delay();
    console.log("1s");

    await delay();
    console.log("2s");

    await delay();
    console.log("3s");
}

umPorSegundo();

//B

import axios from "axios";

async function getUserFromGithub(user){
    try{
        const response  = await axios.get(`https://api.github.com/users/${user}`);

        console.log(response.data);
    }catch(err){
        console.log("Usuário não existe!");
    }
}

getUserFromGithub("rayxan");
getUserFromGithub("rayxan1723127312887");

//C

class Github{
    static async getRepositories(repo){
        try{
            const response = await axios.get(`https://api.github.com/repos/${repo}`);

            console.log(response.data);
        }catch(err){
            console.log("Repositório não existe");
        }
    }
}

Github.getRepositories("rayxan/forca");
Github.getRepositories("rayxan/forca256325");

//D

const buscaUsuario = async usuario =>{
    try{
        const response = await axios.get(`https://api.github.com/users/${usuario}`);

        console.log(response.data);
    }catch(err){
        console.log("Usuário não existe!!!");
    }
};

buscaUsuario("diego3g");

//Lembrar de quando for testar, executar uma letra e comentar as outras
