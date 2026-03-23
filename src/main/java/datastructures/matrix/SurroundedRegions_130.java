package datastructures.matrix;

public class SurroundedRegions_130 {

    private final int[] DIRECTIONS = {-1,0,1,0,-1};
    private char[][] board;
    private int rows;
    private int cols;

    public void solve(char[][] board) {
        this.board = board;
        rows = board.length;
        cols = board[0].length;

        for (int row=0;row<rows;row++) {
            dfs(row,0);
            dfs(row,cols-1);
        }
        for (int col=0;col<cols;col++) {
            dfs(0,col);
            dfs(rows-1, col);
        }

        for (int row=0;row<rows;row++) {
            for (int col=0;col<cols;col++) {
                if (board[row][col]=='#') {
                    board[row][col] = 'O';
                } else if (board[row][col] == 'O'){
                    board[row][col] = 'X';
                }
            }
        }
    }

    private void dfs(int row, int col) {
        if (row<0 || row>=rows || col<0 || col>=cols || board[row][col]!='O') {
            return;
        }
        board[row][col] = '#';

        for (int i=0;i<4;i++) {
            int newRow = row+DIRECTIONS[i];
            int newCol = col+DIRECTIONS[i+1];
            dfs(newRow, newCol);
        }
    }

    public static void main(String[] args) {
        char[][] board ={ {'X','X','X','X'},
                          {'X','O','O','X'},
                          {'X','X','O','X'},
                          {'X','O','X','X'} };
        SurroundedRegions_130 s = new SurroundedRegions_130();
        s.solve(board);
    }
}
