//Somar dígitos do input e dividir pelo próprio input;
#include<bits/stdc++.h>
using namespace std;

int soma_digitos(int n){
    int sum,digit;
    while(n){
        digit = n%10;
        n/=10;

        sum += digit;
    }
    return sum;
}

int main(){
    int n;
    cin>>n;

    if(n % soma_digitos(n) == 0)
        cout<<"Yes";
    else
        cout<<"No";
    
    return 0;
}
