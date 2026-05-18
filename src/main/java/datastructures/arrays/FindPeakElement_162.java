package datastructures.arrays;

public class FindPeakElement_162 {

    public int findPeakElement(int[] nums) {
        int start=0, last=nums.length-1;
        while (start<last) {
            int middle = start + (last-start)/2;
            if (nums[middle] < nums[middle+1]) {
                start = middle+1;
            } else last = middle;
        }
        return start;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        FindPeakElement_162 f = new FindPeakElement_162();
        System.out.println(f.findPeakElement(nums));
    }
}
