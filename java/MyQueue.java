class Queue {

    private int arr[];
    private int size;
    private int front;
    private int rear;

    Queue(int size) {
        this.size = size;
        this.arr = new int[this.size];
        this.front = 0;
        this.rear = 0;
    }

    public void add(int data) {
        if (rear == size) {
            System.out.println("Q Overflow");
        } else {
            arr[rear] = data;
            rear++;
        }
    }

    public void remove() {
        if (front == rear) {
            System.out.println("Q is empty");
        } else {
            arr[front] = -1;
            front++;
            if (front == rear) {
                front = 0;
                rear = 0;
            }
        }
    }

    public int peek() {
        if (front == rear) {
            System.out.println("Q is empty");
            return -1;
        } else {
            return arr[front];
        }
    }

    public boolean isEmpty() {
        return front == rear ? true : false;
    }

    public int size() {
        return rear - front;
    }
}

class CirQueue {
    private int arr[];
    private int size;
    private int front;
    private int rear;

    CirQueue(int size) {
        this.size = size;
        this.arr = new int[this.size];
        this.front = -1;
        this.rear = -1;
    }

    public void add(int data) {
        if (front == 0 && rear == size - 1) {
            System.out.println("Queue Overloaded");
        } else if (front == -1) {
            front = 0;
            rear = 0;
            arr[rear] = data;
        } else if (rear == size - 1 && front != 0) {
            rear = 0;
            arr[rear] = data;
        } else {
            rear++;
            arr[rear] = data;
        }
    }
    
    public void remove() {
        if (front == -1) {
            System.out.println("Queue is Empty");
        } else if (front == rear) {
            arr[front] = -1;
            front = -1;
            rear = -1;
        } else if (front == size - 1) {
            front = 0;
        } else {
            front++;
        }
    }
}
public class MyQueue {

  public static void main(String[] args) {
    Queue q = new Queue(10);
    q.add(5);
    q.add(15);
    q.add(25);
    q.add(55);

    System.out.println(q.size());

    q.remove();

    System.out.println(q.size());

    System.out.println(q.peek());
  }
}
