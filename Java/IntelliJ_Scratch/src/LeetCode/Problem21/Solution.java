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

    /**
     * Interestingly, even though the following code is neater, it is slower (1ms vs 0ms) on leetCode than the
     * slightly messier code below it
     */

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1==null) {return list2;}
        if (list2==null) {return list1;}

        ListNode listStart;
        if (list1.val<=list2.val) {
            listStart = list1;
            list1 = list1.next;
        } else {
            listStart = list2;
            list2 = list2.next;
        }

        ListNode listCurrentPlace = listStart;
        while (list1!=null && list2!=null) {
            if (list1.val <= list2.val) {
                listCurrentPlace.next = list1;
                list1 = list1.next;
            } else if (list1.val > list2.val) {
                listCurrentPlace.next = list2;
                list2 = list2.next;
            }
            listCurrentPlace = listCurrentPlace.next;
        }
        if (list1!=null) {
            listCurrentPlace.next = list1;
        } else if (list2!=null) {
            listCurrentPlace.next = list2;
        }
        return listStart;
    }

    public ListNode mergeTwoLists_0ms_fastest(ListNode list1, ListNode list2) {
        if (list1==null) {return list2;}
        if (list2==null) {return list1;}
        ListNode combinedListStart;
        ListNode currentCombinedList;
        if (list1.val<=list2.val) {
            combinedListStart = list1;
            currentCombinedList = combinedListStart;
            list1 = list1.next;
        } else {
            combinedListStart = list2;
            currentCombinedList = combinedListStart;
            list2 = list2.next;
        }
        while (list1!=null && list2!=null) {
            if (list1.val <= list2.val) {
                currentCombinedList.next = list1;
                list1 = list1.next;
            } else if (list1.val > list2.val) {
                currentCombinedList.next = list2;
                list2 = list2.next;
            }
            currentCombinedList = currentCombinedList.next;
        }
        if (list1!=null) {
            currentCombinedList.next = list1;
        }
        if (list2!=null) {
            currentCombinedList.next = list2;
        }
        return combinedListStart;
    }

    public ListNode mergeTwoLists_messy_and_slow(ListNode list1, ListNode list2) {
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

