package datastructures.matrix;

public class SearchA2DMatrix_74 {

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
        SearchA2DMatrix_74 s = new SearchA2DMatrix_74();
        int[][] matrix = { {1,3,5,7},
                           {10,11,16,20},
                           {23,30,34,60} };
        System.out.println(s.searchMatrix(matrix, 3));
    }

}
