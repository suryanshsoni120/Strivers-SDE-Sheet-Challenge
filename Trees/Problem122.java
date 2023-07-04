import java.util.LinkedList;
import java.util.Queue;

class Node {
    int height;
    int left;
    int right;

    Node(int h, int l, int r) {
        this.height = h;
        this.left = l;
        this.right = r;
    }
}

public class Problem122 {
    public static int heightOfTheTree(int[] inorder, int[] levelOrder, int N) {
        Queue<Node> queue = new LinkedList();
        queue.offer(new Node(0, 0, N - 1));
        int[] position = new int[N + 1];
        for (int i = 0; i < N; i++)
            position[inorder[i]] = i;
        int max = 0;
        for (int i = 0; i < N; i++) {
            int cur = levelOrder[i];
            Node node = queue.poll();
            int curPos = position[cur];
            if (curPos > node.left) {
                queue.offer(new Node(node.height + 1, node.left, curPos - 1));
                max = Math.max(max, node.height + 1);
            }
            if (curPos < node.right) {
                queue.offer(new Node(node.height + 1, curPos + 1, node.right));
                max = Math.max(max, node.height + 1);
            }
        }
        return max;
    }
}
