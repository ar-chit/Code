#include<iostream>
using namespace std;

void fun(){
    static int v=0;
    int a=5;
    v++;  
    cout<<a<<" "<<v<<endl;
}
int main(){
    fun();
    fun();
    fun();

    return 0;
}