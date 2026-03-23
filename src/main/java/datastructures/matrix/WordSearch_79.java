package datastructures.matrix;

public class WordSearch_79 {

    private int rows;
    private int cols;
    private String target;
    private char[][] board;

    public boolean exist(char[][] board, String word) {
        rows = board.length;
        cols = board[0].length;
        this.target = word;
        this.board = board;

        for (int row=0;row<rows;row++) {
            for (int col=0;col<cols;col++) {
                if (dfs(row, col, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(int row, int col, int index) {
        if (index==target.length()-1) {
            return board[row][col]==target.charAt(index);
        }
        if (board[row][col]!=target.charAt(index)) return false;
        char originalChar = board[row][col];
        board[row][col] = '0';
        int[] directions = {-1,0,1,0,-1};

        for (int i=0;i<4;i++) {
            int newRow = row+directions[i];
            int newCol = col+directions[i+1];

            if (newRow>=0 && newRow<rows && newCol>=0 && newCol<cols && board[newRow][newCol]!='0'
                    && dfs(newRow, newCol, index+1)) {
                return true;
            }
        }
        board[row][col] = originalChar;
        return false;
    }

    public static void main(String[] args) {
        char[][] board = {{'A','B','C','E'}, {'S','F','C','S'},{'A','D','E','E'}};
        WordSearch_79 wordSearch79 = new WordSearch_79();
        System.out.println(wordSearch79.exist(board,"ABCCED"));
    }
}
