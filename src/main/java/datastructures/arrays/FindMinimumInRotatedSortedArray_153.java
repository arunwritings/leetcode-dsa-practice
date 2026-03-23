package datastructures.arrays;


public class FindMinimumInRotatedSortedArray_153 {

    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return nums[left];
    }

    public static void main(String[] args) {
        FindMinimumInRotatedSortedArray_153 f = new FindMinimumInRotatedSortedArray_153();
        int[] nums = {3,4,5,1,2};
        System.out.println(f.findMin(nums));
    }

}
