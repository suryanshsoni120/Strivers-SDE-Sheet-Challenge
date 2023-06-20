import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class BinaryTreeNode<T> {
    T data;
    BinaryTreeNode<T> left;
    BinaryTreeNode<T> right;

    public BinaryTreeNode(T data) {
        this.data = data;
    }
}

class Pair {
    BinaryTreeNode node;
    int data;

    Pair(BinaryTreeNode node, int data) {
        this.data = data;
        this.node = node;
    }
}

public class Problem117 {
    public static List<List<Integer>> getTreeTraversal(BinaryTreeNode<Integer> root) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> postOrder = new ArrayList<>();
        List<Integer> preOrder = new ArrayList<>();
        List<Integer> inOrder = new ArrayList<>();
        Stack<Pair> st = new Stack<Pair>();
        st.push(new Pair(root, 1));
        if (root == null)
            return ans;
        while (!st.isEmpty()) {
            Pair it = st.pop();
            if (it.data == 1) {
                preOrder.add((Integer) it.node.data);
                it.data++;
                st.push(it);
                if (it.node.left != null) {
                    st.push(new Pair(it.node.left, 1));
                }
            } else if (it.data == 2) {
                inOrder.add((Integer) it.node.data);
                it.data++;
                st.push(it);
                if (it.node.right != null) {
                    st.push(new Pair(it.node.right, 1));
                }
            } else {
                postOrder.add((Integer) it.node.data);
            }
        }
        ans.add(inOrder);
        ans.add(preOrder);
        ans.add(postOrder);
        return ans;
    }
}
