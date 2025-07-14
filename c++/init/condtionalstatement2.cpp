#include<iostream>
using namespace std;

int main(){
    int age;
    cout<<"Enter the age"<<endl;
    cin>>age;

    if(age<12 || age>50){
        cout<<"eligibe"<<endl;
    }   
    else{
        cout<<"not eligible"<<endl;
    }

    return 0;
}