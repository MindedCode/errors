/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <iostream>

using namespace std;

class brands
{
    public:
    string lap1 = "Dell";
    string lap2 = "Acer";
    
    int lap_name()
    {
        cout<<"name of 1: "<<lap1<<endl;
        cout<<"name of 2: "<<lap2<<endl;
        return 0;
    }
};

class attributes
{
    public:
    string ram ="8 GB";
    string storage = "500 GB ";
    
    int  put()
    {
        cout<<"RAM: "<<ram<<endl;
        cout<<"Storage: "<<storage<<endl;
        return 0;
    }
};

class laptop : pubilc brands : public attributes
{
    public:
    
    string name = " Dell";
    string color = "Silver";
    
    int  show()
    {
        cout<<"Name: "<<name<<endl;
        cout<<"Color: "<<color;
        return 0;
    }
    
};
    

int main()
{
   laptop l1;
   l1.Lap_name();
   l1.put();
   l1.show();
   return 0;

}
