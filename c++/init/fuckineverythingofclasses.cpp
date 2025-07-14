#include <iostream>
using namespace std;
class rectangle
{
private:
    int length;
    int breadth;
public:
    rectangle();
    rectangle(int l, int b);
    rectangle(rectangle &r);
    int getlength() { return length; }
    int getbreadth() { return breadth; }
    void setlength(int l);
    void setbreadth(int b);
    int area();
    int perimeter();
    bool isSquare();
    ~rectangle();
};
int main()
{
    rectangle r1(10, 10);
    cout << "Area is " << r1.area() << endl;
    if (r1.isSquare())
        cout << "Yes" << endl;
    return 0;
}

rectangle::rectangle()
{
    length = 1;
    breadth = 1;
}
rectangle::rectangle(int l, int b)
{
    length = l;
    breadth = b;
}
rectangle::rectangle(rectangle &r)
{
    length = r.length;
    breadth = r.breadth;
}
void rectangle::setlength(int l)
{
    length = l;
}
void rectangle::setbreadth(int b)
{
    breadth = b;
}
int rectangle::area()
{
    return length * breadth;
}
int rectangle::perimeter()
{
    return 2 * (length + breadth);
}
bool rectangle::isSquare()
{
    return length == breadth;
}
rectangle::~rectangle()
{
    cout << "Rectangle Destroyed";
}
