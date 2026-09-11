public class BestTimeToBuyAndSellStock {

    static int maxProfit(int[] prices) {
        int minPriceSoFar = prices[0];
        int maxProfitSoFar = 0;

        for (int i = 1; i < prices.length; i++) {
            int profitIfSoldToday = prices[i] - minPriceSoFar;
            maxProfitSoFar = Math.max(maxProfitSoFar, profitIfSoldToday);
            minPriceSoFar = Math.min(minPriceSoFar, prices[i]);
        }

        return maxProfitSoFar;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(maxProfit(new int[]{7, 6, 4, 3, 1}));
    }
}
