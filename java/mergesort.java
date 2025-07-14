public class mergesort {

  public void merge(int arr[], int start, int end) {
    int mid = start + (end - start) / 2;
    int length1 = mid - start + 1;
    int length2 = end - mid;

    int left[] = new int[length1];
    int right[] = new int[length2];

    int k = start;
    for (int i = 0; i < length1; i++) {
      left[i] = arr[k++];
    }

    k = mid + 1;
    for (int i = 0; i < length2; i++) {
      right[i] = arr[k++];
    }

    int leftIndex = 0;
    int rightIndex = 0;
    int mainIndex = start;

    while (leftIndex < length1 && rightIndex < length2) {
      if (left[leftIndex] < right[rightIndex]) {
        arr[mainIndex++] = left[leftIndex++];
      } else {
        arr[mainIndex++] = right[rightIndex++];
      }
    }

    while (leftIndex < length1) {
      arr[mainIndex++] = left[leftIndex++];
    }

    while (rightIndex < length2) {
      arr[mainIndex++] = right[rightIndex++];
    }
  }

  public void sort(int arr[], int start, int end) {
    if (start >= end) {
      return;
    }

    int mid = start + (end - start) / 2;
    sort(arr, start, mid);
    sort(arr, mid + 1, end);

    merge(arr, start, end);
  }

  public static void printArray(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void main(String[] args) {
    int arr[] = { 345, 2, 4, 4, 2, 42, 63, 533 };
    printArray(arr);

    mergesort st = new mergesort();
    st.sort(arr, 0, arr.length - 1);

    System.out.println();
    printArray(arr);
  }
}
