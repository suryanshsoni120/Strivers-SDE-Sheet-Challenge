import java.util.*;

public class Problem21 {

    public static int lengthOfLongestConsecutiveSequence(int[] arr, int N) {
        if (N == 0) {
            return 0;
        }
        int ans = 1;
        HashSet<Integer> set = new HashSet<>();
        for (int number : arr) {
            set.add(number);
        }
        for (Integer integer : set) {
            if (!set.contains(integer - 1)) {
                int count = 1;
                int curr = integer;
                while (set.contains(curr + 1)) {
                    curr++;
                    count++;
                }
                ans = Math.max(ans, count);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 9, 5, 4, 9, 10, 10, 6 };
        System.out.println(lengthOfLongestConsecutiveSequence(arr, arr.length));
    }
}
