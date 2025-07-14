#include <iostream>
using namespace std;

template <class T>
T maxi(T a, T b)
{
  return a > b ? a : b;
}



int main()
{
  cout << maxi(2.3f, 5.0f) << endl;
  return 0;
}