/**
 * Remove kth node from the last of a linked list
 */
public class RemoveFromLast {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode c = head;
        int cnt = 0;
        while (c != null) {
            cnt++;
            c = c.next;
        }

        int pos = cnt - n;
        int idx = 1;
        c = head;

        if (pos == 0) head = head.next;
        while (c != null) {
            if (pos == idx) {
                c.next = c.next.next;
                break;
            }
            idx++;
            c = c.next;
        }

        return head;
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
