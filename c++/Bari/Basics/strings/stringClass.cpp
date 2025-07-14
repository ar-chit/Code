#include <iostream>
using namespace std;

//  both length and size are same
int length(string s1)
{
  return s1.length();
}

int size(string s1)
{
  return s1.size();
}

//  current max capacity, increases as the size of the string increases
int capacity(string s1)
{
  return s1.capacity();
}

// resizes the capacity
void resize(string &s1, int resize)
{
  s1.resize(resize);
}

// returns the maximum possible size of a string
long maxSize(string s1)
{
  return s1.max_size();
}

void clearString(string &s1)
{
  s1.clear();
}

//  returns whether a string is empty or not
bool emptyString(string s1)
{
  return s1.empty();
}

string appendFn(string main, string toAppend)
{
  return main.append(toAppend);
}

string insertFn(string main, string toInsert, int index, int toInsertChars)
{
  return main.insert(index, toInsert, 0, toInsertChars); //  working
}

string replaceFn(string main, string replaceWith, int index, int numberOfCharsToBeReplaced)
{
  return main.replace(index, numberOfCharsToBeReplaced, replaceWith);
}

string erase(string str)
{
  return str.erase();
}

string push(string str, char ch)
{
  str.push_back(ch);
  return str;
}

string pop(string str)
{
  str.pop_back();
  return str;
}

void swapFn(string &s1, string &s2)
{
  s1.swap(s2);
}

//  returns the index at which the character is present in the main string
int findCharIndex(string main, char ch)
{
  return main.find(ch);
}

//  returns the index at which the string is present in the main string
int findStringIndex(string main, string sub)
{
  return main.find(sub);
}

//  returns the index at which the character is present in the main string, from the left-hand side
int findCharIndexFromEnd(string main, char ch)
{
  return main.rfind(ch);
}

//  returns the index at which the string is present in the main string, from the left-hand side
int findStringIndexFromEnd(string main, string sub)
{
  return main.rfind(sub);
}

//  returns first occurrence of a character in a string
int findFirstIndex(string str, char ch, int startingIndex)
{
  return str.find_first_of(ch, startingIndex);
}

//  returns last occurrence of a character in a string
int findLastIndex(string str, char ch)
{
  return str.find_last_of(ch);
}

string subString(string str, int startingIndex)
{
  return str.substr(startingIndex);
}

string subString(string str, int startingIndex, int numberOfLetters)
{
  return str.substr(startingIndex, numberOfLetters);
}

//  compares strings in dictionary order
int compareStrings(string s1, string s2)
{
  return s1.compare(s2);
}

char getFirstLetter(string str)
{
  return str.front();
}

char getLastLetter(string str)
{
  return str.back();
}

string concat(string s1, string s2)
{
  return s1 + s2;
}

int main()
{
  string s1 = "Programming";
  string s2 = "Something";

  cout << concat(s1, s2) << endl;
  return 0;
}