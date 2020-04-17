#include<bits/stdc++.h>

using namespace std;
using ll = long long;
using ii = pair<ll,ll>;
using vi = vector<ll>;

int main(){
    ll x=2,y=3;
    ii z(x,y);
    vi ns{x,y,10,-1};
    
    cout<<x<<" "<<y<<endl;
    cout<<z.first<<" "<<z.second<<endl;
    cout<<ns[3]<<endl;

    return 0;
}