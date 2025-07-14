#include <iostream>
using namespace std;

struct Rectangle
{
  int length;
  int breadth;
};

void initialize(struct Rectangle *r, int length, int breadth){
  r->length = length;
  r->breadth = breadth;
}

int area(struct Rectangle *r)
{
  return r->length * r->breadth;
}

int perimeter(struct Rectangle *r)
{
  return 2 * (r->length + r->breadth);
}

int main()
{
  Rectangle *r1 = new Rectangle;
  
  r1->length = 0;
  r1->breadth = 0;

  int length = 0, breadth = 0;
  cout << "Enter length and breadth" << endl;
  cin >> length >> breadth;

  initialize(r1, length, breadth);

  int a = area(r1);
  int p = perimeter(r1);

  printf("Area=%d\nPerimeter=%d\n", a, p);

  return 0;
}