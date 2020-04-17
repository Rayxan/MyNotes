#include<bits/stdc++.h>
using namespace std;
int main(){
    int j,i,n,num;
    long long int fib[60];  //long long = int de 64 bits

    fib[0] = 0;
    fib[1] = 1;
    
    scanf("%d",&n);
    for(j=0;j<n;j++){
        scanf("%d",&num);
        
        if(num>2){
            for(i=2;i<=num;i++){
                fib[i] = fib[i-1] + fib[i-2];   //fibonacci
                //printf("Fib(%d) = %lld\n",i,fib[i]);      //lembrar de usar %lld
            }
        }

        printf("Fib(%d) = %lld\n",num,fib[num]);

    }
    return 0;
}