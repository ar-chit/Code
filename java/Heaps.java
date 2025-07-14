public class Heaps {
    public static class Heap {
        public int arr[];
        public int size;

        Heap() {
            arr = new int[101];
            arr[0] = -1;
            size = 0;
        }

        public void insert(int value) {
            size = size + 1;
            int index = size;
            arr[index] = value;

            while (index > 1) {
                int parentIndex = index / 2;
                if (arr[parentIndex] < arr[index]) {
                    swap(arr, index, parentIndex);
                    index = parentIndex;
                } else {
                    break;
                }
            }
        }

        public int delete() {
            int ans = arr[1];
            arr[1] = arr[size];
            size--;

            int index = 1;
            while (index < size) {
                int left = 2 * index;
                int right = 2 * index + 1;

                int largest = index;

                if (left < size && arr[largest] < arr[left]) {
                    largest = left;
                }
                if (right < size && arr[largest] < arr[right]) {
                    largest = right;
                }

                if (largest == index) {
                    return ans;
                } else {
                    swap(arr, index, largest);
                    index = largest;
                }
            }

            return ans;
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void heapify(int arr[], int n, int i) {
        int index = i;
        int leftIndex = 2 * i;
        int rightIndex = 2 * i + 1;
        int largest = index;
        if (leftIndex < n && arr[largest] < arr[leftIndex]) {
            largest = leftIndex;
        }
        if (rightIndex < n && arr[largest] < arr[rightIndex]) {
            largest = rightIndex;
        }
        if (index != largest) {
            swap(arr, index, largest);
            heapify(arr, largest, n);
        }
    }

    public static void buildHeap(int arr[]) {
        int n = arr.length;
        for (int i = n / 2; i > 0; i--) {
            heapify(arr, n, i);
        }
    }

    public static void heapSort(int arr[]) {
        int n = arr.length;
        for (int i = n - 1; i > 0; i--) {
            swap(arr, 1, i);
            heapify(arr, i, 1);
        }
        
    }

    public static void main(String[] args) {
        // Heap h = new Heap();
        // h.arr[0] = -1;
        // h.arr[1] = 100;
        // h.arr[2] = 50;
        // h.arr[3] = 60;
        // h.arr[4] = 40;
        // h.arr[5] = 45;

        // h.size = 5;
        // for (int i = 0; i <= h.size; i++) {
        // System.out.print(h.arr[i] + " ");
        // }

        // System.out.println();

        // h.insert(101);

        // for (int i = 0; i <= h.size; i++) {
        // System.out.print(h.arr[i] + " ");
        // }

        // Heap h2 = new Heap();
        // h2.insert(50);
        // h2.insert(30);
        // h2.insert(70);
        // h2.insert(40);
        // h2.insert(80);
        // h2.insert(100);

        // for (int i = 0; i <= h2.size; i++) {
        //     System.out.print(h2.arr[i] + " ");
        // }

        // System.out.println();

        // h2.delete();

        // for (int i = 0; i <= h2.size; i++) {
        //     System.out.print(h2.arr[i] + " ");
        // }

        int arr[] = { -1, 12, 15, 13, 11, 14 };

        buildHeap(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        // heapSort(arr);

        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }
    }

}
