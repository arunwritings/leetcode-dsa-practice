package datastructures;

public class PowofXandN_50 {

    public double myPow(double x, int n) {
        //return Math.pow(x, n); // Well its not specified in problem desc to not use any built-in libraries, so this should be acceptable right 😂

        if ((long) n < 0) {
            return 1/helper(x, -(long) n);
        }
        return helper(x, n);
    }

    private double helper(double x, long n) {
        if (n==0) return 1;
        if (n%2==1) {
            return x * helper(x, n-1);
        }
        return helper(x*x, n/2);
    }

    public static void main(String[] args) {
        PowofXandN_50 powofXandN50 = new PowofXandN_50();
        System.out.println(powofXandN50.myPow(2.00000, 10));
    }
}
