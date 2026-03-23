package datastructures;

public class ReverseBits_190 {

    public int reverseBits(int n) {
        return Integer.reverse(n);
    }

    public static void main(String[] args) {
        ReverseBits_190 reverseBits190 = new ReverseBits_190();
        System.out.println(reverseBits190.reverseBits(43261596));
    }
}
