#include <iostream>
using namespace std;
class rectangle
{
private:
    int length;
    int breadth;

public:
    int area()
    {
        return length * breadth;
    }
};

int rectangle::perimeter()
{
    return 2 * (length + breadth);
}

int main()
{
    rectangle r(10, 5);
    cout << r.area() << endl;
    cout << r.perimeter();
    return 0;
}