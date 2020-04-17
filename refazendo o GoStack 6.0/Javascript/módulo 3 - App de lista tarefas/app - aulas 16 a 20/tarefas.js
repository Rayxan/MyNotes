var listElement = document.querySelector('#app ul');
var inputElement = document.querySelector('#app input');
var buttonElement = document.querySelector('#app button');

var tarefas = JSON.parse(localStorage.getItem('list_tarefas')) || []; //JSON.parse faz o processo inverso ao JSON.stringify
                                                                      //O [] é pra quando o vetor iniciar o array com vazio

function renderTarefas(){ //renderiza as tarefas na tela
    listElement.innerHTML = ''; //remove todo o conteúdo dentro da ul
    
    for(tarefa of tarefas){ //lista os elementos dos vetor
        var tarefaElement = document.createElement('li');
        var tarefaText = document.createTextNode(tarefa);

        var linkElement = document.createElement('a');
        linkElement.setAttribute('href', '#'); //fazer o Excluir ficar azul

        var pos = tarefas.indexOf(tarefa); //pos recebe a posição da tarefa
        linkElement.setAttribute('onclick', 'deleteTarefa('+ pos +')') //se cliclar em Excluir, passa a posição da tarefa

        var linkText = document.createTextNode(' <Excluir>');

        linkElement.appendChild(linkText);

        tarefaElement.appendChild(tarefaText);
        tarefaElement.appendChild(linkElement);
        
        listElement.appendChild(tarefaElement); //coloca as tarefas na lista
    }
}

renderTarefas();

function addTarefa(){
    var tarefaText = inputElement.value;

    tarefas.push(tarefaText); //adicionar uma tarefa ao vetor
    inputElement.value = '';
    renderTarefas();

    saveToStorage()
}

buttonElement.onclick = addTarefa;

function deleteTarefa(pos){
    tarefas.splice(pos,1); //remove 1 item de acordo com a posição passada
    renderTarefas();

    saveToStorage()
}

function saveToStorage(){
    localStorage.setItem('list_tarefas', JSON.stringify(tarefas)); //locasStorage é uma variável global
}

//JSON (Javascript Object Notation) - Tem uma estrutura parecida com a de um objeto no Javascript,
//porém ele é uma string.

//stringify transforma um vetor em uma string