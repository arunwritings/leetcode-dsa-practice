package datastructures.arrays;

import java.util.Arrays;

public class LongestIncreasingSubsequence_300 {

    public int lengthOfLIS(int[] nums) {
        int len = nums.length;
        int[] dp = new int[len];
        Arrays.fill(dp,1);
        int maxLength = 1;
        for (int i=1;i<len;i++) {
            for (int j=0;j<i;j++) {
                if (nums[j]<nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
            maxLength = Math.max(maxLength, dp[i]);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        LongestIncreasingSubsequence_300 l = new LongestIncreasingSubsequence_300();
        int[] nums = {10,9,2,5,3,7,101,18};
        System.out.println(l.lengthOfLIS(nums));
    }
}
