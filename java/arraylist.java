import java.util.ArrayList;

public class arraylist {

  public static void combining(int arr[], int brr[]) {
    ArrayList<Integer> answer = new ArrayList<Integer>();
    for (int i = 0; i < arr.length; i++) {
      answer.add(arr[i]);
    }
    for (int i = 0; i < brr.length; i++) {
      answer.add(brr[i]);
    }
    System.out.print(answer);
  }

  public static void union(int arr[], int brr[]) {
    ArrayList<Integer> answer = new ArrayList<Integer>();
    for (int i = 0; i < arr.length; i++) {
      answer.add(arr[i]);
    }
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < brr.length; j++) {
        if (arr[i] == brr[j]) {
          brr[j] = Integer.MIN_VALUE;
        }
      }
    }
    for (int i = 0; i < brr.length; i++) {
      if (brr[i] != Integer.MIN_VALUE) {
        answer.add(brr[i]);
      }
    }
    System.out.print(answer);
  }

  public static void intersection(int arr[], int brr[]) {
    ArrayList<Integer> answer = new ArrayList<Integer>();
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < brr.length; j++) {
        if (arr[i] == brr[j]) {
          brr[j] = Integer.MIN_VALUE;
          answer.add(arr[i]);
        }
      }
    }
    System.out.println(answer);
  }

  public static void pairSum(int arr[], int key) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = i; j < arr.length; j++) {
        if (arr[i] + arr[j] == key) {
          System.out.println("(" + arr[i] + ", " + arr[j] + ")");
        }
      }
    }
  }

  public static void tripleSum(int arr[], int key) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        for (int k = j + 1; k < arr.length; k++) {
          if (arr[i] + arr[j] + arr[k] == key) {
            System.out.println(
              "(" + arr[i] + ", " + arr[j] + ", " + arr[k] + ")"
            );
          }
        }
      }
    }
  }

  public static void zeroesAndOnes(int arr[]) {
    int zeroes = 0;
    int ones = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 0) {
        zeroes++;
      }
      if (arr[i] == 1) {
        ones++;
      }
    }
    ArrayList<Integer> answer = new ArrayList<Integer>();
    for (int i = 0; i < zeroes; i++) {
      answer.add(0);
    }
    for (int i = 0; i < ones; i++) {
      answer.add(1);
    }
    System.out.println(answer);
  }

  public static void rotate(int arr[], int k) {
    ArrayList<Integer> answer = new ArrayList<Integer>();
    for (int i = k + 1; i < arr.length; i++) {
      answer.add(arr[i]);
    }
    for (int i = 0; i <= k; i++) {
      answer.add(arr[i]);
    }
    System.out.println(answer);
  }

  public static void insertion(int arr[], int element, int position) {
    ArrayList<Integer> answer = new ArrayList<Integer>();
    for (int i = 0; i < position - 1; i++) {
      answer.add(arr[i]);
    }
    answer.add(element);
    for (int i = position - 1; i < arr.length; i++) {
      answer.add(arr[i]);
    }
    System.out.println(answer);
  }

  public static void deletion(int arr[], int element) {
    boolean lookup = false;
    int position = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == element) {
        lookup = true;
        position = i;
        break;
      }
    }
    if (lookup == false) {
      System.out.println("This element doesn't exists in the array");
      return;
    }
    ArrayList<Integer> answer = new ArrayList<Integer>();
    for (int i = 0; i < position; i++) {
      answer.add(arr[i]);
    }
    for (int i = position + 1; i < arr.length; i++) {
      answer.add(arr[i]);
    }
    System.out.println(answer);
  }

  public static void reverse(int arr[]) {
    ArrayList<Integer> answer = new ArrayList<Integer>();
    int size = arr.length - 1;
    for (int i = size; i >= 0; i--) {
      answer.add(arr[i]);
    }
    System.out.println(answer);
  }

  public static void main(String args[]) {
    // ArrayList<Integer> arr = new ArrayList<Integer>();
    int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
    // int brr[] = { 2, 2, 3, 3, 4 };
    // combining(arr, brr);
    // union(arr, brr);
    // intersection(arr, brr);
    // tripleSum(arr, 12);
    // zeroesAndOnes(arr);
    // rotate(arr, 3);
    // rotate(arr, 3);
    // insertion(arr, 69, 3);
    // deletion(arr, 5);
    reverse(arr);
  }
}
