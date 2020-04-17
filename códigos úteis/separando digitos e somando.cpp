//Esse programa soma os digitos de um numero ex: (12) = 1 + 2 = 3
#include<bits/stdc++.h>
using namespace std;

int digits_sum(int N)
{
	int sum = 0;
	
	while  (N > 0)
	{
		int d = N % 10;
		N /= 10;
		
		sum += d;
	}
	
	return sum;
}

int main(){
    int n;
    cin>>n;
    cout<<digits_sum(n);
    return 0;
}
//explicação do professor: 
/*
você pode fazer um laço
e tirar um dígito por vez
com o operador %
e atualizar o número dividindo-o por dez

você vai extrair sempre as unidades do número que resta
*/

