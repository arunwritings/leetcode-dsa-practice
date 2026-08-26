package datastructures.graphs;

public class NumberOfEnclaves_1020 {

    private final int[] DIRECTIONS = {-1,0,1,0,-1};
    private int rows;
    private int cols;

    public int numEnclaves(int[][] grid) {
        rows = grid.length;
        cols = grid[0].length;
        int enclaves = 0;
        for (int row=0;row<rows;row++) {
            dfs(grid, row,0);
            dfs(grid, row,cols-1);
        }
        for (int col=0;col<cols;col++) {
            dfs(grid, 0,col);
            dfs(grid, rows-1,col);
        }

        for (int row=0;row<rows;row++) {
            for (int col=0;col<cols;col++) {
                if (grid[row][col]==1) {
                    enclaves++;
                }
            }
        }
        return enclaves;
    }

    private void dfs(int[][] grid, int row, int col) {
        if (row<0 || row>=rows || col<0 || col>=cols || grid[row][col]!=1) {
            return;
        }
        grid[row][col] = 0;
        for (int i=0;i<4;i++) {
            int newRow = row+DIRECTIONS[i];
            int newCol = col+DIRECTIONS[i+1];
            dfs(grid, newRow,newCol);
        }
    }

    public static void main(String[] args) {
        int[][] grid = {{0,0,0,0},{0,1,0,1,0},{0,1,1,0},{0,0,0,0}};
        NumberOfEnclaves_1020 n = new NumberOfEnclaves_1020();
        System.out.println(n.numEnclaves(grid));
    }
}
