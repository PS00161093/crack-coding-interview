/**
 * Return Kth to Last:
 * Implement an algorithm to find the kth to last element of a singly linked list.
 */
public class ReturnFromLast {
    public ListNode nthToLast(ListNode head, int n) {
        ListNode h1 = head;
        ListNode h2 = head;

        // Move pl k nodes into the list.
        for (int i = 0; i < n; i++) {
            h1 = h1.next;
        }

        //Move them at the same pace. When pl hits the end, p2 will be at the right element.
        while (h1 != null) {
            h1 = h1.next;
            h2 = h2.next;
        }

        return h2;
    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

}
