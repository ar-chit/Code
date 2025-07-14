#include <iostream>
using namespace std;
#define max(x, y) (x > y ? x : y)
    #define msg (x) #x

#ifndef PI
#define PI 3.1425
#endif
int main()
{
    cout << "PI";
    cout << max(10, 20) << endl;
    cout << msg(Hello) << endl;
    return 0;
}