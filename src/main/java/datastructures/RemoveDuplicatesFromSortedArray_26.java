package datastructures;


public class RemoveDuplicatesFromSortedArray_26 {

    public int removeDuplicates(int[] nums) {
        if (nums.length==0) return 0;
        int i=0;
        for (int j=1;j< nums.length;j++) {
            if (nums[i]!=nums[j]) {
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        RemoveDuplicatesFromSortedArray_26 duplicatesFromSortedArray_26 = new RemoveDuplicatesFromSortedArray_26();
        System.out.println(duplicatesFromSortedArray_26.removeDuplicates(nums));
    }
}
