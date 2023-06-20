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

public class Problem112 {
    public static List<Integer> getPreOrderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preOrdertraversal(root, list);
        return list;
    }

    public static void preOrdertraversal(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        list.add(root.data);
        preOrdertraversal(root.left, list);
        preOrdertraversal(root.right, list);
    }
}
