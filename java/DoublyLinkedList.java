public class DoublyLinkedList {

  public static class Node {

    int data;
    Node prev;
    Node next;

    Node() {
      this.data = 0;
      prev = null;
      next = null;
    }

    Node(int data) {
      this.data = data;
      prev = null;
      next = null;
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
    head.prev = newNode;
    head = newNode;
  }

  public void insertAtTail(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = tail = newNode;
      return;
    }
    tail.next = newNode;
    newNode.prev = tail;
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
    Node prev = head;
    while (i < position - 1) {
      prev = prev.next;
      i++;
    }
    Node curr = prev.next;

    prev.next = newNode;
    newNode.prev = prev;

    curr.prev = newNode;
    newNode.next = curr;
  }

  public void deleteNode(int position) {
      if (head == null) {
          System.out.println("Empty List");
          return;
      }
    
      if (head.next == null && position == 1) {
          head = null;
          tail = null;
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
        head.prev = null;
        temp.next = null;
        return;
    }

    if (position == listLength) {
        Node temp = tail;
        tail = tail.prev;
        tail.next = null;
        temp.prev = null;
        return;
    }

    int i = 1;
    Node left = head;
    while (i < position - 1) {
        left = left.next;
        i++;
    }
    Node curr = left.next;
    Node right = curr.next;

    left.next = right;
    right.prev = left;

    curr.prev = null;
    curr.next = null;
  }

  public void print() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
    System.out.println();
  }

  public static void main(String[] args) {
    DoublyLinkedList dll = new DoublyLinkedList();
    dll.insertAtHead(10);
    // dll.insertAtHead(20);
    // dll.insertAtHead(30);
    // dll.insertAtHead(40);
    // dll.insertAtTail(60);
    // dll.insertAtTail(80);
    // dll.insertAtPosition(6, 101);
    dll.print();
    dll.deleteNode(1);
    dll.print();
  }
}
