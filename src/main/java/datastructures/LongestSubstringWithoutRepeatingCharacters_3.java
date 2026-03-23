package datastructures;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters_3 {

    public int lengthOfLongestSubstring(String s) {
        Set<Character> characters = new HashSet<>();
        int left=0, right=0;
        int maxSubstring = 0;
        while (right<s.length()) {
            char current = s.charAt(right);
            if (!characters.contains(current)) {
                characters.add(current);
                right++;
                maxSubstring = Math.max(maxSubstring, right-left);
            } else {
                characters.remove(s.charAt(left));
                left++;
            }
        }
        return maxSubstring;
    }

    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters_3 longestSubstringWithoutRepeatingCharacters3 = new LongestSubstringWithoutRepeatingCharacters_3();
        System.out.println(longestSubstringWithoutRepeatingCharacters3.lengthOfLongestSubstring("abcabcbb"));
    }
}
