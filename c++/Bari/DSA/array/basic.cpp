#include <iostream>
using namespace std;
int main() {
  int n[5];

  for(int i = 0; i < 5; i++){
    // cout << &n[i] << endl;
    cout << reinterpret_cast<uintptr_t>(&n[i]) << endl;
    // printf("%u \n", &n[i]);
  }

  // char *p = new char[5]{'a', 'b', 'c', 'd', 'e'};

  // for(int i = 0; i < 5; i++){
  //   cout << p[i] << endl;
  // }

  // cout << p << endl;

  // delete[] p;

  // char *p = (char *)malloc(5 * sizeof(char));

  // for(int i = 0; i < 5; i++){
  //   p[i] = 'a' + i;
  // }

  // cout << p << endl;

  // delete[] p;

  // char *str = new char[5]{'a', 'b', 'c', 'd', 'e'};

  // for (int i = 0; i < 5; i++){
  //   cout << str[i] << endl;
  // }

  // cout << str << endl;

  // delete[] str;

  // int arr[] = {1, 2, 3, 4, 5};

  // cout << arr << endl;

  return 0;
}