import java.util.HashMap;

class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;
    LinkedListNode<T> random;

    public LinkedListNode(T data) {
        this.data = data;
    }
}

public class Problem38 {
    public static LinkedListNode<Integer> cloneRandomList(LinkedListNode<Integer> head) {
        HashMap<LinkedListNode<Integer>, LinkedListNode<Integer>> map = new HashMap<>();
        LinkedListNode<Integer> curr = head;
        while (curr != null) {
            LinkedListNode<Integer> node = new LinkedListNode<Integer>(curr.data);
            map.put(curr, node);
            curr = curr.next;
        }
        curr = head;
        while (curr != null) {
            LinkedListNode<Integer> temp = map.get(curr);
            temp.next = map.get(curr.next) != null ? map.get(curr.next) : null;
            temp.random = map.get(curr.random) != null ? map.get(curr.random) : null;
            curr = curr.next;
        }
        return map.get(head);
    }
}
