public class Strings {

    public static String reverse(String str, int end, String ans) {
        if (end < 0) {
            return ans;
        }
        return reverse(str, end - 1, ans + str.charAt(end));
    }

    public static void printSubsequences(String str, int index, String ans) {
        if (index == str.length()) {
            System.out.println(ans);
            return;
        }

        //include
        printSubsequences(str, index + 1, ans + str.charAt(index));
        //exclude
        printSubsequences(str, index + 1, ans);
    }
    
    public static String addStrings(String a, String b, int i, int j, int carry, String ans) {
        if (i < 0 && j < 0 && carry == 0) {
            return ans;
        }
        int first = 0;
        int second = 0;
        if (i >= 0) {
            first = a.charAt(i) - '0';
        }
        if (j >= 0) {
            second = b.charAt(j) - '0';
        }
        int sum = first + second + carry;
        int lastDigit = sum % 10;
        carry = sum / 10;

        ans = lastDigit + ans;

        return addStrings(a, b, i - 1, j - 1, carry, ans);

    }
    
    public static void main(String[] args) {
        // String str = "abc";
        // System.out.println(reverse(str, str.length() - 1, ans));
        // printSubsequences(str, 0, ans);
        String a = "43";
        String b = "343";
        String ans = "";
        System.out.println(addStrings(a, b, a.length() - 1, b.length() - 1, 0, ans));
    }
}
