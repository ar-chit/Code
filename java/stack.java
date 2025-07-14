import java.util.Stack;

public class stack {

  public static void printMiddle(Stack<Integer> s, int totalSize) {
    if (s.size() == Math.abs(totalSize / 2)) {
      System.out.println(s.peek());
      return;
    }

    int temp = s.peek();
    s.pop();

    printMiddle(s, totalSize);

    s.push(temp);
  }

  public void insertSorted(Stack<Integer> s, int target) {
    if (s.isEmpty() || s.peek() >= target) {
      s.push(target);
      return;
    }
    int top = s.peek();
    s.pop();

    insertSorted(s, target);

    s.push(top);
  }

  public void sortStack(Stack<Integer> s) {
    if (s.empty()) {
      return;
    }

    int top = s.peek();
    s.pop();

    sortStack(s);

    insertSorted(s, top);
  }

  public static void insertAtBottom(Stack<Integer> s, int totalSize, int x) {
    if (s.size() == 0) {
      s.push(x);
      return;
    }

    int temp = s.peek();
    s.pop();

    insertAtBottom(s, totalSize, x);

    s.push(temp);
  }

  public static void reverse(Stack<Integer> s) {
    if (s.size() == 0) {
      return;
    }

    int temp = s.peek();

    s.pop();

    reverse(s);

    insertAtBottom(s, s.size(), temp);
  }

  public static void main(String[] args) {
    // Stack<Integer> s1 = new Stack<Integer>();

    // s1.push(10);
    // s1.push(20);
    // s1.push(30);
    // s1.push(40);

    // s1.pop();

    // System.out.println(s1.peek());

    // if (s1.isEmpty()) {
    //     System.out.print("stack is empty");
    // } else{
    //     System.out.println("stack is not empty");
    // }

    // Stack<Integer> s = new Stack<Integer>();

    // s.push(10);
    // s.push(20);
    // s.push(30);
    // s.push(40);

    // System.out.println(s.size());

    // while (!s.isEmpty()) {
    //     System.out.println(s.peek());
    //     s.pop();
    // }

    Stack<Integer> s = new Stack<Integer>();
    //12 6 8 9 9 5 11 5 5 9 6 11
    s.push(12);
    s.push(6);
    s.push(8);
    s.push(9);
    s.push(9);
    s.push(5);
    s.push(11);
    s.push(5);
    s.push(5);
    s.push(9);
    s.push(6);
    s.push(11);

    printMiddle(s, s.size());
  }
}
