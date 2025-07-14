import java.util.ArrayList;
import java.util.PriorityQueue;

public class MergekSortedArrays {

    public static class info{
        public int data;
        public int row;
        public int col;

        info(int val, int row, int col) {
            this.data = val;
            this.row = row;
            this.col = col;
        }

    }

    public static ArrayList<Integer> merge(int arr[][], int n, int k) {
        PriorityQueue<info> pq = new PriorityQueue<info>((a, b) -> (a.data - b.data));

        for (int i = 0; i < k; i++) {
            info temp = new info(arr[i][0], i, 0);
            pq.add(temp);
        }

        ArrayList<Integer> ans = new ArrayList<Integer>();

        while (!pq.isEmpty()) {
            info temp = pq.peek();
            int topElement = temp.data;
            int topRow = temp.row;
            int topCol = temp.col;
            pq.poll();

            ans.add(topElement);

            if (topCol + 1 < n) {
                info newInfo = new info(arr[topRow][topCol + 1], topRow, topCol + 1);
                pq.add(newInfo);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[][] = { { 2, 4, 6, 8 },
                { 1, 3, 5, 7 },
                { 0, 9, 10, 11 } };
       System.out.println( merge(arr, 4, 3));;
    }
}
