class TreeNode<T> {
    T data;
    TreeNode<T> left;
    TreeNode<T> right;

    TreeNode(T data) {
        this.data = data;
        left = null;
        right = null;
    }
};

public class Problem125 {
    public static int lowestCommonAncestor(TreeNode<Integer> root, int x, int y) {
        if (root == null) {
            return -1;
        }
        if (root.data == x || root.data == y) {
            return root.data;
        }
        int leftAns = lowestCommonAncestor(root.left, x, y);
        int rightAns = lowestCommonAncestor(root.right, x, y);
        if (leftAns != -1 && rightAns != -1) {
            return root.data;
        } else if (leftAns != -1 && rightAns == -1) {
            return leftAns;
        } else if (leftAns == -1 && rightAns != -1) {
            return rightAns;
        } else {
            return -1;
        }
    }
}
