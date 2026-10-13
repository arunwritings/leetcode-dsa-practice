package datastructures.arrays;

public class CountNumberOfNiceSubarrays_1248 {

    public int numberOfSubarrays(int[] nums, int k) {
        int left=0, result=0;
        for (int right=0;right<nums.length;right++) {
            if (nums[right]%2!=0) {
                k--;
            }
            while (k<0) {
                if (nums[left]%2!=0) {
                    k++;
                }
                left++;
            }
            result += (right-left+1);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2,1,1};
        CountNumberOfNiceSubarrays_1248 c = new CountNumberOfNiceSubarrays_1248();
        System.out.println(c.numberOfSubarrays(nums,3));
    }
}
