import java.util.*;

public class Problem22 {

    public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0;
        int maxi = 0;
        for (int i = 0; i < arr.size(); i++) {
            prefixSum = prefixSum + arr.get(i);
            if (map.containsKey(prefixSum)) {
                maxi = Math.max(maxi, (i - map.get(prefixSum)));
            } else if (prefixSum == 0) {
                maxi = i + 1;
            } else {
                map.put(prefixSum, i);
            }
        }
        return maxi;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(-1);
        list.add(4);
        list.add(-4);
        System.out.println(LongestSubsetWithZeroSum(list));
    }
}
