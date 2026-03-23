package datastructures;

public class ReverseString_344 {

    public void reverseString(char[] s) {
        int start=0;
        for (int i=s.length-1;i>=start;i--) {
            char temp = s[i];
            s[i] = s[start];
            s[start] = temp;
            start++;
        }
    }

    public static void main(String[] args) {
        ReverseString_344 reverseString344 = new ReverseString_344();
        reverseString344.reverseString(new char[]{'H','a','n','n','a','h'});
    }
}
