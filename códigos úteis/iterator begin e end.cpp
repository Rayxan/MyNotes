#include<bits/stdc++.h>
using namespace std;
int main(){
    vector<int> ar = {1,2,3,4,5};

    //Declaring iterator to a vector
    vector<int>::iterator ptr;

    for(ptr = ar.begin();ptr < ar.end();ptr++){
        cout<<*ptr<<" "; //com asterisco aqui pois iterator é um ponteiro
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
Operations of iterators:

1. begin() : This function is used to return the beginning
position of the container.

2. end() : This function is used to return the after end 
position of the container.

*/
