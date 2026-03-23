package datastructures;

import java.util.Arrays;

public class CountingBits_338 {

    public int[] countBits(int n) {
        int[] result = new int[n+1];
        for (int i=0;i<=n;i++) {
            int count=0;
            int num = i;
            while (num != 0) {
                num &= (num - 1);
                count++;
            }
            result[i] = count;
        }
        return result;
    }

    public static void main(String[] args) {
        CountingBits_338 countingBits338 = new CountingBits_338();
        System.out.println(Arrays.toString(countingBits338.countBits(4)));
    }
}
