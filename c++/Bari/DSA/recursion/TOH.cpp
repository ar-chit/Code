#include <iostream>
using namespace std;

void TowerOfHanoi(int n, char a, char b, char c) {
  if (n > 0) {
    TowerOfHanoi(n - 1, a, c, b);
    cout << "Move disk from " << a << " to " << c << endl;
    TowerOfHanoi(n - 1, b, a, c);
  }
}
int main() {
  int n;
  cout << "Enter the number of disks: ";
  cin >> n;
  TowerOfHanoi(n, 'A', 'B', 'C');
  return 0;
}