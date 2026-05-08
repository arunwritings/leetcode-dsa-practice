package datastructures.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum_18 {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i=0;i< nums.length-3;i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for (int j=i+1;j< nums.length-2;j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                int left=j+1, right= nums.length-1;
                while (left<right) {
                    long sum = (long) nums[i]+nums[j]+nums[left]+nums[right];
                    if (sum<target) {
                        left++;
                    } else if (sum>target) {
                        right--;
                    } else {
                        result.add(new ArrayList<>(List.of(nums[i],nums[j],nums[left], nums[right])));
                        left++;
                        right--;
                        while (left<right && nums[left]==nums[left-1]) left++;
                        while (left<right && nums[right]==nums[right+1]) right--;

                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,0,-1,0,-2,2};
        FourSum_18 f = new FourSum_18();
        System.out.println(f.fourSum(nums, 0));
    }
}
