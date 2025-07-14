#include <iostream>
using namespace std;

float add(float x, float y)
{
    float z;
    z = x + y;
    return z;
}

int main()
{
    float a = 10.4, b = 15.8, c;
    c = add(a, b);
    cout << "Sum is " << c << endl;
}