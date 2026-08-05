package datastructures;

public class RemoveElement_27 {

    public int removeElement(int[] nums, int val) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            if (nums[left] == val) {
                nums[left] = nums[right];
                right--;
            } else {
                left++;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,2};
        RemoveElement_27 r = new RemoveElement_27();
        System.out.println(r.removeElement(nums,2));
    }
}
