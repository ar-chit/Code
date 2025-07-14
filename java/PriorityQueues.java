import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueues {
    public static int getKthSmallestElement(int arr[], int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Comparator.reverseOrder());

        for (int i = 0; i < k; i++) {
            pq.add(arr[i]);
        }

        for (int i = k; i < arr.length; i++) {
            if (arr[i] < pq.peek()) {
                pq.poll();
                pq.add(arr[i]);
            }
        }

        return pq.peek();
    }

    public static int getKttGreatestElement(int arr[], int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        for (int i = 0; i < k; i++) {
            pq.add(arr[i]);
        }

        for (int i = k; i < arr.length; i++) {
            if (arr[i] > pq.peek()) {
                pq.poll();
                pq.add(arr[i]);
            }
        }

        return pq.peek();
    }

    public static void main(String[] args) {
        PriorityQueue<Integer> maxPQ = new
        PriorityQueue<Integer>(Comparator.reverseOrder());
        maxPQ.add(8);
        maxPQ.add(7);
        maxPQ.add(6);
        maxPQ.add(5);
        maxPQ.add(4);
        while (!maxPQ.isEmpty()) {
            System.out.println(maxPQ.poll());
        }
        // maxPQ.poll();
        // System.out.println(maxPQ.peek());
        // maxPQ.poll();
        // System.out.println(maxPQ.peek());
        // maxPQ.poll();
        // System.out.println(maxPQ.peek());
        // maxPQ.poll();
        // System.out.println(maxPQ.peek());
        // maxPQ.poll();

        // System.out.println(maxPQ.size());

        // if (maxPQ.isEmpty()) {
        // System.out.println("is empty");
        // } else {
        // System.out.println("not empty");
        // }

        // System.out.println();

        // PriorityQueue<Integer> minPQ = new PriorityQueue<Integer>();

        // minPQ.add(3);
        // minPQ.add(6);
        // minPQ.add(9);
        // minPQ.add(4);
        // minPQ.add(8);

        // System.out.println(minPQ.peek());
        // minPQ.poll();
        // System.out.println(minPQ.size());
        // minPQ.poll();
        // System.out.println(minPQ.peek());
        // minPQ.poll();
        // System.out.println(minPQ.peek());
        // minPQ.poll();
        // System.out.println(minPQ.peek());
        // minPQ.poll();

        // if (minPQ.isEmpty()) {
        //     System.out.println("is empty");
        // } else {
        //     System.out.println("not empty");
        // }

        // int arr[] = { 10, 5, 20, 4, 15 };
        // System.out.println(getKthSmallestElement(arr, 3));
        // System.out.println(getKttGreatestElement(arr, 3));
    }
}
