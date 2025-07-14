#include <iostream>
using namespace std;
class cuboid
{
private:
    int length;
    int breadth;
    int height;

public:
    cuboid(int l, int b, int h)
    {
        length = l;
        breadth = b;
        height = h;
    }
    int getLength()
    {
        return length;
    }
    int getbreadth()
    {
        return breadth;
    }
    int getHeight()
    {
        return height;
    }
    int setLength(int l);
    int setBreadth(int b);
    int setHeight(int h);
    int area()
    {
        return length*breadth*height;
    }
    int perimeter()
    {
        return 4*(length+breadth+height);
    }


};

int main()
{   
    cuboid c1(10,20,30);
    cout<<"Area of cuboid is "<<c1.area()<<endl;
    cout<<"Perimeter of cuboid is "<<c1.perimeter()<<endl;
    return 0;
}