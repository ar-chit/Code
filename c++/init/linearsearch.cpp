#include <iostream>
using namespace std;

int main()
{
    int a[10], i, n = 10, key;
    cout << "Enter array: " << endl;
    for (i = 0; i < n; i++)
    {
        cin >> a[i];
    }
    cout << "Enter key: " << endl;
    cin >> key;
    for (i = 0; i < n; i++)
    {
        if (key == a[i])
        {
            cout << "Found at: " << i << endl;
            return 0;
        }
    }
    cout << "Not found" << endl;
    return 0;
}