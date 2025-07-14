#include <iostream>
using namespace std;
class base
{
public:
    base()
    {
        cout << "Non-param base " << endl;
    }
    base(int x)
    {
        cout << "Param of base " << x << endl;
    }
};
class derived : public base
{
public:
    derived()
    {
        cout << "Non-param Derived " << endl;
    }
    derived(int y)
    {
        cout << "Param of Derived " << y << endl;
    }
    derived(int x, int y) : base(x)
    {
        cout << "Param of Derived " << y << endl;
    }
};
int main()
{
    derived d(5, 10);
    return 0;
}