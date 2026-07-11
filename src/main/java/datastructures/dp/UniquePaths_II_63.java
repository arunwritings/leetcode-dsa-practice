package datastructures.dp;

public class UniquePaths_II_63 {

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        if (obstacleGrid[0][0]==1) return 0;
        int[][] dp = new int[m][n];
        dp[0][0] = 1;
        for (int i=1;i<=m-1;i++) {
            if (obstacleGrid[i][0]!=1) {
                dp[i][0] = dp[i-1][0];
            }
        }
        for (int i=1;i<=n-1;i++) {
            if (obstacleGrid[0][i]!=1) {
                dp[0][i] = dp[0][i-1];
            }
        }
        for (int i=1;i<=m-1;i++) {
            for (int j=1;j<=n-1;j++) {
                if (obstacleGrid[i][j]==1) {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
            }
        }
        return dp[m-1][n-1];
    }

    public static void main(String[] args) {
        int[][] obstacleGrid = {{0,0,0},{0,1,0},{0,0,0}};
        UniquePaths_II_63 u = new UniquePaths_II_63();
        System.out.println(u.uniquePathsWithObstacles(obstacleGrid));
    }
}
