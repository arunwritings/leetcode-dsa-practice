package datastructures.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElementI_496 {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for (int i= nums2.length-1;i>=0;i--) {
            while (!stack.isEmpty() && stack.peek()<=nums2[i]) {
                stack.pop();
            }
            int nextGreater = stack.isEmpty() ? -1 : stack.peek();
            map.put(nums2[i], nextGreater);
            stack.push(nums2[i]);
        }
        int[] res = new int[nums1.length];
        for (int i=0;i< nums1.length;i++) {
            res[i] = map.get(nums1[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] num1 = {4,1,2};
        int[] num2 = {1,3,4,2};

        NextGreaterElementI_496 nextGreaterElementI496 = new NextGreaterElementI_496();
        System.out.println(Arrays.toString(nextGreaterElementI496.nextGreaterElement(num1, num2)));
    }
}
