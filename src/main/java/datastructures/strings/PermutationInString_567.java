package datastructures.strings;

import java.util.Arrays;

public class PermutationInString_567 {

    public boolean checkInclusion(String s1, String s2) {
        if (s1.length()>s2.length()) return false;
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        for (char ch : s1.toCharArray()) {
            freq1[ch-'a']++;
        }
        int window = s1.length();
        for (int i=0;i<window;i++) {
            freq2[s2.charAt(i)-'a']++;
        }
        if (Arrays.equals(freq1, freq2)) return true;
        for (int i=window;i<s2.length();i++) {
            freq2[s2.charAt(i)-'a']++;
            freq2[s2.charAt(i-window)-'a']--;
            if (Arrays.equals(freq1, freq2)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        PermutationInString_567 p = new PermutationInString_567();
        System.out.println(p.checkInclusion("ab", "eidbaooo"));
    }
}
