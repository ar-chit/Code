import java.util.ArrayList;

public class matrix {
    public static void printing(int arr[][], int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    public static void rowWiseSum(int arr[][]) {
        int row = arr.length;
        int col = arr[0].length;
        int ans[] = new int[row];
        for (int i = 0; i < row; i++) {
            int element = 0;
            for (int j = 0; j < col; j++) {
                element = element + arr[i][j];
            }
            ans[i] = element;
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    public static void columnWiseSum(int arr[][], int row, int col) {
        ArrayList<Integer> sum = new ArrayList<Integer>();
        for (int j = 0; j < col; j++) {
            int element = 0;
            for (int i = 0; i < row; i++) {
                element = element + arr[i][j];
            }
            sum.add(element);
        }
        System.out.println(sum);
    }

    public static void search(int arr[][], int row, int col, int key) {
        boolean found = false;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (key == arr[i][j]) {
                    i += 1;
                    j += 1;
                    System.out.print("[" + i + ", " + j + "]");
                    found = true;
                }
            }
        }
        if (found == false) {
            System.out.println("Not found");
        }
    }

    public static void getMax(int arr[][], int row, int col) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println(max);
    }
    
    public static void getMin(int arr[][], int row, int col) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }
        System.out.println(min);
    }

    public static void transpose(int arr[][], int row, int col) {
        int brr[][] = new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                brr[j][i] = arr[i][j];
            }
        }

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(brr[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String args[]) {
        int arr[][] = { { 1, 2, 3, 10 }, { 4, 5, 6, 11 }, { 7, 8, 9, 12 } };
        // printing(arr, 3, 4);
        rowWiseSum(arr);
        // columnWiseSum(arr, 3, 4);
        // search(arr, 3, 4, 69);
        // getMax(arr, 3, 4);
        // getMin(arr, 3, 4);
        // transpose(arr, 3, 4);

    }
}

