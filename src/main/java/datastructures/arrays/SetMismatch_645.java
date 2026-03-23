package datastructures.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMismatch_645 {

    public int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        Set<Integer> set = new HashSet<>();
        int actualSum = 0;
        for (int num : nums) {
            if (set.contains(num)) {
                result[0] = num;
            } else {
                set.add(num);
                actualSum += num;
            }
        }
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        result[1] = expectedSum-actualSum;
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        SetMismatch_645 setMismatch645 = new SetMismatch_645();
        System.out.println(Arrays.toString(setMismatch645.findErrorNums(nums)));
    }
}
