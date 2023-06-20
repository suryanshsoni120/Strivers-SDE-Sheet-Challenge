import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

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

class Pair {
    TreeNode<Integer> node;
    int row;
    int col;

    Pair(TreeNode<Integer> node, int row, int col) {
        this.node = node;
        this.row = row;
        this.col = col;
    }
}

public class Problem118 {
    public static ArrayList<Integer> verticalOrderTraversal(TreeNode<Integer> root) {
        ArrayList<Integer> ans = new ArrayList<>();
        TreeMap<Integer, TreeMap<Integer, ArrayList<Integer>>> map = new TreeMap<>();
        Queue<Pair> queue = new LinkedList<>();
        if (root == null) {
            return ans;
        }
        queue.add(new Pair(root, 0, 0));
        while (!queue.isEmpty()) {
            Pair temp = queue.poll();
            TreeNode<Integer> frontNode = temp.node;
            int horizontalDist = temp.col;
            int level = temp.row;

            // Initialize the inner TreeMap for the current horizontal distance
            if (!map.containsKey(horizontalDist)) {
                map.put(horizontalDist, new TreeMap<>());
            }

            // Retrieve the TreeMap for the current horizontal distance
            TreeMap<Integer, ArrayList<Integer>> levelMap = map.get(horizontalDist);

            // Add the node to the level map based on the current level
            if (!levelMap.containsKey(level)) {
                levelMap.put(level, new ArrayList<>());
            }
            levelMap.get(level).add(frontNode.data);

            if (frontNode.left != null) {
                queue.add(new Pair(frontNode.left, level + 1, horizontalDist - 1));
            }
            if (frontNode.right != null) {
                queue.add(new Pair(frontNode.right, level + 1, horizontalDist + 1));
            }
        }
        for (Map.Entry<Integer, TreeMap<Integer, ArrayList<Integer>>> entry : map.entrySet()) {
            for (Map.Entry<Integer, ArrayList<Integer>> mapEntry : entry.getValue().entrySet()) {
                ans.addAll(mapEntry.getValue());
            }
        }
        return ans;
    }
}
