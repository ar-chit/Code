#include <iostream>
using namespace std;
int main() {
  int A[3][4] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

  int *B[3];

  for (int i = 0; i < 3; i++){
    B[i] = new int[4];
  }

  B[1][2] = 15;

  for (int i = 0; i < 3; i++){
    for (int j = 0; j < 4; j++){
      cout << B[i][j] << " ";
    }
    cout << endl;
  }

  int **C = new int *[3];

  for (int i = 0; i<3; i++){
    C[i] = new int[4];
  }

  C[1][2] = 15;

  for (int i = 0; i < 3; i++){
    for (int j = 0; j < 4; j++){
      cout << C[i][j] << " ";
    }
    cout << endl;
  }

  return 0;
}