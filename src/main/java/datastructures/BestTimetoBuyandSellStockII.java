package datastructures;

public class BestTimetoBuyandSellStockII {

    public int maxProfit(int[] prices) {
        int maxSum=0;
        for (int i=1;i< prices.length;i++) {
            if (prices[i]>prices[i-1]) {
                maxSum += prices[i]-prices[i-1];
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        BestTimetoBuyandSellStockII bestTimetoBuyandSellStockII = new BestTimetoBuyandSellStockII();
        System.out.println(bestTimetoBuyandSellStockII.maxProfit(new int[]{7,1,5,3,6,4}));
    }
}
