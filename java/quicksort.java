public class quicksort {

  public void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public int partition(int arr[], int start, int end) {
    int pivotIndex = start;
    int pivotElement = arr[start];

    int count = 0;
    for (int i = start + 1; i <= end; i++) {
      if (arr[i] <= pivotElement) {
        count++;
      }
    }

    int rightIndex = start + count;

    swap(arr, pivotIndex, rightIndex);

    pivotIndex = rightIndex;

    int i = start;
    int j = end;

    while (i < pivotIndex && j > pivotIndex) {
      while (arr[i] <= pivotElement) {
        i++;
      }
      while (arr[j] > pivotElement) {
        j--;
      }

      if (i < pivotIndex && j > pivotIndex) {
        swap(arr, i, j);
      }
    }

    return pivotIndex;
  }

  public void sort(int arr[], int start, int end) {
    if (start >= end) {
      return;
    }

    int pivot = partition(arr, start, end);
    sort(arr, start, pivot - 1);
    sort(arr, pivot + 1, end);
  }

  public static void printArray(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void main(String[] args) {
    int arr[] = { 23, 14, 75, 9, 85, 24, 64 };
    printArray(arr);

    quicksort st = new quicksort();
    st.sort(arr, 0, arr.length - 1);

    System.out.println();
    printArray(arr);
  }
}
