package LeetCode.Problem21;

import java.util.List;

public class Solution {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1==null && list2==null) {return list1;}
        ListNode combinedListStart = new ListNode();
        ListNode currentCombinedList = combinedListStart;
        ListNode currentList1 = list1;
        ListNode currentList2 = list2;
        while (currentList1!=null && currentList2!=null) {
            if (currentList1.val <= currentList2.val) {
                currentCombinedList.val = currentList1.val;
                currentList1 = currentList1.next;
            } else if (currentList1.val > currentList2.val) {
                currentCombinedList.val = currentList2.val;
                currentList2 = currentList2.next;
            }
            ListNode nextNode = new ListNode();
            currentCombinedList.next = nextNode;
            currentCombinedList = nextNode;
        }
        while (currentList1!=null) {
            currentCombinedList.val = currentList1.val;
            currentList1 = currentList1.next;
            if (currentList1!=null) {
                ListNode nextNode = new ListNode();
                currentCombinedList.next = nextNode;
                currentCombinedList = nextNode;
            }
        }
        while (currentList2!=null) {
            currentCombinedList.val = currentList2.val;
            currentList2 = currentList2.next;
            if (currentList2!=null) {
                ListNode nextNode = new ListNode();
                currentCombinedList.next = nextNode;
                currentCombinedList = nextNode;
            }
        }
        return combinedListStart;
    }
}

