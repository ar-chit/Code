import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class queue {

  public static Queue<Integer> reverse(Queue<Integer> q) {
    Stack<Integer> st = new Stack<Integer>();
    while (!q.isEmpty()) {
      st.push(q.remove());
    }
    while (!st.isEmpty()) {
      q.add(st.pop());
    }
    return q;
  }

  public static void reverseWithRecursion(Queue<Integer> q) {
    if (q.isEmpty()) {
      return;
    }

    int element = q.remove();

    reverseWithRecursion(q);

    q.add(element);

    printQueue(q);
  }

  public static Queue<Integer> reverseK(Queue<Integer> q, int k) {
    if (q.isEmpty() || k <= 0 || k > q.size()) {
      return q;
    }
    Stack<Integer> st = new Stack<Integer>();

    int count = 0;

    while (count != k) {
      st.push(q.remove());
      count++;
    }

    while (count != 0) {
      q.add(st.pop());
      count--;
    }

    count = q.size() - k;

    while (count != 0) {
      q.add(q.remove());
      count--;
    }

    return q;
  }

  public static Queue<Integer> interleavQueue(Queue<Integer> q) {
    Queue<Integer> temp = new LinkedList<Integer>();
    int mid = q.size() / 2;
    int count = 0;

    while (count < mid) {
      temp.add(q.remove());
      count++;
    }

    while (!q.isEmpty() && !temp.isEmpty()) {
      q.add(temp.remove());
      q.add(q.remove());
    }

    while (!q.isEmpty()) {
      q.add(q.remove());
    }

    return q;
  }

  public static ArrayList<Integer> firstNegativeInteger(int arr[], int k) {
    ArrayList<Integer> ans = new ArrayList<Integer>();
    Queue<Integer> q = new LinkedList<Integer>();

    for (int i = 0; i < k; i++) {
      if (arr[i] < 0) {
        q.add(i);
      }
    }

    for (int i = k; i < arr.length; i++) {
      if (q.isEmpty()) {
        ans.add(0);
      } else {
        ans.add(arr[q.peek()]);
      }

      while (!q.isEmpty() && i - q.peek() >= k) {
        q.remove();
      }

      if (arr[i] < 0) {
        q.add(i);
      }
    }

    if (q.isEmpty()) {
      ans.add(0);
    } else {
      ans.add(arr[q.peek()]);
    }

    return ans;
  }

  public static void printQueue(Queue<Integer> q) {
    while (!q.isEmpty()) {
      System.out.println(q.remove());
    }
  }

  public static void main(String[] args) {
    Queue<Integer> q = new LinkedList<>();
    q.add(3);
    q.add(6);
    q.add(9);
    q.add(8);
    q.add(12);

    // System.out.println(reverse(q));
    // System.out.println(q);
    // System.out.println(reverseK(q, 6));
    // System.out.println(interleavQueue(q));
    int arr[] = { 12, -1, -7, 8, -15, 30, 16, 28 };
    System.out.println(firstNegativeInteger(arr, 3));
  }
}
