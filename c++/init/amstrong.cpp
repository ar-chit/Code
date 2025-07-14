#include <iostream>
using namespace std;

int main()
{
    int n, r, sum = 0, m;
    cout << "Enter number : " << endl;
    cin >> n;
    m = n;

    while (n > 0)
    {
        r = n % 10;
        n = n / 10;
        cout << r << endl;
        sum = sum + r * r * r;
    }
    cout << sum << endl;

    if (sum == m)
    {
        cout << "This an Amstrong number." << endl;
    }
    else
    {
        cout << "This is not a Amstrong number." << endl;
    }
    return 0;
}