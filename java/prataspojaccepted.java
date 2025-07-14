import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class prataspojaccepted {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] nextIntArray(int n) {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = nextInt();
            }
            return arr;
        }
    }

    public static boolean isPossibleSol(int ranks[], int chiefs, int paranthas, int mid) {
        int paranthasCooked = 0;
        for (int i = 0; i < ranks.length; i++) {
            int totalTime = 0;
            int paranthasPerChief = 1;
            while (totalTime <= mid) {
                totalTime += ranks[i] * paranthasPerChief;
                if (totalTime > mid) {
                    break;
                }
                paranthasPerChief++;
                paranthasCooked++;
                if (paranthasCooked >= paranthas) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int minTime(int ranks[], int chiefs, int paranthas) {
        int start = 0;
        int end = ranks[chiefs - 1] * (paranthas * (paranthas + 1) / 2);
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isPossibleSol(ranks, chiefs, paranthas, mid)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        FastReader reader = new FastReader();
        int testCases = reader.nextInt();

        for (int t = 0; t < testCases; t++) {
            int paranthas = reader.nextInt();
            int chiefs = reader.nextInt();
            int[] ranks = reader.nextIntArray(chiefs);

            int minCookingTime = minTime(ranks, chiefs, paranthas);
            System.out.println(minCookingTime);
        }
    }
}
