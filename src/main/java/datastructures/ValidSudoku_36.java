package datastructures;

public class ValidSudoku_36 {

    public boolean isValidSudoku(char[][] board) {
        boolean[][] rowHas = new boolean[9][9];
        boolean[][] colHas = new boolean[9][9];
        boolean[][] subGridHas = new boolean[9][9];

        for (int row=0;row<9;row++) {
            for (int col =0;col<9;col++) {
                char currentChar = board[row][col];
                if (currentChar=='.') continue;
                int digit = currentChar-'0'-1;
                int index = (row/3)*3+(col/3);
                if (rowHas[row][digit] || colHas[col][digit] || subGridHas[index][digit]) return false;
                rowHas[row][digit]=true;
                colHas[col][digit]=true;
                subGridHas[index][digit]=true;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] board = new char[][]{
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };

        ValidSudoku_36 validSudoku36 = new ValidSudoku_36();
        System.out.println(validSudoku36.isValidSudoku(board));
    }
}
