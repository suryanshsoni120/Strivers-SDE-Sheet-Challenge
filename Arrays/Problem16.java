import java.util.ArrayList;
import java.util.HashMap;

public class Problem16 {

    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr) {
        int n = arr.size();
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int i : map.keySet()) {
            if (map.get(i) > (int) Math.floor(n / 3)) {
                ans.add(i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(7);
        arr.add(4);
        arr.add(4);
        arr.add(9);
        arr.add(7);
        System.out.println(majorityElementII(arr));
    }
}