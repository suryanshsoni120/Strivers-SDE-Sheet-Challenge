import java.util.*;

public class Problem7 {

    public static void rotateMatrix(ArrayList<ArrayList<Integer>> mat, int n, int m) {
        int row = 0;
        int col = 0;
        int maxRow = n;
        int maxCol = m;
        int previous, current;
        while (row < maxRow - 1 && col < maxCol - 1) {
            previous = mat.get(row + 1).get(col);
            for (int i = col; i < maxCol; i++) {
                current = mat.get(row).get(i);// 2
                mat.get(row).set(i, previous);
                previous = current;
            }
            row++;
            for (int i = row; i < maxRow; i++) {
                current = mat.get(i).get(maxCol - 1);
                mat.get(i).set(maxCol - 1, previous);
                previous = current;
            }
            maxCol--;
            if (row < maxRow) {
                for (int i = maxCol - 1; i >= col; i--) {
                    current = mat.get(maxRow - 1).get(i);
                    mat.get(maxRow - 1).set(i, previous);
                    previous = current;
                }
            }
            maxRow--;
            if (col < maxCol) {
                for (int i = maxRow - 1; i >= row; i--) {
                    current = mat.get(i).get(col);
                    mat.get(i).set(col, previous);
                    previous = current;
                }
            }
            col++;
        }
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mat = new ArrayList<>();
        ArrayList<Integer> row1 = new ArrayList<>();
        row1.add(1);
        row1.add(2);
        row1.add(3);
        ArrayList<Integer> row2 = new ArrayList<>();
        row2.add(4);
        row2.add(5);
        row2.add(6);
        ArrayList<Integer> row3 = new ArrayList<>();
        row3.add(7);
        row3.add(8);
        row3.add(9);
        mat.add(row1);
        mat.add(row2);
        mat.add(row3);
        int n = mat.size();
        int m = mat.get(0).size();
        rotateMatrix(mat, n, m);
        for (int i = 0; i < mat.size(); i++) {
            System.out.println(mat.get(i));
        }
    }
}
