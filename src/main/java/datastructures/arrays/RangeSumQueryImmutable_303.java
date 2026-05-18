package datastructures.arrays;

public class RangeSumQueryImmutable_303 {

    private final int[] arr;

    public RangeSumQueryImmutable_303(int[] nums) {
       arr = new int[nums.length];
       arr[0] = nums[0];
       for (int i=1;i< nums.length;i++) {
           arr[i] = arr[i-1]+nums[i];
       }
    }

    public int sumRange(int left, int right) {
        if (left==0) return arr[right];
        return arr[right]-arr[left-1];
    }

    public static void main(String[] args) {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        RangeSumQueryImmutable_303 r = new RangeSumQueryImmutable_303(nums);
        System.out.println(r.sumRange(2,4));
    }
}
