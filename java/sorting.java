public class sorting {

  public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void selectionSort(int arr[]) {
    for (int i = 0; i < arr.length - 1; i++) {
      int min = i;
      for (int j = i + 1; j < arr.length; j++) {
        if ((arr[j] < arr[min])) {
          min = j;
        }
      }
      swap(arr, i, min);
    }

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void bubbleSort(int arr[]) {
    for (int round = 1; round < arr.length; round++) {
      boolean swapped = false;
      for (int j = 0; j < arr.length - round; j++) {
        if (arr[j] > arr[j + 1]) {
          swap(arr, j, j + 1);
          swapped = true;
        }
      }
      if (swapped == false) {
        break;
      }
    }

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void insertionSort(int arr[]) {
    for (int i = 1; i < arr.length; i++) {
      int val = arr[i];
      int j = i - 1;
      for (; j >= 0; j--) {
        if (arr[j] > val) {
          arr[j + 1] = arr[j];
        } else {
          break;
        }
      }

      arr[j + 1] = val;
    }

    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void main(String[] args) {
    int arr[] = { 69, 42, 30, 55, 78, 55, 1, 0 };
    // selectionSort(arr);
    // bubbleSort(arr);
    insertionSort(arr);
  }
}
