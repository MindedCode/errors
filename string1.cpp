 
#include <iostream>
#include <cstring>
using namespace std;

int main()
{
    char a[]="Adarsh";
    char b[] = "Kumar";
    char c[] = "\n";
    char d[] = "\0";
    char e[] = {'a', 'b', 'c', 'd', '\0'};
    
    for(int i=0; i<25; i++){
        // cout<<e[i]<<endl;
        cout<<e[i]<<endl;
    }
    
    cout<<a <<" "<<b<<" "<<c<<"null charater"<<d<<" "<<e[3]<<endl;

    return 0;
}


Output of the program ::

a
b
c
d

K
u
m
a
r

A
d
a
r
s
h


4
�
�
�
�
�
Adarsh Kumar 
null character d
