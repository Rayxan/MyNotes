#include<bits/stdc++.h>
using namespace std;
int main(){
    vector<int> ar = {1,2,3,4,5};
    vector<int> ar1 = {10,20,30};

    //Declaring iterators to a vector
    vector<int>::iterator ptr = ar.begin();
    
    //Using advance to set position
    advance(ptr, 3);

    //copying 1 vector element in other using inserter()
    //inserts ar1 after 3rd position in ar
    copy(ar1.begin(), ar1.end(), inserter(ar, ptr));

    for(int &x : ar){
        cout<<x<<" ";
    }

    return 0;
}

//Conceito de Iterator
/*Iterators are used to point at the memory addresses
of STL containers. They are primarily used in sequence
of numbers, characters etc. They reduce the complexity
and execution time of program.
*/

/*
6. inserter() : This function is used to insert the 
elements at any position in the container. It accepts
2 arguments, the container and iterator to position
where the elements have to be inserted.
*/
