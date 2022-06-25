package LeetCode.Problem142;

import LeetCode.ListNode;

import java.util.HashSet;

public class Solution {
    //Not my solution, but avoids using set, so worth looking at.
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        int index = 0;
        do {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == null || fast.next == null) {
                return null;
            }
        } while (fast != slow);
        // after fast and slow intersect
        fast = head;
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;

    }
//    My solution, using sets, is brief but slow and uses memory.
    public ListNode detectCycle_with_set(ListNode head) {
        HashSet<ListNode> nodeSet = new HashSet<ListNode>();
        while (head!=null && nodeSet.add(head)) {
            head = head.next;
        }
        return head;
    }
}
