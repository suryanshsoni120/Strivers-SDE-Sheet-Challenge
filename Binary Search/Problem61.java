public class Problem61 {

    public static int NthRoot(int n, int m) {
        long start = 1;
        long end = m;
        while (start <= end) {
            long mid = start + (end - start) / 2;
            if (mid > m / (Math.pow(mid, n - 1))) {
                end = mid - 1;
            } else if (mid < m / (Math.pow(mid, n - 1))) {
                start = mid + 1;
            } else {
                return (int) mid;
            }
        }
        return -1;
    }
}