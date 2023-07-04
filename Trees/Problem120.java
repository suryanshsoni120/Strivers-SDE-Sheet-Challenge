class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class Problem120 {
    public static int getMaxWidth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int maxWidth = 0;
        while (!queue.isEmpty()) {
            int currWidth = queue.size();
            if (maxWidth < currWidth) {
                maxWidth = currWidth;
            }
            while (currWidth > 0) {
                TreeNode currNode = queue.peek();
                queue.poll();
                if (currNode.left != null) {
                    queue.add(currNode.left);
                }
                if (currNode.right != null) {
                    queue.add(currNode.right);
                }
                currWidth = currWidth - 1;
            }
        }
        return maxWidth;
    }
}
