#include <iostream>
#include <cmath>
using namespace std;
class shape
{
public:
    virtual float area() = 0;
    virtual float perimeter() = 0;
};
class rectangle : public shape
{
private:
    float length;
    float breadth;

public:
    rectangle(int l, int b)
    {
        length = l;
        breadth = b;
    }
    float area()
    {
        return length * breadth;
    }
    float perimeter()
    {
        return 2 * (length + breadth);
    }
};
class circle : public shape
{
private:
    float radius;

public:
    circle(int r)
    {
        radius = r;
    }
    float area()
    {
        return M_PI * radius * radius;
    }
    float perimeter()
    {
        return 2 * M_PI * radius;
    }
};

int main()
{
    shape *s = new rectangle(562, 21);
    cout << "Area of rectangle is " << s->area() << endl;
    cout << "Perimeter of rectangle is " << s->perimeter() << endl;

    cout << endl;
    s = new circle(84);
    cout << "Area of circle is " << s->area() << endl;
    cout << "Circumference of circle is " << s->perimeter() << endl;
    return 0;
}