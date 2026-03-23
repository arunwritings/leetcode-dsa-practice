package datastructures.arrays;

public class SearchInRotatedSortedArray_33 {

    public int search(int[] nums, int target) {
        int left=0, right=nums.length-1;
        while (left<=right) {
            int middle = left + (right-left)/2;
            if (nums[middle]==target) return middle;

            if (nums[left]<=nums[middle]) {
                if (nums[left]<=target && target<nums[middle]) {
                    right = middle-1;
                } else {
                    left = middle+1;
                }
            } else {
                if (nums[middle] < target && target <= nums[right]) {
                    left = middle + 1;
                } else {
                    right = middle - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        SearchInRotatedSortedArray_33 s = new SearchInRotatedSortedArray_33();
        System.out.println(s.search(nums, 0));
    }

}
