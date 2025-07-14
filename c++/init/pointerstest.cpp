#include<iostream>
using namespace std;

int main(){
    int a=10;
    
    cout<<a<<endl;
    cout<<&a<<endl;

    int *p;
    a=*p;
    cout<<*p<<endl;

    return 0;
}