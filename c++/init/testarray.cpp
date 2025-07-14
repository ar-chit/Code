#include <iostream>
using namespace std;

int main()
{
    int n, i;
    cout << "Enter the size of array: " << endl;
    cin >> n;

    int a[n];
    cout << "Enter array: " << endl;

    for (i = 0; i < n; i++)
    {
        cin >> a[i];
    }
    return 0;
}