package datastructures;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class FirstUniqueCharacterInAString {

    public int firstUniqChar(String s) {
        int[] frequencyCount = new int[26];
        int stringLength = s.length();
        for (int i = 0; i < stringLength; i++) {
            int charIndex = s.charAt(i) - 'a';
            frequencyCount[charIndex]++;
        }
        for (int i = 0; i < stringLength; i++) {
            int charIndex = s.charAt(i) - 'a';
            if (frequencyCount[charIndex] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        FirstUniqueCharacterInAString firstUniqueCharacterInAString = new FirstUniqueCharacterInAString();
        System.out.println(firstUniqueCharacterInAString.firstUniqChar("leetcode"));
    }
}
