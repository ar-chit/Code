#include <iostream>
using namespace std;

class rectangle
{
public:
    int length;
    int breadth;

    int area()
    {
        return length * breadth;
    }

    int perimeter()
    {
        return 2 * (length + breadth);
    }
};
int main()
{
    rectangle *ptr = new rectangle;
    ptr->length = 10;
    ptr->breadth = 5;
    cout << "Area is " << ptr->area() << endl;
    cout << "Perimeter is " << ptr->perimeter() << endl;

    return 0;
}