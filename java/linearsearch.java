public class linearsearch {
    public static int linearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i + 1;
            }
        }
        return -1;
    }
    
    public static int rangeSearch(int arr[], int key, int start, int end) {
        for (int i = start; i < end; i++) {
            if (arr[i] == key) {
                return i + 1;
            }
        }
        return -1;
    }

    public static int stringSearch(String str, char key) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == key) {
                return i + 1;
            }
        }
        return -1;
    }
    
    public static void twoDSearch(int brr[][], int key) {
        int row = brr.length;
        int col = brr[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (brr[i][j] == key) {
                    System.out.println("row: " + i + " column: " + j);
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        String str = "Daddy";
        int brr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        // System.out.println(linearSearch(arr, 5));
        // System.out.println(rangeSearch(arr, 1, 0, 5));
        // System.out.println(stringSearch(str, 'y'));
        twoDSearch(brr, 8);
    }
}
