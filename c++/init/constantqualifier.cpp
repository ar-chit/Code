#include<iostream>
using namespace std;
void fun(int &a, int &b)
{
    cout<<a<<" "<<b<<endl;
    a++;

}
int main(){
    int x=10, y=20;

    fun (x,y);
    cout<<"Main:  "<<x<<" "<<y<<endl;

    return 0;
}