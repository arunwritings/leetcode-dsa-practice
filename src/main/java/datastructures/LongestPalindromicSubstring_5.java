package datastructures;

public class LongestPalindromicSubstring_5 {

    public String longestPalindrome(String s) {
        if (s.isEmpty()) return "";
        int start=0, end=0;
        for (int i=0;i<s.length();i++) {
            int oddLength = expandFromCenter(s, i, i);
            int evenLength = expandFromCenter(s, i, i+1);
            int longestLen = Math.max(evenLength, oddLength);
            if (longestLen > end-start) {
                start = i-(longestLen-1)/2;
                end = i+longestLen/2;
            }
        }
        return s.substring(start, end+1);
    }

    private int expandFromCenter(String s, int left, int right) {
        while (left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)) {
            left--;
            right++;
        }
        return right-left-1;
    }

    public static void main(String[] args) {
        LongestPalindromicSubstring_5 longestPalindromicSubstring5 = new LongestPalindromicSubstring_5();
        System.out.println(longestPalindromicSubstring5.longestPalindrome("babad"));
    }
}
