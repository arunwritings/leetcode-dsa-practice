package datastructures.arrays;

public class MaxConsecutiveOnes_485 {

    public int findMaxConsecutiveOnes(int[] nums) {
        int currentMax = 0;
        int maxCount = 0;

        for (int num : nums) {
            if (num==1) {
                currentMax++;
                maxCount = Math.max(maxCount, currentMax);
            } else {
                currentMax=0;
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        MaxConsecutiveOnes_485 m = new MaxConsecutiveOnes_485();
        System.out.println(m.findMaxConsecutiveOnes(nums));
    }
}
