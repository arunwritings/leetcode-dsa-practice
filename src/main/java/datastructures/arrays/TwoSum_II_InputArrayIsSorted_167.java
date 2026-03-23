package datastructures.arrays;

import java.util.Arrays;

public class TwoSum_II_InputArrayIsSorted_167 {

    public int[] twoSum(int[] numbers, int target) {
        int left=0, right= numbers.length-1;
        while (left<right) {
            int sum=numbers[left]+numbers[right];
            if (sum==target) return new int[]{left+1, right+1};
            else if (sum<target) {
                left++;
            } else right--;
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[] numbers = {-1,0};
        TwoSum_II_InputArrayIsSorted_167 t = new TwoSum_II_InputArrayIsSorted_167();
        System.out.println(Arrays.toString(t.twoSum(numbers, -1)));
    }
}
