package datastructures;

public class NumberOf1Bits_191 {

    public int hammingWeight(int n) {
//        String binary = Integer.toBinaryString(n);
//        int count = 0;
//        for (char ch : binary.toCharArray()) {
//            if (ch-'0' != 0) count++;
//        }
//        return count;
        return Integer.bitCount(n);
    }

    public static void main(String[] args) {
        NumberOf1Bits_191 numberOf1Bits191 = new NumberOf1Bits_191();
        System.out.println(numberOf1Bits191.hammingWeight(128));
    }
}
