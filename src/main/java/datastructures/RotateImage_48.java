package datastructures;

public class RotateImage_48 {

    public void rotate(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = row+1; col < matrix[0].length; col++) {
                int temp = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = temp;
            }
        }
        for (int row = 0; row < matrix[0].length; row++) {
            int left = 0, right = matrix[0].length - 1;
            while (left < right) {
                int temp = matrix[row][left];
                matrix[row][left] = matrix[row][right];
                matrix[row][right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][] { {1,2,3}, {4,5,6}, {7,8,9} };
        RotateImage_48 rotateImage48 = new RotateImage_48();
        rotateImage48.rotate(matrix);
    }

}
