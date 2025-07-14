#include <iostream>
using namespace std;

int main()
{
    int n, i, count = 0;

    cout << "Enter 2 numbers: " << endl;
    cin >> i;
    cin >> n;

    for (i; i <= n; i++)
    {
        if (n % i == 0)
        {
            count++;
        }
    }
    if (count == 2)
    {
        cout << "Prime" << endl;
    }
    else
    {
        cout << "Not Prime" << endl;
    }
    return 0;
}