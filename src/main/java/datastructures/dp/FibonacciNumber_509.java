package datastructures.dp;

public class FibonacciNumber_509 {

    public int fib(int n) {
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1]=1;
        if (n==0) return dp[0];
        if (n==1) return dp[1];
        for (int i=2;i<=n;i++) {
            dp[i] = dp[i-2]+dp[i-1];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        FibonacciNumber_509 f = new FibonacciNumber_509();
        System.out.println(f.fib(5));
    }
}
