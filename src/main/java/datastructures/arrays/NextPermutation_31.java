package datastructures.arrays;

public class NextPermutation_31 {

    public void nextPermutation(int[] nums) {
        int len = nums.length;
        int index = len-2;
        while (index>=0) {
            if (nums[index] < nums[index+1]) {
                break;
            }
            index--;
        }
        if (index>=0) {
            int swapIndex = len-1;
            while (swapIndex > index) {
                if (nums[swapIndex]>nums[index]) {
                    swap(nums, swapIndex, index);
                    break;
                }
                swapIndex--;
            }
        }
        int left = index+1;
        int right = len-1;
        while (left<right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        NextPermutation_31 n = new NextPermutation_31();
        n.nextPermutation(nums);
    }
}
