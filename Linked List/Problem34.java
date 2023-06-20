class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data = data;
    }
}

public class Problem34 {
    public static LinkedListNode<Integer> reverseList(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> prev = null;
        LinkedListNode<Integer> curr = head;
        LinkedListNode<Integer> post = null;
        while (curr != null) {
            post = curr.next;
            curr.next = prev;
            prev = curr;
            curr = post;
        }
        return prev;
    }

    public static boolean isPalindrome(LinkedListNode<Integer> head) {
        if (head == null || head.next == null)
            return true;
        LinkedListNode<Integer> slow = head;
        LinkedListNode<Integer> fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        LinkedListNode<Integer> head2 = slow.next;
        slow.next = null;
        head2 = reverseList(head2);
        while (head != null && head2 != null) {
            if ((int) head.data != (int) head2.data)
                return false;
            head = head.next;
            head2 = head2.next;
        }
        return true;
    }
}
