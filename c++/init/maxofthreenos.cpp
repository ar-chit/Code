#include<iostream>
using namespace std;

int main(){
    int a, b, c;
    cout<<"Greatest number will be generated"<<endl;

    cout<<"Enter a"<<endl;
    cin>>a;

    cout<<"Enter b"<<endl;
    cin>>b;

    cout<<"Enter c"<<endl;
    cin>>c;

    if(a>b && a>c){
        cout<<"Greatest number is: "<<a<<endl;
    }
    else if(b>c){
        cout<<"Greatest number is: "<<b<<endl;
    }
    else{
        cout<<"Greatest number is: "<<c<<endl;
    }

    
    return 0;
}