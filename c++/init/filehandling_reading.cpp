#include<iostream>
#include<fstream>
using namespace std;

int main(){
    ifstream ifs("my.txt");
    string name;
    int roll;
    string branch;
    ifs>>name>>roll>>branch;

    cout<<"Name: "<<name<<endl;
    cout<<"Roll no.: "<<roll<<endl;
    cout<<"branch: "<<branch<<endl;
    ifs.close(); 
    return 0;
}