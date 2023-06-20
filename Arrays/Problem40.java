public class Problem40 {
    public static long getTrappedWater(long[] arr, int n) {
        long ans = 0;
        int left = 0;
        int right = n - 1;
        long leftMax = 0;
        long rightMax = 0;
        while (left < right) {
            if (arr[left] <= arr[right]) {
                if (arr[left] >= leftMax) {
                    leftMax = arr[left];
                } else {
                    ans += leftMax - arr[left];
                }
                left++;
            } else {
                if (arr[right] >= rightMax) {
                    rightMax = arr[right];
                } else {
                    ans += rightMax - arr[right];
                }
                right--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        long[] arr = { 3, 0, 0, 2, 0, 4 };
        System.out.println(getTrappedWater(arr, arr.length));
    }
}
