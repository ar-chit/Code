#include <iostream>
#include <cstring>

using namespace std;

int length(char S[])
{
  return strlen(S);
}
char *concat(char S1[], char S2[])
{
  strcat(S1, S2);
  return S1;
}

char *concat(char S1[], char S2[], int length)
{
  strncat(S1, S2, length);
  return S1;
}

char *copy(char Source[], char Destination[])
{
  return strcpy(Destination, Source);
}

char *copy(char Source[], char Destination[], int length)
{
  return strncpy(Destination, Source, length);
}

char *strstrFn(char main[], char sub[])
{
  return strstr(main, sub);
}

char *strchrFn(char S[], char ch)
{
  return strchr(S, ch);
}

char *strrchrFn(char S[], char ch)
{
  return strrchr(S, ch);
}

int dictionaryOrder(char S1[], char S2[]){
  return strcmp(S1, S2);
}

long stringToLong(char str[], char **endptr, int base)
{
  return strtol(str, endptr, base);
}

float stringToFloat(char str[], char **endptr)
{
  return strtof(str, endptr);
}

int main()
{
  char S1[10] = "54.78";
  char *endptr;

  cout << stringToFloat(S1, &endptr) << endl;
  return 0;
}