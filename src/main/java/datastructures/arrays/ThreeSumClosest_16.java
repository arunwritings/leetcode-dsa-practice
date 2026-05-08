package datastructures.arrays;

import java.util.Arrays;

public class ThreeSumClosest_16 {

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest = nums[0]+nums[1]+nums[2];
        for (int i = 0; i <= nums.length-3; i++) {
            int left=i+1; int right = nums.length-1;
            while (left<right) {
                int currentSum = nums[i]+nums[left]+nums[right];
                if (Math.abs(target-currentSum)<Math.abs(target-closest)) {
                    closest = currentSum;
                }
                if (currentSum<target) {
                    left++;
                } else if (currentSum>target) {
                    right--;
                } else return currentSum;
            }
        }
        return closest;
    }

    public static void main(String[] args) {
        int[] nums = {-1,2,1,-4};
        ThreeSumClosest_16 t = new ThreeSumClosest_16();
        System.out.println(t.threeSumClosest(nums, 1));
    }
}
