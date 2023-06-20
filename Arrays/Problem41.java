import java.util.ArrayList;
import java.util.HashSet;

public class Problem41 {

    public static int removeDuplicates(ArrayList<Integer> arr, int n) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(arr.get(i));
        }
        return set.size();
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(5);
        System.out.println(removeDuplicates(arr, arr.size()));
    }
}
