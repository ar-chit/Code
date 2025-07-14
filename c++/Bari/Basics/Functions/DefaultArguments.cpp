#include<iostream>
using namespace std;

int add(int a, int b, int c = 0, int d = 0)
{
  return a + b + c + d;
}

int main()
{
  cout << add(1, 2, 5) << endl;

  return 0;
}