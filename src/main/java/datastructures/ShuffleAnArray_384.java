package datastructures;

import java.util.Arrays;
import java.util.Random;

public class ShuffleAnArray_384 {

    private int[] nums;
    private int[] original;
    private Random random;

    public ShuffleAnArray_384(int[] nums) {
        this.nums = nums;
        this.original = Arrays.copyOf(nums, nums.length);
        this.random = new Random();
    }

    public int[] reset() {
        nums = Arrays.copyOf(original, original.length);
        return nums;
    }

    public int[] shuffle() {
        for (int i=0;i< nums.length;i++) {
            int randIndex = i+ random.nextInt(nums.length-i);
            swap(i,randIndex);
        }
        return nums;
    }

    private void swap(int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        ShuffleAnArray_384 shuffleAnArray384 = new ShuffleAnArray_384(new int[]{1,2,3});
        int[] numsShuffle = shuffleAnArray384.shuffle();
        int[] numsReset = shuffleAnArray384.reset();
    }
}
