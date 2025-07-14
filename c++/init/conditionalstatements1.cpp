#include<iostream>
using namespace std;

int main(){
    int age;
    cout<<"Enter the age"<<endl;
    cin>>age;

    if(age>=12 && age<=50){
        cout<<"young"<<endl;
    }
    else{
        cout<<"not young"<<endl;
    }

    return 0;
}