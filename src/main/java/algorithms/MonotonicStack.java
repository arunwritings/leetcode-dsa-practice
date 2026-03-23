package algorithms;

import java.util.Arrays;
import java.util.Stack;

public class MonotonicStack {

/*  |    Problem            | Direction    | Stack type |
    | --------------------- | ------------ | ---------- |
    | Next Greater Right    | right → left | decreasing |
    | Next Smaller Right    | right → left | increasing |
    | Previous Greater Left | left → right | decreasing |
    | Previous Smaller Left | left → right | increasing |
*/

    public int[] nextGreater(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= nums[i]) {
                stack.pop();
            }
            res[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(nums[i]);
        }
        return res;
    }

    public int[] nextSmaller(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() >= nums[i]) {
                stack.pop();
            }
            res[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(nums[i]);
        }
        return res;
    }

    public int[] previousGreater(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && stack.peek() <= nums[i]) {
                stack.pop();
            }
            res[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(nums[i]);
        }
        return res;
    }

    public int[] previousSmaller(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && stack.peek() >= nums[i]) {
                stack.pop();
            }
            res[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(nums[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {2,1,3,4,8};
        MonotonicStack monotonicStack = new MonotonicStack();
        System.out.println("Next Greater Element is "+ Arrays.toString(monotonicStack.nextGreater(nums)));
        System.out.println("Next Smaller Element is "+ Arrays.toString(monotonicStack.nextSmaller(nums)));
        System.out.println("Previous Greater Element is "+ Arrays.toString(monotonicStack.previousGreater(nums)));
        System.out.println("Previous Smaller Element is "+ Arrays.toString(monotonicStack.previousSmaller(nums)));
    }

}
