#include <iostream>
using namespace std;

struct Rectangle
{
  int length;
  int breadth;
};

void
changeLength(struct Rectangle *r, int l)
{
  r->length = l;
  r->breadth = 20;
}

int main()
{
  struct Rectangle r1 = {10, 5};
  changeLength(&r1, 50);
  cout << r1.length << endl;
  cout << r1.breadth << endl;
  return 0;
}