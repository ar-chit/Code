#include<iostream>
using namespace std;

int main(){
    
    int row, col;
    cout<<"Enter the number of rows"<<endl;
    cin>>row;

    cout<<"Enter the number of columns"<<endl;
    cin>>col;

    for(int i=1;i<=row;i++){
        for(int j=1;j<=col;j++){
            cout<<"*";
        }
        cout<<endl;
    }
    return 0;
}