package datastructures;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber_202 {

    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (n!=1) {
            if (set.contains(n)) return false;
            set.add(n);
            n = getNext(n);
        }
        return true;
    }

    private int getNext(int n) {
        int sum = 0;
        while (n>0) {
            int digit = n%10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        HappyNumber_202 h = new HappyNumber_202();
        System.out.println(h.isHappy(19));
    }
}
