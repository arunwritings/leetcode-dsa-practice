package datastructures.matrix;

import java.util.Deque;
import java.util.LinkedList;

public class RottingOranges_994 {

    public int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        int freshOranges = 0;
        Deque<int[]> deque = new LinkedList<>();
        for (int row=0;row<rows;row++) {
            for (int col=0;col<cols;col++) {
                if (grid[row][col]==1) {
                    freshOranges++;
                } else if (grid[row][col]==2) {
                    deque.offer(new int[]{row,col});
                }
            }
        }

        final int[] directions = {-1,0,1,0,-1};
        for (int time=1; !deque.isEmpty() && freshOranges>0; time++) {
            int size = deque.size();
            for (int i=0;i<size;i++) {
                int[] curPos = deque.poll();
                int curRow = curPos[0];
                int curCol = curPos[1];

                for (int dir=0;dir<4;dir++){
                    int newRow = curRow+directions[dir];
                    int newCol = curCol+directions[dir+1];

                    if (newRow>=0 && newRow<rows && newCol>=0 && newCol<cols && grid[newRow][newCol]==1) {
                        grid[newRow][newCol]=2;
                        deque.offer(new int[]{newRow,newCol});
                        freshOranges--;

                        if (freshOranges==0) return time;
                    }
                }
            }
        }
        return freshOranges > 0 ? -1 : 0;
    }

    public static void main(String[] args) {
        RottingOranges_994 rottingOranges994 = new RottingOranges_994();
        int[][] grid = new int[][]{ {2,1,1}, {0,1,1}, {1,1,1} };
        System.out.println(rottingOranges994.orangesRotting(grid));
    }
}
