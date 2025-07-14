class deque {
    private int arr[];
    private int size;
    private int front;
    private int last;

    deque(int size) {
        this.size = size;
        this.arr = new int[size];
        this.front = -1;
        this.last = -1;
    }

    public void addLast(int data) {
        if (front == 0 && last == size - 1) {
            System.out.println("Deque is overloaded");
        } else if (front == -1) {
            front = 0;
            last = 0;
        } else if (last == size - 1 && front != 0) {
            last = 0;
        } else {
            last++;
        }
        arr[last] = data;
    }

    public void removeLast() {
        if (front == -1) {
            System.out.println("Deque is empty");
        } else if (front == last) {
            arr[front] = -1;
            front = -1;
            last = -1;
        } else if (last == 0) {
            arr[last] = -1;
            last = size - 1;
        } else {
            arr[last] = -1;
            last--;
        }
    }

    public void addFirst(int data) {
        if (front == 0 && last == size - 1) {
            System.out.println("Deque is overloaded");
        } else if (front == -1) {
            front = 0;
            last = 0;
        } else if (front == 0 && last != size - 1) {
            front = size - 1;
        } else {
            front--;
        }
        arr[front] = data;
    }

    public void removeFirst() {
        if (front == -1) {
            System.out.println("Deque is empty");
        } else if (front == last) {
            arr[front] = -1;
            front = -1;
            last = -1;
        } else if (front == size - 1) {
            arr[front] = -1;
            front = 0;
        } else {
            arr[front] = -1;
            front++;
        }
    }
}

public class MyDeque {
    public static void main(String[] args) {
        
    }
}
