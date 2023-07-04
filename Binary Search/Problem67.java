public class Problem67 {

    public static boolean isPossible(int n, int m, int[] arr, long mid) {
        long countdays = 1;
        long timeSum = 0;
        for (int i = 0; i < m; i++) {
            if (timeSum + arr[i] <= mid) {
                timeSum += arr[i];
            } else {
                countdays++;
                if (countdays > n || arr[i] > mid) {
                    return false;
                } else {
                    timeSum = arr[i];
                }
            }
        }
        return true;
    }

    public static long ayushGivesNinjatest(int n, int m, int[] time) {
        long sum = 0;
        for (int i = 0; i < time.length; i++) {
            sum += time[i];
        }
        long start = 0;
        long end = sum;
        while (start <= end) {
            long mid = start + (end - start) / 2;
            if (isPossible(n, m, time, mid)) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
