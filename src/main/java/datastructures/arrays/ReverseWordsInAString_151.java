package datastructures.arrays;

public class ReverseWordsInAString_151 {

    public String reverseWords(String s) {
        String[] strings = s.trim().split("\\s+");
        int left=0, right= strings.length-1;
        while (left<right) {
            String temp = strings[left];
            strings[left] = strings[right];
            strings[right] = temp;
            left++;
            right--;
        }
        return String.join(" ", strings);
    }

    public static void main(String[] args) {
        ReverseWordsInAString_151 reverseWordsInAString151 = new ReverseWordsInAString_151();
        System.out.println(reverseWordsInAString151.reverseWords("the sky is blue"));
    }
}
