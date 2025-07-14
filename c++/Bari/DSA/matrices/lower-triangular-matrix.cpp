#include <iostream>
using namespace std;

class LowerTriangularMatrix {
 private:
  int *A;
  int size;

  int getIndex(int i, int j);

  bool isValidIndex(int i, int j);

 public:
  LowerTriangularMatrix(int size) {
    A = new int[(size * (size + 1)) / 2]();
    this->size = size;
  }

  void set(int i, int j, int x);

  int get(int i, int j);

  void Display();

  ~LowerTriangularMatrix() { delete[] A; }
};

int LowerTriangularMatrix::getIndex(int i, int j) {
  return ((i * (i - 1)) / 2) + (j - 1);
}

bool LowerTriangularMatrix::isValidIndex(int i, int j) {
  if (i < j) {
    return false;
  }
  return true;
}

void LowerTriangularMatrix::set(int i, int j, int x) {
  if (isValidIndex(i, j)) {
    int index = getIndex(i, j);

    A[index] = x;
  }
}

int LowerTriangularMatrix::get(int i, int j) {
  if (!isValidIndex(i, j)) {
    return 0;
  }

  int index = getIndex(i, j);

  return A[index];
}

void LowerTriangularMatrix::Display() {
  for (int i = 1; i <= size; i++) {
    for (int j = 1; j <= size; j++) {
      if (isValidIndex(i, j)) {
        int index = getIndex(i, j);
        cout << A[index] << " ";
      } else {
        cout << 0 << " ";
      }
    }
    cout << endl;
  }
}

int main() {
  LowerTriangularMatrix m1 = new LowerTriangularMatrix(5);

  for (int i = 1; i <= 5; i++) {
    for (int j = 1; j <= i; j++) {
      m1->set(i, j, i + j);
    }
  }

  m1->Display();

  delete m1;

  return 0;
}