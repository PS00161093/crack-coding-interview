import java.util.HashSet;
import java.util.Set;

/**
 * Remove Duplicates: Write code to remove duplicates from an unsorted linked list.
 * Time Complexity: O(n)
 */
public class RemoveDuplicates {

    public void removeDuplicates(ListNode head) {
        Set<Integer> set = new HashSet<>();
        ListNode prev = null;
        while (head != null) {
            if (set.contains(head.val)) {
                prev.next = head.next;
            } else {
                set.add(head.val);
                prev = head;
            }
            head = head.next;
        }
    }

}

class ListNode {
  
    int val;
  
    ListNode next;

    ListNode() {}

    ListNode(int val) {this.val = val;}

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

}
