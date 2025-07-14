#include<iostream>
using namespace std;

vector<int> getSecondOrderElements(int n, vector<int> a)
{
    // Write your code here.
    int second_small = INT_MAX;
    int small = INT_MAX;

    int second_large = INT_MIN;
    int large = INT_MIN;

    for (int i = 0; i < a.size(); i++)
    {
        if (a[i] < small)
        {
            second_small = small;
            small = a[i];
        }
        else if (a[i] != small && a[i] < second_small)
        {
            second_small = a[i];
        }

        if (a[i] > large)
        {
            second_large = large;
            large = a[i];
        }
        else if (a[i] != second_large && a[i] > second_large)
        {
            second_large = a[i];
        }
    }

    vector<int> ans = {second_small, second_large};
    return ans;
}

int main(){
    
    return 0;
}