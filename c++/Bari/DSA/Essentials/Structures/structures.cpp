#include<iostream>
using namespace std;

struct Rectangle{
  int length;
  int breadth;
  char x; //  padding
};
int main()
{
  struct Rectangle r1={10, 5};

  r1.length = 15;
  r1.breadth = 10;

  cout << r1.length << " " <<  r1.breadth << endl;
  return 0;
}