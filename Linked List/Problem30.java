class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    LinkedListNode(T data) {
        this.data = data;
        this.next = null;
    }
}

public class Problem30 {
    public static void deleteNode(LinkedListNode<Integer> node) {
        node.data = node.next.data;
        node.next = node.next.next;
    }
}
