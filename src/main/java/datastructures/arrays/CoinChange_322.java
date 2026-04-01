package datastructures.arrays;

import java.util.Arrays;

public class CoinChange_322 {

    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        Arrays.fill(dp, amount+1);
        dp[0] = 0;
        for (int i=1;i<=amount;i++) {
            for (int coin : coins) {
                if (coin <= i) {
                    dp[i] = Math.min(dp[i], 1+dp[i-coin]);
                }
            }
        }
        if (dp[amount] > amount) {
            return -1;
        } else {
            return dp[amount];
        }
    }

    public static void main(String[] args) {
        int[] coins = {1,2,5};
        CoinChange_322 coinChange322 = new CoinChange_322();
        System.out.println(coinChange322.coinChange(coins,11));
    }
}
