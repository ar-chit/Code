#include<iostream>
using namespace std;

int main(){
    int a[5];
    int sum=0;
    cout<<"Enter the number of elements: "<<endl;
    for(int i=0; i<5; i++)
    {
        cin>>a[i];
    }
    cout<<"Elements are: ";
    for(int i=0; i<5; i++)
    {
        sum=sum+a[i];
    }
    cout<<"Sum is "<<sum;
    

    return 0;
}