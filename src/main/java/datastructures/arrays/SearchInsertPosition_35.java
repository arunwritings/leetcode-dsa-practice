package datastructures.arrays;

public class SearchInsertPosition_35 {

    public int searchInsert(int[] nums, int target) {
        int start=0, last= nums.length-1; 
        while (start<=last) {
            int mid = start+(last-start)/2;
            if (nums[mid]==target) return mid;
            else if (nums[mid]<target) {
                start = mid+1;
            } else {
                last = mid-1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        SearchInsertPosition_35 s = new SearchInsertPosition_35();
        System.out.println(s.searchInsert(nums, 4));
    }
}
