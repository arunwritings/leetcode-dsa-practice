package datastructures.arrays;

public class BinarySearch_704 {

    public int search(int[] nums, int target) {
        int start=0, last= nums.length-1;
        while (start<last) {
            int middle = start + (last-start)/2;
            if (target==nums[middle]) return middle;
            else if (nums[middle]<target) {
                start = middle+1;
            }else {
                last = middle-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch_704 binarySearch704 = new BinarySearch_704();
        System.out.println(binarySearch704.search(new int[]{-1,0,3,5,9,12},9));
    }
}
