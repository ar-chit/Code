#include <iostream>
using namespace std;
class base
{
public:
    Base() { cout << "Constructor of base" << endl }
    ~Base()
    {
        cout << "Destructor of base" << endl;
    }
};

class Derived : public base
{
public:
    Derived() { cout << "Constructor of derived" << endl }
    ~Derived()
    {
        cout << "Destructor of derived" << endl;
    }
}

void
fun()
{
    Base *p = new Derived();
}
int main()
{
    fun();
}