public class Problem4 {

    public static long maxSubarraySum(int[] arr, int n) {
        long max = Long.MIN_VALUE;
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        if (max < 0) {
            return 0;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 7, -4, 3, 2, -10, 9, 1 };
        System.out.println(maxSubarraySum(arr, arr.length));
    }
}
