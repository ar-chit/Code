#include <iostream>
using namespace std;

struct Array {
  int A[10];
  int size;
  int length;
};

int LinearSearch(const Array &arr, int key) {
  for (int i = 0; i < arr.length; i++) {
    if (key == arr.A[i]) {
      return i;
    }
  }
  return -1;
}

int Transposition(struct Array *arr, int key) {
  for (int i = 0; i < arr->length; i++) {
    if (key == arr->A[i]) {
      if (i != 0) {
        swap(arr->A[i], arr->A[i - 1]);
        return i - 1;
      }
      return i;
    }
  }
}

int MoveToHead(struct Array *arr, int key) {
  for (int i = 0; i < arr->length; i++) {
    if (key == arr->A[i]) {
      if (i != 0) {
        swap(arr->A[i], arr->A[0]);
        return 0;
      }
      return i;
    }
  } 
}

int main() {
  struct Array arr = {{8, 9, 4, 7, 6, 3, 10, 5, 14, 2}, 10, 10};
  cout << LinearSearch(arr, 10) << endl;
  return 0;
}