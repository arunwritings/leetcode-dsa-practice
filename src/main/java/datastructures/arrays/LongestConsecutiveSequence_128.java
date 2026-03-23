package datastructures.arrays;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence_128 {

    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int longest = 0;
        for (int num : nums){
            set.add(num);
        }
        for (int num : set) {
            if (!set.contains(num-1)) {
                int current = num;
                int length = 1;
                while (set.contains(current+1)) {
                    current++;
                    length++;
                }
                longest = Math.max(length, longest);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        LongestConsecutiveSequence_128 l = new LongestConsecutiveSequence_128();
        System.out.println(l.longestConsecutive(new int[]{100,4,200,1,3,2}));
    }
}
