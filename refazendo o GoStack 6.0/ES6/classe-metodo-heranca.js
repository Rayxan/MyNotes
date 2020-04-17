//Aplicando conceitos de classe,método,método construtor e herança, 
class List{
    constructor(){
        this.data = [];
    }
    add(data){
        this.data.push(data);
        console.log(this.data);
    }
}

class TodoList extends List{
    constructor(){
        super();

        this.usuario = 'Raylan';
    }

    mostraUsuario(){
        console.log(this.usuario);
    }
}

const MinhaLista = new TodoList();

document.getElementById('novotodo').onclick = function(){ //esse 'novotodo' era o id do button
    MinhaLista.add('Novo todo');
}

MinhaLista.mostraUsuario(); 

