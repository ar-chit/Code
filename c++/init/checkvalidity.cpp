#include<iostream>
using namespace std;

int main(){
    int rollno;

    cout<<"Enter a roll no. "<<endl;
    cin>>rollno;

    if(rollno<0)
    {
        cout<<"The roll no. is not valid. "<<endl;
    }
    else(rollno>0);
    {
        cout<<"The roll no. is valid. "<<endl;
    } 
    return 0;
}