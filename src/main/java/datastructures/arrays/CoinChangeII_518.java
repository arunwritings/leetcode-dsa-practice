package datastructures.arrays;

public class CoinChangeII_518 {

    public int change(int amount, int[] coins) {
        int[] dp = new int[amount+1];
        dp[0] = 1;
        for (int coin : coins) {
            for (int i=coin;i<=amount;i++) {
                dp[i] += dp[i-coin];
            }
        }
        return dp[amount];
    }

    public static void main(String[] args) {
        int[] coins = {1,2,5};
        CoinChangeII_518 c = new CoinChangeII_518();
        System.out.println(c.change(5,coins));
    }
}
