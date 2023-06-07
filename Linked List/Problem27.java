class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data = data;
    }
}

public class Problem27 {

    public static LinkedListNode<Integer> sortTwoLists(LinkedListNode<Integer> first, LinkedListNode<Integer> second) {
        if (first == null)
            return second;

        if (second == null)
            return first;

        if (first.data < second.data) {
            first.next = sortTwoLists(first.next, second);
            return first;
        }
        second.next = sortTwoLists(first, second.next);
        return second;
    }
}
