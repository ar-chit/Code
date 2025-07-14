class array {

  public static int linearSearch(int arr[], int x) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == x) {
        return i;
      }
    }
    return -1;
  }

  public static void doubling(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] * 2 + " ");
    }
  }

  public static void allValuesOne(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      arr[i] = 1;
      System.out.print(arr[i] + " ");
    }
  }

  public static void printArray(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void incArray(int arr[]) {
    arr[0] += 10;
    printArray(arr);
  }

  public static boolean checkInput(int arr[], int key) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == key) {
        return true;
      }
    }
    return false;
  }

  public static int countZeroesAndOnes(int arr[]) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 0 || arr[i] == 1) {
        count++;
      }
    }
    return count;
  }

  public static int[] countZeroesAndOnesSeperately(int arr[]) {
    int numZero = 0;
    int numOne = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 0) {
        numZero++;
      }
      if (arr[i] == 1) {
        numOne++;
      }
    }
    int result[] = { numZero, numOne };
    return result;
  }

  public static int maxNumber(int arr[]) {
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    return max;
  }

  public static int secondMaxNumber(int arr[]) {
    int secondMax = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != maxNumber(arr) && arr[i] > secondMax) {
        secondMax = arr[i];
      }
    }
    return secondMax;
  }

  public static int minNumber(int arr[]) {
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < min) {
        min = arr[i];
      }
    }
    return min;
  }

  public static void printExtremes(int arr[]) {
    int start = 0;
    int end = arr.length;
    while (start < end) {
      if (start == end - 1) {
        System.out.println(arr[start]);
        break;
      } else {
        System.out.print(arr[start] + " ");
        System.out.print(arr[end - 1] + " ");
        start++;
        end--;
      }
    }
  }

  public static boolean checkSorted(int arr[]) {
    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] > arr[i + 1]) {
        return false;
      }
    }
    return true;
  }

  public static void reverse(int arr[]) {
    int low = 0;
    int high = arr.length - 1;
    while (low < high) {
      int temp = arr[low];
      arr[low] = arr[high];
      arr[high] = temp;
      low++;
      high--;
    }
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void main(String args[]) {
    int arr[] = { 1, 2, 3, 3, 45, 67, 97, 33, 78 };
    // System.out.println(linearSearch(arr, 4));
    // doubling(arr);
    // allValuesOne(arr);
    // printArray(arr);
    // incArray(arr);
    // System.out.println(checkInput(arr, 4));
    // System.out.println(countZeroesAndOnes(arr));
    // int result[] = countZeroesAndOnesSeperately(arr);
    // System.out.println(result[0]);
    // System.out.println(result[1]);
    // System.out.println(maxNumber(arr));
    // System.out.println(secondMaxNumber(arr));
    // System.out.println(minNumber(arr));
    // printExtremes(arr);
    // System.out.println(checkSorted(arr));
    // reverse(arr);
  }
}
