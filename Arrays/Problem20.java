import java.util.*;

public class Problem20 {

    public static String fourSum(int[] arr, int target, int n) {
        Arrays.sort(arr);
        for (int i = 0; i < n - 3; i++) {
            for (int j = i + 1; j < n - 2; j++) {
                int t = target - arr[i] - arr[j];
                int k = j + 1;
                int l = n - 1;
                while (k < l) {
                    int val = arr[k] + arr[l];
                    if (val < t)
                        k++;
                    else if (val > t)
                        l--;
                    else {
                        return "Yes";
                    }
                }
            }
        }
        return "No";
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 3, 1, 1 };
        System.out.println(fourSum(arr, 20, arr.length));
    }
}
