#include<iostream>
using namespace std;

int main(){
    string name;
    cout << "May I know your name?" << endl;
    getline(cin, name);
    cout << "Hello " << name << endl;
    return 0;
}