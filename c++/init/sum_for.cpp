#include<iostream>
using namespace std;

int main(){
    int n, i, sum=0;
    cout<<"Enter number: "<<endl;
    cin>>n;

    for(i=1; i<=n; i++){
        sum=sum+i;
        cout<<"Sum of N numbers is: "<<sum<<endl;
        
    }
    return 0;
}