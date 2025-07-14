#include <iostream>
using namespace std;

struct Array {
  int A[10];
  int size;
  int length;
};

void Display(struct Array *arr) {
  cout << "The elements are: " << endl;
  for (int i = 0; i < arr->length; i++) {
    cout << arr->A[i] << " ";
  }

  cout << endl;
}

void InsertInSortedArray(struct Array *arr, int element) {
  if (arr->size <= arr->length) {
    return;
  }

  int i = arr->length - 1;
  while (element < arr->A[i] && i >= 0) {
    arr->A[i + 1] = arr->A[i];
    i--;
  }

  arr->A[i + 1] = element;
  arr->length++;
}

bool isArraySorted(struct Array *arr) {
  for (int i = 0; i < arr->length - 1; i++) {
    if (arr->A[i] > arr->A[i + 1]) {
      return false;
    }
  }
  return true;
}

void NegativesOnLeft(struct Array *arr) {
  int i = 0;
  int j = arr->length - 1;

  while (i < j) {
    while (arr->A[i] < 0) i++;
    while (arr->A[j] >= 0) j--;

    if (i < j) swap(arr->A[i], arr->A[j]);
  }
}

int main() {
  struct Array arr = {{2, -3, 25, 10, -15, -7}, 10, 6};
  // InsertInSortedArray(&arr, 8);

  // cout << isArraySorted(&arr) << endl;
  NegativesOnLeft(&arr);
  Display(&arr);

  return 0;
}