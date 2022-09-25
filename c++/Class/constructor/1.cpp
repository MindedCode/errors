// Multilevel Inheritance

#include<iostream>
using namespace std;
// Grand class
class Brand
{
    public:
    string lap1;
    string lap2;
    
    void get_lap_n(string l1, string l2)
    {
        lap1=l1;
        lap2=l2;
    }
    
    void put_lap_n()
    {
        cout<<"laptop 1 name is: "<<lap1<<endl;
        cout<<"laptop2 name is: "<<lap2<<endl;
    }
};
// Parent class
class attibutes: public Brand
{
    public:
    string ram;
    string storage;
    
    void get_hardware(string r, string s)
    {
        ram=r; storage=s;
    }
    
    void put_hardware()
    {
        cout<<"RAM is: "<<ram<<endl;
        cout<<"Storage is: "<<storage<<endl;
    }
};
// Clild class 
class Laptop: public attributes
{
    public:
    string color1;
    string color2;
    
    void get_color(string c1, string c2)
    {
        color1=c1;
        color2=c2;
    }
    
    void put_color()
    {
        cout<<"Laptop1  color is : "<<color1<<endl;
        cout<<"Laptop2  color is: "<<color2<<endl;
    }
};


int main()
{
    
    Laptop l;
    
    l.get_lap_n("Dell", "apple");
    l.put_lap_n();
    l.get_hardware("8 GB", "16 GB");
    l.put_hardware();
    l.get_color("Silver", "Golden");
    l.put_color();
    
    
    return 0;
}
