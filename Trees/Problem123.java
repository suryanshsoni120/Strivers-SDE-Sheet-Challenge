class TreeNode<T> {
    public T data;
    public TreeNode<T> left;
    public TreeNode<T> right;

    TreeNode(T data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class Problem123 {

    public static int height(TreeNode<Integer> root, int[] dim) {
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left, dim);
        int rightHeight = height(root.right, dim);
        dim[0] = Math.max(dim[0], leftHeight + rightHeight);
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static int diameterOfBinaryTree(TreeNode<Integer> root) {
        int[] dim = new int[1];
        height(root, dim);
        return dim[0];
    }
}
