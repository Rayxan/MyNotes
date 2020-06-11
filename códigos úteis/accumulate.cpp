#include<bits/stdc++.h>
using namespace std;

string solve(int h, int n, const vector<int>& xs){
  long long sum  = accumulate(xs.begin(), xs.end(), 0);

  return sum >= h ? "Yes" : "No";
}

int main1(){
  int h,n;

  cin>>h>>n;

  vector<int> xs(n);

  for(int i=0; i<N;i++)
    cin>>xs[i];

  auto ans = solve(h,n,xs);

  cout<<ans<<'\n';

  return 0;
}

/*accumulate(first, last, sum);
first, last : first and last elements of range 
              whose elements are to be added
sum :  initial value of the sum
*/
