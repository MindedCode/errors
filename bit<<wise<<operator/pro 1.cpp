#include<iostream>
using namespace std;

int main(){
    int n;
    cin>>n;
    int a = 3;

    cout << n&a << "n&n" <<endl;
    // cout << n|n << "n|n" <<endl;
    // cout << ~n  << "~n " <<endl;
    // cout << n^n << "n^n" <<endl;
    
    return 0;
}



output of:

main.cpp: In function ‘int main()’:
main.cpp:9:17: error: invalid operands of types ‘int’ and ‘const char [4]’ to binary ‘operator<<’
    9 |     cout << n&a << "n&n" <<endl;
      |               ~ ^~ ~~~~~
      |               |    |
      |               int  const char [4]
