#include<iostream>
using namespace std;

int main(){
    int a[5];
    int min, max;
    cout<<"enter the number of elements"<<endl;
    for(int i=0; i<5;i++)
    {
        cin>>a[i];
    }
    min=a[0];
    for(int i=0; i<5;i++)
    {
        if (a[i]<min)
        {
            min=a[i];
        }
    }
    cout<<"Minimum element"<<endl;
    cout<<min;
    min=a[5];
    for(int i=0; i<5; i++)
    {
        if (a[i]>max)
        {
            max=a[i];
        }
    }
    cout<<"Maximum element"<<endl;
    cout<<max;
    return 0;
}