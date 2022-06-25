package LeetCode.Problem876;

import LeetCode.ListNode;

public class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode endNode = head.next;
        ListNode midNode = head;
        while (endNode!=null) {
            midNode = midNode.next;
            endNode = endNode.next;
            if (endNode.next != null) {
                endNode = endNode.next;
            }
        }
        return midNode;
    }
    public ListNode middleNode_another_solution(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
