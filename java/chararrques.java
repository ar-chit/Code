public class chararrques {
    public static boolean isPalindrome(char[] ch) {
        char[] chCopy = new char[ch.length];
        int j = 0;
        for (int i = ch.length - 1; i >= 0; i--) {
            chCopy[j] = ch[i];
            j++;
        }
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != chCopy[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindromeOptimized(char[] ch) {
        int i = 0;
        int j = ch.length - 1;
        while (i <= j) {
            if (ch[i] != ch[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static char[] convertIntoUpperCase(char[] ch) {
        for (int i = 0; i < ch.length; i++) {
            ch[i] = (char) (ch[i] - 'a' + 'A');
        }
        return ch;
    }

    public static char[] convertIntoLowerCase(char[] ch) {
        for (int i = 0; i < ch.length; i++) {
            ch[i] = (char) (ch[i] - 'A' + 'a');
        }
        return ch;
    }
    public static void main(String args[]) {
        char ch[] = { 'M', 'A', 'D', 'A', 'M' };
        // System.out.println(isPalindrome(ch));
        // System.out.println(isPalindromeOptimized(ch));
        // System.out.println(convertIntoUpperCase(ch));
        System.out.println(convertIntoLowerCase(ch));

    }
    
}
