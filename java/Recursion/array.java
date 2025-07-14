public class array {
    public static void print1(int arr[], int index) {
        if (index == arr.length) {
            return;
        }
        System.out.print(arr[index] + " ");
        print1(arr, index + 1);
    }

    public static void printReverse1(int arr[], int index) {
        if (index == arr.length) {
            return;
        }
        printReverse1(arr, index + 1);
        System.out.print(arr[index] + " ");
    }

    public static void printReverse2(int arr[], int index) {
        if (index < 0) {
            return;
        }
        System.out.print(arr[index] + " ");
        printReverse2(arr, index - 1);
    }
    
    public static int max1(int arr[], int index) {
        if (index == arr.length) {
            return Integer.MIN_VALUE;
        }
        int ans = arr[index];
        int recAns = max1(arr, index + 1);
        return Math.max(ans, recAns);
    }

    public static int max2(int arr[], int index, int max) {
        if (index == arr.length) {
            return max;
        }
        max = Math.max(arr[index], max);
        return max2(arr, index + 1, max);
    }

    public static int firstIndex(int arr[], int index, int key) {
        if (index == arr.length) {
            System.out.println("Not found");
            return -1;
        }
        if (key == arr[index]) {
            return index;
        }
        return firstIndex(arr, index + 1, key);
    }

    public static int lastIndex(int arr[], int index, int key) {
        if (index == 0) {
            System.out.println("Not found");
            return -1;
        }
        if (key == arr[index]) {
            return index;
        }
        return lastIndex(arr, index - 1, key);
    }

    public static void allOccurances(int arr[], int index, int key) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == key) {
            System.out.print(index + " ");
        }
        allOccurances(arr, index + 1, key);
    }
    
    public static void main(String[] args) {
        int arr[] = { 7, 2, 21, 15, 9, 21, 18 };
        // print(arr, 0);
        // printReverse1(arr, 0);
        // printReverse2(arr, arr.length-1);
        // System.out.println(max1(arr, 0));
        // System.out.println(max2(arr, 0, Integer.MIN_VALUE));
        // System.out.println(firstIndex(arr, 0, 21));
        // System.out.println(lastIndex(arr, arr.length-1, 21));
        allOccurances(arr, 0, 21);
    }
}
