package datastructures.trees;

public class UniqueBinarySearchTrees_96 {

/*
 * Formula: Catalan Number
 *
 *              1       (2n)!
 *     C(n) = -----  * --------
 *             n + 1    n! * n!
 *
 * The number of BSTs for this root is: C(i - 1) * C(n - i)
 **/
    public int numTrees(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1; dp[1] = 1;
        for (int node=2;node<=n;node++) {
            for (int root=1;root<=node;root++) {
                dp[node] += dp[root-1] * dp[node-root];
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        UniqueBinarySearchTrees_96 u = new UniqueBinarySearchTrees_96();
        System.out.println(u.numTrees(3));
    }
}
