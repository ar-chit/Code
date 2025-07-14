public class prataspoj {
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
        int end = ranks[chiefs-1]*(paranthas*(paranthas+1)/2);
        int ans = -1;
        
        while (start <= end) {
            int mid = start + (end - start)/2;
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
        int chiefs = 1;
        int paranthas = 8;
        int ranks[] = {1,1,1,1,1,1,1,1};
        System.out.println(minTime(ranks, chiefs, paranthas));
    }
}
