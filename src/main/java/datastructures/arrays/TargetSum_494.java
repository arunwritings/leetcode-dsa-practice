package datastructures.arrays;

import java.util.Arrays;

public class TargetSum_494 {

    public int findTargetSumWays(int[] nums, int target) {
        int sum = Arrays.stream(nums).sum();
        if (sum<Math.abs(target) || (sum-target)%2 !=0) return 0;
        int n = nums.length;
        int targetSum = (sum-target)/2;
        int[][] dp = new int[n+1][targetSum+1];
        dp[0][0] = 1;
        for (int i=1;i<=n;i++) {
            for (int j=0;j<=targetSum;j++) {
                dp[i][j] = dp[i-1][j];
                if (j>=nums[i-1]) {
                    dp[i][j] += dp[i-1][j-nums[i-1]];
                }
            }
        }
        return dp[n][targetSum];
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1};
        TargetSum_494 targetSum494 = new TargetSum_494();
        System.out.println(targetSum494.findTargetSumWays(nums, 3));
    }

}
