import java.util.ArrayList;
import java.util.Arrays;

public class binsearch {
    public static int binarySearch(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (key == arr[mid]) {
                mid += 1;
                return mid;
            } else if (key < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return -1;
    }

    public static int autoBinarySearch(int arr[], int key) {
        int answer = Arrays.binarySearch(arr, key);
        if (answer >= 0) {
            return answer;
        }
        return -1;
    }

    public static int firstOccurance(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;
        int answer = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (key == arr[mid]) {
                answer = mid + 1;
                end = mid - 1;
            } else if (key < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return answer;
    }

    public static int lastOccurance(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;
        int answer = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (key == arr[mid]) {
                answer = mid + 1;
                start = mid + 1;
            } else if (key < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return answer;
    }

    public static int autoFirstOccurance(int arr[], int key) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            array.add(arr[i]);
        }
        return (array.indexOf(key) + 1);
    }

    public static int autoLastOccurance(int arr[], int key) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            array.add(arr[i]);
        }
        return (array.lastIndexOf(key) + 1);
    }

    public static int sqrtUsingBinSearch(int key) {
        int start = 0;
        int end = key;
        int answer = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if ((mid * mid) == key) {
                answer = mid;
                return answer;
            } else if ((mid * mid) < key) {
                answer = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return answer;
    }

    public static double preciseSquareRoot(int key) {
        double answer = sqrtUsingBinSearch(key);
        double step = 0.1;
        int precision = 50;
        for (int i = 0; i < precision; i++) {
            for (double j = answer; j * j <= key; j = j + step) {
                answer = j;
            }
            step /= 10;
        }
        return answer;
    }

    public static int matrixBinarySearch(int matrix[][], int key) {
        int start = 0;
        int end = (matrix.length * matrix[0].length) - 1;
        int col = matrix[0].length;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int rowIndex = mid / col;
            int colIndex = mid % col;
            int element = matrix[rowIndex][colIndex];
            if (key == element) {
                return colIndex;
            } else if (element > mid) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static int binSearchInNearlySortedArray(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == key) {
                return mid + 1;
            } else if (mid - 1 >= start && arr[mid - 1] == key) {
                return mid;
            } else if (mid + 1 < end && arr[mid + 1] == key) {
                return mid + 2;
            } else if (arr[mid] < key) {
                start = mid + 2;
            } else {
                end = mid - 2;
            }
        }
        return -1;
    }

    public static int divideUsingBinSearch(int dividend, int divisor) {
        int absoluteDividend = Math.abs(dividend);
        int absoluteDivisor = Math.abs(divisor);

        int start = 0;
        int end = absoluteDividend;
        int quotient = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid * absoluteDivisor == absoluteDividend) {
                quotient = mid;
                break;
            } else if (mid * absoluteDivisor < absoluteDividend) {
                quotient = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        if ((dividend < 0 && divisor < 0) || (dividend > 0 && divisor > 0)) {
            return quotient;
        }
        return -quotient;
    }

    public static int singleElementInASortedArray(int arr[]) {
        int start = 0;
        int end = arr.length-1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (start == end) {
                return arr[start];
            }
            if (mid % 2 == 0) {
                if (arr[mid] == arr[mid + 1]) {
                    start = mid + 2;
                } else {
                    end = mid;
                }
            } else {
                if (arr[mid] == arr[mid - 1]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    public static int exponentialSearch(int arr[], int key) {
        if (arr[0] == key) {
            return 0;
        }
        int i = 1;
        while (i < arr.length && arr[i] <= key) {
            i = i * 2;
        }
        int answer = Arrays.binarySearch(arr, i / 2, Math.min(i, arr.length), key);
        if (answer >= 0) {
            return answer;
        }
        return -1;
    }
    
    public static int optimizedExponentialSearch(int arr[], int key){
        int i = 0;
        int j = 1;
        while (arr[j] < key) {
            j = i;
            j = j * 2;
        }
        int answer = Arrays.binarySearch(arr, i, j, key);
        if (answer >= 0) {
            return answer;
        }
        return -1;
    }
    public static void main(String args[]) {
        int arr[] = { 10, 17, 25, 26, 27, 28, 29, 30, 45, 66, 69, 79, 81, 95 };
        // int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        // System.out.println(binarySearch(arr, 13));
        // System.out.println(autoBinarySearch(arr, 8));
        // System.out.println(firstOccurance(arr, 2));
        // System.out.println(lastOccurance(arr, 8));
        // System.out.println(autoFirstOccurance(arr, 2));
        // System.out.println(lastOccurance(arr, 2));
        // System.out.println(sqrtUsingBinSearch(2147395599));
        // System.out.println(preciseSquareRoot(10));
        // System.out.println(matrixBinarySearch(matrix, 5));
        // System.out.println(binSearchInNearlySortedArray(arr, 80));
        // System.out.println(divideUsingBinSearch(-22, 4));
        // System.out.println(singleElementInASortedArray(arr));
        System.out.println(exponentialSearch(arr, 69));
    }
}
