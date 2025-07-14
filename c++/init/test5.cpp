#include<iostream>
using namespace std;
class rectangle
{
private:
    int length;
    int breadth;
public:
    rectangle(int l, int b)
    {
        length=l;
        breadth=b;
    }
    int getlength()
    {
        return length;
    }
    int getbreadth()
    {
        return breadth;
    }
    int area()
    {
        return length*breadth;
    }
    int perimeter()
    {
        return 2*(length+breadth);
    }
};
int main(){
    rectangle r1(10,5);
    cout<<"Area of rectangle is "<<r1.area()<<endl;
    cout<<"Perimeter of rectangle is "<<r1.perimeter()<<endl;  
    return 0;
}    
