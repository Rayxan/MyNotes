#include<bits/stdc++.h>
using namespace std;
int main()
{
    string s, nova="";

    getline(cin, s);
    
    for(int i=0; i<s.length(); i++)
        nova= s[i] + nova;
    
    cout << nova << endl;
    
    return 0;
}
