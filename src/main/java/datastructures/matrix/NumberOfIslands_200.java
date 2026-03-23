package datastructures.matrix;

public class NumberOfIslands_200 {

    private final int[] DIRECTIONS = {-1,0,1,0,-1};
    private char[][] grid;
    private int rows;
    private int cols;

    public int numIslands(char[][] grid) {
        this.grid = grid;
        rows = grid.length;
        cols = grid[0].length;
        int islands = 0;
        for (int row=0;row<rows;row++) {
            for (int col=0;col<cols;col++) {
                if (grid[row][col]=='1') {
                    islands++;
                    dfs(row,col);
                }
            }
        }
        return islands;
    }

    private void dfs(int row, int col) {
        if (row<0||row>=rows || col<0||col>=cols || grid[row][col]=='0') return;

        grid[row][col] = '0';
        for (int i=0;i<4;i++) {
            int newRow = row+DIRECTIONS[i];
            int newCol = col+DIRECTIONS[i+1];
            dfs(newRow, newCol);
        }
    }

    public static void main(String[] args) {
        char[][] grid = { {'1','1','1','1','0'},
                          {'1','1','0','1','0'},
                          {'1','1','0','0','0'},
                          {'0','0','0','0','0'} };
        NumberOfIslands_200 numberOfIslands200 = new NumberOfIslands_200();
        System.out.println(numberOfIslands200.numIslands(grid));
    }
}
