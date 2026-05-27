package datastructures.matrix;

import java.util.ArrayDeque;
import java.util.Deque;

public class ShortestPathInBinaryMatrix_1091 {

    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        if (grid[0][0]==1) return -1;
        grid[0][0]=1;
        Deque<int[]> deque = new ArrayDeque<>();
        deque.offer(new int[]{0,0});
        int pathLength = 1;
        while (!deque.isEmpty()) {
            int size = deque.size();
            for (int i=0;i<size;i++) {
                int[] currentCell = deque.poll();
                int row = currentCell[0];
                int col = currentCell[1];
                if (row==n-1 && col==n-1) return pathLength;
                for (int nextRow=row-1;nextRow<=row+1;nextRow++) {
                    for (int nextCol=col-1;nextCol<=col+1;nextCol++) {
                        if (nextRow>=0 && nextRow<n && nextCol>=0 && nextCol<n && grid[nextRow][nextCol]==0) {
                            grid[nextRow][nextCol]=1;
                            deque.offer(new int[]{nextRow,nextCol});
                        }
                    }
                }
            }
            pathLength++;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[][] grid = {{0,0,0},{1,1,0},{1,1,0}};
        ShortestPathInBinaryMatrix_1091 s = new ShortestPathInBinaryMatrix_1091();
        System.out.println(s.shortestPathBinaryMatrix(grid));
    }
}
