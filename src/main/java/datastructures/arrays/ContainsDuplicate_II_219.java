package datastructures.arrays;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate_II_219 {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int previousIndex = map.get(nums[i]);
                if (i - previousIndex <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        ContainsDuplicate_II_219 c = new ContainsDuplicate_II_219();
        System.out.println(c.containsNearbyDuplicate(nums,3));
    }
}
