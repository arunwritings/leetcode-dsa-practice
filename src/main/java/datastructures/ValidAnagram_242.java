package datastructures;

public class ValidAnagram_242 {

    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()) return false;
        int[] freq = new int[26];
        for (char ch : s.toCharArray()) {
            freq[ch-'a']++;
        }
        for (char ch : t.toCharArray()) {
            freq[ch-'a']--;
        }
        for (int num : freq) {
            if (num!=0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        ValidAnagram_242 validAnagram242 = new ValidAnagram_242();
        System.out.println(validAnagram242.isAnagram("car","rat"));
    }
}
