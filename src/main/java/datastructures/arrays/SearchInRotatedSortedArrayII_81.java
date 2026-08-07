package datastructures.arrays;

public class SearchInRotatedSortedArrayII_81 {

    public boolean search(int[] nums, int target) {
        int left=0, right = nums.length-1;
        while (left<=right) {
            int middle = left+(right-left)/2;
            if (nums[middle]==target) return true;
            if (nums[left]==nums[middle] && nums[middle]==nums[right]) {
                left++;
                right--;
                continue;
            }
            if (nums[left]<= nums[middle]) {
                if (nums[left]<=target && target<=nums[middle]) {
                    right = middle-1;
                } else {
                    left = middle+1;
                }
            } else {
                if (nums[middle]<=target && target<=nums[right]) {
                    left = middle+1;
                } else {
                    right = middle-1;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,0,0,5};
        SearchInRotatedSortedArrayII_81 s = new SearchInRotatedSortedArrayII_81();
        System.out.println(s.search(nums,0));
    }
}
