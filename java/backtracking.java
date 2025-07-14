import java.util.ArrayList;

public class backtracking {

    public static String swapCharacters(String str, int index1, int index2) {
        char[] charArray = str.toCharArray();
        char temp = charArray[index1];
        charArray[index1] = charArray[index2];
        charArray[index2] = temp;
        return new String(charArray);
    }

    public static void printPermutation(ArrayList<String> ans, String str, int i) {
        if (i >= str.length()) {
            ans.add(str);
            return;
        }
        for (int j = i; j < str.length(); j++) {
            str = swapCharacters(str, i, j);
            printPermutation(ans, str, i + 1);
            str = swapCharacters(str, i, j); 
        }
    }
  
    public static void main(String[] args) {
    ArrayList<String> ans = new ArrayList<String>();
    String str = "prosperity";

    printPermutation(ans, str, 0);
    System.out.println(ans);
  }
}
