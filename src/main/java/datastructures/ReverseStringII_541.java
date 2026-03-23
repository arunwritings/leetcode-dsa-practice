package datastructures;

import java.util.Arrays;

public class ReverseStringII_541 {

    public String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        for (int i=0;i<s.length();i=i+k*2) {
            int left = i;
            int right = Math.min(i+k-1, chars.length-1);
            while (left<right) {
                char temp = chars[right];
                chars[right] = chars[left];
                chars[left] = temp;
                left++;
                right--;
            }
        }
        return String.copyValueOf(chars);
    }

    public static void main(String[] args) {
        ReverseStringII_541 reverseStringII541 = new ReverseStringII_541();
        System.out.println(reverseStringII541.reverseStr("abcdefg",2));
    }
}
