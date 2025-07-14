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

struct Array *UnionUnSorted(struct Array *arr, struct Array *brr) {
  struct Array *crr = new struct Array[sizeof(struct Array *)];
  crr->size = arr->length + brr->length;

  for (int i = 0; i < arr->length; i++, crr->length++) {
    crr->A[i] = arr->A[i];
  }

  for (int i = 0, j = arr->length; i < brr->length; i++) {
    int flag = false;
    for (int k = 0; k < crr->length; k++) {
      if (brr->A[i] == crr->A[k]) {
        flag = true;
        break;
      }
    }
    if (flag == false) {
      crr->A[j] = brr->A[i];
      j++;
      crr->length++;
    }
  }

  return crr;
}

struct Array *UnionSorted(struct Array *arr, struct Array *brr) {
  struct Array *crr = new struct Array[sizeof(struct Array *)];
  crr->size = arr->length + brr->length;

  int i, j, k;
  i = j = k = 0;

  while (i < arr->length && j < brr->length) {
    if (arr->A[i] == brr->A[j]) {
      crr->A[k++] = arr->A[i++];
      j++;
    } else if (arr->A[i] < brr->A[j]) {
      crr->A[k++] = arr->A[i++];
    } else {
      crr->A[k++] = brr->A[j++];
    }
    crr->length++;
  }

  while (i < arr->length) {
    crr->A[k++] = arr->A[i++];
    crr->length++;
  }

  while (j < arr->length) {
    crr->A[k++] = brr->A[j++];
    crr->length++;
  }
  return crr;
}

struct Array *IntersectionUnSorted(struct Array *arr, struct Array *brr) {
  struct Array *crr = new struct Array[sizeof(struct Array *)];
  crr->size = arr->length + brr->length;

  int i = 0;

  int j = 0;
  while (i < arr->length) {
    for (int k = 0; k < brr->length; k++) {
      if (arr->A[i] == brr->A[j]) {
        crr->A[j++] = arr->A[i];
        crr->length++;
        break;
      }
    }
    i++;
  }

  return crr;
}

struct Array *IntersectionSorted(struct Array *arr, struct Array *brr) {
  struct Array *crr = new struct Array[sizeof(struct Array *)];
  crr->size = arr->length + brr->length;

  int i = 0;
  int j = 0;
  int k = 0;

  while (i < arr->length && j < brr->length) {
    if (arr->A[i] == brr->A[j]) {
      crr->A[k++] = arr->A[i++];
      j++;
      crr->length++;
    } else if (arr->A[i] < brr->A[j]) {
      i++;
    } else {
      j++;
    }
  }

  return crr;
}

struct Array *DifferenceUnSorted(struct Array *arr, struct Array *brr) {
  struct Array *crr = new struct Array[sizeof(struct Array *)];

  int i = 0;
  int j = 0;
  while (i < arr->length) {
    int flag = false;
    for (int k = 0; k < brr->length; k++) {
      if (arr->A[i] == brr->A[k]) {
        flag = true;
        break;
      }
    }
    if (!flag) {
      crr->A[j++] = arr->A[i];
      crr->length++;
    }
    i++;
  }

  return crr;
}

struct Array *DifferenceSorted(struct Array *arr, struct Array *brr) {
  struct Array *crr = new struct Array[sizeof(struct Array *)];

  int i = 0, j = 0, k = 0;

  while (i < arr->length && j < brr->length) {
    if(arr->A[i] < brr->A[j]){
      crr->A[k++] = arr->A[i++];
      crr->length++;
    } else if (brr->A[j] < arr->A[i]) {
      j++;
    } else {
      i++;
      j++;
    }
  }

  while(i<arr->length){
    crr->A[k++] = arr->A[i++];
    crr->length++;
  }

  return crr;
}

int main() {
  // struct Array arr = {{3, 5, 10, 4, 6}, 5, 5};
  // struct Array brr = {{12, 4, 7, 2, 5}, 5, 5};

  struct Array arr = {{3, 4, 5, 6, 10}, 5, 5};
  struct Array brr = {{2, 4, 5, 7, 12}, 5, 5};

  struct Array *crr = DifferenceSorted(&arr, &brr);

  Display(crr);

  return 0;
}