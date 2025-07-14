class buynsell {
    public static int maxProfit(int[] prices) {
        int maximumprofit = Integer.MIN_VALUE;
        for (int days = prices.length; days >= 0; days--) {
            int buy = Integer.MAX_VALUE;
            int buyat = 0;
            for (int j = 0; j < days; j++) {
                if (prices[j] < buy) {
                    buy = prices[j];
                    buyat = j;
                }
            }
            int sell = Integer.MIN_VALUE;
            for (int k = buyat; k < days; k++) {
                if (prices[k] > sell) {
                    sell = prices[k];
                }
            }
            int profit = 0;
            if (sell > buy) {
                profit = sell - buy;
                if (maximumprofit < profit) {
                    maximumprofit = profit;
                }
            }
        }
        if (maximumprofit < 0) {
            maximumprofit = 0;
        }

        return maximumprofit;
    }

    public static void main(String args[]) {
        int prices[] = { 7, 1, 5, 3, 6, 4, 69 };
        System.out.println(maxProfit(prices));
    }
}