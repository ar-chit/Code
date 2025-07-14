#include<iostream>
#include<cmath>
using namespace std;

int main(){
    float a, b, c, d;
    
    cout<<"Enter a"<<endl;
    cin>>a;

    cout<<"Enter b"<<endl;
    cin>>b;

    cout<<"Enter c"<<endl;
    cin>>c;

    d=b*b-4*a*c;

    if(d==0){
        cout<<"Roots are real and equal"<<endl;
        cout<<endl<<"Root is: "<<(-b/(2*a))<<endl;
    }
    else if(d>0){
        cout<<"Roots are real and unequal"<<endl;
        cout<<endl<<"Roots are: "<<(-b+sqrt(d)/2*a)<<" and "<<(-b-sqrt(d)/2*a);
    }
    else{
        cout<<"Imaginary roots"<<endl;
    }

    return 0;
}