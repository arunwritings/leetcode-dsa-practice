package datastructures;

public class HammingDistance_461 {

    public static int hammingDistance(int x, int y) {
        int xor = x ^ y;
        return Integer.bitCount(xor);
    }

    public static void main(String[] args) {
        System.out.println(hammingDistance(1,4));
    }
}
