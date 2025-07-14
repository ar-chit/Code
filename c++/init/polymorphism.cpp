#include<iostream>
using namespace std;
class car
{
public:
    virtual void start()=0;
};
class Innova: public car
{
public:
    void start()
    {
        cout<<"Innova started"<<endl;
    }
};
class Swift: public car
{
public:
    void start()
    {
        cout<<"swift started"<<endl;
    }
};
int main(){
    car *c=new Innova();
    c->start();
    c=new Swift();
    c->start();

    return 0;
}