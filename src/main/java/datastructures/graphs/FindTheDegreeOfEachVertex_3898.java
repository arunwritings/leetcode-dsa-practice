package datastructures.graphs;

import java.util.Arrays;

public class FindTheDegreeOfEachVertex_3898 {

    public int[] findDegrees(int[][] matrix) {
        int[] result = new int[matrix.length];
        int count=0;
        for (int[] arr : matrix) {
            result[count++] = Arrays.stream(arr).sum();
        }
        return result;
    }
}
