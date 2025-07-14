#include <iostream>
using namespace std;

void fun1(int n)
{
  if (n > 0)
  {
    cout << n << " ";
    fun1(n - 1);
  }
}

int staticFun(int n){
  static int x = 0;
  if(n > 0){
    x++;
    return staticFun(n-1) + x;
  }
  return 0;
}

int main()
{
  // fun1(3);
  cout << staticFun(5) << endl;
  return 0;
}