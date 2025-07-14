#include <iostream>
#include <stdlib.h>

using namespace std;
int main()
{
  int *p = new int[5];

  p[0] = 10;
  p[1] = 15;
  p[2] = 20;
  p[3] = 25;
  p[4] = 30;

  for (int i = 0; i < 5; i++)
  {
    cout << p[i] << endl;
  }

  cout << sizeof(p) << endl;  //  all pointers take 8 bytes

  delete[] p; //  for C++
  // free(p);  //  for C language
  return 0;
}