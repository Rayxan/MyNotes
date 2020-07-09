#include<bits/stdc++.h>
using namespace std;
int main(){
    string s;

    cin.ignore();
    getline(cin,s);

    cout<<s;

    return 0;
}
/*
A função std::getline() é capaz de ler o dado de entrada
 até que uma nova linha seja detectada enquanto
  std::ignore() limpa o caracter de nova linha \n do buffer
   de entrada std::cin.
*/
