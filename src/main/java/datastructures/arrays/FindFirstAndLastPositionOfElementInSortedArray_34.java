package datastructures.arrays;

import java.util.Arrays;

public class FindFirstAndLastPositionOfElementInSortedArray_34 {

    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[]{-1,-1};
        }
        int firstIndex = searchFirstIndex(nums, target);
        int lastIndex = searchLastIndex(nums, target);
        return new int[]{firstIndex, lastIndex};
    }

    private int searchFirstIndex(int[] nums, int target) {
        int start=0, last= nums.length-1;
        int result = -1;
        while (start<=last) {
            int mid = start+(last-start)/2;
            if (nums[mid]==target) {
                result = mid;
                last = mid-1;
            } else if (nums[mid]<target) {
                start = mid+1;
            } else {
                last=mid-1;
            }
        }
        return result;
    }

    private int searchLastIndex(int[] nums, int target) {
        int start=0, last= nums.length-1;
        int result = -1;
        while (start<=last) {
            int mid = start+(last-start)/2;
            if (nums[mid]==target) {
                result = mid;
                start = mid+1;
            } else if (nums[mid]<target) {
                start = mid+1;
            } else {
                last=mid-1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        FindFirstAndLastPositionOfElementInSortedArray_34 f = new FindFirstAndLastPositionOfElementInSortedArray_34();
        System.out.println(Arrays.toString(f.searchRange(nums, 8)));
    }
}
