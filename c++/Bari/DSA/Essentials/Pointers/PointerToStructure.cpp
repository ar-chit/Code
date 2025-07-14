#include <iostream>
using namespace std;

struct Rectangle
{
  int length;
  int breadth;
};

int main()
{
  Rectangle *p;

  p = (Rectangle *)malloc(sizeof(Rectangle));

  p->length = 10;

  cout << (*p).length << endl;

  delete p;

  return 0;
}