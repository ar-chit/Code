public class arrayqs {
    public static void sum(int arr[], int brr[]) {
        int a = 0;
        int arrlength = arr.length;
        for (int i = arrlength - 1; i >= 0; i--) {
            a = a + arr[i];
            a *= 10;
        }
        
        a /= 10;
        System.out.println(a);
        int b = 0;
        int brrlength = brr.length;
        for (int i = brrlength - 1; i >= 0; i--) {
            b = b + brr[i];
            b *= 10;
        }
        b /= 10;
        System.out.println(b);

    }
    public static void main(String args[]) {
        int arr[] = { 9, 5, 4, 9 };
        int brr[] = { 2, 1, 4 };
        sum(arr, brr);
    }
}
