package datastructures;

public class PalindromeNumber_9 {

    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        long original = x;
        long reversed = 0;
        while (x != 0) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }
        return original == reversed;
    }

    public static void main(String[] args) {
        PalindromeNumber_9 p = new PalindromeNumber_9();
        System.out.println(p.isPalindrome(121));
    }
}
