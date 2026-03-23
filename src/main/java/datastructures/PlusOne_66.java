package datastructures;

import java.util.Arrays;

public class PlusOne_66 {

    public int[] plusOne(int[] digits) {
        int i= digits.length-1;
        while (i>=0) {
            if (digits[i]<9) {
                digits[i]++;
                return digits;
            }
            digits[i]=0;
            i--;
        }

        int[] result = new int[digits.length+1];
        result[0]=1;
        return result;
    }

    public static void main(String[] args) {
        PlusOne_66 plusOne66 = new PlusOne_66();
        System.out.println(Arrays.toString(plusOne66.plusOne(new int[]{5,9})));
    }
}
