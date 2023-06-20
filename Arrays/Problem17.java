public class Problem17 {

    public static int uniquePaths(int m, int n) {
        int ans = 1;
        for (int i = 1; i <= n - 1; i++) {
            ans = (ans * (m + i - 1)) / i;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(uniquePaths(2, 2));
    }
}
