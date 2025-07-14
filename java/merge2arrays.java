public class merge2arrays {

    public static void merge(int a[], int b[]) {
        int arr[] = new int[a.length + b.length];

        int length1 = a.length;
        int length2 = b.length;

        int leftIndex = 0;
        int rightIndex = 0;
        int mainIndex = 0;
        while (leftIndex < length1 && rightIndex < length2) {
            if (a[leftIndex] <= b[rightIndex]) {
                arr[mainIndex++] = a[leftIndex++];
            } else {
                arr[mainIndex++] = b[rightIndex++];
            }
        }

        while (leftIndex < length1) {
            arr[mainIndex++] = a[leftIndex++];
        }

        while (rightIndex < length2) {
            arr[mainIndex++] = b[rightIndex++];
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int a[] = { 1, 2, 8, 9, 12, 13 };
        int b[] = { 3, 4, 7, 10 };
        merge(a, b);
    }
}
