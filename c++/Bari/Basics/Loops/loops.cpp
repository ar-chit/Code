#include <iostream>
#include <cmath>
using namespace std;

void multiplicationTable(int x)
{
  for (int i = 0; i <= 10; i++)
  {
    cout << x << " x " << i << " = " << x * i << endl;
  }
}

int sum(int n)
{
  int sum = 0;
  for (int i = 1; i <= n; i++)
  {
    sum += i;
  }
  return sum;
}

int factorial(int n)
{
  int factorial = 1;
  for (int i = 2; i <= n; i++)
  {
    factorial = factorial * i;
  }
  return factorial;
}

void factors(int n)
{
  for (int i = 1; i <= n; i++)
  {
    if (n % i == 0)
    {
      cout << i << endl;
    }
  }
}

bool perfect(int n)
{
  int sum = 0;
  for (int i = 1; i < n; i++)
  {
    if (n % i == 0)
    {
      sum += i;
    }
  }
  return sum == n;
}

bool prime(int n)
{
  int count = 0;

  for (int i = 2; i < n; i++)
  {
    if (n % i == 0)
    {
      count++;
    }
  }

  return count == 0;
}

void digitsDisplay(int n)
{
  while (n != 0)
  {
    cout << n % 10 << " ";
    n /= 10;
  }
}

int countDigits(int n)
{
  int count = 0;
  while (n != 0)
  {
    count++;
    n /= 10;
  }
  return count;
}

bool armstrong(int n)
{
  int digits = countDigits(n);
  int sum = 0;
  int temp = n;
  while (temp != 0)
  {
    sum += pow(temp % 10, digits);
    temp /= 10;
  }
  return sum == n;
}

int reverse(int n)
{
  int ans = 0;
  while (n != 0)
  {
    ans += (n % 10);
    ans *= 10;
    n /= 10;
  }
  return ans / 10;
}

bool palindrome(int n)
{
  return n == reverse(n);
}

int gcd(int n, int m)
{
  while (n != m)
  {
    if (n > m)
    {
      n -= m;
    }
    else if (m > n)
    {
      m -= n;
    }
  }
  return n;
}
int main()
{
  cout << gcd(30, 21) << endl;
  return 0;
}