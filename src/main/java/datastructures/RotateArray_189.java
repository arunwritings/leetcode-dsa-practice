package datastructures;

import java.util.Arrays;

public class RotateArray_189 {

//    public int[] rotate(int[] nums, int k) {
//        int[] result = new int[nums.length];
//        int index = 0;
//        for (int i= nums.length-k;i< nums.length;i++) {
//            result[index++] = nums[i];
//        }
//        int count=0;
//        for (int i=index;i< nums.length;i++) {
//            result[i] = nums[count++];
//        }
//        return result;
//    }

    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0,k-1);
        reverse(nums, k, nums.length-1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start<end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        RotateArray_189 rotateArray189 = new RotateArray_189();
        rotateArray189.rotate(new int[]{-1}, 2);
    }
}
