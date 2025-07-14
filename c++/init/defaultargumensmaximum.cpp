#include <iostream>
using namespace std;
int max(int a, int b, int c=0, int d=0)
{
    return a > b && a > c && a>d ? a : b > c && b>d ? b : c>d ? c : d;
}

int main()
{
    cout << max(10, 13) << endl;
    cout << max(10, 13, 15) << endl;
    cout << max(10, 13 ,15, 20)<<endl;
    return 0;
}