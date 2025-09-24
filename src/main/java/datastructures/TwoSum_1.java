package datastructures;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum_1 {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0;i< nums.length;i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                return new int[]{map.get(diff), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }


    public static void main(String[] args) {
        TwoSum_1 twoSum1 = new TwoSum_1();
        int[] nums = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum1.twoSum(nums, 18)));
    }
}
