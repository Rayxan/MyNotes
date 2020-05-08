//Async await inviabiliza o uso de promises sem o .then e o .catch
const minhaPromise = () => new Promise((resolve, reject) => {
    setTimeout(() => { resolve('OK') }, 2000);
});

//Sem arrow funct
async function executaPromise(){
        console.log(await minhaPromise()); //só executa a próxima linha depois que essa linha é executada
        console.log(await minhaPromise());
        console.log(await minhaPromise());
}

//Com arrow funct
const executaPromise2 = async () => {
    console.log(await minhaPromise()); //só executa a próxima linha depois que essa linha é executada
    console.log(await minhaPromise());
    console.log(await minhaPromise());
};

executaPromise();
executaPromise2();
