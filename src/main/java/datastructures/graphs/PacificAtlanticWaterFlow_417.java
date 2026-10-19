package datastructures.graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PacificAtlanticWaterFlow_417 {

    private final int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int rows = heights.length; int cols = heights[0].length;
        boolean[][] pacific = new boolean[rows][cols];
        boolean[][] atlantic = new boolean[rows][cols];

        for (int col=0;col<cols;col++) {
            dfs(0,col,pacific, heights);
            dfs(rows-1,col,atlantic,heights);
        }

        for (int row=0;row<rows;row++) {
            dfs(row,0,pacific,heights);
            dfs(row,cols-1,atlantic,heights);
        }
        List<List<Integer>> result = new ArrayList<>();
        for (int row=0;row<rows;row++) {
            for (int col=0;col<cols;col++) {
                if (pacific[row][col] && atlantic[row][col]) {
                    result.add(Arrays.asList(row,col));
                }
            }
        }
        return result;
    }

    private void dfs(int row, int col, boolean[][] ocean, int[][] heights) {
        ocean[row][col] = true;
        for (int[] dir : directions) {
            int newRow = row + dir[0];
            int newCol = col + dir[1];
            if (newRow>=0 && newRow<=heights.length && newCol>=0 && newCol<=heights[0].length
                    && !ocean[newRow][newCol] && heights[newRow][newCol]>=heights[row][col]) {
                dfs(newRow,newCol,ocean,heights);
            }
        }
    }

    public static void main(String[] args) {
        int[][] heights = {{1,2,2,3,5},{3,2,3,4,4},{2,4,5,3,1},{6,7,1,4,5},{5,1,1,2,4}};
        PacificAtlanticWaterFlow_417 p = new PacificAtlanticWaterFlow_417();
        System.out.println(p.pacificAtlantic(heights));
    }
}
