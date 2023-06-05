import java.util.*;

public class Problem3 {

    public static ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation) {
        int index = -1;
        int n = permutation.size();
        for (int i = n - 2; i >= 0; i--) {
            if (permutation.get(i) < permutation.get(i + 1)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            Collections.reverse(permutation);
            return permutation;
        }
        for (int i = n - 1; i >= index; i--) {
            if (permutation.get(i) > permutation.get(index)) {
                int temp = permutation.get(i);
                permutation.set(i, permutation.get(index));
                permutation.set(index, temp);
                break;
            }
        }
        List<Integer> ans = permutation.subList(index + 1, n);
        Collections.reverse(ans);
        return permutation;
    }

    public static void main(String[] args) {
        ArrayList<Integer> permutation = new ArrayList<>();
        permutation.add(2);
        permutation.add(3);
        permutation.add(1);
        permutation.add(4);
        permutation.add(5);
        System.out.println(nextPermutation(permutation));
    }
}
