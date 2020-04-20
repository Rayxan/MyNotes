#include<bits/stdc++.h>
using namespace std;
int main(){
    vector<int> ar = {1,2,3,4,5,6,7};

    //Declaring iterators to a vector
    vector<int>::iterator ptr = ar.begin();
    vector<int>::iterator ftr = ar.end();

    //Using next() to return new iterator
    auto it = next(ptr,3);

    //Using prev() to return new iterator  
    auto it1 = prev(ftr,3);

    cout<<*it<<endl;
    cout<<*it1<<endl;
    return 0;
}

//Conceito de Iterator
/*Iterators are used to point at the memory addresses
of STL containers. They are primarily used in sequence
of numbers, characters etc. They reduce the complexity
and execution time of program.
*/

/*
4. next() : This function returns the new iterator that 
the iterator would point after advancing the positions 
mentioned in its arguments.

5. prev() : This function returns the new iterator that 
the iterator would point after decrementing the positions
 mentioned in its arguments.
*/

//Obs: Lembrar de quando for usar o next(), apontar o 
//iterator pro inicio do vetor dependendo do caso.
//E quando for usar o prev(), lembrar de apontar pro 
//final, dependendo do caso também.
