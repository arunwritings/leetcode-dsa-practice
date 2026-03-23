package datastructures.arrays;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElementII_503 {

    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Arrays.fill(result, -1);
        Stack<Integer> stack = new Stack<>();

        for (int i=0;i<2*n;i++) {
            int index = i%n;
            while (!stack.isEmpty() && nums[stack.peek()]<nums[index]) {
                int prevIndex = stack.pop();
                result[prevIndex] = nums[index];
            }

            if (i<n) {
                stack.push(index);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,3};
        NextGreaterElementII_503 nextGreaterElementII503 = new NextGreaterElementII_503();
        System.out.println(Arrays.toString(nextGreaterElementII503.nextGreaterElements(nums)));
    }

}
