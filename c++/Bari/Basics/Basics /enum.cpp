#include <iostream>
using namespace std;

enum day
{
    sun = 2,
    mon,
    tue,
    wed,
    thurs,
    fri,
    sat
};

int main()
{
    const int CSE = 1;
    const int ECE = 2;

    day d = mon;

    cout << d << endl;
    return 0;
}