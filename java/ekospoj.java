import java.util.Scanner;
import java.util.Arrays;

class ekospoj {
    public static boolean isPossibleSol(long trees[], long M, long mid) {
        long element = 0;
        for (int i = 0; i < trees.length; i++) {
            if (trees[i] > mid) {
                element += (trees[i] - mid);
            }
        }
        if (element >= M) {
            return true;
        }
        return false;
    }

    public static long maxHeight(long trees[], int N, long M) {
        Arrays.sort(trees);
        long start = 0;
        long end = trees[trees.length - 1];
        long ans = -1;

        while (start <= end) {
            long mid = start + (end - start) / 2;
            if (isPossibleSol(trees, M, mid)) {
                ans = mid;
                start = mid + 1;

            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) throws java.lang.Exception {
            Scanner in = new Scanner(System.in);
            int N = in.nextInt();
            long M = in.nextLong();

            long trees[] = new long[N];

            for (int i = 0; i < N; i++) {
                trees[i] = in.nextInt();
            }
        
            System.out.println(maxHeight(trees, N, M));
            in.close();
    }
}
