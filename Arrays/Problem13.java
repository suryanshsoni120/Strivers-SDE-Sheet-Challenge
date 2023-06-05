import java.util.*;

public class Problem13 {

    static boolean searchMatrix(ArrayList<ArrayList<Integer>> mat, int target) {
        int n = mat.size();
        int m = mat.get(0).size();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat.get(i).get(j) == target) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mat = new ArrayList<>();
        ArrayList<Integer> row1 = new ArrayList<>();
        row1.add(1);
        row1.add(2);
        row1.add(3);
        row1.add(4);
        ArrayList<Integer> row2 = new ArrayList<>();
        row2.add(5);
        row2.add(6);
        row2.add(7);
        row2.add(8);
        ArrayList<Integer> row3 = new ArrayList<>();
        row3.add(9);
        row3.add(10);
        row3.add(11);
        row3.add(12);
        mat.add(row1);
        mat.add(row2);
        mat.add(row3);
        System.out.println(searchMatrix(mat, 8));
    }
}
