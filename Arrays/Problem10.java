import java.util.*;

public class Problem10 {

    public static int findDuplicate(ArrayList<Integer> arr, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int ans = 0;
        for (int j : map.keySet()) {
            if (map.get(j) > 1) {
                ans = j;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(1);
        arr.add(3);
        arr.add(4);
        arr.add(2);
        int n = arr.size();
        System.out.println(findDuplicate(arr, n));
    }
}
