import java.util.ArrayList;
import java.util.Scanner;

public class accenture {

  public static int ewMatrix(int arr[], int length) {
    ArrayList<Integer> even = new ArrayList<Integer>();
    ArrayList<Integer> odd = new ArrayList<Integer>();
    for (int i = 0; i < length; i++) {
      if (arr[i] % 2 == 0) {
        even.add(arr[i]);
      } else {
        odd.add(arr[i]);
      }
    }
    System.out.println(even);
    System.out.println(odd);
    return even.get(even.size() - 2) + odd.get(odd.size() - 2);
  }

  public static boolean checkPassword(String str) {
      if (str.length() < 4) {
          return false;
      }
      char firstChar = str.charAt(0);
      if (firstChar >= '0' && firstChar <= '9') {
          return false;
      }
      if (!str.matches(".*\\d.*")) {
        return false;
      }
      if (!str.matches(".*[A-Z].*")) {
          return false;
      }
      if (str.contains("/") || str.contains(" ")) {
          return false;
      }
      return true;
  }
    
    

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int[] arr = new int[size];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();
    System.out.println(ewMatrix(arr, arr.length));
    System.out.println(checkPassword("aj1iosnfD"));
  }
}
