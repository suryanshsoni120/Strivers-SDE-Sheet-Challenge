import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.data = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.data = val;
        this.left = left;
        this.right = right;
    }
}

public class Problem113 {
    public static List<Integer> getPostOrderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        postOrderTraversal(root, list);
        return list;
    }

    public static void postOrderTraversal(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        postOrderTraversal(root.left, list);
        postOrderTraversal(root.right, list);
        list.add(root.data);
    }
}
