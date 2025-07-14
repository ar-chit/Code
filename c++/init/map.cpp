#include<iostream>
#include<unordered_map>
using namespace std;

int main(){
    unordered_map<string, int> m;

    pair<string, int> p1 = make_pair("A", 9);
    m.insert(p1);

    pair<string, int> p2 = make_pair("B", 10);
    m.insert(p2);

    m["F"] = 10;

    // access

    cout << m["F"] << endl;

    return 0;
}