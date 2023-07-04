import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class BinaryTreeNode<T> {
    T data;
    BinaryTreeNode<T> left;
    BinaryTreeNode<T> right;

    public BinaryTreeNode(T data) {
        this.data = data;
    }
}

public class Problem127 {

    public static List<Integer> zigZagTraversal(BinaryTreeNode<Integer> root) {
        List<Integer> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        if (root == null)
            return res;
        Queue<BinaryTreeNode<Integer>> queue = new LinkedList<>();
        queue.offer(root);
        queue.offer(null);
        int level = 0;
        while (!queue.isEmpty()) {
            BinaryTreeNode<Integer> rem = queue.poll();
            if (rem == null) {
                if (level % 2 == 0) {
                    ans.addAll(res);
                } else {
                    Collections.reverse(res);
                    ans.addAll(res);
                }
                level++;
                if (!queue.isEmpty()) {
                    queue.offer(null);
                }
                res = new ArrayList<>();
            } else {
                res.add(rem.data);
                if (rem.left != null) {
                    queue.offer(rem.left);
                }
                if (rem.right != null) {
                    queue.offer(rem.right);
                }
            }
        }
        return ans;
    }
}
