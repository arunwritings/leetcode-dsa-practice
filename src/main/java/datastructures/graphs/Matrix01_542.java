package datastructures.graphs;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Matrix01_542 {

    public int[][] updateMatrix(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        int[][] visited = new int[rows][cols];
        int[][] distances = new int[rows][cols];
        Deque<int[]> deque = new LinkedList<>();
        for (int i=0;i<rows;i++) {
            for (int j=0;j<cols;j++) {
                if (mat[i][j]==0) {
                    deque.add(new int[]{i,j,0});
                    visited[i][j] = 1;
                }else {
                    visited[i][j] = 0;
                }
            }
        }
        final int[] directions = {-1,0,1,0,-1};
        while (!deque.isEmpty()) {
            int[] cell = deque.poll();
            int row = cell[0];
            int col = cell[1];
            int steps = cell[2];
            distances[row][col] = steps;

            for (int i=0;i<4;i++) {
                int newRow = row+directions[i];
                int newCol = col+directions[i+1];
                if (newRow>=0 && newRow<rows && newCol>=0 && newCol<cols && visited[newRow][newCol]==0) {
                    visited[newRow][newCol] = 1;
                    deque.add(new int[]{newRow,newCol,steps+1});
                }
            }
        }
        return distances;
    }

    public static void main(String[] args) {
        int[][] mat = {{0,0,0},{0,1,0},{1,1,1}};
        Matrix01_542 m = new Matrix01_542();
        System.out.println(Arrays.deepToString(m.updateMatrix(mat)));
    }
}
