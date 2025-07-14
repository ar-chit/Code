#include <iostream>
#include <numeric>
using namespace std;

struct Array {
  int A[15];
  int size;
  int length;
};

int get(struct Array *arr, int index) {
  if (index < 0 || index >= arr->length) {
    return -1;
  }
  return arr->A[index];
}

void set(struct Array *arr, int index, int x) {
  if (index >= 0 && index < arr->length) {
    arr->A[index] = x;
  }
}

int max(struct Array *arr) {
  int max = arr->A[0];

  for (int i = 1; i < arr->length; i++) {
    if (arr->A[i] > max) {
      max = arr->A[i];
    }
  }

  return max;
}

int min(struct Array *arr){
  int min = arr->A[0];

  for (int i = 1; i < arr->length; i++){
    if(arr->A[i] < min){
      min = arr->A[i];
    }
  }

  return min;
}

int sum(struct Array *arr) {
  return accumulate(arr->A, arr->A + arr->length, 0);
}

float average(struct Array *arr) { return sum(arr) / arr->length; }

int main() {
  struct Array arr = {{2, 3, 4, 5, 6}, 10, 5};

  // set(&arr, 5, 5);
  // cout << get(&arr, 5) << endl;

  // cout << max(&arr) << endl;
  // cout << min(&arr) << endl;
  cout << average(&arr) << endl;

  return 0;
}