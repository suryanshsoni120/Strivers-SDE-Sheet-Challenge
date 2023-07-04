class BinaryTreeNode<T> {
    T data;
    BinaryTreeNode<T> left;
    BinaryTreeNode<T> right;

    public BinaryTreeNode(T data) {
        this.data = data;
    }
}

public class Problem126 {

    public static boolean identicalTrees(BinaryTreeNode<Integer> root1, BinaryTreeNode<Integer> root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null) {
            return (root1 == root2);
        }
        boolean leftAns = identicalTrees(root1.left, root2.left);
        boolean rightAns = identicalTrees(root1.right, root2.right);
        return ((root1.data.equals(root2.data)) && leftAns && rightAns);
    }
}
