package datastructures;

public class SumOfTwoIntegers {

    public int sum(int a, int b) {
        while (b!=0) {
            int carry = (a&b) << 1;
            a = a^b;
            b=carry;
        }
        return a;
    }

    public static void main(String[] args) {
        SumOfTwoIntegers s = new SumOfTwoIntegers();
        System.out.println(s.sum(2,3));
    }
}
