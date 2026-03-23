package datastructures.strings;

public class LongestRepeatingCharacterReplacement_424 {

    public int characterReplacement(String s, int k) {
        int[] charFreq = new int[26];
        int left = 0;
        int maxFreq = 0;
        int length = s.length();
        for (int right=0;right<length;right++) {
            int currentCharIndex = s.charAt(right)-'A';
            charFreq[currentCharIndex]++;
            maxFreq = Math.max(maxFreq, charFreq[currentCharIndex]);
            int window = right-left+1;
            int charsToReplace = window-maxFreq;
            if (charsToReplace>k) {
                int leftCharIndex = s.charAt(left)-'A';
                charFreq[leftCharIndex]--;
                left++;
            }
        }
        return length-left;
    }

    public static void main(String[] args) {
        LongestRepeatingCharacterReplacement_424 l = new LongestRepeatingCharacterReplacement_424();
        System.out.println(l.characterReplacement("ABAB",2));
    }
}
