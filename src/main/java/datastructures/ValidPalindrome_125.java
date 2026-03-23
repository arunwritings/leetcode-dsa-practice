package datastructures;

public class ValidPalindrome_125 {

    public boolean isPalindrome(String s) {
        if (s.isEmpty()) return true;
        String input = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        int left=0, right = input.length()-1;
        while (left<=right) {
            if (input.charAt(left)!=input.charAt(right)) {
                return false;
            } else{
                left++;
                right--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ValidPalindrome_125 validPalindrome125 = new ValidPalindrome_125();
        System.out.println(validPalindrome125.isPalindrome("race a car"));
    }
}
