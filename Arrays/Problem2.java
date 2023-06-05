import java.util.*;

public class Problem2 {

    public static ArrayList<ArrayList<Long>> printPascal(int n) {
        ArrayList<ArrayList<Long>> traingle = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ArrayList<Long> row = new ArrayList<Long>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add((long) 1);
                } else {
                    Long num = traingle.get(i - 1).get(j - 1) + traingle.get(i - 1).get(j);
                    row.add(num);
                }
            }
            traingle.add(row);
        }
        return traingle;
    }

    public static void main(String[] args) {
        System.out.println(printPascal(4));
    }
}
