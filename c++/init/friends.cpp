#include<iostream>
using namespace std;
class my
{
private:
    int a;
protected:
    int b;
public:
    int c;
    friend void fun();
}; 
void fun()
{
    my m;
    m.a=12;
    m.b=15;
    m.c=20;
}
int main(){
    
    return 0;
}