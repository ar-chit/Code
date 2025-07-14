#include<iostream>
using namespace std;

class rational
{
private:
    int numerator;
    int denominator;

public:
    rational(int n=0, int d=0)
    {
        numerator=n;
        denominator=d;
    }
    void display()
    {
        cout<<"Awnser is"<<numerator/denominator<<endl;
    }
    rational operator+(rational x)
    {
        rational temp;
        temp.numerator=numerator+x.numerator;
        temp.denominator=denominator+x.denominator;
        return temp;
    }
};

int main()
{
    rational n1(5,4), n2=(8,4), n3 ;
    n3=n1 + n2;
    n3.display();

    return 0;
}