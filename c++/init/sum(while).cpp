#include<iostream>
using namespace std;

int main(){
    int n, i=1, sum=0;
    cout<<"Enter n"<<endl;
    cin>>n;
    while (i<=n)
    {
        sum+=i;
        i++;
    }
    cout<<"Sum of N numbers is: "<<sum<<endl;
    
    return 0;
}