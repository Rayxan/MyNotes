// S(12) = 1 + 2 = 3
// S(101) = 1 + 0 + 1 = 2
#include <bits/stdc++.h>
 
#define vi vector<int>
#define ll long long
#define pb push_back
#define mp make_pair
#define endl "\n"
#define ii pair<int,int>
#define qu queue <int>
#define qmax priority_queue <int>
#define qmin priority_queue <int, vector<int>,greater<int>>

using namespace std;

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    int n, aux=0;

    cin>>n;

    while(n){
        aux += (n%10);

        n /= 10;
    }

   cout<<aux<<endl;

    return 0;
}
