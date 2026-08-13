package datastructures.matrix;

public class SearchA2DMatrix_II_240 {

    public boolean searchMatrix(int[][] matrix, int target) {
        int cols = matrix[0].length;
        int col = 0;
        for (int[] ints : matrix) {
            if (target >= ints[col] && target <= ints[cols - 1]) {
                int left = 0, right = cols - 1;
                while (left <= right) {
                    int mid = left + (right - left) / 2;
                    if (target == ints[mid]) return true;
                    else if (target > ints[mid]) {
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = { {1,4,7,11,15},
                         {2,5,8,12,19},
                         {3,6,9,16,22},
                         {10,13,14,17,24},
                         {18,21,23,26,30} };
        SearchA2DMatrix_II_240 s = new SearchA2DMatrix_II_240();
        System.out.println(s.searchMatrix(matrix,5));
    }
}
