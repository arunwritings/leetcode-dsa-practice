package datastructures.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LongestIncreasingSubsequence_300 {

    public int lengthOfLIS(int[] nums) {
        int len = nums.length;
//        int[] dp = new int[len];
//        Arrays.fill(dp,1);
//        int maxLength = 1;
//        for (int i=1;i<len;i++) {
//            for (int j=0;j<i;j++) {
//                if (nums[j]<nums[i]) {
//                    dp[i] = Math.max(dp[i], dp[j]+1);
//                }
//            }
//            maxLength = Math.max(maxLength, dp[i]);
//        }
//        return maxLength;

        List<Integer> temp = new ArrayList<>();
        temp.add(nums[0]);
        for (int i=1;i<len;i++) {
            if (nums[i] > temp.get(temp.size()-1)) {
                temp.add(nums[i]);
            } else {
                int index = Collections.binarySearch(temp, nums[i]);
                if (index<0) index = -(index+1);
                temp.set(index, nums[i]);
            }
        }
        return temp.size();
    }

    public static void main(String[] args) {
        LongestIncreasingSubsequence_300 l = new LongestIncreasingSubsequence_300();
        int[] nums = {10,9,2,5,3,7,101,18};
        System.out.println(l.lengthOfLIS(nums));
    }
}
