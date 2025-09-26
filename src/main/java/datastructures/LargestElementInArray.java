package datastructures;

public class LargestElementInArray {

    public int largestElement(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
        }
        return max;
    }

    public static void main(String[] args) {
        LargestElementInArray largestElementInArray = new LargestElementInArray();
        System.out.println(largestElementInArray.largestElement(new int[]{8, 7, 6, 5}));
    }
}
