//uri questão 1094 iniciante

#include<bits/stdc++.h>
using namespace std;

int main(){
    int n;
    double c=0,r=0,s=0;
    string a,b;

    cin>>n;

    for(int i=0;i<n;i++){
        cin>>a>>b;

        if(b=="C")
            c += stoi(a);
        else if(b=="R")
            r += stoi(a);
        else if(b=="S")
            s += stoi(a);
    }
    
    cout<<fixed<<setprecision(0);
    cout<<"Total: "<<(c+r+s)<<" cobaias"<<endl;
    cout<<"Total de coelhos: "<<c<<endl;
    cout<<"Total de ratos: "<<r<<endl;
    cout<<"Total de sapos: "<<s<<endl;

    cout<<fixed<<setprecision(2);
    cout<<"Percentual de coelhos: "<<((c*100)/(c+r+s))<<" %"<<endl;
    cout<<"Percentual de ratos: "<<((r*100)/(c+r+s))<<" %"<<endl;
    cout<<"Percentual de sapos: "<<((s*100)/(c+r+s))<<" %"<<endl;

    return 0;
}
/*
Como saber a porcentagem em algo dentro de um valor:
Exemplo:

total = 92;
quantidade a ser analisada = 29;

quant * 100 = 2900;
2900/total = 31,52;

Ou seja, 29 dentro de 92 é 31,52% de 92;
*/
/*
TESTE
10
10 C
6 R
15 S
5 C
14 R
9 C
6 R
8 S
5 C
14 R
*/
