import java.util.Arrays;

public class Problem9 {

    public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
        // Write your code here.
        int[] ans = new int[n + m];
        int first = 0;
        int second = 0;
        int index = 0;
        while (first < m && second < n) {
            if (arr1[first] <= arr2[second]) {
                ans[index] = arr1[first];
                first++;
                index++;
            } else {
                ans[index] = arr2[second];
                second++;
                index++;
            }
        }
        while (first < m) {
            ans[index] = arr1[first];
            first++;
            index++;
        }
        while (second < n) {
            ans[index] = arr2[second];
            second++;
            index++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr1 = { 3, 6, 9, 0, 0 };
        int[] arr2 = { 4, 10 };
        int m = arr1.length;
        int n = arr2.length;
        System.out.println(Arrays.toString(ninjaAndSortedArrays(arr1, arr2, m, n)));
    }
}
