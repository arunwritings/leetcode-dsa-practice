package datastructures.matrix;

import java.util.Arrays;

public class FloodFill_733 {

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oldColor = image[sr][sc];
        if (oldColor==color) return image;
        dfs(image, sr, sc, oldColor, color);
        return image;
    }

    private void dfs(int[][] image, int row, int col, int oldColor, int newColor) {
        int rows = image.length;
        int cols = image[0].length;
        if (row < 0 || row >= rows || col < 0 || col >= cols) return;
        if (image[row][col]!=oldColor) return;
        image[row][col] = newColor;
        int[][] dirs = {{-1,0},{1,0},{0,-1},{0,1}};
        for (int[] dir : dirs) {
            dfs(image, row+dir[0], col+dir[1], oldColor, newColor);
        }
    }

    public static void main(String[] args) {
        int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
        FloodFill_733 floodFill733 = new FloodFill_733();
        System.out.println(Arrays.deepToString(floodFill733.floodFill(image, 1, 1, 2)));
    }
}
