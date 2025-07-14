#include<iostream>
using namespace std;

int main(){
    float u, v, a;

    cout<<"Enter initial velocity: "<<endl;
    cin>>u;

    cout<<"Enter final velocity: "<<endl;
    cin>>v;

    cout<<"Enter acceleration: "<<endl;
    cin>>a;

    cout<<"Speed is "<<(v*v-u*u)/(2*a)<<endl;


    return 0;
}