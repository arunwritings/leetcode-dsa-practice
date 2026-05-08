package datastructures.arrays;

public class MinimumSizeSubarraySum_209 {

    public int minSubArrayLen(int target, int[] nums) {
        int left=0, sum=0;
        int minLength = Integer.MAX_VALUE;
        int length = nums.length;
        for (int right=0;right<length;right++) {
            sum+=nums[right];
            while (sum>=target) {
                minLength = Math.min(minLength, right-left+1);
                sum-=nums[left];
                left++;
            }
        }
        return minLength==Integer.MAX_VALUE ? 0 : minLength;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1,1,1,1};
        MinimumSizeSubarraySum_209 m = new MinimumSizeSubarraySum_209();
        System.out.println(m.minSubArrayLen(11, nums));
    }
}
