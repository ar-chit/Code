#include<iostream>
#include<fstream>
using namespace std;

int main(){
    ofstream ofs("My.txt",ios::trunc);
    ofs<<"Billa"<<endl;
    ofs<<"69"<<endl;
    ofs<<"ugh"<<endl;

    ofs.close(); 
    return 0;
}