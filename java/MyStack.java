class Stack {

        private int arr[];
        private int top;
        private int size;

        public Stack(int size) {
            this.arr = new int[size];
            this.size = size;
            this.top = -1;
        }

        public void push(int data) {
            if (size - top > 1) {
                top++;
                arr[top] = data;
            } else {
                System.out.println("Stack Overflow");
            }
        }

        public void pop() {
            if (top == -1) {
                System.out.println("Stack Underflow");
            } else {
                top--;
            }
        }

        public int peek() {
            if (top == -1) {
                System.out.println("Stack Empty");
            }
            return arr[top];
        }

        public int size() {
            return top + 1;
        }

        public boolean isEmpty() {
            if (top == -1) {
                return true;
            }
            return false;
        }
    }

public class MyStack {
    public static void main(String[] args) {
        Stack s = new Stack(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }

        System.out.println(s.size());
        
    }
}
