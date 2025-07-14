#include<iostream>
using namespace std;
class base
{
public:
    int a;
    void display()
    {
        cout<<"Display of Base"<<endl;
    }
};

class derived: public base
{
public:
    void show()
    {
        cout<<"Show of Derived"<<endl;
    }

};
int main(){
    derived d;
    d.display();
    d.show();
    return 0;
}