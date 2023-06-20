import java.util.ArrayList;

class TreeNode<T> {
    public T data;
    TreeNode<T> left;
    TreeNode<T> right;

    TreeNode(T data) {
        this.data = data;
        left = null;
        right = null;
    }
};

public class Problem114 {
    public static ArrayList<Integer> getLeftView(TreeNode<Integer> root) {
        ArrayList<Integer> list = new ArrayList<>();
        addLeftMostNode(root, list, 0);
        return list;
    }

    public static void addLeftMostNode(TreeNode<Integer> root, ArrayList<Integer> list, int level) {
        if (root == null) {
            return;
        }
        if (level == list.size()) {
            list.add(root.data);
        }
        addLeftMostNode(root.left, list, level + 1);
        addLeftMostNode(root.right, list, level + 1);
    }
}
