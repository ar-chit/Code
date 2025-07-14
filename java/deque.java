import java.util.ArrayDeque;
import java.util.Deque;

public class deque {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<Integer>();
        dq.addFirst(10);
        dq.addFirst(20);
        dq.addLast(30);;

        while (!dq.isEmpty()) {
            System.out.println(dq.getFirst());
            dq.removeFirst();
            dq.removeLast();
        }
    }
}