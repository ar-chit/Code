#include <iostream>
using namespace std;

int *fun(int n)
{
  int *p = new int[n];
  return p;
}

int main()
{
  int *arr = fun(5);

  arr[0] = 10;

  cout << arr[0] << endl;
  return 0;
}