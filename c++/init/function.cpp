#include<iostream>
using namespace std;

int sum(int x, int y)
{
    return x+y;
}

int main(){

    int a, b, c;
    cin>>a;
    cin>>b;
    c=sum(a,b);
    cout<<"Sum is: "<<c<<endl;
    return 0;
    
}