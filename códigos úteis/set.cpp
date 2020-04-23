/*set é uma estrutura de dados que te permite armazenar 
valores não duplicados independente da ordem de inserção 
que foi feita.
>>>>>>>>GERALMENTE USADO PRA ENCONTRAR UM CPF NO MEIO DE OUTROS<<<<<<<<<<<
*/
#include<bits/stdc++.h>
using namespace std;
int main(){
    set <int> s;
    s.insert(10);
    s.insert(20);
    s.insert(30);
    s.insert(30);
    s.insert(50);
    s.insert(80);
    s.insert(50);

    set<int>::iterator i = s.begin();

    for(; i != s.end(); i++){
        cout<<*i<<endl; //é usado como ponteiro aqui, pois o iterator é um ponteiro
    }

    return 0;
}
