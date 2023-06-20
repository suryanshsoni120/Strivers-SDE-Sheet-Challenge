import java.util.ArrayList;

public class Problem42 {
    public static int longestSubSeg(ArrayList<Integer> arr, int n, int k) {
        int ans = 0;
        int zeroes = 0;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == 0) {
                zeroes++;
            }
            while (zeroes > k) {
                if (arr.get(j) == 0) {
                    zeroes--;
                }
                j++;
            }
            ans = Math.max(ans, i - j + 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(0);
        arr.add(0);
        arr.add(1);
        arr.add(1);
        arr.add(0);
        arr.add(1);
        System.out.println(longestSubSeg(arr, arr.size(), 1));
    }
}
