#include<iostream>
using namespace std;
int main()
{
  char s[50];

  cout << "Enter your name" << endl;
  cin.get(s, 50);

  cout << "Hi " << s << endl;

  char s2[50];

  cin.ignore();

  cout << "Enter your name again" << endl;
  cin.get(s2, 50);

  cout << "Hi again " << s2 << endl;
  return 0;
}