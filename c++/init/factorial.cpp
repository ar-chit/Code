#include<iostream>
using namespace std;

int main(){
    int n, i, ans=1;
    cout<<"Enter n: "<<endl;
    cin>>n;

    for(i=1; i<=n; i++){
        ans=ans*i;

    }
    cout<<"Factorial is: "<<ans<<endl;


    return 0;
}