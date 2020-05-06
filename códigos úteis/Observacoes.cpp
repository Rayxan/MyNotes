#include<ncurses> // biblioteca pra manipular cor de letras e etc

#include<ctype.h> // contém funções e macros para manipulação de caracteres.
//Utilizando as funções desta biblioteca podemos verificar se um caracter é númerico,
//ou se é maiúsculo, minúsculo, representa espaço em branco etc.

typedef enum { STARTING, RUNNING, WAITING, VICTORY, GAME_OVER } Status;
//enum é um tipo de dado que permite escrever constantes que irão ser associadas a numeros inteiros
//se não for especificado um número, começa em 0
