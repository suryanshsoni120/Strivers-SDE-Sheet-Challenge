import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

class Pair {
    BinaryTreeNode node;
    int val;

    Pair(BinaryTreeNode node, int val) {
        this.node = node;
        this.val = val;
    }
}

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

public class Problem116 {
    public static ArrayList<Integer> getTopView(BinaryTreeNode root) {
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
            int horizontalDist = temp.val;
            if (!map.containsKey(horizontalDist)) {
                map.put(horizontalDist, frontNode.val);
            }
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
