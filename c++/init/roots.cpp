#include<iostream>
#include<cmath>
using namespace std;

int main(){
    int a,b,c;
    float root1, root2;

    cout<<"Enter first number"<<endl;
    cin>>a;

    cout<<"Enter second number"<<endl;
    cin>>b;

    cout<<"Enter third number"<<endl;
    cin>>c;

    root1=(-b+sqrt(b*b-4*a*c))/(2*a);
    root2=(-b-sqrt(b*b-4*a*c))/(2*a);

    cout<<"First root is: "<<endl;
    cout<<root1<<endl;

    cout<<"Second root is: "<<endl;
    cout<<root2<<endl;

    return 0;
}