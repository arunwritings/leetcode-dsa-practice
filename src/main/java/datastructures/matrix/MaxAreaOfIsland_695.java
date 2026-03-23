package datastructures.matrix;

public class MaxAreaOfIsland_695 {

    private final int[] DIRECTIONS = {-1,0,1,0,-1};
    private int[][] grid;
    private int rows;
    private int cols;
    int maxArea = 0;
    int curMax = 0;

    public int maxAreaOfIsland(int[][] grid) {
        this.grid = grid;
        rows = grid.length;
        cols = grid[0].length;

        for (int row=0;row<rows;row++) {
            for (int col=0;col<cols;col++) {
                if (grid[row][col]==1) {
                    curMax =0;
                    dfs(row, col);
                    maxArea = Math.max(maxArea, curMax);
                }
            }
        }
        return maxArea;
    }

    private void dfs(int row, int col) {
        if (row<0||row>=rows || col<0||col>=cols || grid[row][col]==0) return;

        grid[row][col] = 0;
        curMax++;
        for (int i=0;i<4;i++) {
            int newRow = row+DIRECTIONS[i];
            int newCol = col+DIRECTIONS[i+1];
            dfs(newRow, newCol);
        }
    }

    public static void main(String[] args) {
        int[][] grid = {{0,0,1,0,0,0,0,1,0,0,0,0,0},
                        {0,0,0,0,0,0,0,1,1,1,0,0,0},
                        {0,1,1,0,1,0,0,0,0,0,0,0,0},
                        {0,1,0,0,1,1,0,0,1,0,1,0,0},
                        {0,1,0,0,1,1,0,0,1,1,1,0,0},
                        {0,0,0,0,0,0,0,0,0,0,1,0,0},
                        {0,0,0,0,0,0,0,1,1,1,0,0,0},
                        {0,0,0,0,0,0,0,1,1,0,0,0,0}};
        MaxAreaOfIsland_695 m = new MaxAreaOfIsland_695();
        System.out.println(m.maxAreaOfIsland(grid));
    }
}
