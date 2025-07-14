#include <iostream>
using namespace std;
int division(int x, int y)
{
    if (y == 0)
    {
        throw 1;
    }
    else
    {
        return x / y;
    }
};

int main()
{
    int a = 10, b = 5, c;

    try
    {
        c = division(a, b);
        cout << c;
    }
    catch (int e)
    {
        cout << "Division by zero" << e << endl;
    }
    cout << endl;
    cout << "Fuck you, bye" << endl;   

    return 0;
}