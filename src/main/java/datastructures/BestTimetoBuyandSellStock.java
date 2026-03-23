package datastructures;

public class BestTimetoBuyandSellStock {

    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minCost = prices[0];
        for (int i = 1; i < prices.length; i++) {
            maxProfit = Math.max(maxProfit, prices[i] - minCost);
            minCost = Math.min(minCost, prices[i]);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        BestTimetoBuyandSellStock bestTimetoBuyandSellStock = new BestTimetoBuyandSellStock();
        System.out.println(bestTimetoBuyandSellStock.maxProfit(new int[]{7,1,5,3,6,4}));
    }
}
