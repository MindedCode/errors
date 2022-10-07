
#include <iostream>

using namespace std;
class A{
    public:
    int b;
     void p(int i){
         int b=i;
     }
     void g(){
        //  cout<<"enter"<<b<<endl;
        //  cin>>b;
         cout<<"value of b : "<<b<<endl;
         
     }
    
};

int main()
{
    A s1;
    
    int j;
    cout<<"enter "<<endl;
    cin>>j;
    
    s1.p(j);
    s1.g();
    return 0;
}


**/Error is:
p function declare the two times/**
output of the program:

enter 
7
value of b : 1359180256
