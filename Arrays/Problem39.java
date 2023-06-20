import java.util.ArrayList;
import java.util.Arrays;

public class Problem39 {

    public static ArrayList<ArrayList<Integer>> findTriplets(int[] arr, int n, int K) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            int j = i + 1;
            int l = n - 1;
            while (j < l) {
                int sum = arr[i] + arr[j] + arr[l];
                if (sum < K) {
                    j++;
                } else if (sum > K) {
                    l--;
                } else {
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(arr[i]);
                    temp.add(arr[j]);
                    temp.add(arr[l]);
                    ans.add(temp);
                    j++;
                    l--;
                    while (j < l && arr[j] == arr[j - 1]) {
                        j++;
                    }
                    while (j < l && arr[l] == arr[l + 1]) {
                        l--;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1, 2, 3 };
        System.out.println(findTriplets(arr, arr.length, 6));
    }
}
