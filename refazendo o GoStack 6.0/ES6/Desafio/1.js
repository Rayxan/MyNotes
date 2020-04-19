//Questão 1
class Usuario{
    constructor(email, senha){
        this.email = email;
        this.senha = senha;
    }

    isAdmin(){
        return this.admin === true; //vai verificar e retornar true se true === true, e false se false === true
    }
}

class Admin extends Usuario{
    constructor(email,senha){
        super(email,senha);

        this.admin = true;
    }
}


const User1 = new Usuario('emailUsuario@gmai.com', 'senha123');
const Admin1 = new Admin('emailUsuario@gmai.com', 'senha123');

console.log(User1.isAdmin());
console.log(Admin1.isAdmin());

