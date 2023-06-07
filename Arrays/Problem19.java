import java.util.*;

public class Problem19 {

    public static List<int[]> pairSum(int[] arr, int s) {
        Arrays.sort(arr);
        HashMap<Integer, Set<Integer>> map = new HashMap<>();
        List<int[]> res = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            map.putIfAbsent(arr[i], new HashSet<>());
            map.get(arr[i]).add(i);
        }
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.get(arr[i]).remove(i);
            }
            if (map.containsKey(s - arr[i])) {
                Set<Integer> value = map.get(s - arr[i]);
                int[] arr1 = new int[2];
                arr1[0] = arr[i];
                arr1[1] = s - arr[i];
                for (int j : value) {
                    res.add(arr1);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 2, -3, 3, 3, -2 };
        System.out.println(pairSum(arr, 0));
    }
}
