#include<iostream>
using namespace std;
int main()
{
  int x = 10;
  int y = 20;
  int &z = x;
  cout << x << " " << y << " " << z << endl;
  return 0;
}