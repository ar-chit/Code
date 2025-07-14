#include<iostream>
using namespace std;

//  pass by value
// void swap(int a, int b){
//   int temp = a;
//   a = b;
//   b = temp;
// }

//  pass by address
// void swap(int *a, int *b){
//   int temp = *a;
//   *a = *b;
//   *b = temp;
// }

//  pass by reference
void swap(int &a, int &b){
  int temp = a;
  a = b;
  b = temp;
}
int main()
{
  int x = 10;
  int y = 20;

  swap(x, y);

  cout << x << " " << y << endl;
  return 0;
}