import java.util.*;

public class Problem11 {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        int[] ans = new int[2];
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr.get(i)))
                ans[1] = arr.get(i);
            else
                map.put(arr.get(i), true);
        }
        for (int i = 1; i <= n; i++) {
            if (!map.containsKey(i)) {
                ans[0] = i;
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(6);
        arr.add(4);
        arr.add(3);
        arr.add(5);
        arr.add(5);
        arr.add(1);
        int n = arr.size();
        System.out.println(Arrays.toString(missingAndRepeating(arr, n)));
    }
}
