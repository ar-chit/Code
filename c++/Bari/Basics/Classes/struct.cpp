#include <iostream>
using namespace std;

struct Demo
{
private:
  int x;
  int y;

  void Display()
  {
    cout << x << " " << y << endl;
  }
};

int main()
{
  Demo *d = new Demo;

  d->x = 10;
  d->y = 20;

  d->Display();

  return 0;
}