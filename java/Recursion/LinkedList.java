public class LinkedList {

  public static class Node {

    int data;
    Node next;

    public Node() {
      this.data = 0;
      this.next = null;
    }

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public static Node head;
  public static Node tail;

  public void insertAtHead(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = tail = newNode;
      return;
    }
    newNode.next = head;
    head = newNode;
  }

  public void insertAtTail(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = tail = newNode;
      return;
    }
    tail.next = newNode;
    tail = newNode;
  }

  public int length() {
    int length = 0;
    Node temp = head;
    while (temp != null) {
      temp = temp.next;
      length++;
    }
    return length;
  }

  public void insertAtPosition(int position, int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = tail = newNode;
      return;
    }

    if (position <= 1) {
      insertAtHead(data);
      return;
    }

    int listLength = length();

    if (position > listLength) {
      insertAtTail(data);
      return;
    }

    int i = 1;
    Node previous = head;
    while (i < position - 1) {
      previous = previous.next;
      i++;
    }

    Node current = previous.next;

    previous.next = newNode;
    newNode.next = current;
  }

  public void deleteNode(int position) {
    if (head == null) {
      System.out.println("Empty List");
      return;
    }

    int listLength = length();

    if (position <= 0 || position > listLength) {
      System.out.println("Position not valid");
      return;
    }

    if (position == 1) {
      Node temp = head;
      head = head.next;
      temp.next = null;
      return;
    }

    if (position == listLength) {
      int i = 1;
      Node previous = head;
      while (i < position - 1) {
        previous = previous.next;
        i++;
      }
      previous.next = null;
      tail = previous;
      return;
    }

    int i = 1;
    Node previous = head;
    while (i < position - 1) {
      previous = previous.next;
      i++;
    }
    Node current = previous.next;
    previous.next = current.next;
    current.next = null;
  }

  public void print() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
    System.out.println();
  }

  public void reverse() {
    Node prev = null;
    Node curr = head;
    while (curr != null) {
      Node temp = curr.next;
      curr.next = prev;
      prev = curr;
      curr = temp;
    }
    head = prev;
  }

  public int mid() {
    Node slow = head;
    Node fast = head;
    while (fast != null) {
      fast = fast.next;
      if (fast != null) {
        fast = fast.next;
        slow = slow.next;
      }
    }
    return slow.data;
  }

  public boolean checkCycle() {
    Node slow = head;
    Node fast = head;
    while (fast != null) {
      fast = fast.next;
      if (fast != null) {
        fast = fast.next;
        slow = slow.next;
      }

      if (slow == fast) {
        return true;
      }
    }
    return false;
  }

  public Node startingPointOfCycle() {
    Node slow = head;
    Node fast = head;
    while (fast != null) {
      fast = fast.next;
      if (fast != null) {
        fast = fast.next;
        slow = slow.next;
        if (slow == fast) {
          slow = head;
          while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
          }
          return slow;
        }
      }
    }
    return null;
  }

  //Recursion
  public void print(Node temp) {
    if (temp == null) {
      return;
    }
    System.out.print(temp.data + " ");
    print(temp.next);
  }

  public int length(Node temp, int count) {
    if (temp == null) {
      return count;
    }
    return length(temp.next, count + 1);
  }

  public void printKfromEnd(Node temp, int k, int index) {
    int pos = length() - k;
    if (index == pos) {
      System.out.println(temp.data);
      return;
    }
    printKfromEnd(temp.next, k, index + 1);
  }

  public Node reverse(Node current) {
    if (current == null || current.next == null) {
      return current;
    }

    Node newHead = reverse(current.next);
    current.next.next = current;
    current.next = null;
    return newHead;
  }

  public Node reverseKGroup(Node head, int k) {
    if (head == null) {
      return head;
    }
    Node prev = null;
    Node curr = head;
    int count = 0;
    Node forward = null;
    while (curr != null && count < k) {
      forward = curr.next;
      curr.next = prev;
      prev = curr;
      curr = forward;
      count++;
    }
    if (forward != null) {
      head.next = reverseKGroup(forward, k);
    }
    return prev;
  }

  public static void main(String[] args) {
    LinkedList ll = new LinkedList();
    ll.insertAtHead(20);
    ll.insertAtHead(10);
    ll.insertAtTail(30);
    ll.insertAtTail(40);
    ll.insertAtTail(50);
    ll.insertAtTail(60);
    ll.insertAtHead(20);
    ll.insertAtHead(10);
    ll.insertAtTail(35);
    ll.insertAtTail(40);
    ll.insertAtTail(50);
    ll.print();
    // ll.print(head);
    // System.out.println(ll.length());
    // System.out.println(ll.length(head, 0));
    // ll.printKfromEnd(head, 6, 0);
    head = ll.reverse(head);
    ll.print();
  }
}
