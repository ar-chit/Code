#include <iostream>
using namespace std;

int getLength(char* str) {
  int i = 0;
  for (i = 0; str[i] != '\0'; i++) {
  }
  return i;
}

char* toLowerCase(char* str) {
  for (int i = 0; str[i] != '\0'; i++) {
    if (str[i] >= 65 && str[i] <= 90) {
      str[i] += 32;
    }
  }
  return str;
}

char* toUpperCase(char* str) {
  for (int i = 0; str[i] != '\0'; i++) {
    if (str[i] >= 97 && str[i] <= 122) {
      str[i] -= 32;
    }
  }
  return str;
}

char* toggleCase(char* str) {
  for (int i = 0; str[i] != '\0'; i++) {
    if (str[i] >= 65 && str[i] <= 90) {
      str[i] += 32;
    } else if (str[i] >= 97 && str[i] <= 122) {
      str[i] -= 32;
    }
  }
  return str;
}

pair<int, int> vowelsAndConsonantsCount(char* str) {
  int vcount = 0;
  int ccount = 0;

  for (int i = 0; str[i] != '\0'; i++) {
    char ch = tolower(str[i]);
    if (isalpha(ch)) {
      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        vcount++;
      } else {
        ccount++;
      }
    }
  }
  return {vcount, ccount};
}

char* trim(char* str) {
  if (!str) return nullptr;

  char* start = str;
  while (*start && isspace(*start)) {
    ++start;
  }

  char* end = start + strlen(start) - 1;
  while (end >= start && isspace(*end)) {
    --end;
  }

  *(end + 1) = '\0';

  return start;
}

int countWords(char* str) {
  int words = 1;
  char* trimmedStr = trim(str);
  for (int i = 1; trimmedStr[i] != '\0'; i++) {
    if (trimmedStr[i] == 32 && trimmedStr[i - 1] != 32) {
      words++;
    }
  }
  return words;
}

bool isUserValid(char* name) {
  for (int i = 0; name[i] != '\0'; i++) {
    if (!(name[i] >= 65 && name[i] <= 90) &&
        !(name[i] >= 97 && name[i] <= 122) &&
        !(name[i] >= 48 && name[i] <= 57)) {
      return false;
    }
  }
  return true;
}

char* reverse(char* str) {
  int start = 0;
  int end = strlen(str) - 1;
  while (start < end) {
    swap(str[start], str[end]);
    start++;
    end--;
  }
  return str;
}

bool areEqual(const char* str1, const char* str2) {
  int str1length = strlen(str1);
  int str2length = strlen(str2);

  if (str1length != str2length) {
    return false;
  }

  for (int i = 0; i < str1length; i++) {
    if (str1[i] != str2[i]) {
      return false;
    }
  }

  return true;
}

char* greaterString(char* str1, char* str2) {
  for (int i = 0; str1[i] != '\0' && str2[i] != '\0'; i++) {
    char toLowerChar1 = tolower(str1[i]);
    char toLowerChar2 = tolower(str2[i]);
    if (toLowerChar1 != toLowerChar2) {
      return toLowerChar1 > toLowerChar2 ? str1 : str2;
    }
  }

  int str1length = strlen(str1);
  int str2length = strlen(str2);

  if (str1length != str2length) {
    return str1length > str2length ? str1 : str2;
  }

  return nullptr;
}

bool isPalindrome(char* str) {
  int start = 0;
  int end = strlen(str) - 1;

  while (start < end) {
    if (str[start] != str[end]) {
      return false;
    }
    start++;
    end--;
  }

  return true;
}

void duplicates(char* str) {
  int* arr = new int[26]();

  int min = 25;

  for (int i = 0; str[i] != '\0'; i++) {
    str[i] = tolower(str[i]);
    arr[str[i] - 97]++;
    if ((str[i] - 97) < min) {
      min = str[i] - 97;
    }
  }

  for (int i = min; i < 26; i++) {
    if (arr[i] > 1) {
      char duplicateAlpha = i + 97;
      cout << duplicateAlpha << " is repeating for " << arr[i] << " times"
           << endl;
    }
  }

  delete[] arr;
}

void duplicatesUsingBits(char* str) {
  int H = 0;
  for (int i = 0; str[i] != '\0'; i++) {
    str[i] = tolower(str[i]);
    int bit = str[i] - 97;

    int a = 1;
    a = a << bit;

    if (H & a) {
      cout << str[i] << " is repeating" << endl;
    } else {
      H = H | a;
    }
  }
}

bool checkAnagram(char* str1, char* str2) {
  int* H = new int[26]();

  for (int i = 0; str1[i] != '\0'; i++) {
    str1[i] = tolower(str1[i]);
    H[str1[i] - 97]++;
  }

  for (int i = 0; str2[i] != '\0'; i++) {
    str2[i] = tolower(str2[i]);
    H[str2[i] - 97]--;

    if (H[str2[i] - 97] < 0) {
      delete[] H;
      return false;
    }
  }

  delete[] H;
  return true;
}

void perm(char s[], int l, int h) {
  if (l == h) {
    cout << s << endl;
  }

  for (int i = l; i <= h; i++) {
    swap(s[l], s[i]);
    perm(s, l + 1, h);
    swap(s[l], s[i]);
  }
}

int main() {
  char* str1 = new char[10];
  strcpy(str1, "ABC");
  char* str2 = new char[10];
  strcpy(str2, "Medical");
  // char* str2 = new char[10];
  // strcpy(str2, "weld");
  // char* strToLowerCase = toLowerCase(str);
  // char* strToUpperCase = toUpperCase(str);
  // char* toggleStr = toggleCase(str);
  // pair<int, int> count = vowelsAndConsonantsCount(str);

  // cout << "Vowels: " << count.first << endl;
  // cout << "Consonants: " << count.second << endl;
  // cout << countWords(str) << endl;
  // cout << isUserValid(str) << endl;
  // cout << reverse(str) << endl;
  // cout << areEqual(str1, str2) << endl;
  // cout << greaterString(str1, str2) << endl;
  // cout << isPalindrome(str1) << endl;
  // duplicatesUsingBits(str1);
  // cout << checkAnagram(str1, str2) << endl;
  perm(str1, 0, 2);
  return 0;
}