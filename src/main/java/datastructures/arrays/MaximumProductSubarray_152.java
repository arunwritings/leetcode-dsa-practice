package datastructures.arrays;

public class MaximumProductSubarray_152 {

    public int maxProduct(int[] nums) {
        int res = nums[0];
        int currentMin = 1, currentMax = 1;
        for (int num : nums) {
            int temp = currentMax * num;
            currentMax = Math.max(Math.max(currentMax*num, currentMin*num), num);
            currentMin = Math.min(Math.min(temp, num*currentMin), num);
            res = Math.max(res, currentMax);
        }
        return res;
    }

    public static void main(String[] args) {
        MaximumProductSubarray_152 m = new MaximumProductSubarray_152();
        System.out.println(m.maxProduct(new int[]{2,3,-2,4}));
    }
}
