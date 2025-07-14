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

void Append(struct Array *arr, int x) {
  if (arr->length < arr->size) {
    arr->A[arr->length++] = x;
  }
}

void Insert(struct Array *arr, int index, int x) {
  if (index >= 0 && index <= arr->length) {
    for (int i = arr->length; i > index; i--) {
      arr->A[i] = arr->A[i - 1];
    }
    arr->A[index] = x;
    arr->length++;
  }
}

void Delete(struct Array *arr, int index) {
  if (index >= 0 && index < arr->length) {
    for (int i = index; i < arr->length - 1; i++) {
      arr->A[i] = arr->A[i + 1];
    }
    arr->length--;
  }
}

int main() {
  struct Array arr = {{2, 3, 4, 5, 6}, 10, 5};
  // cout << "Enter the size of the array: " << endl;
  // cin >> arr.size;
  // arr.A  = new int[arr.size];

  // cout << "Enter the number of elements: " << endl;
  // cin >> arr.length;

  // cout << "Enter the elements: " << endl;
  // for(int i = 0; i < arr.length; i++)
  // {
  //   cin >> arr.A[i];
  // }

  // Append(&arr, 10);
  // Delete(&arr, 0);
  Insert(&arr, 2, 15);

  Display(&arr);
  return 0;
}