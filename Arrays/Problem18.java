import java.util.*;

public class Problem18 {

    public static int reversePairs(ArrayList<Integer> arr) {
        int n = arr.size();
        int ans = 0;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (arr.get(j) > 2 * arr.get(i)) {
                    ans++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(3);
        list.add(1);
        System.out.println(reversePairs(list));
    }
}
