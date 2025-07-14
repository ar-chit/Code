#include <iostream>
using namespace std;

struct Array {
  int A[10];
  int size;
  int length;
};

void Display(struct Array *arr) {
  for (int i = 0; i < arr->length; i++) {
    cout << arr->A[i] << " ";
  }
  cout << endl;
}

void Merge(struct Array *arr, struct Array *brr, struct Array *crr) {
  int i = 0, j = 0, k = 0;

  while (i < arr->length && j < brr->length) {
    if (arr->A[i] < brr->A[j]) {
      crr->A[k++] = arr->A[i++];
    } else {
      crr->A[k++] = brr->A[j++];
    }
  }

  for (; j < brr->length; j++, k++) {
    crr->A[k] = brr->A[j];
  }

  for (; i < arr->length; i++, k++) {
    crr->A[k] = arr->A[i];
  }
}
int main() {
  struct Array arr = {{3, 8, 16, 20, 25}, 5, 5};
  struct Array brr = {{28, 30, 45, 67, 79}, 5, 5};
  struct Array crr = {{}, 10, 10};

  Merge(&arr, &brr, &crr);

  Display(&crr);

  return 0;
}