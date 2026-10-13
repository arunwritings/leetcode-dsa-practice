package datastructures.arrays;

public class BinarySubarraysWithSum_930 {

    public int numSubarraysWithSum(int[] nums, int goal) {
        int prefixSum=0, result=0;
        int[] count = new int[nums.length+1];
        count[0] = 1;
        for (int num : nums) {
            prefixSum += num;
            if (prefixSum >= goal) {
                result += count[prefixSum-goal];
            }
            count[prefixSum]++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,0,1,0,1};
        BinarySubarraysWithSum_930 b = new BinarySubarraysWithSum_930();
        System.out.println(b.numSubarraysWithSum(nums,2));
    }
}
