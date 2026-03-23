package datastructures;

public class ReverseInteger_7 {

    public int reverse(int x) {
        int reversedNumber=0;
        while (x!=0) {
            if (reversedNumber>Integer.MAX_VALUE/10 || reversedNumber<Integer.MIN_VALUE/10) return 0;
            int last = x%10;
            reversedNumber = reversedNumber*10 + last;
            x/=10;
        }
        return reversedNumber;
    }

    public static void main(String[] args) {
        ReverseInteger_7 reverseInteger7 = new ReverseInteger_7();
        System.out.println(reverseInteger7.reverse(-123));
    }
}
