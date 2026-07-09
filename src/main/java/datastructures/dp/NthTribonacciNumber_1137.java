package datastructures.dp;

public class NthTribonacciNumber_1137 {

    public int tribonacci(int n) {
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1]=1;
        dp[2] = 1;
        if (n==0) return dp[0];
        if (n==1 || n==2) return dp[1];
        for (int i=3;i<=n;i++) {
            dp[i] = dp[i-3]+dp[i-2]+dp[i-1];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        NthTribonacciNumber_1137 n = new NthTribonacciNumber_1137();
        System.out.println(n.tribonacci(5));
    }
}
