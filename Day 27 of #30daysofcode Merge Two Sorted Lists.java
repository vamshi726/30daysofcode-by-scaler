//Problem: Merge Two Sorted Lists

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
             ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;
        while (l1 != null || l2 != null) {
            if (l2 == null || (l1 != null && l1.val <= l2.val)) {
                cur.next = l1;
                l1 = l1.next;
                cur = cur.next;
            }
            else {
                cur.next = l2;
                l2 = l2.next;
                cur = cur.next;
            }
        }
        return dummy.next;
    }
}
/*
Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
*/
