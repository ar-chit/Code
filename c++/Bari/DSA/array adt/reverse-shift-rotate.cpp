#include <iostream>
using namespace std;

struct Array {
  int A[15];
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

void ReverseUsingAuxiliaryArray(struct Array *arr) {
  int *B = new int[arr->length];
  for (int i = arr->length - 1, j = 0; i >= 0; i--, j++) {
    B[j] = arr->A[i];
  }

  for (int i = 0; i < arr->length; i++) {
    arr->A[i] = B[i];
  }

  delete[] B;
}

void ReverseUsingSwap(struct Array *arr) {
  for (int i = 0, j = arr->length - 1; i < j; i++, j--) {
    swap(arr->A[i], arr->A[j]);
  }
}

void LeftShift(struct Array *arr) {
  for (int i = 1; i < arr->length; i++) {
    arr->A[i - 1] = arr->A[i];
  }

  arr->A[arr->length - 1] = 0;
}

void RightShift(struct Array *arr) {
  for (int i = arr->length - 2; i >= 0; i--) {
    arr->A[i + 1] = arr->A[i];
  }

  arr->A[0] = 0;
}

void LeftRotate(struct Array *arr) {
  int deletedElement = arr->A[0];
  for (int i = 1; i < arr->length; i++) {
    arr->A[i - 1] = arr->A[i];
  }
  arr->A[arr->length - 1] = deletedElement;
}

void RightRotate(struct Array *arr) {
  int deletedElement = arr->A[arr->length - 1];
  for (int i = arr->length - 2; i >= 0; i--) {
    arr->A[i + 1] = arr->A[i];
  }

  arr->A[0] = deletedElement;
}

int main() {
  struct Array arr = {{2, 3, 4, 5, 6}, 10, 5};
  for (int i = 0; i < 10; i++) {
    RightRotate(&arr);
    Display(&arr);
  }

  return 0;
}