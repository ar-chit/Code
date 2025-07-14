#include <iostream>
using namespace std;

int main()
{
    int n, i, ans = 1, sum = 0;

    cout << "Enter number: " << endl;
    cin >> n;
    cout << endl;

    for (i = 0; i <= n; i++)
    {

        if (n % i == 0)
        {
            cout << i << endl;
            sum = sum + i;
        }
    }
    cout << endl;
    cout << "Sum of factors is: " << sum << endl;
    if (sum / 2 == n)
    {
        cout << "Perfect number" << endl;
    }
    else
    {
        cout << "Not Perfect" << endl;
    }
    return 0;
}