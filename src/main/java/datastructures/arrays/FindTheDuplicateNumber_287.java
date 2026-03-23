package datastructures.arrays;

import java.util.HashSet;
import java.util.Set;

public class FindTheDuplicateNumber_287 {

    public int findDuplicate(int[] nums) {
//        Set<Integer> integerSet = new HashSet<>();
//        for (int num : nums) {
//            if (integerSet.contains(num)) return num;
//            else integerSet.add(num);
//        }
//        return 0;

        int slow = nums[0];
        int fast = nums[0];

        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow!=fast);

        slow = nums[0];
        while (slow!=fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }

    public static void main(String[] args) {
        FindTheDuplicateNumber_287 findTheDuplicateNumber287 = new FindTheDuplicateNumber_287();
        System.out.println(findTheDuplicateNumber287.findDuplicate(new int[]{1,3,4,2,2}));
    }

}
