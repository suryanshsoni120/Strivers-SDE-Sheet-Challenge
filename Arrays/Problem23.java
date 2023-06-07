import java.util.*;

public class Problem23 {

    public static int subarraysXor(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int count = 0;
        int xor = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            xor = xor ^ arr.get(i);
            if (map.get(xor ^ x) != null)
                count += map.get(xor ^ x);
            if (xor == x) {
                count++;
            }
            if (map.get(xor) != null)
                map.put(xor, map.get(xor) + 1);
            else
                map.put(xor, 1);
        }
        return count;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(1);
        list.add(0);
        list.add(3);
        list.add(4);
        list.add(7);
        System.out.println(subarraysXor(list, 11));
    }
}
