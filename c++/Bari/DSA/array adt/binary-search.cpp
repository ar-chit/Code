#include <iostream>
using namespace std;

struct Array {
  int A[15];
  int size;
  int length;
};

int BinarySearch(struct Array *arr, int key) {
  int low = 0;
  int high = arr->length - 1;

  while (low <= high) {
    int mid = low + (high - low) / 2;
    if (arr->A[mid] == key) {
      return mid;
    } else if (key < arr->A[mid]) {
      high = mid - 1;
    } else {
      low = mid + 1;
    }
  }

  return -1;
}

int RBinarySearch(struct Array *arr, int key) {
  static int l = 0;
  static int h = arr->length - 1;

  if (l <= h) {
    int mid = l + (h - l) / 2;

    if (arr->A[mid] == key) {
      return mid;
    } else if (key < arr->A[mid]) {
      h = mid - 1;
      return RBinarySearch(arr, key);
    } else {
      l = mid + 1;
      return RBinarySearch(arr, key);
    }
  }

  return -1;
}

int main() {
  struct Array arr = {
      {4, 8, 10, 15, 18, 21, 24, 27, 29, 33, 34, 37, 39, 41, 43}, 15, 15};

  cout << BinarySearch(&arr, 24) << endl;
  cout << RBinarySearch(&arr, 24) << endl;
  return 0;
}