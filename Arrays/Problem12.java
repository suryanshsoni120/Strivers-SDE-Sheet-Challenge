public class Problem12 {

    public static long getInversions(long arr[], int n) {
        long ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    ans++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        long[] arr = { 2, 5, 1, 3, 4 };
        int n = arr.length;
        System.out.println(getInversions(arr, n));
    }
}
