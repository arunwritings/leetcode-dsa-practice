package datastructures.dp;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle_II_119 {

    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        long value = 1;
        for (int r = 0; r <= rowIndex; r++) {
            row.add((int) value);
            //nCr = nC(r-1) * (n-r+1) / r
            value = value * (rowIndex - r) / (r + 1);
        }
        return row;
    }

    public static void main(String[] args) {
        PascalsTriangle_II_119 p = new PascalsTriangle_II_119();
        System.out.println(p.getRow(3));
    }
}
