public class TwoInOneStack {
    class Stack {
        private int arr[];
        private int size;
        private int top1;
        private int top2;

        public Stack(int size) {
            this.arr = new int[size];
            this.size = size;
            this.top1 = -1;
            this.top2 = size;
        }

        public void push1(int data) {
            if (top2 - top1 == 1) {
                System.out.println("Stack Overflow");
            } else {
                top1++;
                arr[top1] = data;
            }
        }
        
        public void pop1() {
            if (top1 == -1) {
                System.out.println("Stack1 Underflow");
            } else {
                top1--;
            }
        }
        
        public void push2(int data) {
            if (top2 - top1 == 1) {
                System.out.println("Stack Overflow");
            } else {
                top2--;
                arr[top2] = data;
            }
        }
        
        public void pop2() {
            if (top2 == size) {
                System.out.println("Stack2 Underflow");
            } else {
                top2++;
            }
        }
    }
}
