//Problem: Remove Duplicates from Sorted List


class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
    while (curr != null) {
      while (curr.next != null && curr.next.val == curr.val) {
        curr.next = curr.next.next;
      }
      curr = curr.next;
     }  
      return head;
    }
}

/*
Input: head = [1,1,2,3,3]
Output: [1,2,3]
*/
