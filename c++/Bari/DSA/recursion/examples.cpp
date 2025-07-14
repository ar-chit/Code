#include <iostream>
using namespace std;

int sum(int n) {
  if (n == 1) {
    return 1;
  }
  return sum(n - 1) + n;
}

int iSum(int n) {
  int sum = 0;
  for (int i = 1; i <= n; i++) {
    sum += i;
  }
  return sum;
}

int fact(int n) {
  if (n == 0 || n == 1) {
    return 1;
  }
  return fact(n - 1) * n;
}

int iFact(int n) {
  int result = 1;
  for (int i = 1; i <= n; i++) {
    result *= i;
  }
  return result;
}

int powSlow(int m, int n) {
  if (n == 0) {
    return 1;
  }
  return pow(m, n - 1) * m;
}

int powFast(int m, int n) {
  if (n == 0) {
    return 1;
  }
  if (n % 2 == 0) {
    return powFast(m * m, n / 2);
  }
  return m * powFast(m * m, (n - 1) / 2);
}

int iPow(int m, int n) {
  int ans = 1;
  while (n > 0) {
    if (n % 2 == 1) {
      ans *= m;
    }
    m *= m;
    n /= 2;
  }
  return ans;
}

double eSlow(int x, int n) {
  static double p = 1, f = 1;

  if (n == 0) {
    return 1;
  }

  double r = eSlow(x, n - 1);
  p *= x;
  f *= n;
  return r + p / f;
}

double eFast(int x, int n) {
  static double s = 1;
  if (n == 0) {
    return s;
  }
  s = 1 + ((double)x / n * s);
  return eFast(x, n - 1);
}

double iE(int x, int n) {
  double ans = 1;
  while (n != 0) {
    ans = 1 + ((double)x / n * ans);
    n--;
  }
  return ans;
}

int fibSlow(int n) {
  if (n <= 1) {
    return n;
  }
  return fibSlow(n - 2) + fibSlow(n - 1);
}

int fibFast(int n, int arr[]) {  //  memoization
  if (n <= 1) {
    arr[n] = n;
    return n;
  }
  if (arr[n - 2] == -1) {
    arr[n - 2] = fibFast(n - 2, arr);
  }
  if (arr[n - 1] == -1) {
    arr[n - 1] = fibFast(n - 1, arr);
  }
  arr[n] = arr[n - 2] + arr[n - 1];
  return arr[n - 2] + arr[n - 1];
}

int iFib(int n) {
  if (n <= 1) {
    return n;
  }
  int t0 = 0, t1 = 1, ans = 0;
  for (int i = 2; i <= n; i++) {
    ans = t0 + t1;
    t0 = t1;
    t1 = ans;
  }
  return ans;
}

int iCombination(int n, int r) {  //  nCr 
  int ansN = 1, ansR = 1, ansSub = 1;
  for (int i = 1; i <= n; i++) {
    ansN *= i;
    if (i == r) {  
      ansR = ansN;
    }
    if (i == n - r) {
      ansSub = ansN;
    }
  }
  return ansN / (ansR * ansSub);
}

int combination(int n, int r) {   //  nCr using Pascal's Triangle
  if (r == 0 || n == r) {
    return 1;
  }
  return combination(n - 1, r - 1) + combination(n - 1, r);
}

int main() {
  // cout << sum(5) << endl;
  // cout << iSum(5) << endl;
  // cout << fact(5) << endl;
  // cout << iFact(5) << endl;
  // cout << powSlow(2, 9) << endl;
  // cout << powFast(2, 9) << endl;
  // cout << iPow(2, 10) << endl;
  // cout << eSlow(4, 10) << endl;
  // cout << eFast(4, 10) << endl;
  // cout << iE(4, 10) << endl;
  // cout << fibSlow(7) << endl;
  // int n = 7;
  // int *arr = new int[n];
  // fill(arr, arr + n, -1);

  // cout << fibFast(n, arr) << endl;
  // for (int i = 0; i < n; i++) {
  //   cout << arr[i] << endl;
  // }

  // delete[] arr;

  // cout << iFib(7) << endl;
  cout << iCombination(6, 3) << endl;
  cout << combination(6, 3) << endl;
  return 0;
}