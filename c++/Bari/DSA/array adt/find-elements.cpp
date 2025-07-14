#include <iostream>
using namespace std;

struct Array {
  int A[10];
  int size;
  int length;
};

void Display(struct Array *arr) {
  for (int i = 0; arr->length; i++) {
    cout << arr->A[i] << " ";
  }

  cout << endl;
}

int FindSingleMissingElementInSortedArrayStartingFromFirstNaturalNumber(
    struct Array *arr) {
  int sum = 0;

  for (int i = 0; i < arr->length; i++) {
    sum += arr->A[i];
  }

  int s = (arr->A[arr->length - 1] * (arr->A[arr->length - 1] + 1)) / 2;

  return s - sum == 0 ? -1 : s - sum;
}

int FindSingleMissingElementInSortedArrayStartingFromAnywhere(
    struct Array *arr) {
  int diff = arr->A[0];

  for (int i = 0; i < arr->length; i++) {
    if (arr->A[i] - i != diff) {
      return diff + i;
    }
  }

  return -1;
}

void FindMultipleMissingElementsInSortedArray(struct Array *arr) {
  int diff = arr->A[0];

  for (int i = 0; i < arr->length; i++) {
    while (diff < arr->A[i] - i) {
      cout << "Missing element: " << diff + i << endl;
      diff++;
    }
  }
}

void FindMultipleMissingElementsInUnsortedArray(struct Array *arr) {
  int low = INT_MAX, high = INT_MIN;

  for (int i = 0; i < arr->length; i++) {
    if (low > arr->A[i]) {
      low = arr->A[i];
    }
    if (high < arr->A[i]) {
      high = arr->A[i];
    }
  }

  int n = high - low;

  int *H = new int[n]{0};

  for (int i = 0; i < arr->length; i++) {
    H[arr->A[i] - low]++;
  }

  for (int i = 0; i < n; i++) {
    if (H[i] == 0) {
      cout << "Missing element is: " << i + low << endl;
    }
  }

  delete[] H;
}

void FindDuplicateElementsInSortedArray(struct Array *arr) {
  for (int i = 0; i < arr->length - 1; i++) {
    if (arr->A[i] == arr->A[i + 1]) {
      int count = 2;
      i++;
      while (arr->A[i] == arr->A[i + 1]) {
        count++;
        i++;
      }
      cout << arr->A[i] << " is appearing " << count << " times" << endl;
    }
  }
}

void FindDuplicateElementsInSortedArrayUsingHashTable(struct Array *arr) {
  int low = arr->A[0];
  int high = arr->A[arr->length - 1];
  int diff = (high - low) + 1;

  int *H = new int[diff]{0};

  cout << diff << endl;

  for (int i = 0; i < arr->length; i++) {
    H[arr->A[i] - low]++;
  }

  for (int i = 0; i < diff; i++) {
    if (H[i] > 1) {
      cout << i + low << " is appearing " << H[i] << " times" << endl;
    }
  }

  delete[] H;
}

void FindDuplicateElementsInUnsortedArray(struct Array *arr) {
  for (int i = 0; i < arr->length - 1; i++) {
    if (arr->A[i] != -1) {
      int count = 1;
      for (int j = i + 1; j < arr->length; j++) {
        if (arr->A[i] == arr->A[j]) {
          arr->A[j] = -1;
          count++;
        }
      }
      if (count > 1) {
        cout << arr->A[i] << " is appearing " << count << " times" << endl;
      }
    }
  }
}

void FindDuplicateElementsInUnsortedArrayUsingHashTable(struct Array *arr) {
  int low = INT_MAX;
  int high = INT_MIN;

  for (int i = 0; i < arr->length; i++) {
    if (arr->A[i] > high) {
      high = arr->A[i];
    }
    if (arr->A[i] < low) {
      low = arr->A[i];
    }
  }

  if (low == INT_MAX || high == INT_MIN) {
    return;
  }

  int diff = (high - low) + 1;

  int *H = new int[diff]{0};

  for (int i = 0; i < arr->length; i++) {
    H[arr->A[i] - low]++;
  }

  for (int i = 0; i < diff; i++) {
    if (H[i] > 1) {
      cout << i + low << " is appearing " << H[i] << " times" << endl;
    }
  }

  delete[] H;
}

void FindPair(struct Array *arr, const int k) {
  for (int i = 0; i < arr->length - 1; i++) {
    if (arr->A[i] < k) {
      for (int j = i + 1; j < arr->length; j++) {
        if (arr->A[i] + arr->A[j] == k) {
          cout << arr->A[i] << " + " << arr->A[j] << " = " << k << endl;
        }
      }
    }
  }
}

void FindPairUsingHashTable(struct Array *arr, int k) {
  int low = INT_MAX;
  int high = INT_MIN;

  for (int i = 0; i < arr->length; i++) {
    if (arr->A[i] < low) {
      low = arr->A[i];
    }

    if (arr->A[i] > high) {
      high = arr->A[i];
    }
  }

  if (low == INT_MAX || high == INT_MIN) return;

  int *H = new int[high > k ? k + 1 : high + 1]{0};

  for (int i = 0; i < arr->length; i++) {
    if (arr->A[i] <= k) {
      int pair = k - arr->A[i];
      if (H[pair] == 1) {
        cout << arr->A[i] << " + " << pair << " = " << k << endl;
      }
      H[arr->A[i]]++;
    }
  }

  delete[] H;
}

void FindPairInSortedArray(struct Array *arr, int k) {
  int i = 0;
  int j = arr->length;

  while (i < j) {
    if (arr->A[i] + arr->A[j] == k) {
      cout << arr->A[i] << " + " << arr->A[j] << " = " << k << endl;
      i++;
      j--;
    } else if (arr->A[i] + arr->A[j] > k) {
      j--;
    } else {
      i++;
    }
  }
}

void FindMinMax(struct Array *arr) {
  int min = arr->A[0], max = arr->A[0];

  for (int i = 0; i < arr->length; i++) {
    if (arr->A[i] < min) {
      min = arr->A[i];
    } else if (arr->A[i] > max) {
      max = arr->A[i];
    }
  }

  cout << "Max: " << max << endl;
  cout << "Min: " << min << endl;
}

int main() {
  struct Array arr = {{5, 8, 3, 9, 6, 2, 10, 7, -1, 4}, 10, 10};

  // cout <<
  // FindSingleMissingElementInSortedArrayStartingFromFirstNaturalNumber(&arr)
  //      << endl;

  // cout << FindSingleMissingElementInSortedArrayStartingFromAnywhere(&arr) <<
  // endl;

  // FindMultipleMissingElementsInUnsortedArray(&arr);

  // FindDuplicateElementsInSortedArrayUsingHashTable(&arr);

  // FindDuplicateElementsInUnsortedArray(&arr);

  // FindDuplicateElementsInUnsortedArrayUsingHashTable(&arr);

  // FindPairUsingHashTable(&arr, 10);

  // FindPairInSortedArray(&arr, 10);

  FindMinMax(&arr);
}