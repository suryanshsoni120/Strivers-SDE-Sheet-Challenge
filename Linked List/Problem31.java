class Node {
    public int data;
    public Node next;

    Node() {
        this.data = 0;
        this.next = null;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

public class Problem31 {
    public static int findIntersection(Node firstHead, Node secondHead) {
        Node head1 = firstHead;
        Node head2 = secondHead;
        if (head1 == head2)
            return head1.data;
        while (head1 != head2) {
            head1 = head1.next;
            head2 = head2.next;
            if (head1 == head2) {
                if (head1 == null)
                    return -1;
                return head1.data;
            }
            if (head1 == null)
                head1 = secondHead;
            if (head2 == null)
                head2 = firstHead;
        }
        return head1.data;
    }
}
