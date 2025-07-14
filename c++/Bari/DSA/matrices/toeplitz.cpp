#include <iostream>
using namespace std;

class ToepitzMatrix {
 private:
  int *A;
  int size;

  int getIndex(int i, int j) {
    if (i <= j) {
      return j - i;
    }

    return this->size + i - j - 1;
  }

 public:
  ToepitzMatrix(int size) {
    A = new int[2 * size - 1]();
    this->size = size;
  }

  void set(int i, int j, int x) { A[getIndex(i, j)] = x; }

  int get(int i, int j) { return A[getIndex(i, j)]; }

  void Display() {
    for (int i = 0; i < this->size; i++) {
      for (int j = 0; j < this->size; j++) {
        cout << A[getIndex(i, j)] << " ";
      }
      cout << endl;
    }
  }

  ~ToepitzMatrix() { delete[] A; }
};

int main() {
  ToepitzMatrix *t1 = new ToepitzMatrix(5);

  t1->set(1, 1, 2);
  t1->set(1, 2, 3);
  t1->set(1, 3, 4);
  t1->set(1, 4, 5);
  t1->set(1, 5, 6);

  t1->set(2, 1, 7);
  t1->set(3, 1, 8);
  t1->set(4, 1, 9);
  t1->set(5, 1, 10);

  t1->Display();

  return 0;
}