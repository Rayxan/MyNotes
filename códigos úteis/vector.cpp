#include<bits/stdc++.h>
using namespace std;
int main(){
    vector<int> n;
    n.push_back(1);// inserir elementos em um vector 
    n.push_back(2);
    n.push_back(3);
    
    int tamanho = n.size();
    cout<<tamanho<<endl;
    cout<<n[1]<<endl;

    //Crie um vetor de inteiros com 10 posições, cujos elementos tem valor 1.
    vector<int> v(10,1);
    cout<<endl<<v[1]<<endl;
    cout<<v[3]<<endl;

    //begin() e end()
    vector<int> vtor;
    vtor.push_back(50);
    vtor.push_back(100);
    vtor.push_back(200);
    
    vector<int>::iterator i  = vtor.begin(); //i aponta para v[0];
    cout<<endl<<*i<<endl;
    i++; // i aponta para v[1];
    cout<<*i<<endl<<endl;

    //usando a função sort para ordenar um vector
    vector<int> ve;
    ve.push_back(3);
    ve.push_back(2);
    ve.push_back(1);
    cout<<ve[0]<<ve[1]<<ve[2]<<endl;

    sort(ve.begin(),ve.end()); // OBS: ela ordena a região de memória entre esses ponteiros. 
    cout<<ve[0]<<ve[1]<<ve[2]<<endl;

    return 0;
}