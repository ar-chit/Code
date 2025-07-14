public class Recursion {

    public static void printNto1(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        printNto1(n - 1);
    }

    public static void print1toN(int n) {
        if (n == 0) {
            return;
        }
        print1toN(n - 1);
        System.out.print(n + " ");
    }

    public static void printDecAndInc(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        printDecAndInc(n - 1);
        System.out.print(n + " ");
    }
    
    public static int factorial(int n) {
        if (n == 1) {
            return 0;
        }
        return n * factorial(n - 1);
    }


    public static void main(String[] args) {
        // printNto1(6);
        // print1toN(6);
        // printDecAndInc(6);
        System.out.println(factorial(5));
    }
}
