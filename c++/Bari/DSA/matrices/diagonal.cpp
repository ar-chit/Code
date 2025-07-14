#include <iostream>
using namespace std;

class Diagonal {
 private:
  int *arr;
  int size;

 public:
  Diagonal(int size) {
    this->size = size;
    arr = new int[size]();
  }

  void set(int i, int j, int x);

  int get(int i, int j);

  void display();

  ~Diagonal() { delete[] arr; }
};

void Diagonal::set(int i, int j, int x) {
  if (i > 0 && j > 0 && i <= size && j <= size && i == j) {
    arr[i - 1] = x;
  }
}

int Diagonal::get(int i, int j) {
  if (i > 0 && j > 0 && i < size && j < size) {
    if (i == j) {
      return arr[i - 1];
    }
    return 0;
  }
  return -1;
}

void Diagonal::display() {
  for (int i = 0; i < size; i++) {
    for (int j = 0; j < size; j++) {
      if (i == j) {
        cout << arr[i] << " ";
      } else {
        cout << 0 << " ";
      }
    }
    cout << endl;
  }
}

int main() {
  Diagonal *d1 = new Diagonal(5);

  d1->set(1, 1, 3);
  d1->set(2, 2, 7);
  d1->set(3, 3, 4);
  d1->set(4, 4, 9);
  d1->set(5, 5, 6);

  d1->display();

  delete d1;

  return 0;
}