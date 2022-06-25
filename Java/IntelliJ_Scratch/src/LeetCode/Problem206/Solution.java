package LeetCode.Problem206;

import LeetCode.ListNode;

public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode previousNode, currentNode, nextNode;
        if (head==null || head.next==null) {
            return head;
        }
        currentNode = head;
        nextNode = currentNode.next;
        currentNode.next = null;
        while(nextNode!=null) {
            previousNode = currentNode;
            currentNode = nextNode;
            nextNode = currentNode.next;
            currentNode.next = previousNode;
        }
        return currentNode;
    }
}
