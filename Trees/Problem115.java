import java.util.*;

class BinaryTreeNode {
    int val;
    BinaryTreeNode left;
    BinaryTreeNode right;

    BinaryTreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

class Pair {
    BinaryTreeNode node;
    int data;

    Pair(BinaryTreeNode node, int data) {
        this.node = node;
        this.data = data;
    }
}

public class Problem115 {
    public static ArrayList<Integer> bottomView(BinaryTreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Pair> queue = new LinkedList<>();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        if (root == null) {
            return ans;
        }
        queue.add(new Pair(root, 0));
        while (!queue.isEmpty()) {
            Pair temp = queue.poll();
            BinaryTreeNode frontNode = temp.node;
            int horizontalDist = temp.data;
            map.put(horizontalDist, frontNode.val);
            if (frontNode.left != null) {
                queue.add(new Pair(frontNode.left, horizontalDist - 1));
            }
            if (frontNode.right != null) {
                queue.add(new Pair(frontNode.right, horizontalDist + 1));
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            ans.add(entry.getValue());
        }
        return ans;
    }
}
