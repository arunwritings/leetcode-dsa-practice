package datastructures;

public class SumOfCompatibleNumbersInRange_I_3954 {

    public int sumOfGoodIntegers(int n, int k) {
        int start = Math.max(1,n-k);
        int end = n+k;
        int sum = 0;
        for (int x=start;x<=end;x++) {
            if (Math.abs(n-x)<=k && (n&x)==0) {
                sum += x;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        SumOfCompatibleNumbersInRange_I_3954 s = new SumOfCompatibleNumbersInRange_I_3954();
        System.out.println(s.sumOfGoodIntegers(2,3));
    }
}
