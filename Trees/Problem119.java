import java.util.ArrayList;

class TreeNode {
    int data;
    TreeNode left, right;

    public TreeNode(int item) {
        data = item;
        left = right = null;
    }
}

public class Problem119 {

    public static void traverse(TreeNode root, int x, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }
        path.add(root.data);
        if (root.data == x) {
            return;
        }
        traverse(root.left, x, path);
        traverse(root.right, x, path);
        if (path.get(path.size() - 1) != x) {
            path.remove(path.get(path.size() - 1));
        }
    }

    public static ArrayList<Integer> pathInATree(TreeNode root, int x) {
        ArrayList<Integer> path = new ArrayList<>();
        traverse(root, x, path);
        return path;
    }
}
