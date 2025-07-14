#include<iostream>
using namespace std;

int main(){
    int n, m;
    cout<<"Enter 2 numbers: "<<endl;
    cin>>n>>m;

    while(m!=n){
        if (m>n){
            m=m-n;
        }
        else{
            n=n-m;
        }
    }   
    cout<<"GCD of the two numbers is: "<<m<<endl;
    return 0;
}