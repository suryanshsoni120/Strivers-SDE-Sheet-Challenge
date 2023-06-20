import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class BinaryTreeNode<T> {
    T val;
    BinaryTreeNode<T> left;
    BinaryTreeNode<T> right;

    public BinaryTreeNode(T val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class Problem121 {
    public static ArrayList<Integer> getLevelOrder(BinaryTreeNode root) {
        Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
        ArrayList<Integer> ans = new ArrayList<Integer>();
        if (root == null)
            return ans;
        queue.offer(root);
        while (!queue.isEmpty()) {
            if (queue.peek().left != null)
                queue.offer(queue.peek().left);
            if (queue.peek().right != null)
                queue.offer(queue.peek().right);
            ans.add((Integer) queue.poll().val);
        }
        return ans;
    }
}
