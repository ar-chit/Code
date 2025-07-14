#include <iostream>
using namespace std;
class base
{
public:
    void fun()
    {
        cout << "Fun of Base" << endl;
    }
};
class derived : public base
{
public:
    void fun()
    {
        cout << "Fun of Derived" << endl;
    }
};

int main()
{
    derived d;
    d.fun();
    return 0;
}