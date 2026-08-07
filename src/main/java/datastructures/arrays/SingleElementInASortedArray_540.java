package datastructures.arrays;

public class SingleElementInASortedArray_540 {

    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        if (n==1) return nums[0];
        if (nums[0]!=nums[1]) return nums[0];
        if (nums[n-1]!=nums[n-2]) return nums[n-1];
        int left = 1, right = n-2;
        while (left<=right) {
            int middle = left + (right-left)/2;
            if (nums[middle]!=nums[middle+1] && nums[middle]!=nums[middle-1]) return nums[middle];
            if ((middle%2==0 && nums[middle]==nums[middle+1]) ||
                    (middle%2==1 && nums[middle]==nums[middle-1])) {
                left = middle+1;
            } else {
                right = middle-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,4,4};
        SingleElementInASortedArray_540 s = new SingleElementInASortedArray_540();
        System.out.println(s.singleNonDuplicate(nums));
    }
}
