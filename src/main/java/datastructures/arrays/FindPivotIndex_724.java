package datastructures.arrays;

import java.util.Arrays;

public class FindPivotIndex_724 {

    public int pivotIndex(int[] nums) {
        int totalSum = Arrays.stream(nums).sum();
        int leftSum=0;
        for (int i=0;i< nums.length;i++) {
            int rightSum = totalSum-leftSum-nums[i];
            if (rightSum==leftSum) return i;
            leftSum += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};
        FindPivotIndex_724 f = new FindPivotIndex_724();
        System.out.println(f.pivotIndex(nums));
    }
}
