package datastructures.arrays;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK_560 {

    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int currSum=0, count=0;
        for (int num : nums) {
            currSum += num;
            if (map.containsKey(currSum-k)) {
                count += map.get(currSum-k);
            }
            map.put(currSum, map.getOrDefault(currSum,0)+1);
        }
        return count;
    }

    public static void main(String[] args) {
        SubarraySumEqualsK_560 s = new SubarraySumEqualsK_560();
        int[] nums = {1,1,1};
        System.out.println(s.subarraySum(nums, 2));
    }
}
